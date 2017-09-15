package edu.aku.hassannaqvi.rhdisease.activities.FormInfo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.Form10.F10AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.Form4.F04AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.Form7.F07AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.Form8.F08AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.Form9.F09AActivity;
import edu.aku.hassannaqvi.rhdisease.contracts.FormsContract;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class IdentificationActivity extends Activity {

    @BindView(R.id.participant_id)
    EditText participantId;

    DatabaseHelper db;
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);
        ButterKnife.bind(this);

        db = new DatabaseHelper(this);

    }

    @OnClick(R.id.btnCheck)
    void onBtnCheckClick() {


    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        //if (check) {
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
                } else if (MainApp.formType.equals("8")) {
                    Intent secB = new Intent(this, F08AActivity.class);
                    startActivity(secB);
                } else if (MainApp.formType.equals("9")) {
                    Intent secB = new Intent(this, F09AActivity.class);
                    startActivity(secB);
                } else if (MainApp.formType.equals("10")) {
                    Intent secB = new Intent(this, F10AActivity.class);
                    startActivity(secB);
                }
            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        /*} else {
            Toast.makeText(this, "Click on Check Button", Toast.LENGTH_SHORT).show();
        }*/
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        MainApp.fc = new FormsContract();

        MainApp.fc.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fc.setFormDate(new Date().toString());
        MainApp.fc.setUser(MainApp.userName);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        MainApp.fc.setFormType(MainApp.formType);
        MainApp.fc.setParticipantID(participantId.getText().toString());

        JSONObject sInfo = new JSONObject();


        MainApp.fc.setInfo(String.valueOf(sInfo));

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