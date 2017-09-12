package edu.aku.hassannaqvi.rhdisease.activities.Form3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
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
import edu.aku.hassannaqvi.rhdisease.activities.Form4.F04AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.contracts.FormsContract;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class F03AActivity extends AppCompatActivity {

    private static final String TAG = F03AActivity.class.getSimpleName();
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

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
    @BindView(R.id.f03a010)
    RadioGroup f03a010;
    @BindView(R.id.f03a010a)
    RadioButton f03a010a;
    @BindView(R.id.f03a010b)
    RadioButton f03a010b;
    @BindView(R.id.fldGrpf03a011)
    LinearLayout fldGrpf03a011;
    @BindView(R.id.f03a011)
    RadioGroup f03a011;
    @BindView(R.id.f03a011a)
    RadioButton f03a011a;
    @BindView(R.id.f03a011b)
    RadioButton f03a011b;
    @BindView(R.id.f03a011c)
    RadioButton f03a011c;
    @BindView(R.id.f03a011888)
    RadioButton f03a011888;
    @BindView(R.id.f03a011999)
    RadioButton f03a011999;
    @BindView(R.id.f03a011888x)
    EditText f03a011888x;
    @BindView(R.id.f03a012)
    RadioGroup f03a012;
    @BindView(R.id.f03a012a)
    RadioButton f03a012a;
    @BindView(R.id.f03a012b)
    RadioButton f03a012b;
    @BindView(R.id.participantID)
    EditText participantID;
    @BindView(R.id.fldGrpf03a012)
    LinearLayout fldGrpf03a012;

    @BindViews({R.id.f03a001, R.id.f03a002, R.id.f03a003, R.id.f03a004, R.id.f03a005})
    List<RadioGroup> f03aInclusion;
    @BindViews({R.id.f03a001a, R.id.f03a002a, R.id.f03a003a, R.id.f03a004a, R.id.f03a005a})
    List<RadioButton> f03aInclusionYes;
    @BindViews({R.id.f03a006, R.id.f03a007, R.id.f03a008})
    List<RadioGroup> f03aExclusion;
    @BindViews({R.id.f03a006b, R.id.f03a007b, R.id.f03a008b})
    List<RadioButton> f03aExclusionNo;

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

        f03a010.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f03a010b.isChecked()) {
                    fldGrpf03a011.setVisibility(View.VISIBLE);
                    fldGrpf03a012.setVisibility(View.GONE);
                    f03a012.clearCheck();
                    participantID.setText(null);
                } else {
                    fldGrpf03a011.setVisibility(View.GONE);
                    f03a011.clearCheck();
                    f03a011888x.setText(null);
                    fldGrpf03a012.setVisibility(View.VISIBLE);
                }
            }
        });

        f03a011888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    f03a011888x.setVisibility(View.VISIBLE);
                } else {
                    f03a011888x.setVisibility(View.GONE);
                    f03a011888x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {


        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (check) {
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
        } else {
            Toast.makeText(this, "Click on Check Button", Toast.LENGTH_SHORT).show();
        }


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

                    //finish();

                    if (flag) {
                        startActivity(new Intent(this, F04AActivity.class));
                    } else {
                        Intent intent = new Intent(this, EndingActivity.class);
                        intent.putExtra("complete", true);
                        startActivity(intent);

                    }

/*
                startActivity(new Intent(this, SectionBActivity.class));
*/

                } else {
                    Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
                }
            }

        }
    }

    private boolean UpdateDB() {
        /*DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addEnrollment(AppMain.fc);

        AppMain.fc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            AppMain.fc.set_UID(
                    (AppMain.fc.getDeviceID() + AppMain.fc.get_ID()));
            db.updateFormID();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        }*/
        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.fc = new FormsContract();

        MainApp.fc.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fc.setFormDate(dtToday);
        MainApp.fc.setUser(MainApp.userName);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));


        MainApp.setGPS(this);

    }

    public boolean ValidateForm() {


        // =================== celcn ====================
        if (f03a001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a001), Toast.LENGTH_SHORT).show();
            f03a001a.setError("This data is required");
            Log.d(TAG, "f03a001:empty ");
            return false;
        } else {
            f03a001a.setError(null);
        }

        return true;
    }


    @Override
    public void onBackPressed() {
//        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
        super.onBackPressed();
    }


}
