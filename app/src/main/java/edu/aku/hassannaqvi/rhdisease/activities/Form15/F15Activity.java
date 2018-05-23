package edu.aku.hassannaqvi.rhdisease.activities.Form15;


import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import butterknife.ButterKnife;


import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.databinding.ActivityF15Binding;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;
import io.blackbox_vision.datetimepickeredittext.view.TimePickerEditText;
public class F15Activity extends AppCompatActivity {

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());
    ActivityF15Binding bi;
/*
    @BindView(R.id.f15rhstatus)
    RadioGroup f15rhstatus;
    @BindView(R.id.f15rhstatusa)
    RadioButton f15rhstatusa;
    @BindView(R.id.f15rhstatusb)
    RadioButton f15rhstatusb;
    @BindView(R.id.f15rhstatus999)
    RadioButton f15rhstatus999;
    @BindView(R.id.f15researchpersonnel)
    EditText f15researchpersonnel;

    @BindView(R.id.f1502)
    RadioGroup f1502;
    @BindView(R.id.f1502a)
    RadioButton f1502a;
    @BindView(R.id.f1502b)
    RadioButton f1502b;
    @BindView(R.id.f1502c)
    RadioButton f1502c;
    @BindView(R.id.f1502888)
    RadioButton f1502888;
    @BindView(R.id.f1502888x)
    EditText f1502888x;

    @BindView(R.id.f1503)
    RadioGroup f1503;
    @BindView(R.id.f1503a)
    RadioButton f1503a;
    @BindView(R.id.f1503b)
    RadioButton f1503b;
    @BindView(R.id.f1503c)
    RadioButton f1503c;
    @BindView(R.id.f1503d)
    RadioButton f1503d;
    @BindView(R.id.f1503888)
    RadioButton f1503888;
    @BindView(R.id.f1503cx)
    EditText f1503cx;
    @BindView(R.id.f1503dx)
    EditText f1503dx;
    @BindView(R.id.f1503888x)
    EditText f1503888x;

    @BindView(R.id.f1504date)
    DatePickerInputEditText f1504date;
    @BindView(R.id.f1504time)
    TimePickerEditText f1504time;

     @BindView(R.id.f1505)
    RadioGroup f1505;
    @BindView(R.id.f1505a)
    RadioButton f1505a;
    @BindView(R.id.f1505b)
    RadioButton f1505b;
    @BindView(R.id.f1505999)
    RadioButton f1505999;

     @BindView(R.id.f1506)
    RadioGroup f1506;
    @BindView(R.id.f1506a)
    RadioButton f1506a;
    @BindView(R.id.f1506b)
    RadioButton f1506b;


    @BindView(R.id.f1507event)
    EditText f1507event;
    @BindView(R.id.f1507management)
    EditText f1507management;

      @BindView(R.id.f1508)
    RadioGroup f1508;
        @BindView(R.id.f1508a)
    RadioButton f1508a;
    @BindView(R.id.f1508b)
    RadioButton f1508b;

    @BindView(R.id.f1509)
    RadioGroup f1509;
    @BindView(R.id.f1509a)
    RadioButton f1509a;
   @BindView(R.id.f1509b)
    RadioButton f1509b;
    @BindView(R.id.f1509999)
    RadioButton f1509999;

     @BindView(R.id.f1510)
    EditText f1510;
     @BindView(R.id.fldGrpf1510)
    LinearLayout fldGrpf1510;

*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_f15);
//        ButterKnife.bind(this);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_f15);
        bi.setCallback(this);
        bi.f1504date.setManager(getSupportFragmentManager());
        bi.f1504date.setMaxDate(dateToday);
        bi.f1504time.setManager(getSupportFragmentManager());
        bi.f1504time.setTimeFormat("HH:mm");

        bi.f1509.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.f1509b) {
                    bi.fldGrpf1510.setVisibility(View.GONE);
                    bi.f1510.setText(null);
                } else {
                    bi.fldGrpf1510.setVisibility(View.VISIBLE);
                }
            }
        });

    }

   public void BtnContinue() {
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent secNext = new Intent(this, EndingActivity.class);
                secNext.putExtra("complete", true);
                startActivity(secNext);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this,"You cannot go back!",Toast.LENGTH_SHORT).show();
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        //MainApp.fc = new FormsContract();

        MainApp.fc.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fc.setFormDate(dtToday);
        MainApp.fc.setUser(MainApp.userName);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        //MainApp.fc.setParticipantID(participantID.getText().toString());
        MainApp.fc.setFormType(MainApp.FORM15);
        MainApp.fc.setApp_version(MainApp.versionName + "." + MainApp.versionCode);
        JSONObject f15 = new JSONObject();

        f15.put("f15rhstatus", bi.f15rhstatusa.isChecked() ? "1" : bi.f15rhstatusb.isChecked() ? "2" : bi.f15rhstatus999.isChecked() ? "999" : "0");
        f15.put("f15researchpersonnel", bi.f15researchpersonnel.getText().toString());
        f15.put("f1501dt", dtToday);
        f15.put("f1502", bi.f1502a.isChecked() ? "1" : bi.f1502b.isChecked() ? "2" : bi.f1502c.isChecked() ? "3" : bi.f1502888.isChecked() ? "888" : "0");
        f15.put("f1502888x", bi.f1502888x.getText().toString());
        f15.put("f1503", bi.f1503a.isChecked() ? "1" : bi.f1503b.isChecked() ? "2" : bi.f1503c.isChecked() ? "3" :bi.f1503d.isChecked() ? "4" : bi.f1503888.isChecked() ? "888" : "0");
        f15.put("f1503cx", bi.f1503cx.getText().toString());
        f15.put("f1503dx", bi.f1503dx.getText().toString());
        f15.put("f1503888x", bi.f1503888x.getText().toString());
        f15.put("f1504dt", bi.f1504date.getText().toString());
        f15.put("f1504t", bi.f1504time.getText().toString());
        f15.put("f1505", bi.f1505a.isChecked() ? "1" : bi.f1505b.isChecked() ? "2" : bi.f1505999.isChecked() ? "999" : "0");
        f15.put("f1506", bi.f1506a.isChecked() ? "1" : bi.f1506b.isChecked() ? "2" : "0");
        f15.put("f1507event", bi.f1507event.getText().toString());
        f15.put("f1507management", bi.f1507management.getText().toString());
        f15.put("f1508", bi.f1508a.isChecked() ? "1" : bi.f1508b.isChecked() ? "2" : "0");
        f15.put("f1509", bi.f1509a.isChecked() ? "1" : bi.f1509b.isChecked() ? "2" :bi.f1509999.isChecked() ? "999" : "0");
        f15.put("f1510", bi.f1510.getText().toString());

        MainApp.fc.setF15(String.valueOf(f15));
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {
        if (!validatorClass.EmptyRadioButton(this, bi.f15rhstatus, bi.f15rhstatusa, getString(R.string.f15rhstatus))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.f15researchpersonnel, getString(R.string.f15researchpersonnel))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.f1502, bi.f1502888, bi.f1502888x, getString(R.string.f1502))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.f1503, bi.f1503a, getString(R.string.f1503))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.f1503, bi.f1503c, bi.f1503cx, getString(R.string.f1503))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.f1503, bi.f1503d, bi.f1503dx, getString(R.string.f1503))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.f1503, bi.f1503888, bi.f1503888x, getString(R.string.f1503))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.f1504date, getString(R.string.f1504) + " date")) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.f1504time, getString(R.string.f1504) + " time")) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.f1505, bi.f1505a, getString(R.string.f1505))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.f1506, bi.f1506a, getString(R.string.f1506))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.f1507event, getString(R.string.f1507event))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.f1507management, getString(R.string.f1507management))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.f1508, bi.f1508a, getString(R.string.f1508))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.f1509, bi.f1509a, getString(R.string.f1509))) {
            return false;
        }
        if (bi.f1509b.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.f1510, getString(R.string.f1510))) {
                return false;
            }
        }
        return true;
    }
    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);
        int updcount = db.updateF015();
        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

   public void BtnEnd() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.endActivity(this, this);
    }

}
