package edu.aku.hassannaqvi.rhdisease.activities.Form3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.Form7.F07AActivity;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class F03BActivity extends Activity
{

    private static final String TAG = F03BActivity.class.getSimpleName();
    @BindView(R.id.fldGrpEligible)
    LinearLayout fldGrpEligible;
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
    @BindView(R.id.f03a011888)
    RadioButton f03a011888;
    @BindView(R.id.f03a011999)
    RadioButton f03a011999;
    @BindView(R.id.f03a011888x)
    EditText f03a011888x;
    @BindView(R.id.fldGrpf03a012)
    LinearLayout fldGrpf03a012;
    @BindView(R.id.f03a012)
    RadioGroup f03a012;
    @BindView(R.id.f03a012a)
    RadioButton f03a012a;
    @BindView(R.id.f03a012b)
    RadioButton f03a012b;
    @BindView(R.id.participantID)
    EditText participantID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f03_b);
        ButterKnife.bind(this);

        f03a010.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
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

        f03a011888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
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
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        MainApp.endActivity(this, this);
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

                if (f03a010a.isChecked()) {
                    Intent endSec = new Intent(this, F07AActivity.class);
                    endSec.putExtra("complete", true);
                    startActivity(endSec);
                } else {
                    Intent endSec = new Intent(this, EndingActivity.class);
                    endSec.putExtra("complete", true);
                    startActivity(endSec);
                }


                //startActivity(new Intent(this, MainActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateF03();

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


        MainApp.f03.put("f03a010", f03a010a.isChecked() ? "1" : f03a010b.isChecked() ? "2" : "0");
        MainApp.f03.put("f03a011", f03a011a.isChecked() ? "1" : f03a011b.isChecked() ? "2" : f03a011888.isChecked() ? "888"
                : f03a011999.isChecked() ? "999" : "0");
        MainApp.f03.put("f03a011888x", f03a011888x.getText().toString());
        MainApp.f03.put("f03a012", f03a012a.isChecked() ? "1" : f03a012b.isChecked() ? "2" : "0");
        MainApp.f03.put("f03a013", new Date().toString());
        MainApp.fc.setParticipantID(participantID.getText().toString());
        MainApp.fc4.setParticipantID(participantID.getText().toString());


        MainApp.participantID = participantID.getText().toString();


        MainApp.fc.setF03(String.valueOf(MainApp.f03));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {


        if (MainApp.eligibleFlag) {

            // =================== 10 ====================
            if (f03a010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a010), Toast.LENGTH_SHORT).show();
                f03a010a.setError("This data is required");
                Log.d(TAG, "f03a010:empty ");
                return false;
            } else {
                f03a010a.setError(null);
            }

            if (!f03a010a.isChecked()) {
                if (f03a011.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a011), Toast.LENGTH_SHORT).show();
                    f03a011a.setError("This data is required");
                    Log.d(TAG, "f03a011:empty ");
                    return false;
                } else {
                    f03a011a.setError(null);
                }

                if (f03a011888.isChecked() && f03a011888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a011) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f03a011888x.setError("This data is Required!");

                    Log.i(TAG, "f03a011888x: This Data is Required!");
                    return false;
                } else {
                    f03a011888x.setError(null);
                }
            } else {

                if (f03a012.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f03a012), Toast.LENGTH_SHORT).show();
                    f03a012a.setError("This data is required");
                    Log.d(TAG, "f03a012:empty ");
                    return false;
                } else {
                    f03a012a.setError(null);
                }

                if (participantID.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.participant_id), Toast.LENGTH_SHORT).show();
                    participantID.setError("This data is required");
                    Log.d(TAG, "participantID:empty ");
                    return false;
                } else {
                    participantID.setError(null);
                }
            }
        }


        return true;

    }



}
