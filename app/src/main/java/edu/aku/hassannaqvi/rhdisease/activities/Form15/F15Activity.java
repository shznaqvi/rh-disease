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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

    Date date = new GregorianCalendar(2018, Calendar.JUNE, 27).getTime(); // as told by amjad bhai
    String fixedminDate = new SimpleDateFormat("dd/MM/yyyy").format(date);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_f15);
        bi.setCallback(this);
        bi.f15d.setManager(getSupportFragmentManager());
        bi.f15t.setManager(getSupportFragmentManager());
        bi.f15t.setTimeFormat("HH:mm");
        bi.f15d.setMinDate(fixedminDate);
        bi.f15d.setMaxDate(dateToday);

        bi.f1504date.setManager(getSupportFragmentManager());
        bi.f1504date.setMaxDate(dateToday);
        bi.f1504time.setManager(getSupportFragmentManager());
        bi.f1504time.setTimeFormat("HH:mm");

        bi.f1509.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!bi.f1509a.isChecked()) {
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
        f15.put("f15adversed", bi.f15d.getText().toString());
        f15.put("f15adverset", bi.f15t.getText().toString());
        f15.put("f15rhstatus", bi.f15rhstatusa.isChecked() ? "1" : bi.f15rhstatusb.isChecked() ? "2" : bi.f15rhstatus999.isChecked() ? "999" : "0");
//        f15.put("f15researchpersonnel", bi.f15researchpersonnel.getText().toString());
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
       /* if (!validatorClass.EmptyTextBox(this, bi.f15researchpersonnel, getString(R.string.f15researchpersonnel))) {
            return false;
        }
*/
        if (!validatorClass.EmptyTextBox(this, bi.f15d, getString(R.string.f15dt) +" "+getString(R.string.date))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.f15t, getString(R.string.f15dt) +" "+getString(R.string.time))) {
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
        if (bi.f1509a.isChecked()) {
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
