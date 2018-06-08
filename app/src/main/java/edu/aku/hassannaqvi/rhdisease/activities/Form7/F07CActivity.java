package edu.aku.hassannaqvi.rhdisease.activities.Form7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class F07CActivity extends AppCompatActivity
{

    private static final String TAG = F07CActivity.class.getSimpleName();
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    @BindView(R.id.f07c001)
    EditText f07c001;
    @BindView(R.id.f07c001999)
    CheckBox f07c001999;
    @BindView(R.id.f07c002)
    EditText f07c002;
    @BindView(R.id.f07c002999)
    CheckBox f07c002999;
    @BindView(R.id.f07c003)
    EditText f07c003;
    @BindView(R.id.f07c003999)
    CheckBox f07c003999;
    @BindView(R.id.f07c004)
    EditText f07c004;
    @BindView(R.id.f07c004999)
    CheckBox f07c004999;
    @BindView(R.id.f07c005)
    EditText f07c005;
    @BindView(R.id.f07c005999)
    CheckBox f07c005999;
    @BindView(R.id.f07c006)
    RadioGroup f07c006;
    @BindView(R.id.f07c006a)
    RadioButton f07c006a;
    @BindView(R.id.f07c006aage)
    EditText f07c006aage;
    @BindView(R.id.f07c006b)
    RadioButton f07c006b;
    @BindView(R.id.f07c006bage)
    EditText f07c006bage;
    @BindView(R.id.f07c00698)
    RadioButton f07c00698;
    @BindView(R.id.f07c006999)
    RadioButton f07c006999;
    @BindView(R.id.f07c007)
    RadioGroup f07c007;
    @BindView(R.id.f07c007a)
    RadioButton f07c007a;
    @BindView(R.id.f07c007aage)
    EditText f07c007aage;
    @BindView(R.id.f07c007b)
    RadioButton f07c007b;
    @BindView(R.id.f07c007bage)
    EditText f07c007bage;
    @BindView(R.id.f07c00798)
    RadioButton f07c00798;
    @BindView(R.id.f07c007999)
    RadioButton f07c007999;
    @BindView(R.id.f07c008)
    DatePickerInputEditText f07c008;
    @BindView(R.id.f07c009)
    RadioGroup f07c009;
    @BindView(R.id.f07c009a)
    RadioButton f07c009a;
    @BindView(R.id.f07c009b)
    RadioButton f07c009b;
    @BindView(R.id.f07c009c)
    RadioButton f07c009c;
    @BindView(R.id.f07c009d)
    RadioButton f07c009d;
    @BindView(R.id.f07c009e)
    RadioButton f07c009e;
    @BindView(R.id.f07c009f)
    RadioButton f07c009f;
    @BindView(R.id.f07c009888)
    RadioButton f07c009888;
    @BindView(R.id.f07c009999)
    RadioButton f07c009999;
    @BindView(R.id.f07c009888x)
    EditText f07c009888x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f07_c);
        ButterKnife.bind(this);

        String date13Weeks = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - ((MainApp.MILLISECONDS_IN_13_WEEKS)));
        String date42Weeks = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - ((MainApp.MILLISECONDS_IN_42_WEEKS)));
        f07c008.setManager(getSupportFragmentManager());
        f07c008.setMaxDate(date13Weeks);
        f07c008.setMinDate(date42Weeks);




        f07c001999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07c001.setVisibility(View.GONE);
                    f07c001.setText(null);
                } else {
                    f07c001.setVisibility(View.VISIBLE);
                }
            }
        });

        f07c002999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07c002.setVisibility(View.GONE);
                    f07c002.setText(null);
                } else {
                    f07c002.setVisibility(View.VISIBLE);
                }
            }
        });

        f07c003999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07c003.setVisibility(View.GONE);
                    f07c003.setText(null);
                } else {
                    f07c003.setVisibility(View.VISIBLE);
                }
            }
        });

        f07c004999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07c004.setVisibility(View.GONE);
                    f07c004.setText(null);
                } else {
                    f07c004.setVisibility(View.VISIBLE);
                }
            }
        });

        f07c005999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07c005.setVisibility(View.GONE);
                    f07c005.setText(null);
                } else {
                    f07c005.setVisibility(View.VISIBLE);
                }
            }
        });

        //=================== f07c006a ==============
        f07c006a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f07c006aage.setVisibility(View.VISIBLE);
                } else {
                    f07c006aage.setVisibility(View.GONE);
                    f07c006aage.setText(null);
                }
            }
        });
        //=================== f07c006b ==============
        f07c006b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f07c006bage.setVisibility(View.VISIBLE);
                } else {
                    f07c006bage.setVisibility(View.GONE);
                    f07c006bage.setText(null);
                }
            }
        });

        //=================== f07c007a ==============
        f07c007a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f07c007aage.setVisibility(View.VISIBLE);
                } else {
                    f07c007aage.setVisibility(View.GONE);
                    f07c007aage.setText(null);
                }
            }
        });

        //=================== f07c007b ==============
        f07c007b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f07c007bage.setVisibility(View.VISIBLE);
                } else {
                    f07c007bage.setVisibility(View.GONE);
                    f07c007bage.setText(null);
                }
            }
        });

        //=================== f07c00988 ==============
        f07c009888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f07c009888x.setVisibility(View.VISIBLE);
                } else {
                    f07c009888x.setVisibility(View.GONE);
                    f07c009888x.setText(null);
                }
            }
        });





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


                startActivity(new Intent(this, F07DActivity.class));

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

        f07c.put("f07c001", f07c001.getText().toString());
        f07c.put("f07c001999", f07c001999.isChecked() ? "999" : "0");
        f07c.put("f07c002", f07c002.getText().toString());
        f07c.put("f07c002999", f07c002999.isChecked() ? "999" : "0");
        f07c.put("f07c003", f07c003.getText().toString());
        f07c.put("f07c003999", f07c003999.isChecked() ? "999" : "0");
        f07c.put("f07c004", f07c004.getText().toString());
        f07c.put("f07c004999", f07c004999.isChecked() ? "999" : "0");
        f07c.put("f07c005", f07c005.getText().toString());
        f07c.put("f07c005999", f07c005999.isChecked() ? "999" : "0");
        f07c.put("f07c006", f07c006a.isChecked() ? "1" : f07c006b.isChecked() ? "2" : f07c00698.isChecked() ? "98" :f07c006999.isChecked() ? "999" : "0");
        f07c.put("f07c006a", f07c006aage.getText().toString());
        f07c.put("f07c006b", f07c006bage.getText().toString());
        f07c.put("f07c007", f07c007a.isChecked() ? "1" : f07c007b.isChecked() ? "2" : f07c00798.isChecked() ? "98" :f07c007999.isChecked() ? "999" : "0");
        f07c.put("f07c007a", f07c007aage.getText().toString());
        f07c.put("f07c007b", f07c007bage.getText().toString());
        f07c.put("f07c008", f07c008.getText().toString());
        f07c.put("f07c009", f07c009a.isChecked() ? "1" : f07c009b.isChecked() ? "2" : f07c009c.isChecked() ? "3" : f07c009d.isChecked() ? "4" : f07c009e.isChecked() ? "5" : f07c009f.isChecked() ? "6" : f07c009888.isChecked() ? "888" : f07c009999.isChecked() ? "999" : "0");
        f07c.put("f07c009888x", f07c009888x.getText().toString());

        MainApp.fc4.setF07c(String.valueOf(f07c));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        // ====================== f07c001 ===================
        if (!f07c001999.isChecked()) {
            if (f07c001.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c001), Toast.LENGTH_SHORT).show();
                f07c001.setError("This data is Required!");

                Log.i(TAG, "f07c001: This Data is Required!");
                return false;
            } else {
                f07c001.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f07c001,1,15,getString(R.string.f07c001)," Number")) {
                return false;
            }
        }


        // ====================== f07c002 ===================
        if (!f07c002999.isChecked()) {
            if (f07c002.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c002), Toast.LENGTH_SHORT).show();
                f07c002.setError("This data is required");
                Log.d(TAG, " f07c002 :empty ");
                return false;
            } else {
                f07c002.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f07c002,1,15,getString(R.string.f07c002)," Number")) {
                return false;
            }
        }


        // ====================== f07c003 ===================
        if (!f07c003999.isChecked()) {
            if (f07c003.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c003), Toast.LENGTH_SHORT).show();
                f07c003.setError("This data is required");
                Log.d(TAG, " f07c003 :empty ");
                return false;
            } else {
                f07c003.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f07c003,1,15,getString(R.string.f07c003)," Number")) {
                return false;
            }
        }


        // ====================== f07c004 ===================

        if (!f07c004999.isChecked()) {
            if (f07c004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c004), Toast.LENGTH_SHORT).show();
                f07c004.setError("This data is required");
                Log.d(TAG, " f07c004 :empty ");
                return false;
            } else {
                f07c004.setError(null);
            }

            if (!validatorClass.RangeTextBox(this,f07c004,1,15,getString(R.string.f07c004)," Number")) {
                return false;
            }
        }

        // ====================== f07c005 ===================
        if (!f07c005999.isChecked()) {
            if (f07c005.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c005), Toast.LENGTH_SHORT).show();
                f07c005.setError("This data is required");
                Log.d(TAG, " f07c005 :empty ");
                return false;
            } else {
                f07c005.setError(null);
            }

            if (!validatorClass.RangeTextBox(this,f07c005,1,15,getString(R.string.f07c005)," Number")) {
                return false;
            }
        }
        //=================== f07c006 ==============
        if (f07c006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c006), Toast.LENGTH_SHORT).show();
            f07c006999.setError("This data is Required!");
            Log.i(TAG, "f07c006: This Data is Required!");
            return false;
        } else {
            f07c006999.setError(null);
        }

        if (f07c006a.isChecked() && f07c006aage.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c006a), Toast.LENGTH_SHORT).show();
            f07c006aage.setError("This data is required");
            Log.d(TAG, " f07c006aage :empty ");
            return false;
        } else {
            f07c006aage.setError(null);
        }
        if (f07c006b.isChecked() && f07c006bage.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c006b), Toast.LENGTH_SHORT).show();
            f07c006bage.setError("This data is required");
            Log.d(TAG, " f07c006bage :empty ");
            return false;
        } else {
            f07c006bage.setError(null);
        }

        //=================== f07c007 ==============
        if (f07c007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c007), Toast.LENGTH_SHORT).show();
            f07c007999.setError("This data is Required!");
            Log.i(TAG, "f07c007: This Data is Required!");
            return false;
        } else {
            f07c007999.setError(null);
        }

        if (f07c007a.isChecked() && f07c007aage.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c007a), Toast.LENGTH_SHORT).show();
            f07c007aage.setError("This data is required");
            Log.d(TAG, " f07c007aage :empty ");
            return false;
        } else {
            f07c007aage.setError(null);
        }
        if (f07c007b.isChecked() && f07c007bage.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c007b), Toast.LENGTH_SHORT).show();
            f07c007bage.setError("This data is required");
            Log.d(TAG, " f07c007bage :empty ");
            return false;
        } else {
            f07c007bage.setError(null);
        }

        //=================== f07c009 ==============
        if (f07c009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c009), Toast.LENGTH_SHORT).show();
            f07c009999.setError("This data is Required!");
            Log.i(TAG, "f07c009: This Data is Required!");
            return false;
        } else {
            f07c009999.setError(null);
        }

        if (f07c009888.isChecked() && f07c009888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07c009) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f07c009888x.setError("This data is required");
            Log.d(TAG, " f07c009888 :empty ");
            return false;
        } else {
            f07c009888x.setError(null);
        }

        return true;


    }
    
}

