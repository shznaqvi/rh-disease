package edu.aku.hassannaqvi.rhdisease.activities.FormInfo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.nio.DoubleBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.Form10.F10AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.Form11.F11AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.Form4.F04AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.Form7.F07AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.Form8.F08AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.Form9.F09AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.contracts.FormsContract;
import edu.aku.hassannaqvi.rhdisease.contracts.rh_resultsContract;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class IdentificationActivity extends Activity {

    private static final String TAG = IdentificationActivity.class.getSimpleName();
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    @BindView(R.id.participant_id)
    EditText participantId;
    @BindView(R.id.f08a001)
    EditText f08a001;
    @BindView(R.id.f08a001999)
    CheckBox f08a001999;
    @BindView(R.id.fldGrpF08)
    LinearLayout fldGrpF08;
    @BindView(R.id.fldGrpfooter)
    LinearLayout fldGrpfooter;

    DatabaseHelper db;
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);
        ButterKnife.bind(this);


        db = new DatabaseHelper(this);

        if (MainApp.formType.equals("8")) {
            fldGrpF08.setVisibility(View.VISIBLE);
        } else {
            fldGrpF08.setVisibility(View.GONE);
            f08a001.setText(null);
            f08a001999.setChecked(false);
        }

        fldGrpfooter.setVisibility(View.GONE);


        f08a001999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f08a001.setVisibility(View.GONE);
                    f08a001.setText(null);
                } else {
                    f08a001.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    @OnClick(R.id.btnCheck)
    void onBtnCheckClick() {
        int formtype = 0;
        String formType = MainApp.formType;
        switch (formType) {

            case MainApp.FORM8:
                formtype = 9;
                // if (db.checkForRH_Results(participantId.getText().toString(), formtype)||db.checkForRH_Results(participantId.getText().toString())) {
                if (db.checkForRH_Results(participantId.getText().toString(), MainApp.RH_NEGATIVE) || db.checkForRH_Results(participantId.getText().toString(), MainApp.RH_NEGATIVE, MainApp.FORM9)) {
                    if (db.checkForRH_Results(participantId.getText().toString(), MainApp.RH_NEGATIVE)) {
                        rh_resultsContract resultsContract = new rh_resultsContract();
                        resultsContract = db.getRH_Results(participantId.getText().toString(), MainApp.RH_NEGATIVE);
                        if (!resultsContract.get_id().equals("")) {
                            try {
                                String lmpDate = resultsContract.getLmp();
                                DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                                Date frmDate = sdf.parse(lmpDate);
                                Date curretDate = new Date();
                                Double GA =  getDateDiff(frmDate, curretDate, TimeUnit.DAYS);
                                if (GA >= 32 && GA <= 36) {
                                    fldGrpfooter.setVisibility(View.VISIBLE);
                                    Toast.makeText(this, "Gestational age is " + GA, Toast.LENGTH_LONG).show();

                                } else {
                                    Toast.makeText(this, "Gestational age is " + GA + " i:e not in range", Toast.LENGTH_LONG).show();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else if (db.checkForRH_Results(participantId.getText().toString(), MainApp.RH_NEGATIVE, MainApp.FORM9)) {
                        String lmp = db.getRH_Results(participantId.getText().toString(),  MainApp.RH_NEGATIVE, MainApp.FORM9);
                        try {
                            DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                            Date frmDate = sdf.parse(lmp);
                            Date curretDate = new Date();
                            Double GA =  getDateDiff(frmDate, curretDate, TimeUnit.DAYS);
                            if (GA >= 32 && GA <= 36) {
                                fldGrpfooter.setVisibility(View.VISIBLE);
                                Toast.makeText(this, "Gestational age is " + GA, Toast.LENGTH_LONG).show();

                            } else {
                                Toast.makeText(this, "Gestational age is " + GA + " i:e not in range", Toast.LENGTH_LONG).show();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                } else {
                    fldGrpfooter.setVisibility(View.GONE);
                    Toast.makeText(this, "Participant has no RH-Results or has RH-Positive", Toast.LENGTH_LONG).show();
                }

                break;
            case MainApp.FORM9:
                formtype = 7;
                if (db.checkFormParticipantID(participantId.getText().toString(), String.valueOf(formtype)) || db.checkFormParticipantID(participantId.getText().toString())) {
                    fldGrpfooter.setVisibility(View.VISIBLE);
                } else {
                    fldGrpfooter.setVisibility(View.GONE);
                    Toast.makeText(this, "Participant is already Enrolled or Participant ID is not allocated yet!", Toast.LENGTH_LONG).show();
                }
                break;
            case MainApp.FORM10:
                if (db.checkForRH_Results(participantId.getText().toString(), MainApp.RH_NEGATIVE)||db.checkForf10Acceptance(participantId.getText().toString(), MainApp.FORM8)) {
                    fldGrpfooter.setVisibility(View.VISIBLE);
                } else {
                    fldGrpfooter.setVisibility(View.GONE);
                    Toast.makeText(this, "Participant not found or either RH status is positive", Toast.LENGTH_LONG).show();
                }

                break;
            case MainApp.FORM11:
                if (db.checkForRH_Results(participantId.getText().toString(), MainApp.RH_POSITIVE) || db.checkForRH_Results(participantId.getText().toString(), MainApp.RH_POSITIVE, MainApp.FORM9)) {
                    fldGrpfooter.setVisibility(View.VISIBLE);
                } else if (db.checkForRH_Results(participantId.getText().toString(), MainApp.RH_NEGATIVE) || db.checkForRH_Results(participantId.getText().toString(), MainApp.RH_NEGATIVE, MainApp.FORM9)) {
                    if (db.checkForf15Adverse(participantId.getText().toString()) || db.checkForf15Adverse(participantId.getText().toString(), MainApp.FORM10)) {
                        fldGrpfooter.setVisibility(View.VISIBLE);
                    } else {
                        fldGrpfooter.setVisibility(View.GONE);
                        Toast.makeText(this, "This Participant has an adverse reaction after taking injection or Form 10 is not filled yet!", Toast.LENGTH_LONG).show();
                    }
                } else {
                    fldGrpfooter.setVisibility(View.GONE);
                    Toast.makeText(this, "Participant is already Enrolled or Participant ID is not allocated yet!", Toast.LENGTH_LONG).show();
                }
                break;
        }

    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }

    public static Double getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        long weeks = timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS) / 7;
        long days = timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS) % 7;
        Double gage =  Double.parseDouble(weeks+"."+days);
        return gage;
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        //if (check) {

        //if (formValidation()) {


        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        if (UpdateDB()) {
            Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

            finish();

            if (MainApp.formType.equals("4")) {
                Intent secB = new Intent(this, F04AActivity.class);
                startActivity(secB);
            } else if (MainApp.formType.equals("7")) {
                Intent secB = new Intent(this, F07AActivity.class);
                startActivity(secB);
            } else if (MainApp.formType.equals("8") && !f08a001999.isChecked()) {
                Intent secB = new Intent(this, F08AActivity.class);
                DatabaseHelper db = new DatabaseHelper(this);

                startActivity(secB);
            } else if (MainApp.formType.equals("9")) {
                Intent secB = new Intent(this, F09AActivity.class);
                String lmpDate = null;
                String lmpResult = db.getLmp(participantId.getText().toString(), Integer.parseInt(MainApp.FORM5));
                if (lmpResult.equals("") || lmpResult == null) {
                    lmpDate = db.getlmp(participantId.getText().toString());
                } else {
                    lmpDate = lmpResult;
                }
                secB.putExtra(F09AActivity.PARTICIPANT_ID_TAG, participantId.getText().toString());
                secB.putExtra(F09AActivity.LMP_TAG, lmpDate);
                startActivity(secB);
            } else if (MainApp.formType.equals("11")) {
                Intent secB = new Intent(this, F10AActivity.class);
                startActivity(secB);
            } else if (MainApp.formType.equals("8") && f08a001999.isChecked()) {
                Intent secB = new Intent(this, EndingActivity.class);
                secB.putExtra("complete", true);
                startActivity(secB);
            } else if (MainApp.formType.equals("10")) {
                Intent secB = new Intent(this, F11AActivity.class);
                startActivity(secB);
            }
        } else {
            Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
        }


        /*} else {
            Toast.makeText(this, "Click on Check Button", Toast.LENGTH_SHORT).show();
        }*/

        //}

    }

    public int getGA(String lmpDate) {
        try {
            //lmpDate = "11-12-2017";
            //current Date
            Date curretDate = new Date();
            Calendar calendarCurrent = Calendar.getInstance();
            calendarCurrent.setTime(curretDate);

            DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date frmDate = sdf.parse(lmpDate);
            Calendar calendarlmp = Calendar.getInstance();
            calendarlmp.setTime(frmDate);
            calendarlmp.add(Calendar.WEEK_OF_YEAR, calendarCurrent.get(Calendar.WEEK_OF_YEAR));
            int GA = calendarlmp.get(Calendar.DAY_OF_YEAR) / 7;
            return GA;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (!f08a001999.isChecked()) {

            if (f08a001.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f08a001), Toast.LENGTH_SHORT).show();
                f08a001.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f08a001: This data is Required!");
                return false;
            } else {
                f08a001.setError(null);
            }

        }

        return true;
    }

    private void SaveDraft() throws JSONException {

        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        MainApp.fc = new FormsContract();

        MainApp.fc.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fc.setFormDate(new SimpleDateFormat("dd-MM-yyyy HH:mm").format(System.currentTimeMillis()));
        MainApp.fc.setUser(MainApp.userName);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        MainApp.fc.setFormType(MainApp.formType);
        MainApp.fc.setParticipantID(participantId.getText().toString());
        //MainApp.fc.setDeviceID(MainApp.deviceId);
        MainApp.fc.setApp_version(MainApp.versionName + "." + MainApp.versionCode);

        JSONObject sInfo = new JSONObject();

        sInfo.put("f08a001", f08a001999.isChecked() ? "999" : f08a001.getText().toString());
        MainApp.TotalFetusCount = Integer.valueOf(f08a001.getText().toString().isEmpty() ? "0" : f08a001.getText().toString());

        if (MainApp.formType.equals("8")) {
            MainApp.fc.setF08(String.valueOf(sInfo));
        }

        MainApp.setGPS(this);

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addForm(MainApp.fc);

        MainApp.fc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fc.set_UID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.get_ID()));
            db.updateFormID();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}