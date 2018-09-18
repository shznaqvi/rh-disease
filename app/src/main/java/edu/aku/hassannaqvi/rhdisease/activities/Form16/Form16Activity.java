package edu.aku.hassannaqvi.rhdisease.activities.Form16;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.databinding.ActivityF12Binding;
import edu.aku.hassannaqvi.rhdisease.databinding.ActivityForm16Binding;
import edu.aku.hassannaqvi.rhdisease.validation.ClearClass;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;

public class Form16Activity extends AppCompatActivity {


    ActivityForm16Binding bi;
    String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date inputDate = new Date();
    Date outDate = new Date();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_form16);
        bi.setCallback(this);
        bi.f1603date.setManager(getSupportFragmentManager());
        bi.f1604date.setManager(getSupportFragmentManager());
        bi.f1603time.setManager(getSupportFragmentManager());
        bi.f1604time.setManager(getSupportFragmentManager());
        bi.f1603date.setMaxDate(dateToday);
        bi.f1604date.setMaxDate(dateToday);

        setupViews();
    }

    private void setupViews() {

        //======================= if RH positive===============================

        bi.f16h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.f16ha) {
                    bi.mainContainer.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.mainContainer, false);
                    bi.f1603date.setText(null);
                    bi.f1604date.setText(null);
                    bi.f1603time.setText(null);
                    bi.f1604time.setText(null);
                    bi.f1603date.setMaxDate(null);
                    bi.f1603date.setMinDate(null);
                    bi.f1604date.setMaxDate(null);
                    bi.f1604date.setMinDate(null);


                } else {
                    bi.mainContainer.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.mainContainer, true);
                    bi.f1603date.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime()));
                    bi.f1604date.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime()));

                }
            }
        });

        // ===========================Q.1 Check======================================

        bi.f1601.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.f1601b) {

                    bi.mainContainer2.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.mainContainer2, false);
                    bi.f1603date.setText(null);
                    bi.f1604date.setText(null);
                    bi.f1603time.setText(null);
                    bi.f1604time.setText(null);
                    bi.f1603date.setMaxDate(null);
                    bi.f1603date.setMinDate(null);
                    bi.f1604date.setMaxDate(null);
                    bi.f1604date.setMinDate(null);

                } else {
                    bi.mainContainer2.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.mainContainer2, true);
                    bi.f1603date.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime()));
                    bi.f1604date.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime()));

                }
            }
        });

        //================checking date================================

        bi.f1603date.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    inputDate = sdf.parse(bi.f1603date.getText().toString());
                    String date = new SimpleDateFormat("dd/MM/yyyy").format(inputDate);
                    bi.f1604date.setText(null);
                    bi.f1604date.setMinDate(date);

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        bi.f1604date.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                try {

                    outDate = sdf.parse(bi.f1604date.getText().toString());
                    // sdf = new SimpleDateFormat("dd-MM-yyyy");
                } catch (Exception e) {

                    e.printStackTrace();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (outDate.before(inputDate)) {

                    bi.f1604date.setError("Minimum date is " + bi.f1603date.getText().toString());
                    //bi.f1604date.setManager(getSupportFragmentManager());

                } else {
                    bi.f1604date.setError(null);
                    //bi.f1604date.setManager(getSupportFragmentManager());
                }

            }
        });

        //=========================================================================================
    }

    public void BtnContinue() {

        if (validateForm()) {

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

    public void BtnEnd() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.endActivity(this, this);

    }

    private void SaveDraft() throws JSONException {

        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject f16 = new JSONObject();
        f16.put("f16rh", bi.f16ha.isChecked() ? "1" : bi.f16hb.isChecked() ? "2" : "0");
        f16.put("f16death", bi.f16deatha.isChecked() ? "1" : bi.f16deathb.isChecked() ? "2" : bi.f16deathc.isChecked() ? "3" : "0");
        f16.put("f16facid", bi.f16facidx.getText().toString());
        f16.put("f1601", bi.f1601a.isChecked() ? "1" : bi.f1601b.isChecked() ? "2" : "0");
        f16.put("f1602", bi.f1602.getText().toString());
        f16.put("f1603dt", bi.f1603date.getText().toString());
        f16.put("f1603t", bi.f1603time.getText().toString());
        f16.put("f1604dt", bi.f1604date.getText().toString());
        f16.put("f1604t", bi.f1604time.getText().toString());
        f16.put("f1605", bi.f1605level.getText().toString());
        f16.put("f1605note", bi.f1605note.getText().toString());
        f16.put("f1606", bi.f1606a.isChecked() ? "1" : bi.f1606b.isChecked() ? "2" : "0");


//        MainApp.fc.setF16(String.valueOf(f16));
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
//
//        DatabaseHelper db = new DatabaseHelper(this);
//
//        int updcount = db.updateF016();
//
//        if (updcount == 1) {
//            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
//            return true;
//        } else {
//            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
//            return false;
//        }
return true;

    }

    public boolean validateForm() {

        //confirm Rh Status
        if (!validatorClass.EmptyRadioButton(this, bi.f16h, bi.f16hb, getString(R.string.f16h))) {

            return false;
        }

        // if RH is positive

        if (!bi.f16ha.isChecked()) {

            //confirm miscarriage or death
            if (!validatorClass.EmptyRadioButton(this, bi.f16death, bi.f16deatha, getString(R.string.f16death))) {


                return false;
            }

            if (!validatorClass.EmptyTextBox(this, bi.f16ridx, getString(R.string.f16rid))) {


                return false;
            }

            if (!validatorClass.EmptyTextBox(this, bi.f16facidx, getString(R.string.f16facid))) {

                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.f1601, bi.f1601b, getString(R.string.f1601))) {

                return false;
            }

            if (!bi.f1601b.isChecked()) {

                if (!validatorClass.EmptyTextBox(this, bi.f1602, getString(R.string.f1602))) {

                    return false;
                }
                if (!bi.f1602.getText().toString().contains(".")) {
                    bi.f1602.setError("Decimal value required");
                    bi.f1602.requestFocus();

                } else {
                    bi.f1602.setError(null);
                    bi.f1602.clearFocus();
                }

                if (!validatorClass.EmptyTextBox(this, bi.f1603date, getString(R.string.f1603))) {

                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.f1603time, getString(R.string.f1603))) {

                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.f1604date, getString(R.string.f1604))) {

                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.f1604time, getString(R.string.f1604))) {

                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.f1605level, getString(R.string.f1605))) {

                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.f1605note, getString(R.string.f1605))) {

                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1606, bi.f1606b, getString(R.string.f1606))) {

                    return false;
                }


            }
        }

        return true;
    }
}
