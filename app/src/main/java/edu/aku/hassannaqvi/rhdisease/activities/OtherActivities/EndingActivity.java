package edu.aku.hassannaqvi.rhdisease.activities.OtherActivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.contracts.FilledFormsContract;
import edu.aku.hassannaqvi.rhdisease.contracts.FormsContract;
import edu.aku.hassannaqvi.rhdisease.contracts.rh_resultsContract;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class EndingActivity extends Activity {

    private static final String TAG = EndingActivity.class.getSimpleName();
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.dcstatus)
    RadioGroup dcstatus;
    @BindView(R.id.dcstatus01)
    RadioButton dcstatus01;
    @BindView(R.id.dcstatus02)
    RadioButton dcstatus02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        Boolean check = getIntent().getExtras().getBoolean("complete");

        if (check) {
            dcstatus01.setEnabled(true);
            dcstatus02.setEnabled(false);

        } else {
            //fldGrpmn0823Reason.setVisibility(View.GONE);
            dcstatus01.setEnabled(false);
            dcstatus02.setEnabled(true);

        }

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {

                MainApp.FetusCount = 1;

                finish();
                MainApp.f03 = new JSONObject();
                MainApp.formType = "";
                MainApp.fc = new FormsContract();
                MainApp.fc4 = new FormsContract();
                MainApp.rh = new rh_resultsContract();
                MainApp.ffc = new FilledFormsContract();

                Intent endSec = new Intent(this, MainActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        MainApp.fc.setIstatus(dcstatus01.isChecked() ? "1" : dcstatus02.isChecked() ? "2" : "0");

        if (MainApp.formType.equals("7")) {
            MainApp.fc4.setIstatus(dcstatus01.isChecked() ? "1" : dcstatus02.isChecked() ? "2" : "0");
        }

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        String completeStatus = dcstatus01.isChecked() ? "1" : dcstatus02.isChecked() ? "0" : "99";
        DatabaseHelper db = new DatabaseHelper(this);
        if (!TextUtils.isEmpty(MainApp.fc.getParticipantID())) {
            switch (MainApp.formType) {
                //todo implement save it temporarely in Rh table as well!
                case MainApp.FORM16:
                    MainApp.ffc.setf16(completeStatus);
                    MainApp.rh.setf16(completeStatus);
                    db.updatef16filled();
                    db.updatef16filledinRH();
                    break;

                case MainApp.FORM14:
                    MainApp.ffc.setf14(completeStatus);
                    MainApp.rh.setf14(completeStatus);
                    db.updatef14filled();
                    db.updatef14filledinRH();
                    break;

                case MainApp.FORM13:
                    MainApp.ffc.setf13(completeStatus);
                    MainApp.rh.setf13(completeStatus);
                    db.updatef13filled();
                    db.updatef13filledinRH();
                    break;
                case MainApp.FORM12:
                    MainApp.ffc.setf12(completeStatus);
                    MainApp.rh.setf12(completeStatus);
                    db.updatef12filled();
                    db.updatef12filledinRH();
                case MainApp.FORM15:
                    //Todo: should implement a condition of defining its first time insertion or second
                    if (MainApp.F15First) {
                    MainApp.ffc.setf15first(completeStatus);
                    MainApp.rh.setf15first(completeStatus);
                    db.updatef15firstfilled();
                    db.updatef15firstfilledinRH();
                        MainApp.F15First = false;
                        MainApp.F15Second = false;
                    }
                    else if (MainApp.F15Second) {
                        MainApp.ffc.setf15second(completeStatus);
                        MainApp.rh.setf15second(completeStatus);
                        db.updatef15secondfilled();
                        db.updatef15secondfilledinRH();
                        MainApp.F15First = false;
                        MainApp.F15Second = false;
                    }
                    if (completeStatus.equals("0")){
                        completeStatus = "1";
                    }

                case MainApp.FORM10:
                    //Todo: should implement a condition of defining its first time insertion or second
                    if (MainApp.F10First) {
                        MainApp.ffc.setf10first(completeStatus);
                        MainApp.rh.setf10first(completeStatus);
                        db.updatef10firstfilled();
                        db.updatef10firstfilledinRH();
                        MainApp.F10First = false;
                        MainApp.F10Second = false;
                        if (completeStatus.equals("0")){
                            completeStatus = "1";
                        }
                    }
                    else if (MainApp.F10Second){
                    MainApp.ffc.setf10second(completeStatus);
                    MainApp.rh.setf10second(completeStatus);
                    db.updatef10secondfilled();
                    db.updatef10secondfilledinRH();
                        MainApp.F10First = false;
                        MainApp.F10Second = false;
                        if (completeStatus.equals("0")){
                            completeStatus = "1";
                        }
                    }
                case MainApp.FORM11:
                    if(!MainApp.formType.equals(MainApp.FORM10)){
                        if (!MainApp.formType.equals(MainApp.FORM15)) {
                            MainApp.ffc.setf11(completeStatus);
                            MainApp.rh.setf11(completeStatus);
                            db.updatef11filled();
                            db.updatef11filledinRH();
                            if (completeStatus.equals("0")){
                                completeStatus = "1";
                            }
                        }
                    }
                case MainApp.FORM8:
                    MainApp.ffc.setf8(completeStatus);
                    MainApp.rh.setf8(completeStatus);
                    db.updatef8filled();
                    db.updatef8filledinRH();
                    if (completeStatus.equals("0")){
                        completeStatus = "1";
                    }
                case MainApp.FORM9:
                    MainApp.ffc.setf9(completeStatus);
                    MainApp.rh.setf9(completeStatus);
                    db.updatef9filled();
                    db.updatef9filledinRH();
                    if (completeStatus.equals("0")){
                        completeStatus = "1";
                    }
                case MainApp.FORM7:
                    MainApp.ffc.setf5(completeStatus);
                    MainApp.rh.setf5(completeStatus);
                    db.updatef5filled();
                    db.updatef5filledinRH();

                    break;
            }
        }
        int updcount = db.updateEnding();
        int updcount1 = 0;
        if (MainApp.formType.equals("7")) {
            updcount1 = db.updateEnding4();
        }


        if (updcount == 1 || updcount1 == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (dcstatus.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Not Selected): " + getString(R.string.dcstatus), Toast.LENGTH_LONG).show();
            dcstatus02.setError("Please Select One");    // Set Error on last radio button
            Log.i(TAG, "dcstatus: This data is Required!");
            return false;
        } else {
            dcstatus02.setError(null);
        }


        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}
