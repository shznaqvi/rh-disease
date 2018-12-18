package edu.aku.hassannaqvi.rhdisease.activities.Form17;

import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.databinding.ActivityForm17Binding;
import edu.aku.hassannaqvi.rhdisease.validation.ClearClass;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;

public class Form17Activity extends AppCompatActivity {
    ActivityForm17Binding bi;
    Date date = new GregorianCalendar(2018, Calendar.JUNE, 27).getTime(); // as told by amjad bhai
    String fixedminDate = new SimpleDateFormat("dd/MM/yyyy").format(date);
    String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_form17);
        bi.setCallback(this);
        bi.f1703d.setManager(getSupportFragmentManager());
        bi.f1703t.setManager(getSupportFragmentManager());
        bi.f1704d.setManager(getSupportFragmentManager());
        bi.f1704t.setManager(getSupportFragmentManager());
        bi.f1703t.setTimeFormat("HH:mm");
        bi.f1704t.setTimeFormat("HH:mm");
        bi.f1703d.setMinDate(fixedminDate);
        bi.f1703d.setMaxDate(dateToday);
        bi.f1704d.setMinDate(fixedminDate);
        bi.f1704d.setMaxDate(dateToday);

        bi.f17rh.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.f17rha) {
                    bi.fldGrp001.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrp001, false);
                } else {
                    bi.fldGrp001.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrp001, true);
                }
            }
        });
        bi.f1701.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId != R.id.f1701a) {
                    bi.fldGrp002.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrp002, false);
                } else {
                    bi.fldGrp002.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrp002, true);
                }
            }
        });
        bi.f1702.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId != R.id.f1702a) {
                    bi.fldGrp003.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrp003, false);
                } else {
                    bi.fldGrp003.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrp003, true);
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
        Toast.makeText(this, "You cannot go back!", Toast.LENGTH_SHORT).show();
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
        MainApp.fc.setFormType(MainApp.FORM17);
        MainApp.fc.setApp_version(MainApp.versionName + "." + MainApp.versionCode);
        JSONObject f17 = new JSONObject();
        f17.put("f17rhstatus", bi.f17rha.isChecked() ? "1" : bi.f17rhb.isChecked() ? "2" : "0");
        f17.put("f17hcwid", bi.f17hcwidx.getText().toString());
        f17.put("f17facilityid", bi.facilityName1.isChecked() ? "1" : bi.facilityName2.isChecked() ? "2" : "0");
        f17.put("f17dt", dtToday);
        f17.put("f1701", bi.f1701a.isChecked() ? "1" : bi.f1701b.isChecked() ? "2" : "0");
        f17.put("f1702", bi.f1702a.isChecked() ? "1" : bi.f1702b.isChecked() ? "2" : "0");
        f17.put("f1703d", bi.f1703d.getText().toString());
        f17.put("f1703t", bi.f1703t.getText().toString());
        f17.put("f1704d", bi.f1704d.getText().toString());
        f17.put("f1704t", bi.f1704t.getText().toString());
        f17.put("f1705", bi.f1705a.isChecked() ? "1" : bi.f1705b.isChecked() ? "2" : "0");
        f17.put("f1706", bi.f1706a.isChecked() ? "1" : bi.f1706b.isChecked() ? "2" : "0");
        f17.put("f17researchName",MainApp.userName);

        MainApp.fc.setf17(String.valueOf(f17));
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {
        if (!validatorClass.EmptyRadioButton(this, bi.f17rh, bi.f17rha, getString(R.string.f17rh))) {
            return false;
        }
        if (!bi.f17rha.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.f17hcwidx, getString(R.string.f17hcwid))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, bi.facilityName, bi.facilityName1, getString(R.string.f17facility))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, bi.f1701, bi.f1701a, getString(R.string.f1701))) {
                return false;
            }
            if (bi.f1701a.isChecked()) {
                if (!validatorClass.EmptyRadioButton(this, bi.f1702, bi.f1702a, getString(R.string.f1702))) {
                    return false;
                }
                if (bi.f1702a.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, bi.f1703d, getString(R.string.f1703) + " " + getString(R.string.date))) {
                        return false;
                    }
                    if (!validatorClass.EmptyTextBox(this, bi.f1703t, getString(R.string.f1703) + " " + getString(R.string.time))) {
                        return false;
                    }
                    if (!validatorClass.EmptyTextBox(this, bi.f1704d, getString(R.string.f1704) + " " + getString(R.string.date))) {
                        return false;
                    }
                    if (!validatorClass.EmptyTextBox(this, bi.f1704t, getString(R.string.f1704) + " " + getString(R.string.time))) {
                        return false;
                    }
                    if (!validatorClass.EmptyRadioButton(this, bi.f1705, bi.f1705a, getString(R.string.f1705))) {
                        return false;
                    }
                    return validatorClass.EmptyRadioButton(this, bi.f1706, bi.f1706a, getString(R.string.f1706));
                }
            }

        }

        return true;
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);
        int updcount = db.updateF17();
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
