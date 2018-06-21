package edu.aku.hassannaqvi.rhdisease.activities.Form7;

import android.app.Activity;
import android.content.Intent;
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
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;

public class F07DActivity extends Activity {

    private static final String TAG = F07DActivity.class.getSimpleName();

    @BindView(R.id.f07d001)
    EditText f07d001;
    @BindView(R.id.f07d001999)
    CheckBox f07d001999;
    @BindView(R.id.f07d002)
    RadioGroup f07d002;
    @BindView(R.id.f07d002a)
    RadioButton f07d002a;
    @BindView(R.id.f07d002b)
    RadioButton f07d002b;
    @BindView(R.id.f07d002999)
    RadioButton f07d002999;
    @BindView(R.id.f07d003)
    LinearLayout f07d003;
    @BindView(R.id.f07d003a)
    CheckBox f07d003a;
    @BindView(R.id.f07d003b)
    CheckBox f07d003b;
    @BindView(R.id.f07d003c)
    CheckBox f07d003c;
    @BindView(R.id.f07d003d)
    CheckBox f07d003d;
    @BindView(R.id.f07d003888)
    CheckBox f07d003888;
    @BindView(R.id.f07d003888x)
    EditText f07d003888x;
    @BindView(R.id.f07d004)
    RadioGroup f07d004;
    @BindView(R.id.f07d004a)
    RadioButton f07d004a;
    @BindView(R.id.f07d004b)
    RadioButton f07d004b;
    @BindView(R.id.f07d004999)
    RadioButton f07d004999;
    @BindView(R.id.f07d005)
    RadioGroup f07d005;
    @BindView(R.id.f07d005a)
    RadioButton f07d005a;
    @BindView(R.id.f07d005aprob)
    EditText f07d005aprob;
    @BindView(R.id.f07d005b)
    RadioButton f07d005b;
    @BindView(R.id.f07d005999)
    RadioButton f07d005999;
    @BindView(R.id.f07d006)
    RadioGroup f07d006;
    @BindView(R.id.f07d006a)
    RadioButton f07d006a;
    @BindView(R.id.f07d006b)
    RadioButton f07d006b;
    @BindView(R.id.f07d006c)
    RadioButton f07d006c;
    @BindView(R.id.f07d006d)
    RadioButton f07d006d;
    @BindView(R.id.f07d006e)
    RadioButton f07d006e;
    @BindView(R.id.f07d006f)
    RadioButton f07d006f;
    @BindView(R.id.f07d006888)
    RadioButton f07d006888;
    @BindView(R.id.f07d006888x)
    EditText f07d006888x;
    @BindView(R.id.fldGrp002)
    LinearLayout fldGrp002;
    @BindView(R.id.fldGrp005)
    LinearLayout fldGrp005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f07_d);
        ButterKnife.bind(this);

        f07d001999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07d001.setVisibility(View.GONE);
                    f07d001.setText(null);
                } else {
                    f07d001.setVisibility(View.VISIBLE);
                }
            }
        });

        f07d002.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (f07d002a.isChecked()) {
                    fldGrp002.setVisibility(View.VISIBLE);
                } else {
                    fldGrp002.setVisibility(View.GONE);
                    f07d003a.setChecked(false);
                    f07d003b.setChecked(false);
                    f07d003c.setChecked(false);
                    f07d003d.setChecked(false);
                    f07d003888.setChecked(false);
                    f07d003888x.setText(null);

                }
            }
        });

        //=================== f07d003888 ==============
        f07d003888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f07d003888x.setVisibility(View.VISIBLE);
                } else {
                    f07d003888x.setVisibility(View.GONE);
                    f07d003888x.setText(null);
                }
            }
        });

        //=================== f07d003688 ==============
        f07d006888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f07d006888x.setVisibility(View.VISIBLE);
                } else {
                    f07d006888x.setVisibility(View.GONE);
                    f07d006888x.setText(null);
                }
            }
        });

        //=================== f07d005888 ==============
        f07d005a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f07d005aprob.setVisibility(View.VISIBLE);
                } else {
                    f07d005aprob.setVisibility(View.GONE);
                    f07d005aprob.setText(null);
                }
            }
        });

        f07d005.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (f07d005a.isChecked()) {
                    fldGrp005.setVisibility(View.VISIBLE);
                } else {
                    fldGrp005.setVisibility(View.GONE);
                    f07d006.clearCheck();
                    f07d006888x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        //if (check) {
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            finish();
            Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
            Intent endSec = new Intent(this, EndingActivity.class);
            endSec.putExtra("complete", false);
            startActivity(endSec);
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
        /*} else {
            Toast.makeText(this, "Click on Check Button", Toast.LENGTH_SHORT).show();
        }*/
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
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", true);
                startActivity(endSec);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateF07D();


        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject f07d = new JSONObject();

        f07d.put("f07d001", f07d001.getText().toString());
        f07d.put("f07d001999", f07d001999.isChecked() ? "999" : "0");
        f07d.put("f07d002", f07d002a.isChecked() ? "1" : f07d002b.isChecked() ? "2" : f07d002999.isChecked() ? "999" : "0");
        f07d.put("f07d003a", f07d003a.isChecked() ? "1" : "0");
        f07d.put("f07d003b", f07d003b.isChecked() ? "2" : "0");
        f07d.put("f07d003c", f07d003c.isChecked() ? "3" : "0");
        f07d.put("f07d003d", f07d003d.isChecked() ? "4" : "0");
        f07d.put("f07d003888", f07d003888.isChecked() ? "888" : "0");
        f07d.put("f07d003888x", f07d003888x.getText().toString());
        f07d.put("f07d004", f07d004a.isChecked() ? "1" : f07d004b.isChecked() ? "2" : f07d004999.isChecked() ? "999" : "0");
        f07d.put("f07d005", f07d005a.isChecked() ? "1" : f07d005b.isChecked() ? "2" : f07d005999.isChecked() ? "999" : "0");
        f07d.put("f07d005aprob", f07d005aprob.getText().toString());
        f07d.put("f07d006", f07d006a.isChecked() ? "1" : f07d006b.isChecked() ? "2" : f07d006c.isChecked() ? "3" : f07d006d.isChecked() ? "4" : f07d006e.isChecked() ? "5" : f07d006f.isChecked() ? "6" : f07d006888.isChecked() ? "888" : "0");
        f07d.put("f07d006888x", f07d006888x.getText().toString());

        MainApp.fc4.setF07d(String.valueOf(f07d));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        // ====================== f07d001 ===================
        if (!f07d001999.isChecked()) {
            if (f07d001.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07d001), Toast.LENGTH_SHORT).show();
                f07d001.setError("This data is Required!");

                Log.i(TAG, "f07d001: This Data is Required!");
                return false;
            } else {
                f07d001.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f07d001,1,9,getString(R.string.f07d001)," visits")) {
                return false;
            }
        }


        //=================== f07d002 ==============
        if (f07d002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07d002), Toast.LENGTH_SHORT).show();
            f07d002999.setError("This data is Required!");
            Log.i(TAG, "f07d002: This Data is Required!");
            return false;
        } else {
            f07d002999.setError(null);
        }

        if (f07d002a.isChecked()) {
            //=================== f07d003 ==============
            if (!validatorClass.EmptyCheckBox(this,f07d003,f07d003888,f07d003888x, getString(R.string.f07d003))){
                return false;
            }
        }
        //=================== f07d004 ==============
        if (f07d004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07d004), Toast.LENGTH_SHORT).show();
            f07d004999.setError("This data is Required!");
            Log.i(TAG, "f07d004: This Data is Required!");
            return false;
        } else {
            f07d004999.setError(null);
        }

        //=================== f07d005 ==============
        if (f07d005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07d005), Toast.LENGTH_SHORT).show();
            f07d005999.setError("This data is Required!");
            Log.i(TAG, "f07d005: This Data is Required!");
            return false;
        } else {
            f07d005999.setError(null);
        }

        if (f07d005a.isChecked() && f07d005aprob.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c005a), Toast.LENGTH_SHORT).show();
            f07d005aprob.setError("This data is required");
            Log.d(TAG, " f07d005aprob:empty ");
            return false;
        } else {
            f07d005aprob.setError(null);
        }

        if (f07d005a.isChecked()) {
            //=================== f07d006 ==============
            if (f07d006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07d006), Toast.LENGTH_SHORT).show();
                f07d006888.setError("This data is Required!");
                Log.i(TAG, "f07d006: This Data is Required!");
                return false;
            } else {
                f07d006888.setError(null);
            }

            if (f07d006888.isChecked() && f07d006888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07d006) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f07d006888x.setError("This data is required");
                Log.d(TAG, " f07d006888x :empty ");
                return false;
            } else {
                f07d006888x.setError(null);
            }
        }
        return true;
    }
}

