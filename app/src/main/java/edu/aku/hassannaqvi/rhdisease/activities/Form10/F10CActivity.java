package edu.aku.hassannaqvi.rhdisease.activities.Form10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity_ViewBinding;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class F10CActivity extends Activity {

    private static final String TAG = F10CActivity.class.getSimpleName();
    @BindView(R.id.f10c001)
    RadioGroup f10c001;
    @BindView(R.id.f10c001a)
    RadioButton f10c001a;
    @BindView(R.id.f10c001b)
    RadioButton f10c001b;
    @BindView(R.id.f10c001888)
    RadioButton f10c001888;
    @BindView(R.id.f10c001888x)
    EditText f10c001888x;
    @BindView(R.id.fldGrpf10c002)
    LinearLayout fldGrpf10c002;
    @BindView(R.id.f10c002a)
    EditText f10c002a;
    @BindView(R.id.f10c002b)
    EditText f10c002b;
    @BindView(R.id.f10c003)
    RadioGroup f10c003;
    @BindView(R.id.f10c003a)
    RadioButton f10c003a;
    @BindView(R.id.f10c003b)
    RadioButton f10c003b;
    @BindView(R.id.f10c004a)
    EditText f10c004a;
    @BindView(R.id.f10c004b)
    EditText f10c004b;
    @BindView(R.id.f10c005)
    RadioGroup f10c005;
    @BindView(R.id.f10c005a)
    RadioButton f10c005a;
    @BindView(R.id.f10c005b)
    RadioButton f10c005b;
    @BindView(R.id.f10c005c)
    RadioButton f10c005c;
    @BindView(R.id.f10c006)
    RadioGroup f10c006;
    @BindView(R.id.f10c006a)
    RadioButton f10c006a;
    @BindView(R.id.f10c006b)
    RadioButton f10c006b;
    @BindView(R.id.f10c006c)
    RadioButton f10c006c;
    @BindView(R.id.f10c006d)
    RadioButton f10c006d;
    @BindView(R.id.f10c007)
    RadioGroup f10c007;
    @BindView(R.id.f10c007a)
    RadioButton f10c007a;
    @BindView(R.id.f10c007b)
    RadioButton f10c007b;
    @BindView(R.id.f10c008)
    RadioGroup f10c008;
    @BindView(R.id.f10c008a)
    RadioButton f10c008a;
    @BindView(R.id.f10c008b)
    RadioButton f10c008b;
    @BindView(R.id.f10c009)
    RadioGroup f10c009;
    @BindView(R.id.f10c009a)
    RadioButton f10c009a;
    @BindView(R.id.f10c009b)
    RadioButton f10c009b;
    @BindView(R.id.f10c010)
    RadioGroup f10c010;
    @BindView(R.id.f10c010a)
    RadioButton f10c010a;
    @BindView(R.id.f10c010b)
    RadioButton f10c010b;
    @BindView(R.id.f10c011)
    RadioGroup f10c011;
    @BindView(R.id.f10c011a)
    RadioButton f10c011a;
    @BindView(R.id.f10c011b)
    RadioButton f10c011b;
    @BindView(R.id.f10c012)
    RadioGroup f10c012;
    @BindView(R.id.f10c012a)
    RadioButton f10c012a;
    @BindView(R.id.f10c012b)
    RadioButton f10c012b;
    @BindView(R.id.f10c013)
    RadioGroup f10c013;
    @BindView(R.id.f10c013a)
    RadioButton f10c013a;
    @BindView(R.id.f10c013b)
    RadioButton f10c013b;
    @BindView(R.id.f10c013c)
    RadioButton f10c013c;
    @BindView(R.id.f10c013d)
    RadioButton f10c013d;
    @BindView(R.id.f10c013e)
    RadioButton f10c013e;
    @BindView(R.id.f10c013f)
    RadioButton f10c013f;
    @BindView(R.id.f10c013888)
    RadioButton f10c013888;
    @BindView(R.id.f10c013888x)
    EditText f10c013888x;
    @BindView(R.id.f10c014)
    RadioGroup f10c014;
    @BindView(R.id.f10c014a)
    RadioButton f10c014a;
    @BindView(R.id.f10c014b)
    RadioButton f10c014b;
    @BindView(R.id.fldGrpf10c015)
    LinearLayout fldGrpf10c015;
    @BindView(R.id.f10c015)
    EditText f10c015;
    @BindView(R.id.fldGrpf10c012)
    LinearLayout fldGrpf10c012;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f10_c);
        ButterKnife.bind(this);

        f10c001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f10c001a.isChecked()) {
                    fldGrpf10c002.setVisibility(View.VISIBLE);
                } else {
                    fldGrpf10c002.setVisibility(View.GONE);
                    f10c002a.setText(null);
                    f10c002b.setText(null);
                    f10c003.clearCheck();
                    f10c004a.setText(null);
                    f10c004b.setText(null);
                    f10c005.clearCheck();
                    f10c006.clearCheck();
                    f10c007.clearCheck();
                    f10c008.clearCheck();
                    f10c009.clearCheck();
                    f10c010.clearCheck();
                    f10c011.clearCheck();
                    f10c012.clearCheck();
                    f10c013.clearCheck();
                    f10c013888x.setText(null);
                    f10c014.clearCheck();
                    f10c015.setText(null);
                }
            }
        });

        f10c012.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f10c012a.isChecked()) {
                    fldGrpf10c012.setVisibility(View.VISIBLE);
                } else {
                    fldGrpf10c012.setVisibility(View.GONE);
                    f10c013.clearCheck();
                    f10c013888x.setText(null);
                }
            }
        });

        f10c013888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f10c013888x.setVisibility(View.VISIBLE);
                } else {
                    f10c013888x.setVisibility(View.GONE);
                    f10c013888x.setText(null);
                }
            }
        });

        f10c014.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f10c014a.isChecked()) {
                    fldGrpf10c015.setVisibility(View.VISIBLE);
                } else {
                    fldGrpf10c015.setVisibility(View.GONE);
                    f10c015.setText(null);
                }
            }
        });


    }

    @OnTextChanged(value = R.id.f10c002a,
            callback = OnTextChanged.Callback.TEXT_CHANGED)
    void afterf10c002aInput(Editable editable) {
        if (Integer.valueOf(f10c002a.getText().toString().isEmpty() ? "0" : f10c002a.getText().toString()) >= 60) {
            f10c002b.setVisibility(View.VISIBLE);
        } else {
            f10c002b.setVisibility(View.GONE);
            f10c002b.setText(null);
        }
    }

    @OnTextChanged(value = R.id.f10c004a,
            callback = OnTextChanged.Callback.TEXT_CHANGED)
    void afterf10c004aInput(Editable editable) {
        if (Double.valueOf(f10c004a.getText().toString().isEmpty() ? "0" : f10c004a.getText().toString()) >= 37.5
                || Double.valueOf(f10c004a.getText().toString().isEmpty() ? "0" : f10c004a.getText().toString()) < 35.5) {
            f10c004b.setVisibility(View.VISIBLE);
        } else {
            f10c004b.setVisibility(View.GONE);
            f10c004b.setText(null);
        }
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


                //startActivity(new Intent(this, F10BActivity.class));
                startActivity(new Intent(this, EndingActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject f10c = new JSONObject();

        f10c.put("f10c001", f10c001a.isChecked() ? "1" : f10c001b.isChecked() ? "2" : f10c001888.isChecked() ? "888" : "0");
        f10c.put("f10c001888x", f10c001888x.getText().toString());
        f10c.put("f10c002a", f10c002a.getText().toString());
        f10c.put("f10c002b", f10c002b.getText().toString());
        f10c.put("f10c003", f10c003a.isChecked() ? "1" : f10c003b.isChecked() ? "2" : "0");
        f10c.put("f10c004a", f10c004a.getText().toString());
        f10c.put("f10c004b", f10c004b.getText().toString());
        f10c.put("f10c005", f10c005a.isChecked() ? "1" : f10c005b.isChecked() ? "2" : f10c005c.isChecked() ? "3" : "0");
        f10c.put("f10c006", f10c006a.isChecked() ? "1" : f10c006b.isChecked() ? "2" : f10c006c.isChecked() ? "3"
                : f10c006d.isChecked() ? "4" : "0");
        f10c.put("f10c007", f10c007a.isChecked() ? "1" : f10c007b.isChecked() ? "2" : "0");
        f10c.put("f10c008", f10c008a.isChecked() ? "1" : f10c008b.isChecked() ? "2" : "0");
        f10c.put("f10c009", f10c009a.isChecked() ? "1" : f10c009b.isChecked() ? "2" : "0");
        f10c.put("f10c010", f10c010a.isChecked() ? "1" : f10c010b.isChecked() ? "2" : "0");
        f10c.put("f10c011", f10c011a.isChecked() ? "1" : f10c011b.isChecked() ? "2" : "0");
        f10c.put("f10c012", f10c012a.isChecked() ? "1" : f10c012b.isChecked() ? "2" : "0");
        f10c.put("f10c013", f10c013a.isChecked() ? "1" : f10c013b.isChecked() ? "2" : f10c013c.isChecked() ? "3"
                : f10c013d.isChecked() ? "4" : f10c013e.isChecked() ? "5" : f10c013f.isChecked() ? "6"
                : f10c013888.isChecked() ? "888" : "0");
        f10c.put("f10c013888x", f10c013888x.getText().toString());
        f10c.put("f10c014", f10c014a.isChecked() ? "1" : f10c014b.isChecked() ? "2" : "0");
        f10c.put("f10c015", f10c015.getText().toString());

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {


        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateF10C();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public boolean ValidateForm() {

        if (f10c001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c001), Toast.LENGTH_SHORT).show();
            f10c001a.setError("This data is Required!");

            Log.i(TAG, "f10c001: This Data is Required!");
            return false;
        } else {
            f10c001a.setError(null);
        }

        if (f10c001a.isChecked()) {
            if (f10c002a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c002), Toast.LENGTH_SHORT).show();
                f10c002a.setError("This data is Required!");

                Log.i(TAG, "f10c002: This Data is Required!");
                return false;
            } else {
                f10c002a.setError(null);
            }

            if (Integer.valueOf(f10c002a.getText().toString()) >= 60) {
                if (f10c002b.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c002), Toast.LENGTH_SHORT).show();
                    f10c002b.setError("This data is Required!");

                    Log.i(TAG, "f10c002: This Data is Required!");
                    return false;
                } else {
                    f10c002b.setError(null);
                }
            }

            if (f10c003.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c003), Toast.LENGTH_SHORT).show();
                f10c003a.setError("This data is Required!");

                Log.i(TAG, "f10c003: This Data is Required!");
                return false;
            } else {
                f10c003a.setError(null);
            }

            if (f10c004a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c004), Toast.LENGTH_SHORT).show();
                f10c004a.setError("This data is Required!");

                Log.i(TAG, "f10c004: This Data is Required!");
                return false;
            } else {
                f10c004a.setError(null);
            }

            if (Double.valueOf(f10c004a.getText().toString()) >= 37.5 || Double.valueOf(f10c004a.getText().toString()) < 35.5) {
                if (f10c004b.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c004), Toast.LENGTH_SHORT).show();
                    f10c004b.setError("This data is Required!");

                    Log.i(TAG, "f10c004: This Data is Required!");
                    return false;
                } else {
                    f10c004b.setError(null);
                }
            }

            if (f10c005.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c005), Toast.LENGTH_SHORT).show();
                f10c005a.setError("This data is Required!");

                Log.i(TAG, "f10c005: This Data is Required!");
                return false;
            } else {
                f10c005a.setError(null);
            }

            if (f10c006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c006), Toast.LENGTH_SHORT).show();
                f10c006a.setError("This data is Required!");

                Log.i(TAG, "f10c006: This Data is Required!");
                return false;
            } else {
                f10c006a.setError(null);
            }

            if (f10c007.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c007), Toast.LENGTH_SHORT).show();
                f10c007a.setError("This data is Required!");

                Log.i(TAG, "f10c007: This Data is Required!");
                return false;
            } else {
                f10c007a.setError(null);
            }

            if (f10c008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c008), Toast.LENGTH_SHORT).show();
                f10c008a.setError("This data is Required!");

                Log.i(TAG, "f10c008: This Data is Required!");
                return false;
            } else {
                f10c008a.setError(null);
            }

            if (f10c009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c009), Toast.LENGTH_SHORT).show();
                f10c009a.setError("This data is Required!");

                Log.i(TAG, "f10c009: This Data is Required!");
                return false;
            } else {
                f10c009a.setError(null);
            }

            if (f10c010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c010), Toast.LENGTH_SHORT).show();
                f10c010a.setError("This data is Required!");

                Log.i(TAG, "f10c010: This Data is Required!");
                return false;
            } else {
                f10c010a.setError(null);
            }


            if (f10c011.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c011), Toast.LENGTH_SHORT).show();
                f10c011a.setError("This data is Required!");

                Log.i(TAG, "f10c011: This Data is Required!");
                return false;
            } else {
                f10c011a.setError(null);
            }

            if (f10c012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c012), Toast.LENGTH_SHORT).show();
                f10c012a.setError("This data is Required!");

                Log.i(TAG, "f10c012: This Data is Required!");
                return false;
            } else {
                f10c012a.setError(null);
            }

            if (f10c012a.isChecked()) {

                if (f10c013.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c013), Toast.LENGTH_SHORT).show();
                    f10c013a.setError("This data is Required!");

                    Log.i(TAG, "f10c013: This Data is Required!");
                    return false;
                } else {
                    f10c013a.setError(null);
                }

                if (f10c013888.isChecked() && f10c013888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c013) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f10c013888x.setError("This data is Required!");

                    Log.i(TAG, "f10c013888x: This Data is Required!");
                    return false;
                } else {
                    f10c013888x.setError(null);
                }
            }

            if (f10c014.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c014), Toast.LENGTH_SHORT).show();
                f10c014a.setError("This data is Required!");

                Log.i(TAG, "f10c014: This Data is Required!");
                return false;
            } else {
                f10c014a.setError(null);
            }

            if (f10c014a.isChecked()) {
                if (f10c015.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10c015), Toast.LENGTH_SHORT).show();
                    f10c015.setError("This data is Required!");

                    Log.i(TAG, "f10c015: This Data is Required!");
                    return false;
                } else {
                    f10c015.setError(null);
                }
            }


        }


        return true;
    }

    /*@Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }*/


}
