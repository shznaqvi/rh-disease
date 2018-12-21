package edu.aku.hassannaqvi.rhdisease.activities.Form8;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.contracts.FetusContract;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;

public class F08AActivity extends Activity {

    private static final String TAG = F08AActivity.class.getName();


    @BindView(R.id.f08a002)
    RadioGroup f08a002;
    @BindView(R.id.f08a002a)
    RadioButton f08a002a;
    @BindView(R.id.f08a002b)
    RadioButton f08a002b;
    @BindView(R.id.f08a002c)
    RadioButton f08a002c;
    @BindView(R.id.f08a002d)
    RadioButton f08a002d;
    @BindView(R.id.f08a002999)
    RadioButton f08a002999;
    @BindView(R.id.f08a003)
    EditText f08a003;
    @BindView(R.id.f08a003999)
    CheckBox f08a003999;
    @BindView(R.id.f08a004)
    EditText f08a004;
    @BindView(R.id.f08a004999)
    CheckBox f08a004999;
    @BindView(R.id.f08a005)
    EditText f08a005;
    @BindView(R.id.f08a005999)
    CheckBox f08a005999;
    @BindView(R.id.f08a006)
    EditText f08a006;
    @BindView(R.id.f08a006999)
    CheckBox f08a006999;
    @BindView(R.id.f08a007)
    EditText f08a007;
    @BindView(R.id.f08a007999)
    CheckBox f08a007999;
    @BindView(R.id.f08a008w)
    EditText f08a008w;
    @BindView(R.id.f08a008d)
    EditText f08a008d;
    @BindView(R.id.f08a008999)
    CheckBox f08a008999;
    @BindView(R.id.f08a009)
    RadioGroup f08a009;
    @BindView(R.id.f08a009a)
    RadioButton f08a009a;
    @BindView(R.id.f08a009b)
    RadioButton f08a009b;
    @BindView(R.id.f08a009c)
    RadioButton f08a009c;
    @BindView(R.id.f08a009d)
    RadioButton f08a009d;
    @BindView(R.id.f08a009e)
    RadioButton f08a009e;
    @BindView(R.id.f08a009f)
    RadioButton f08a009f;
    @BindView(R.id.f08a009g)
    RadioButton f08a009g;
    @BindView(R.id.f08a009h)
    RadioButton f08a009h;
    @BindView(R.id.f08a009i)
    RadioButton f08a009i;
    @BindView(R.id.f08a009999)
    RadioButton f08a009999;
    @BindView(R.id.f08a010)
    RadioGroup f08a010;
    @BindView(R.id.f08a010a)
    RadioButton f08a010a;
    @BindView(R.id.f08a010b)
    RadioButton f08a010b;
    @BindView(R.id.f08a010c)
    RadioButton f08a010c;
    @BindView(R.id.f08a010d)
    RadioButton f08a010d;
    @BindView(R.id.f08a010999)
    RadioButton f08a010999;
    @BindView(R.id.f08a011)
    RadioGroup f08a011;
    @BindView(R.id.f08a011a)
    RadioButton f08a011a;
    @BindView(R.id.f08a011b)
    RadioButton f08a011b;
    @BindView(R.id.f08a012)
    EditText f08a012;
    @BindView(R.id.f08a013)
    EditText f08a013;
    @BindView(R.id.fldGrpf08012)
    LinearLayout fldGrpf08012;
    @BindView(R.id.f08a013999)
    CheckBox f08a013999;
    @BindView(R.id.count)
    TextView count;

    @BindView(R.id.facilityName)
    RadioGroup facilityName;
    @BindView(R.id.facilityName1)
    RadioButton facilityName1;
    @BindView(R.id.facilityName2)
    RadioButton facilityName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f08_a);
        ButterKnife.bind(this);

        count.setText("Fetus: " + MainApp.FetusCount + " out of " + MainApp.TotalFetusCount);

        f08a003999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f08a003.setVisibility(View.GONE);
                    f08a003.setText(null);
                } else {
                    f08a003.setVisibility(View.VISIBLE);
                }
            }
        });

        f08a004999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f08a004.setVisibility(View.GONE);
                    f08a004.setText(null);
                } else {
                    f08a004.setVisibility(View.VISIBLE);
                }
            }
        });

        f08a005999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f08a005.setVisibility(View.GONE);
                    f08a005.setText(null);
                } else {
                    f08a005.setVisibility(View.VISIBLE);
                }
            }
        });

        f08a006999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f08a006.setVisibility(View.GONE);
                    f08a006.setText(null);
                } else {
                    f08a006.setVisibility(View.VISIBLE);
                }
            }
        });

        f08a007999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f08a007.setVisibility(View.GONE);
                    f08a007.setText(null);
                } else {
                    f08a007.setVisibility(View.VISIBLE);
                }
            }
        });

        f08a008999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f08a008w.setVisibility(View.GONE);
                    f08a008d.setVisibility(View.GONE);
                    f08a008d.setText(null);
                    f08a008w.setText(null);
                } else {
                    f08a008d.setVisibility(View.VISIBLE);
                    f08a008w.setVisibility(View.VISIBLE);
                }
            }
        });

        f08a011.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f08a011a.isChecked()) {
                    fldGrpf08012.setVisibility(View.VISIBLE);
                } else {
                    fldGrpf08012.setVisibility(View.GONE);
                    f08a012.setText(null);
                }
            }
        });

        f08a013999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f08a013.setVisibility(View.GONE);
                    f08a013.setText(null);
                } else {
                    f08a013.setVisibility(View.VISIBLE);

                }
            }
        });


    }


    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();


        /*if (!f08a001999.isChecked()) {
            //        01
            if (f08a001.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a001), Toast.LENGTH_SHORT).show();
                f08a001.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a002: This data is Required!");
                return false;
            } else {
                f08a001.setError(null);
            }
        }*/


        //
        if (facilityName.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.facilityName), Toast.LENGTH_SHORT).show();
            facilityName1.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f08a002: This data is Required!");
            return false;
        } else {
            facilityName1.setError(null);
        }
        //      02
        if (f08a002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a002), Toast.LENGTH_SHORT).show();
            f08a002a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f08a002: This data is Required!");
            return false;
        } else {
            f08a002a.setError(null);
        }


        if (!f08a003999.isChecked()) {
            //        03
            if (f08a003.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a003), Toast.LENGTH_SHORT).show();
                f08a003.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a003: This data is Required!");
                return false;
            } else {
                f08a003.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f08a003,100,170,getString(R.string.f08a003)," bpm")) {
                return false;
            }
        }


        if (!f08a004999.isChecked()) {
            //        04
            if (f08a004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a004), Toast.LENGTH_SHORT).show();
                f08a004.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a004: This data is Required!");
                return false;
            } else {
                f08a004.setError(null);
            }
        }


        if (!f08a005999.isChecked()) {
            //        05
            if (f08a005.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a005), Toast.LENGTH_SHORT).show();
                f08a005.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a005: This data is Required!");
                return false;
            } else {
                f08a005.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f08a005,280,350,getString(R.string.f08a005)," mm")) {
               return false;
            }
        }


        if (!f08a006999.isChecked()) {
            //        06
            if (f08a006.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a006), Toast.LENGTH_SHORT).show();
                f08a006.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a006: This data is Required!");
                return false;
            } else {
                f08a006.setError(null);
            }
        }


        if (!f08a007999.isChecked()) {

            //        07
            if (f08a007.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a007), Toast.LENGTH_SHORT).show();
                f08a007.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a007: This data is Required!");
                return false;
            } else {
                f08a007.setError(null);
            }
        }


        if (!f08a008999.isChecked()) {

            //        08w
            if (f08a008w.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.weeks), Toast.LENGTH_SHORT).show();
                f08a008w.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a008w: This data is Required!");
                return false;
            } else {
                f08a008w.setError(null);
            }


            //        08d
            if (f08a008d.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                f08a008d.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a008d: This data is Required!");
                return false;
            } else {
                f08a008d.setError(null);
            }
        }


        //        09
        if (f08a009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a009), Toast.LENGTH_SHORT).show();
            f08a009a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f08a009: This data is Required!");
            return false;
        } else {
            f08a009a.setError(null);
        }


        //        10
        if (f08a010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a010), Toast.LENGTH_SHORT).show();
            f08a010a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f08a010: This data is Required!");
            return false;
        } else {
            f08a010a.setError(null);
        }


        //        11
        if (f08a011.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a011), Toast.LENGTH_SHORT).show();
            f08a011a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f08a011: This data is Required!");
            return false;
        } else {
            f08a011a.setError(null);
        }


        if (f08a011a.isChecked()) {
            //        12
            if (f08a012.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a012), Toast.LENGTH_SHORT).show();
                f08a012.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a012: This data is Required!");
                return false;
            } else {
                f08a012.setError(null);
            }
        }


        if (!f08a013999.isChecked()) {
            //        13
            if (f08a013.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a013), Toast.LENGTH_SHORT).show();
                f08a013.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a013: This data is Required!");
                return false;
            } else {
                f08a013.setError(null);
            }
        }


        return true;
    }

    private void SaveDraft() throws JSONException {


        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.fec = new FetusContract();

        MainApp.fec.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fec.setUser(MainApp.userName);
        MainApp.fec.set_UUID(MainApp.fc.get_UID());
        MainApp.fec.setParticipantID(MainApp.fc.getParticipantID());
        MainApp.fec.setFormType(MainApp.fc.getFormType());
        MainApp.fec.setFormDate(MainApp.fc.getFormDate());
        MainApp.fec.setDeviceID(MainApp.fc.getDeviceID());
        MainApp.fec.setApp_version(MainApp.versionName + "." + MainApp.versionCode);


        JSONObject f8 = new JSONObject();


       /* if (f08a001999.isChecked()) {
            f8.put("f08a001", "999");
        } else {
            f8.put("f08a001", f08a001.getText().toString());
        }*/

        f8.put("f08facility", facilityName1.isChecked() ? "1" : facilityName2.isChecked() ? "2" : "0");
        f8.put("f08a002", f08a002a.isChecked() ? "1"
                : f08a002b.isChecked() ? "2"
                : f08a002c.isChecked() ? "3"
                : f08a002d.isChecked() ? "4"
                : 0);

        if (f08a003999.isChecked()) {
            f8.put("f08a003", "999");
        } else {
            f8.put("f08a003", f08a003.getText().toString());
        }


        if (f08a004999.isChecked()) {
            f8.put("f08a004", "999");
        } else {
            f8.put("f08a004", f08a004.getText().toString());
        }


        if (f08a005999.isChecked()) {
            f8.put("f08a005", "999");
        } else {
            f8.put("f08a005", f08a005.getText().toString());
        }


        if (f08a006999.isChecked()) {
            f8.put("f08a006", "999");
        } else {
            f8.put("f08a006", f08a006.getText().toString());
        }


        if (f08a007999.isChecked()) {
            f8.put("f08a007", "999");
        } else {
            f8.put("f08a007", f08a007.getText().toString());
        }


        f8.put("f08a008w", f08a008w.getText().toString());
        f8.put("f08a008d", f08a008d.getText().toString());
        f8.put("f08a008999", f08a008999.isChecked() ? "999" : "0");


        f8.put("f08a009", f08a009a.isChecked() ? "1"
                : f08a009b.isChecked() ? "2"
                : f08a009c.isChecked() ? "3"
                : f08a009d.isChecked() ? "4"
                : f08a009e.isChecked() ? "5"
                : f08a009f.isChecked() ? "6"
                : f08a009g.isChecked() ? "7"
                : f08a009h.isChecked() ? "8"
                : f08a009i.isChecked() ? "9"
                : f08a009999.isChecked() ? "999"
                : 0);

        f8.put("f08a010", f08a010a.isChecked() ? "1"
                : f08a010b.isChecked() ? "2"
                : f08a010c.isChecked() ? "3"
                : f08a010d.isChecked() ? "4"
                : f08a010999.isChecked() ? "999"
                : 0);

        f8.put("f08a011", f08a011a.isChecked() ? "1"
                : f08a011b.isChecked() ? "2"
                : 0);

        f8.put("f08a012", f08a012.getText().toString());
        f8.put("f08a013", f08a013.getText().toString());


        MainApp.fec.setF08(String.valueOf(f8));

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.endActivity(this, this);
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement

        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                if (MainApp.FetusCount < MainApp.TotalFetusCount) {
                    Intent intent = new Intent(this, F08AActivity.class);
                    MainApp.FetusCount++;
                    startActivity(intent);
                } else {
                    Intent secNext = new Intent(this, EndingActivity.class);
                    secNext.putExtra("complete", true);
                    startActivity(secNext);
                }


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addFetus(MainApp.fec);

        MainApp.fec.set_ID(String.valueOf(updcount));

        if (updcount > 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fec.set_UID(
                    (MainApp.fc.getDeviceID() + MainApp.fec.get_ID()));
            db.updateFetusID();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        }

        return true;
    }

}