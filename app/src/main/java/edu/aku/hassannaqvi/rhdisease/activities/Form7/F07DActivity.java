package edu.aku.hassannaqvi.rhdisease.activities.Form7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
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
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.MainActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class F07DActivity extends Activity {

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
    RadioGroup f07d003;
    @BindView(R.id.f07d003a)
    RadioButton f07d003a;
    @BindView(R.id.f07d003b)
    RadioButton f07d003b;
    @BindView(R.id.f07d003c)
    RadioButton f07d003c;
    @BindView(R.id.f07d003d)
    RadioButton f07d003d;
    @BindView(R.id.f07d003888)
    RadioButton f07d003888;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f07_d);
        ButterKnife.bind(this);

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


                startActivity(new Intent(this, MainActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateF07C();

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

        JSONObject f07c = new JSONObject();

        MainApp.fc.setF07c(String.valueOf(f07c));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {


        return true;
    }
}

