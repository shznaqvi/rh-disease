package edu.aku.hassannaqvi.rhdisease.activities.Form12;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import butterknife.OnClick;
import butterknife.OnTextChanged;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.databinding.ActivityF12Binding;
import edu.aku.hassannaqvi.rhdisease.validation.ClearClass;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;

public class F12Activity extends AppCompatActivity {
    ActivityF12Binding bi;
    String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());
    Date date = new GregorianCalendar(2018, Calendar.JUNE, 27).getTime(); // as told by amjad bhai
    String fixedminDate = new SimpleDateFormat("dd/MM/yyyy").format(date);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_f12);
        bi.setCallback(this);
        setupView();
        bi.f12d.setManager(getSupportFragmentManager());
        bi.f12t.setManager(getSupportFragmentManager());
        bi.f12t.setTimeFormat("HH:mm");
        bi.f12d.setMinDate(fixedminDate);
        bi.f12d.setMaxDate(dateToday);

    }

    private void setupView() {
        bi.f1202.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != R.id.f1202b) {
                    bi.fldGrpf1202.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrpf1202.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpf1202, true);
                }
            }
        });
        bi.f1203.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.f1203a) {
                    bi.fldGrpf1203.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrpf1203.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpf1203, true);
                }
            }
        });

        bi.f1214.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.f1214b) {
                    bi.fldGrpf1214.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpf1214, true);
                } else {
                    bi.fldGrpf1214.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.f1216.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.f1216b) {
                    bi.fldGrpf1216.setVisibility(View.GONE);
                    bi.f1217.setText(null);
                } else {
                    bi.fldGrpf1216.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.f1204a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (Integer.valueOf(bi.f1204a.getText().toString().isEmpty() ? "0" : bi.f1204a.getText().toString()) >= 60) {
                    bi.f1204b.setVisibility(View.VISIBLE);
                } else {
                    bi.f1204b.setVisibility(View.GONE);
                    bi.f1204b.setText(null);
                }
            }
        });

        bi.f1206a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (Double.valueOf(bi.f1206a.getText().toString().isEmpty() ? "0" : bi.f1206a.getText().toString()) >= 37.5
                        || Double.valueOf(bi.f1206a.getText().toString().isEmpty() ? "0" : bi.f1206a.getText().toString()) < 35.5) {
                    bi.f1206b.setVisibility(View.VISIBLE);
                } else {
                    bi.f1206b.setVisibility(View.GONE);
                    bi.f1206b.setText(null);
                }
            }
        });

    }


    public void BtnEnd() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.endActivity(this, this);
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

    private boolean formValidation() {
        if (!validatorClass.EmptyTextBox(this, bi.f12d, getString(R.string.f12dt)+" "+getString(R.string.date))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.f12t, getString(R.string.f12dt)+" "+getString(R.string.time))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.f12loc, bi.f12loc888, bi.f12loc888x, getString(R.string.f12loc))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.f1201, bi.f1201a, getString(R.string.f1201))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.f1202, bi.f1202a, getString(R.string.f1202))) {
            return false;
        }
        if (!bi.f1202b.isChecked()) {

            if (!validatorClass.EmptyRadioButton(this, bi.f1203, bi.f1203888, bi.f1203888x, getString(R.string.f1203))) {
                return false;
            }
            if (bi.f1203a.isChecked()) {

                if (!validatorClass.EmptyTextBox(this, bi.f1204a, getString(R.string.f1204))) {
                    return false;
                }
                if (Integer.valueOf(bi.f1204a.getText().toString()) >= 60) {
                    if (!validatorClass.EmptyTextBox(this, bi.f1204b, getString(R.string.f1204))) {
                        return false;
                    }
                }

                if (!validatorClass.EmptyRadioButton(this, bi.f1205, bi.f1205a, getString(R.string.f1205))) {
                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.f1206a, getString(R.string.f1206))) {
                    return false;
                }
                if (Double.valueOf(bi.f1206a.getText().toString()) >= 37.5 || Double.valueOf(bi.f1206a.getText().toString()) < 35.5) {
                    if (!validatorClass.EmptyTextBox(this, bi.f1206b, getString(R.string.f1206))) {
                        return false;
                    }
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1207, bi.f1207a, getString(R.string.f1207))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1208, bi.f1208a, getString(R.string.f1208))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1209, bi.f1209a, getString(R.string.f1209))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1210, bi.f1210a, getString(R.string.f1210))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1211, bi.f1211a, getString(R.string.f1211))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1212, bi.f1212a, getString(R.string.f1212))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1213, bi.f1213a, getString(R.string.f1213))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1214, bi.f1214a, getString(R.string.f1214))) {
                    return false;
                }
                if (!bi.f1214b.isChecked()) {
                    if (!validatorClass.EmptyRadioButton(this, bi.f1215, bi.f1215888, bi.f1215888x, getString(R.string.f1215))) {
                        return false;
                    }
                }
                if (!validatorClass.EmptyRadioButton(this, bi.f1216, bi.f1216a, getString(R.string.f1216))) {
                    return false;
                }
                if (bi.f1216a.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, bi.f1217, getString(R.string.f1217))) {
                        return false;
                    }
                }


            }
        }
        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject f12 = new JSONObject();
        f12.put("f12deld", bi.f12d.getText().toString());
        f12.put("f12delt", bi.f12t.getText().toString());
        f12.put("f12loc",bi.f12loc1.isChecked() ? "1" : bi.f12loc2.isChecked() ? "2" : bi.f12loc888.isChecked() ? "888" : "0");
        f12.put("f12loc888x", bi.f12loc888x.getText().toString());
        f12.put("f1201",bi.f1201a.isChecked() ? "1" : bi.f1201b.isChecked() ? "2" : bi.f1201999.isChecked() ? "999" : "0");
        f12.put("f1202",bi.f1202a.isChecked() ? "1" : bi.f1202b.isChecked() ? "2" : bi.f1202999.isChecked() ? "999" : "0");
        f12.put("f1203",bi.f1203a.isChecked() ? "1" : bi.f1203b.isChecked() ? "2" : bi.f1203888.isChecked() ? "888" : "0");
        f12.put("f1203888x", bi.f1203888x.getText().toString());
        f12.put("f1204a", bi.f1204a.getText().toString());
        f12.put("f1204b", bi.f1204b.getText().toString());
        f12.put("f1205",bi.f1205a.isChecked() ? "1" : bi.f1205b.isChecked() ? "2" : "0");
        f12.put("f1206a", bi.f1206a.getText().toString());
        f12.put("f1206b", bi.f1206b.getText().toString());
        f12.put("f1207",bi.f1207a.isChecked() ? "1" : bi.f1207b.isChecked() ? "2" : bi.f1207c.isChecked() ? "3" : "0");
        f12.put("f1208",bi.f1208a.isChecked() ? "1" : bi.f1208b.isChecked() ? "2" : bi.f1208c.isChecked() ? "3" :bi.f1208d.isChecked() ? "4" : "0");
        f12.put("f1209",bi.f1209a.isChecked() ? "1" : bi.f1209b.isChecked() ? "2" : "0");
        f12.put("f1210",bi.f1210a.isChecked() ? "1" : bi.f1210b.isChecked() ? "2" : "0");
        f12.put("f1211",bi.f1211a.isChecked() ? "1" : bi.f1211b.isChecked() ? "2" : "0");
        f12.put("f1212",bi.f1212a.isChecked() ? "1" : bi.f1212b.isChecked() ? "2" : "0");
        f12.put("f1213",bi.f1213a.isChecked() ? "1" : bi.f1213b.isChecked() ? "2" : "0");
        f12.put("f1214",bi.f1214a.isChecked() ? "1" : bi.f1214b.isChecked() ? "2" : "0");
        f12.put("f1215",bi.f1215a.isChecked() ? "1" :
                bi.f1215b.isChecked() ? "2" :
                bi.f1215c.isChecked() ? "3" :
                bi.f1215d.isChecked() ? "4" :
                bi.f1215e.isChecked() ? "5" :
                bi.f1215f.isChecked() ? "6" :
                        bi.f1215888.isChecked() ? "888" : "0");
        f12.put("f1215888x", bi.f1215888x.getText().toString());
        f12.put("f1216",bi.f1216a.isChecked() ? "1" : bi.f1216b.isChecked() ? "2" : "0");
        f12.put("f1217", bi.f1217.getText().toString());

        MainApp.fc.setF12(String.valueOf(f12));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateF012();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


}
