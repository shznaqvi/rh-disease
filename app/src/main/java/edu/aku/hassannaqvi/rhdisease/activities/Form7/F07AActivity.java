package edu.aku.hassannaqvi.rhdisease.activities.Form7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;

public class F07AActivity extends Activity {

    private static final String TAG = F07AActivity.class.getName();
    @BindView(R.id.f07a001)
    EditText f07a001;
    @BindView(R.id.f07a001999)
    CheckBox f07a001999;
    @BindView(R.id.f07a002)
    RadioGroup f07a002;
    @BindView(R.id.f07a002a)
    RadioButton f07a002a;
    @BindView(R.id.f07a002b)
    RadioButton f07a002b;
    @BindView(R.id.fldGrpf07a03)
    LinearLayout fldGrpf07a03;
    @BindView(R.id.f07a003)
    RadioGroup f07a003;
    @BindView(R.id.f07a003a)
    RadioButton f07a003a;
    @BindView(R.id.f07a003b)
    RadioButton f07a003b;
    @BindView(R.id.f07a003c)
    RadioButton f07a003c;
    @BindView(R.id.f07a003d)
    RadioButton f07a003d;
    @BindView(R.id.f07a003e)
    RadioButton f07a003e;
    @BindView(R.id.f07a003f)
    RadioButton f07a003f;
    @BindView(R.id.f07a003g)
    RadioButton f07a003g;
    @BindView(R.id.f07a003h)
    RadioButton f07a003h;
    @BindView(R.id.f07a003i)
    RadioButton f07a003i;
    @BindView(R.id.f07a003j)
    RadioButton f07a003j;
    @BindView(R.id.f07a003k)
    RadioButton f07a003k;
    @BindView(R.id.f07a003l)
    RadioButton f07a003l;
    @BindView(R.id.f07a003888)
    RadioButton f07a003888;
    @BindView(R.id.f07a003999)
    RadioButton f07a003999;
    @BindView(R.id.f07a003888x)
    EditText f07a003888x;
    @BindView(R.id.f07a004)
    RadioGroup f07a004;
    @BindView(R.id.f07a004a)
    RadioButton f07a004a;
    @BindView(R.id.f07a004b)
    RadioButton f07a004b;
    @BindView(R.id.f07a004c)
    RadioButton f07a004c;
    @BindView(R.id.f07a004d)
    RadioButton f07a004d;
    @BindView(R.id.f07a004e)
    RadioButton f07a004e;
    @BindView(R.id.f07a004888)
    RadioButton f07a004888;
    @BindView(R.id.f07a004888x)
    EditText f07a004888x;
    @BindView(R.id.f07a005)
    RadioGroup f07a005;
    @BindView(R.id.f07a005a)
    RadioButton f07a005a;
    @BindView(R.id.f07a005b)
    RadioButton f07a005b;
    @BindView(R.id.f07a005999)
    RadioButton f07a005999;
    @BindView(R.id.fldGrpf07a06)
    LinearLayout fldGrpf07a06;
    @BindView(R.id.f07a006)
    RadioGroup f07a006;
    @BindView(R.id.f07a006a)
    RadioButton f07a006a;
    @BindView(R.id.f07a006b)
    RadioButton f07a006b;
    @BindView(R.id.f07a006c)
    RadioButton f07a006c;
    @BindView(R.id.f07a006888)
    RadioButton f07a006888;
    @BindView(R.id.f07a006888x)
    EditText f07a006888x;
    @BindView(R.id.f07a007)
    RadioGroup f07a007;
    @BindView(R.id.f07a007a)
    RadioButton f07a007a;
    @BindView(R.id.f07a007b)
    RadioButton f07a007b;
    @BindView(R.id.fldGrpf07a08)
    LinearLayout fldGrpf07a08;
    @BindView(R.id.f07a008)
    RadioGroup f07a008;
    @BindView(R.id.f07a008a)
    RadioButton f07a008a;
    @BindView(R.id.f07a008b)
    RadioButton f07a008b;
    @BindView(R.id.f07a008c)
    RadioButton f07a008c;
    @BindView(R.id.f07a008d)
    RadioButton f07a008d;
    @BindView(R.id.f07a008e)
    RadioButton f07a008e;
    @BindView(R.id.f07a008f)
    RadioButton f07a008f;
    @BindView(R.id.f07a008g)
    RadioButton f07a008g;
    @BindView(R.id.f07a008888)
    RadioButton f07a008888;
    @BindView(R.id.f07a008888x)
    EditText f07a008888x;
    @BindView(R.id.f07a009)
    EditText f07a009;
    @BindView(R.id.f07a010)
    EditText f07a010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f07_a);
        ButterKnife.bind(this);

//        Skip Patterns

//        01
        f07a001999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07a001.setVisibility(View.GONE);
                    f07a001.setText(null);
                } else {
                    f07a001.setVisibility(View.VISIBLE);
                }
            }
        });

//        02
        f07a002.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.f07a002b) {
                    fldGrpf07a03.setVisibility(View.GONE);
                    f07a003.clearCheck();
                    f07a003888x.setText(null);
                } else {
                    fldGrpf07a03.setVisibility(View.VISIBLE);
                }
            }
        });

//        03
        f07a003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.f07a003888) {
                    f07a003888x.setVisibility(View.VISIBLE);
                } else {
                    f07a003888x.setVisibility(View.GONE);
                    f07a003888x.setText(null);
                }
            }
        });

//        04
        f07a004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.f07a004888) {
                    f07a004888x.setVisibility(View.VISIBLE);
                } else {
                    f07a004888x.setVisibility(View.GONE);
                    f07a004888x.setText(null);
                }
            }
        });

//        05
        f07a005.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.f07a005b) {
                    fldGrpf07a06.setVisibility(View.GONE);
                    f07a006.clearCheck();
                    f07a006888x.setText(null);
                } else {
                    fldGrpf07a06.setVisibility(View.VISIBLE);
                }
            }
        });

//        06
        f07a006.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.f07a006888) {
                    f07a006888x.setVisibility(View.VISIBLE);
                } else {
                    f07a006888x.setVisibility(View.GONE);
                    f07a006888x.setText(null);
                }
            }
        });

//        07
        f07a007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.f07a007b) {
                    fldGrpf07a08.setVisibility(View.GONE);
                    f07a008.clearCheck();
                    f07a008888x.setText(null);

                    f07a009.setText(null);
                    f07a010.setText(null);
                } else {
                    fldGrpf07a08.setVisibility(View.VISIBLE);
                }
            }
        });

//        08
        f07a008.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.f07a008888) {
                    f07a008888x.setVisibility(View.VISIBLE);
                } else {
                    f07a008888x.setVisibility(View.GONE);
                    f07a008888x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

      //  Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
      //  Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        MainApp.endActivity(this, this);
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, F07BActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addForm(MainApp.fc4);

        MainApp.fc4.set_ID(String.valueOf(updcount));

        if (updcount > 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fc4.set_UID(
                    (MainApp.fc4.getDeviceID() + MainApp.fc4.get_ID()));
            db.updateForm4ID();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        }

        return true;

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        //MainApp.fc4 = new FormsContract();

        MainApp.formType = "7";
        MainApp.fc4.setFormType("7");
        MainApp.fc4.setDevicetagID(MainApp.fc.getDevicetagID());
        MainApp.fc4.setFormDate(new SimpleDateFormat("dd-MM-yy HH:mm").format(System.currentTimeMillis()));
        MainApp.fc4.setUser(MainApp.userName);
        MainApp.fc4.setDeviceID(MainApp.fc.getDeviceID());
        MainApp.fc4.setApp_version(MainApp.fc.getApp_version());
        MainApp.fc4.setParticipantID(MainApp.fc.getParticipantID());
        MainApp.fc4.set_UUID(MainApp.fc.get_UID());


        JSONObject sF07A = new JSONObject();

        sF07A.put("f07a001", f07a001999.isChecked() ? "999" : f07a001.getText().toString());
        sF07A.put("f07a002", f07a002a.isChecked() ? "1" : f07a002b.isChecked() ? "2" : "0");
        sF07A.put("f07a003", f07a003a.isChecked() ? "1" : f07a003b.isChecked() ? "2" : f07a003c.isChecked() ? "3" : f07a003d.isChecked() ? "4" :
                f07a003e.isChecked() ? "5" : f07a003f.isChecked() ? "6" : f07a003g.isChecked() ? "7" : f07a003h.isChecked() ? "8" :
                        f07a003i.isChecked() ? "9" : f07a003j.isChecked() ? "10" : f07a003k.isChecked() ? "11" : f07a003l.isChecked() ? "11"
                                : f07a003888.isChecked() ? "888" : f07a003999.isChecked() ? "999" : "0");
        sF07A.put("f07a003888x", f07a003888x.getText().toString());
        sF07A.put("f07a004", f07a004a.isChecked() ? "1" : f07a004b.isChecked() ? "2" : f07a004c.isChecked() ? "3" : f07a004d.isChecked() ? "4" :
                f07a004e.isChecked() ? "5" : f07a004888.isChecked() ? "888" : "0");
        sF07A.put("f07a004888x", f07a004888x.getText().toString());
        sF07A.put("f07a005", f07a005a.isChecked() ? "1" : f07a005b.isChecked() ? "2" : f07a005999.isChecked() ? "999" : "0");
        sF07A.put("f07a006", f07a006a.isChecked() ? "1" : f07a006b.isChecked() ? "2" : f07a006c.isChecked() ? "3" : f07a006888.isChecked() ? "888" : "0");
        sF07A.put("f07a006888x", f07a006888x.getText().toString());
        sF07A.put("f07a007", f07a007a.isChecked() ? "1" : f07a007b.isChecked() ? "2" : "0");
        sF07A.put("f07a008", f07a008a.isChecked() ? "1" : f07a008b.isChecked() ? "2" : f07a008c.isChecked() ? "3" : f07a008d.isChecked() ? "4" :
                f07a008e.isChecked() ? "5" : f07a008f.isChecked() ? "6" : f07a008g.isChecked() ? "7" : f07a008888.isChecked() ? "888" : "0");
        sF07A.put("f07a008888x", f07a008888x.getText().toString());
        sF07A.put("f07a009", f07a009.getText().toString());
        sF07A.put("f07a010", f07a010.getText().toString());

        MainApp.fc4.setF07a(String.valueOf(sF07A));
        //MainApp.fc.setF07a(String.valueOf(sF07A));

        setGPS();

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

//        01
        if (!f07a001999.isChecked()) {
            if (f07a001.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a001) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f07a001.setError("This data is Required!");

                Log.i(TAG, "f03a011888x: This Data is Required!");
                return false;
            } else {
                f07a001.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f07a001,15,49,getString(R.string.f07a001)," Age")) {
                return false;
            }
        }

//        02
        if (f07a002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a002), Toast.LENGTH_SHORT).show();
            f07a002a.setError("This data is required");
            Log.d(TAG, "f07a002:empty ");
            return false;
        } else {
            f07a002a.setError(null);
        }

//        03
        if (f07a002a.isChecked()) {
            if (f07a003.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a003), Toast.LENGTH_SHORT).show();
                f07a003888.setError("This data is required");
                Log.d(TAG, "f07a003:empty ");
                return false;
            } else {
                f07a003888.setError(null);
            }

            if (f07a003888.isChecked() && f07a003888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a003) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f07a003888x.setError("This data is Required!");

                Log.i(TAG, "f07a003888x: This Data is Required!");
                return false;
            } else {
                f07a003888x.setError(null);
            }
        }

//        04
        if (f07a004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a004), Toast.LENGTH_SHORT).show();
            f07a004888.setError("This data is required");
            Log.d(TAG, "f07a004:empty ");
            return false;
        } else {
            f07a004888.setError(null);
        }

        if (f07a004888.isChecked() && f07a004888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a004) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f07a004888x.setError("This data is Required!");

            Log.i(TAG, "f07a004888x: This Data is Required!");
            return false;
        } else {
            f07a004888x.setError(null);
        }

//        05
        if (f07a005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a005), Toast.LENGTH_SHORT).show();
            f07a005a.setError("This data is required");
            Log.d(TAG, "f07a005:empty ");
            return false;
        } else {
            f07a005a.setError(null);
        }

//        06
        if (!f07a005b.isChecked()) {
            if (f07a006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a006), Toast.LENGTH_SHORT).show();
                f07a006888.setError("This data is required");
                Log.d(TAG, "f07a006:empty ");
                return false;
            } else {
                f07a006888.setError(null);
            }

            if (f07a006888.isChecked() && f07a006888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a006) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f07a006888x.setError("This data is Required!");

                Log.i(TAG, "f07a006888x: This Data is Required!");
                return false;
            } else {
                f07a006888x.setError(null);
            }
        }

//        07
        if (f07a007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a007), Toast.LENGTH_SHORT).show();
            f07a007a.setError("This data is required");
            Log.d(TAG, "f07a007:empty ");
            return false;
        } else {
            f07a007a.setError(null);
        }

//        08 09 10
        if (f07a007a.isChecked()) {
//            08
            if (f07a008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a008), Toast.LENGTH_SHORT).show();
                f07a008888.setError("This data is required");
                Log.d(TAG, "f07a008:empty ");
                return false;
            } else {
                f07a008888.setError(null);
            }

            if (f07a008888.isChecked() && f07a008888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a008) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f07a008888x.setError("This data is Required!");

                Log.i(TAG, "f07a008888x: This Data is Required!");
                return false;
            } else {
                f07a008888x.setError(null);
            }

//            09
            if (f07a009.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a009) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f07a009.setError("This data is Required!");

                Log.i(TAG, "f03a011888x: This Data is Required!");
                return false;
            } else {
                f07a009.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f07a009,0,7,getString(R.string.f07a009)," Days")) {
                return false;
            }

//            10
            if (f07a010.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07a010) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f07a010.setError("This data is Required!");

                Log.i(TAG, "f03a011888x: This Data is Required!");
                return false;
            } else {
                f07a010.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f07a010,1,16,getString(R.string.f07a010)," Hours")) {
                return false;
            }
        }

        return true;

    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

//        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        try {
            String lat = GPSPref.getString("Latitude", "0");
            String lang = GPSPref.getString("Longitude", "0");
            String acc = GPSPref.getString("Accuracy", "0");
            String dt = GPSPref.getString("Time", "0");

            if (lat == "0" && lang == "0") {
                Toast.makeText(this, "Could not obtained GPS points", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
            }

            String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

            MainApp.fc4.setGpsLat(GPSPref.getString("Latitude", "0"));
            MainApp.fc4.setGpsLng(GPSPref.getString("Longitude", "0"));
            MainApp.fc4.setGpsAcc(GPSPref.getString("Accuracy", "0"));
//            AppMain.fc.setGpsTime(GPSPref.getString(date, "0")); // Timestamp is converted to date above
            MainApp.fc4.setGpsDT(date); // Timestamp is converted to date above

            Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Log.e(TAG, "setGPS: " + e.getMessage());
        }

    }
}
