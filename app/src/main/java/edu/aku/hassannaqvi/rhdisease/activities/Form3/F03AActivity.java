package edu.aku.hassannaqvi.rhdisease.activities.Form3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.Form4.F04AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class F03AActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private static final String TAG = F03AActivity.class.getSimpleName();
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    @BindView(R.id.participantName)
    EditText participantName;
    @BindView(R.id.screeningnum)
    EditText screeningnum;
    @BindView(R.id.f03a001)
    RadioGroup f03a001;
    @BindView(R.id.f03a001a)
    RadioButton f03a001a;
    @BindView(R.id.f03a001b)
    RadioButton f03a001b;
    @BindView(R.id.f03a002)
    RadioGroup f03a002;
    @BindView(R.id.f03a002a)
    RadioButton f03a002a;
    @BindView(R.id.f03a002b)
    RadioButton f03a002b;
    @BindView(R.id.f03a002date)
    DatePickerInputEditText f03a002date;
    @BindView(R.id.f03a003)
    RadioGroup f03a003;
    @BindView(R.id.f03a003a)
    RadioButton f03a003a;
    @BindView(R.id.f03a003b)
    RadioButton f03a003b;
    @BindView(R.id.f03a004)
    RadioGroup f03a004;
    @BindView(R.id.f03a004a)
    RadioButton f03a004a;
    @BindView(R.id.f03a004b)
    RadioButton f03a004b;
    @BindView(R.id.f03a005)
    RadioGroup f03a005;
    @BindView(R.id.f03a005a)
    RadioButton f03a005a;
    @BindView(R.id.f03a005b)
    RadioButton f03a005b;
    @BindView(R.id.f03a006)
    RadioGroup f03a006;
    @BindView(R.id.f03a006a)
    RadioButton f03a006a;
    @BindView(R.id.f03a006b)
    RadioButton f03a006b;
    @BindView(R.id.f03a007)
    RadioGroup f03a007;
    @BindView(R.id.f03a007a)
    RadioButton f03a007a;
    @BindView(R.id.f03a007b)
    RadioButton f03a007b;
    @BindView(R.id.f03a008)
    RadioGroup f03a008;
    @BindView(R.id.f03a008a)
    RadioButton f03a008a;
    @BindView(R.id.f03a008b)
    RadioButton f03a008b;


    @BindViews({R.id.f03a001, R.id.f03a002, R.id.f03a003, R.id.f03a004, R.id.f03a005, R.id.f03a006, R.id.f03a007, R.id.f03a008})
    List<RadioGroup> f03aInclusion;
    @BindViews({R.id.f03a001a, R.id.f03a002a, R.id.f03a003a, R.id.f03a004a, R.id.f03a005a,
            R.id.f03a006b, R.id.f03a007b, R.id.f03a008b})
    List<RadioButton> f03aInclusionYes;

    Boolean check = false;
    Boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f03_a);
        ButterKnife.bind(this);


        String date13Weeks = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - ((MainApp.MILLISECONDS_IN_13_WEEKS)));
        String date42Weeks = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - ((MainApp.MILLISECONDS_IN_42_WEEKS)));
        f03a002date.setManager(getSupportFragmentManager());
        f03a002date.setMaxDate(date13Weeks);
        f03a002date.setMinDate(date42Weeks);


        //================== Q7 Skip Pattern ===========
        for (RadioGroup rg : f03aInclusion) {
            rg.setOnCheckedChangeListener(this);
        }



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
            {
                try {
                    SaveDraft();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (UpdateDB()) {
                    Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                    finish();
                    if (MainApp.eligibleFlag) {
                        Intent endSec = new Intent(this, F04AActivity.class);
                        endSec.putExtra("complete", true);
                        startActivity(endSec);
                    } else {
                        Intent endSec = new Intent(this, EndingActivity.class);
                        endSec.putExtra("complete", true);
                        startActivity(endSec);
                    }

                } else {
                    Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
                }
            }

        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addForm(MainApp.fc);

        MainApp.fc.set_ID(String.valueOf(updcount));

        if (updcount > 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fc.set_UID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.get_ID()));
            db.updateFormID();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        }

        return true;
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
        MainApp.fc.setFormType("3");

        MainApp.f03.put("screennum", screeningnum.getText().toString());
        MainApp.f03.put("participantName", participantName.getText().toString());
        MainApp.f03.put("f03a001", f03a001a.isChecked() ? "1" : f03a001b.isChecked() ? "2" : "0");
        MainApp.f03.put("f03a002", f03a002a.isChecked() ? "1" : f03a002b.isChecked() ? "2" : "0");
        MainApp.f03.put("f03a002date", f03a002date.getText().toString());
        MainApp.f03.put("f03a003", f03a003a.isChecked() ? "1" : f03a003b.isChecked() ? "2" : "0");
        MainApp.f03.put("f03a004", f03a004a.isChecked() ? "1" : f03a004b.isChecked() ? "2" : "0");
        MainApp.f03.put("f03a005", f03a005a.isChecked() ? "1" : f03a005b.isChecked() ? "2" : "0");
        MainApp.f03.put("f03a006", f03a006a.isChecked() ? "1" : f03a006b.isChecked() ? "2" : "0");
        MainApp.f03.put("f03a007", f03a007a.isChecked() ? "1" : f03a007b.isChecked() ? "2" : "0");
        MainApp.f03.put("f03a008", f03a008a.isChecked() ? "1" : f03a008b.isChecked() ? "2" : "0");
        if (isInclude()) {
            MainApp.f03.put("f03a009", "1");
        } else {
            MainApp.f03.put("f03a009", "2");
        }

        MainApp.fc.setF03(String.valueOf(MainApp.f03));

        MainApp.setGPS(this);

    }

    public boolean ValidateForm() {


        if (screeningnum.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.screennum), Toast.LENGTH_SHORT).show();
            screeningnum.setError("This data is required");
            Log.d(TAG, "screeningnum:empty ");
            return false;
        } else {
            screeningnum.setError(null);
        }

        if (participantName.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.participantName), Toast.LENGTH_SHORT).show();
            participantName.setError("This data is required");
            Log.d(TAG, "participantName:empty ");
            return false;
        } else {
            participantName.setError(null);
        }
        // =================== 1 ====================
        if (f03a001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a001), Toast.LENGTH_SHORT).show();
            f03a001a.setError("This data is required");
            Log.d(TAG, "f03a001:empty ");
            return false;
        } else {
            f03a001a.setError(null);
        }

        // =================== 2 ====================
        if (f03a002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a002), Toast.LENGTH_SHORT).show();
            f03a002a.setError("This data is required");
            Log.d(TAG, "f03a002:empty ");
            return false;
        } else {
            f03a002a.setError(null);
        }


        // =================== 3 ====================
        if (f03a003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a003), Toast.LENGTH_SHORT).show();
            f03a003a.setError("This data is required");
            Log.d(TAG, "f03a003:empty ");
            return false;
        } else {
            f03a003a.setError(null);
        }

        // =================== 4 ====================
        if (f03a004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a004), Toast.LENGTH_SHORT).show();
            f03a004a.setError("This data is required");
            Log.d(TAG, "f03a004:empty ");
            return false;
        } else {
            f03a004a.setError(null);
        }

        // =================== 5 ====================
        if (f03a005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a005), Toast.LENGTH_SHORT).show();
            f03a005a.setError("This data is required");
            Log.d(TAG, "f03a005:empty ");
            return false;
        } else {
            f03a005a.setError(null);
        }

        // =================== 6 ====================
        if (f03a006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a006), Toast.LENGTH_SHORT).show();
            f03a006a.setError("This data is required");
            Log.d(TAG, "f03a006:empty ");
            return false;
        } else {
            f03a006a.setError(null);
        }

        // =================== 7 ====================
        if (f03a007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a007), Toast.LENGTH_SHORT).show();
            f03a007a.setError("This data is required");
            Log.d(TAG, "f03a007:empty ");
            return false;
        } else {
            f03a007a.setError(null);
        }

        // =================== 8 ====================
        if (f03a008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a008), Toast.LENGTH_SHORT).show();
            f03a008a.setError("This data is required");
            Log.d(TAG, "f03a008:empty ");
            return false;
        } else {
            f03a008a.setError(null);
        }




        return true;
    }


    @Override
    public void onBackPressed() {
//        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
        super.onBackPressed();
    }

    //=== Eligibility Skip pattern
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

        MainApp.eligibleFlag = isInclude();

    }


    public boolean isInclude() {

        int i = 0;
        for (RadioButton rg : f03aInclusionYes) {
            if (rg.isChecked()) {
                i++;
            }

        }
        // Show answer here
        return i == f03aInclusionYes.size();
    }
}
