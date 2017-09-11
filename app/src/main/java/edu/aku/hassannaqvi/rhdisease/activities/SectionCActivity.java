package edu.aku.hassannaqvi.rhdisease.activities;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.contracts.DeceasedContract;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class SectionCActivity extends Activity {

    private static final String TAG = SectionCActivity.class.getSimpleName();


    @BindView(R.id.dcca)
    EditText dcca;
    @BindView(R.id.dccbrhh)
    RadioGroup dccbrhh;
    @BindView(R.id.dccbrhh01)
    RadioButton dccbrhh01;
    @BindView(R.id.dccbrhh02)
    RadioButton dccbrhh02;
    @BindView(R.id.dccbrhh03)
    RadioButton dccbrhh03;
    @BindView(R.id.dccbrhh04)
    RadioButton dccbrhh04;
    @BindView(R.id.dccbrhh05)
    RadioButton dccbrhh05;
    @BindView(R.id.dccbrhh06)
    RadioButton dccbrhh06;
    @BindView(R.id.dccbrhh07)
    RadioButton dccbrhh07;
    @BindView(R.id.dccbrhh08)
    RadioButton dccbrhh08;
    @BindView(R.id.dccbrhh96)
    RadioButton dccbrhh96;
    @BindView(R.id.dccbrhh10)
    RadioButton dccbrhh10;
    @BindView(R.id.dccbrhh11)
    RadioButton dccbrhh11;
    @BindView(R.id.dccbrhh99)
    RadioButton dccbrhh99;
    @BindView(R.id.dccbrhh88)
    RadioButton dccbrhh88;
    @BindView(R.id.dccbrhh96x)
    EditText dccbrhh96x;
    @BindView(R.id.dccbfid)
    EditText dccbfid;
    @BindView(R.id.dccbmid)
    EditText dccbmid;
    @BindView(R.id.dccc)
    RadioGroup dccc;
    @BindView(R.id.dccc01)
    RadioButton dccc01;
    @BindView(R.id.dccc02)
    RadioButton dccc02;
    @BindView(R.id.dccd)
    DatePicker dccd;
    @BindView(R.id.dccdod)
    RadioGroup dccdod;
    @BindView(R.id.dccage01)
    RadioButton dccage01;
    @BindView(R.id.dccdod02)
    RadioButton dccdod02;
    @BindView(R.id.fldGrpdccage)
    LinearLayout fldGrpdccage;
    @BindView(R.id.dccey)
    EditText dccey;
    @BindView(R.id.dccem)
    EditText dccem;
    @BindView(R.id.dcced)
    EditText dcced;
    @BindView(R.id.fldGrpdccdod)
    LinearLayout fldGrpdccdod;
    @BindView(R.id.dccf)
    DatePicker dccf;
    @BindView(R.id.dccg)
    EditText dccg;
    @BindView(R.id.dcch)
    RadioGroup dcch;
    @BindView(R.id.dcch01)
    RadioButton dcch01;
    @BindView(R.id.dcch02)
    RadioButton dcch02;
    @BindView(R.id.dcch03)
    RadioButton dcch03;
    @BindView(R.id.dcch04)
    RadioButton dcch04;
    @BindView(R.id.dcch05)
    RadioButton dcch05;
    @BindView(R.id.fldGrpdcch)
    LinearLayout fldGrpdcch;


    int position = 0;
    boolean dataFlag = false;
    long ageInYears = 0;
    Calendar cal = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);
        dccd.setMaxDate(new Date().getTime());
        dccf.setMaxDate(new Date().getTime());
        dccf.setMinDate((new Date().getTime() - ((MainApp.MILLISECONDS_IN_YEAR) + MainApp.MILLISECONDS_IN_DAY)));


        position = getIntent().getExtras().getInt("position");

        dataFlag = getIntent().getBooleanExtra("dataFlag", false);

//        Set fields
        dcca.setText(MainApp.cc.getName());
        dcca.setEnabled(false);

//        ((RadioButton) dccbrhh.getChildAt((Integer.parseInt(MainApp.cc.getRelation_hh())) - 1)).setChecked(true);

        dccbfid.setEnabled(false);
        dccbmid.setEnabled(false);

        if (dataFlag) {

            dccbfid.setText(MainApp.cc.getDss_id_f());
            dccbmid.setText(MainApp.cc.getDss_id_m());

            dccc.check(MainApp.cc.getGender().equals("1") ? dccc01.getId() : dccc02.getId());

            if (MainApp.cc.getGender().equals("1")) {
                dccc02.setEnabled(false);
            } else {
                dccc01.setEnabled(false);
            }


//          ((RadioButton) dccc.getChildAt((Integer.parseInt(MainApp.cc.getGender())) - 1)).setChecked(true);


        } else {
            dccbfid.setText("null");
            dccbmid.setText("null");
        }

        String[] dt1 = MainApp.cc.getCurrent_date().split("-");

        dccf.updateDate(Integer.parseInt(dt1[2]), Integer.parseInt(dt1[1]) - 1, Integer.parseInt(dt1[0]));

//        if (MainApp.cc.getAgeY().equals("")) {
//            dccdod02.setChecked(true);
//            String[] dt = MainApp.cc.getDob().split("-");
//            dccd.updateDate(Integer.parseInt(dt[2]), Integer.parseInt(dt[1]) - 1, Integer.parseInt(dt[0]));
//        } else {
//
//            dccage01.setChecked(true);
//            dccey.setText(MainApp.cc.getAgeY());
//            dccem.setText(MainApp.cc.getAgeM());
//            dcced.setText(MainApp.cc.getAgeD());
//        }


        /* End Fields */

        dccdod.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (dccage01.isChecked()) {
                    fldGrpdccage.setVisibility(View.VISIBLE);
                    fldGrpdccdod.setVisibility(View.GONE);
                    Calendar c = Calendar.getInstance();
                    dccd.updateDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));

                } else {
                    fldGrpdccdod.setVisibility(View.VISIBLE);
                    fldGrpdccage.setVisibility(View.GONE);
                    dcced.setText(null);
                    dccem.setText(null);
                    dccey.setText(null);
                }
            }
        });

        dccey.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (dccc02.isChecked()
                        && (Integer.valueOf(dccey.getText().toString().isEmpty() ? "0" : dccey.getText().toString()) >= 15
                        && Integer.valueOf(dccey.getText().toString().isEmpty() ? "0" : dccey.getText().toString()) <= 49)) {
                    fldGrpdcch.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcch.setVisibility(View.GONE);
                    dcch.clearCheck();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

/*        dccd.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (dccc02.isChecked()) {
//                    Log.d("Date", "Year=" + year + " Month=" + (month + 1) + " day=" + dayOfMonth);
                    if ((dccd.getYear() - Calendar.getInstance().get(Calendar.YEAR)) >= 15
                            || (dccd.getYear() - Calendar.getInstance().get(Calendar.YEAR)) <= 49) {
                        fldGrpdcch.setVisibility(View.VISIBLE);
                    } else {
                        fldGrpdcch.setVisibility(View.GONE);
                        dcch.clearCheck();
                    }
                }
            }
        });*/

/*        dccd.init(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {

            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int dayOfMonth) {
                if (dccc02.isChecked()) {
                    Log.d("Date", "Year=" + year + " Month=" + (month + 1) + " day=" + dayOfMonth);
                    if ((year - Calendar.getInstance().get(Calendar.YEAR)) >= 15
                            || (year - Calendar.getInstance().get(Calendar.YEAR)) <= 49) {
                        fldGrpdcch.setVisibility(View.VISIBLE);
                    } else {
                        fldGrpdcch.setVisibility(View.GONE);
                        dcch.clearCheck();
                    }
                }
            }
        });*/

        dccc.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (dccc02.isChecked()) {

                    if (dccage01.isChecked() && (Integer.valueOf(dccey.getText().toString().isEmpty() ? "0" : dccey.getText().toString()) >= 15
                            && Integer.valueOf(dccey.getText().toString().isEmpty() ? "0" : dccey.getText().toString()) <= 49)) {
                        fldGrpdcch.setVisibility(View.VISIBLE);
                    } else if (dccdod02.isChecked() && ((dccd.getYear() - new Date().getYear()) >= 15 || (dccd.getYear() - new Date().getYear()) <= 49)) {
                        fldGrpdcch.setVisibility(View.VISIBLE);
                    } else {
                        fldGrpdcch.setVisibility(View.GONE);
                        dcch.clearCheck();
                    }
                } else {
                    fldGrpdcch.setVisibility(View.GONE);
                    dcch.clearCheck();
                }
            }
        });


        dccbrhh96.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dccbrhh96x.setVisibility(View.VISIBLE);
                } else {
                    dccbrhh96x.setVisibility(View.GONE);
                    dccbrhh96x.setText(null);
                }
            }
        });

        //===================== Calculation of age from Date of Birth

        dccd.init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Log.d("Date", "Year=" + year + " Month=" + (monthOfYear + 1) + " day=" + dayOfMonth);
                cal.set(year, monthOfYear, dayOfMonth);

                Calendar cal2 = Calendar.getInstance();
                cal2.set(dccd.getYear(), dccd.getMonth(), dccd.getDayOfMonth());

                Date dateofDeath = getDateFrom(MainApp.cc.getCurrent_date());

                Date dateOfBirth = cal2.getTime();

                long diff = dateofDeath.getTime() - dateOfBirth.getTime();

                ageInYears = (diff / (24 * 60 * 60 * 1000)) / 365;

                if (dccc02.isChecked() && (ageInYears <= 49 && ageInYears >= 15)) {
                    fldGrpdcch.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcch.setVisibility(View.GONE);
                    dcch.clearCheck();
                }

                /*if (dccc02.isChecked()) {
                    Log.d("Date", "Year=" + year + " Month=" + (monthOfYear + 1) + " day=" + dayOfMonth);
                    if ((year - Calendar.getInstance().get(Calendar.YEAR)) >= 15
                            || (year - Calendar.getInstance().get(Calendar.YEAR)) <= 49) {
                        fldGrpdcch.setVisibility(View.VISIBLE);
                    } else {
                        fldGrpdcch.setVisibility(View.GONE);
                        dcch.clearCheck();
                    }
                }*/


            }
        });


        //===============================


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

//            MainApp.currentStatusCount -= 1;


        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

//        finish();
        MainApp.finishActivity(this, this);

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                MainApp.currentDeceasedCheck = 1;

//                    MainApp.currentStatusCount -= 1;


//                Intent secNext = new Intent(this, FamilyMembersActivity.class);
//                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);
        Long updcount = db.addDeceasedMembers(MainApp.dc);
        MainApp.dc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.dc.set_UID(
                    (MainApp.dc.getDeviceId() + MainApp.dc.get_ID()));
            db.updateDeceasedID();

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.dc = new DeceasedContract();
        MainApp.dc.set_UUID(MainApp.fc.getUID());
        MainApp.dc.setFormDate(MainApp.fc.getFormDate());
        MainApp.dc.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.dc.setUser(MainApp.fc.getUser());
        MainApp.dc.setDss_id_hh(MainApp.fc.getDSSID().toUpperCase());
        MainApp.dc.setDss_id_h(MainApp.cc.getDss_id_h().toUpperCase());
        MainApp.dc.setSite_code(MainApp.cc.getSite_code());
        MainApp.dc.set_DATE(MainApp.cc.get_DATE());

        MainApp.dc.setDevicetagID(sharedPref.getString("tagName", null));

        MainApp.dc.setDss_id_f(dccbfid.getText().toString().toUpperCase());
        MainApp.dc.setDss_id_m(dccbmid.getText().toString().toUpperCase());

        MainApp.dc.setDss_id_member(MainApp.cc.getDss_id_member().toUpperCase());

        MainApp.dc.setName(dcca.getText().toString());
        MainApp.dc.setRelation_hh(dccbrhh01.isChecked() ? "1" : dccbrhh02.isChecked() ? "2" : dccbrhh03.isChecked() ? "3"
                : dccbrhh04.isChecked() ? "4" : dccbrhh05.isChecked() ? "5" : dccbrhh06.isChecked() ? "6"
                : dccbrhh07.isChecked() ? "7" : dccbrhh08.isChecked() ? "8" : dccbrhh96.isChecked() ? "9"
                : dccbrhh10.isChecked() ? "10" : dccbrhh11.isChecked() ? "11" : dccbrhh99.isChecked() ? "99"
                : dccbrhh88.isChecked() ? "88" : "0");

        MainApp.dc.setGender(dccc01.isChecked() ? "1" : dccc02.isChecked() ? "2" : "0");
        MainApp.dc.setDod(MainApp.cc.getCurrent_date());
        if (dccdod02.isChecked()) {
            MainApp.dc.setDob(new SimpleDateFormat("dd-MM-yyyy").format(dccd.getCalendarView().getDate()));

        } else {
            MainApp.dc.setAgeY(dccey.getText().toString());
            MainApp.dc.setAgeM(dccem.getText().toString());
            MainApp.dc.setAgeD(dcced.getText().toString());
        }
        MainApp.dc.setRemarks(dccg.getText().toString());
        MainApp.dc.setWra(dcch01.isChecked() ? "1" : dcch02.isChecked() ? "2" : dcch03.isChecked() ? "3"
                : dcch04.isChecked() ? "4" : dcch05.isChecked() ? "5" : "0");



        /*JSONObject sC = new JSONObject();

        sC.put("dcca", dcca.getText().toString());
        sC.put("dccbrhh", dccbrhh01.isChecked() ? "1" : dccbrhh02.isChecked() ? "2" : dccbrhh03.isChecked() ? "3"
                : dccbrhh04.isChecked() ? "4" : dccbrhh05.isChecked() ? "5" : dccbrhh06.isChecked() ? "6"
                : dccbrhh07.isChecked() ? "7" : dccbrhh08.isChecked() ? "8" : dccbrhh96.isChecked() ? "9"
                : dccbrhh10.isChecked() ? "10" : dccbrhh11.isChecked() ? "11" : dccbrhh99.isChecked() ? "99"
                : dccbrhh88.isChecked() ? "88" : "0");
        sC.put("dccbfid", dccbfid.getText().toString());
        sC.put("dccbmid", dccbmid.getText().toString());
        sC.put("dccc", dccc01.isChecked() ? "1" : dccc02.isChecked() ? "2" : "0");
        sC.put("dccd", new SimpleDateFormat("dd-MM-yyyy").format(dccd.getCalendarView().getDate()));
        sC.put("dccey", dccey.getText().toString());
        sC.put("dccem", dccem.getText().toString());
        sC.put("dcced", dcced.getText().toString());
        sC.put("dccf", new SimpleDateFormat("dd-MM-yyyy").format(dccf.getCalendarView().getDate()));
        sC.put("dccg", dccg.getText().toString());
        sC.put("dcch", dcch01.isChecked() ? "1" : dcch02.isChecked() ? "2" : dcch03.isChecked() ? "3"
                : dcch04.isChecked() ? "4" : dcch05.isChecked() ? "5" : "0");


        //        MainApp.fc.setROW_sc(String.valueOf(sc));
*/
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ====================== Name ==============

        if (dcca.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcca), Toast.LENGTH_SHORT).show();
            dcca.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcca: This data is Required!");
            return false;
        } else {
            dcca.setError(null);
        }

        // ===================== Relation with HH ==============
        if (dccbrhh.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccbrhh), Toast.LENGTH_SHORT).show();
            dccbrhh99.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccbrhh: This data is Required!");
            return false;
        } else {
            dccbrhh99.setError(null);
        }

        //============= Father ID ====================

        if (dccbfid.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbbfid), Toast.LENGTH_SHORT).show();
            dccbfid.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccbfid: This data is Required!");
            return false;
        } else {
            dccbfid.setError(null);
        }

        // ============== MotherTB ID ===================

        if (dccbmid.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbbmid), Toast.LENGTH_SHORT).show();
            dccbmid.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccbmid: This data is Required!");
            return false;
        } else {
            dccbmid.setError(null);
        }

        // ============== Sex ===================

        if (dccc.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccc), Toast.LENGTH_SHORT).show();
            dccc02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccc: This data is Required!");
            return false;
        } else {
            dccc02.setError(null);
        }

        if (dccdod.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcce), Toast.LENGTH_SHORT).show();
            dccdod02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccdod: This data is Required!");
            return false;
        } else {
            dccdod02.setError(null);
        }


        if (dccage01.isChecked()) {
            // ================= Age in years ===========
            if (dccey.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccey), Toast.LENGTH_SHORT).show();
                dccey.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "dccey: This data is Required!");
                return false;
            } else {
                dccey.setError(null);
            }

            // ================= Age in months ===========
            if (dccem.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccem), Toast.LENGTH_SHORT).show();
                dccem.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "dccem: This data is Required!");
                return false;
            } else {
                dccem.setError(null);
            }

            // ================= Age in days ===========
            if (dcced.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcced), Toast.LENGTH_SHORT).show();
                dcced.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "dcced: This data is Required!");
                return false;
            } else {
                dcced.setError(null);
            }
        }

        // ============== Remarks ===================

        if (dccg.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccg), Toast.LENGTH_SHORT).show();
            dccg.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccg: This data is Required!");
            return false;
        } else {
            dccg.setError(null);
        }

        if (dccc02.isChecked() && ((ageInYears >= 15 && ageInYears <= 49)
                || (Integer.valueOf(dccey.getText().toString().isEmpty() ? "0" : dccey.getText().toString()) >= 15
                && Integer.valueOf(dccey.getText().toString().isEmpty() ? "0" : dccey.getText().toString()) <= 49))) {

            // ============== Status of WRA ===================

            if (dcch.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcch), Toast.LENGTH_SHORT).show();
                dcch05.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcch: This data is Required!");
                return false;
            } else {
                dcch05.setError(null);
            }
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

    public Date getDateFrom(String dateStr) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


}
