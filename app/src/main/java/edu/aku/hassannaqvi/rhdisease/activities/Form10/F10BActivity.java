package edu.aku.hassannaqvi.rhdisease.activities.Form10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class F10BActivity extends Activity {

    private static final String TAG = F10BActivity.class.getSimpleName();
    @BindView(R.id.f10b001)
    RadioGroup f10b001;
    @BindView(R.id.f10b001a)
    RadioButton f10b001a;
    @BindView(R.id.f10b001b)
    RadioButton f10b001b;
    @BindView(R.id.f10b001999)
    RadioButton f10b001999;
    @BindView(R.id.f10b002)
    RadioGroup f10b002;
    @BindView(R.id.f10b002a)
    RadioButton f10b002a;
    @BindView(R.id.f10a002b)
    RadioButton f10a002b;
    @BindView(R.id.f10a002999)
    RadioButton f10a002999;
    @BindView(R.id.f10b003)
    RadioGroup f10b003;
    @BindView(R.id.f10b003a)
    RadioButton f10b003a;
    @BindView(R.id.f10a003b)
    RadioButton f10a003b;
    @BindView(R.id.f10a003999)
    RadioButton f10a003999;
    @BindView(R.id.f10b004)
    RadioGroup f10b004;
    @BindView(R.id.f10b004a)
    RadioButton f10b004a;
    @BindView(R.id.f10a004b)
    RadioButton f10a004b;
    @BindView(R.id.f10a004999)
    RadioButton f10a004999;
    @BindView(R.id.f10b004x)
    EditText f10b004x;
    @BindView(R.id.f10b005a)
    CheckBox f10b005a;
    @BindView(R.id.f10b005b)
    CheckBox f10b005b;
    @BindView(R.id.f10b005c)
    CheckBox f10b005c;
    @BindView(R.id.f10b005d)
    CheckBox f10b005d;
    @BindView(R.id.f10b005e)
    CheckBox f10b005e;
    @BindView(R.id.f10b005f)
    CheckBox f10b005f;
    @BindView(R.id.f10b005g)
    CheckBox f10b005g;
    @BindView(R.id.f10b005999)
    CheckBox f10b005999;
    @BindView(R.id.f10b005888)
    CheckBox f10b005888;
    @BindView(R.id.f10b005888x)
    EditText f10b005888x;
    @BindView(R.id.f10b006)
    RadioGroup f10b006;
    @BindView(R.id.f10b006a)
    RadioButton f10b006a;
    @BindView(R.id.f10a006b)
    RadioButton f10a006b;
    @BindView(R.id.f10a006999)
    RadioButton f10a006999;
    @BindView(R.id.f10b007)
    RadioGroup f10b007;
    @BindView(R.id.f10b007a)
    RadioButton f10b007a;
    @BindView(R.id.f10a007b)
    RadioButton f10a007b;
    @BindView(R.id.f10a007999)
    RadioButton f10a007999;
    @BindView(R.id.f10b008)
    RadioGroup f10b008;
    @BindView(R.id.f10b008a)
    RadioButton f10b008a;
    @BindView(R.id.f10a008b)
    RadioButton f10a008b;
    @BindView(R.id.f10a008999)
    RadioButton f10a008999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f10_b);
        ButterKnife.bind(this);

        f10b004a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    f10b004x.setVisibility(View.VISIBLE);
                } else {
                    f10b004x.setVisibility(View.GONE);
                    f10b004x.setText(null);
                }
            }
        });

        f10b005888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    f10b005888x.setVisibility(View.VISIBLE);
                } else {
                    f10b005888x.setVisibility(View.GONE);
                    f10b005888x.setText(null);
                }
            }
        });





    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

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


                startActivity(new Intent(this, F10CActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {


        return true;
    }

    public boolean ValidateForm() {

        if (f10b001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b001), Toast.LENGTH_SHORT).show();
            f10b001a.setError("This data is Required!");

            Log.i(TAG, "f10b001: This Data is Required!");
            return false;
        } else {
            f10b001a.setError(null);
        }

        if (f10b002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b002), Toast.LENGTH_SHORT).show();
            f10b002a.setError("This data is Required!");

            Log.i(TAG, "f10b002: This Data is Required!");
            return false;
        } else {
            f10b002a.setError(null);
        }

        if (f10b003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b003), Toast.LENGTH_SHORT).show();
            f10b003a.setError("This data is Required!");

            Log.i(TAG, "f10b003: This Data is Required!");
            return false;
        } else {
            f10b003a.setError(null);
        }

        if (f10b004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b004), Toast.LENGTH_SHORT).show();
            f10b004a.setError("This data is Required!");

            Log.i(TAG, "f10b004: This Data is Required!");
            return false;
        } else {
            f10b004a.setError(null);
        }

        if (f10b004a.isChecked()) {
            if (f10b004x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b004a), Toast.LENGTH_SHORT).show();
                f10b004x.setError("This data is Required!");

                Log.i(TAG, "f10b004x: This Data is Required!");
                return false;
            } else {
                f10b004x.setError(null);
            }
        }

        if (!(f10b005a.isChecked() || f10b005b.isChecked() || f10b005c.isChecked() || f10b005d.isChecked()
                || f10b005e.isChecked() || f10b005f.isChecked() || f10b005g.isChecked() || f10b005999.isChecked()
                || f10b005888.isChecked())) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b005), Toast.LENGTH_SHORT).show();
            f10b005a.setError("This data is Required!");

            Log.i(TAG, "f10b005: This Data is Required!");
            return false;
        } else {
            f10b005a.setError(null);
        }

        if (f10b005888.isChecked() && f10b005888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b005) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f10b005888.setError("This data is Required!");

            Log.i(TAG, "f10b005888x: This Data is Required!");
            return false;
        } else {
            f10b005888x.setError(null);
        }

        if (f10b006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b006), Toast.LENGTH_SHORT).show();
            f10b006a.setError("This data is Required!");

            Log.i(TAG, "f10b006: This Data is Required!");
            return false;
        } else {
            f10b006a.setError(null);
        }

        if (f10b007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b007), Toast.LENGTH_SHORT).show();
            f10b007a.setError("This data is Required!");

            Log.i(TAG, "f10b007: This Data is Required!");
            return false;
        } else {
            f10b007a.setError(null);
        }

        if (f10b008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10b008), Toast.LENGTH_SHORT).show();
            f10b008a.setError("This data is Required!");

            Log.i(TAG, "f10b008: This Data is Required!");
            return false;
        } else {
            f10b008a.setError(null);
        }

        return true;
    }

    /*@Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }*/




}
