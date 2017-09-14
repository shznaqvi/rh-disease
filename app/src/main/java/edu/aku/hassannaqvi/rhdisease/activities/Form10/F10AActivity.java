package edu.aku.hassannaqvi.rhdisease.activities.Form10;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
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
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

/**
 * Created by gul.sanober on 13-Sep-17.
 */

public class F10AActivity extends AppCompatActivity {

    private static final String TAG = F10AActivity.class.getSimpleName();
    //String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    @BindView(R.id.f10a001)
    RadioGroup f10a001;
    @BindView(R.id.f10a001a)
    RadioButton f10a001a;
    @BindView(R.id.f10a001b)
    RadioButton f10a001b;
    @BindView(R.id.f10a001c)
    RadioButton f10a001c;
    @BindView(R.id.f10a001d)
    RadioButton f10a001d;
    @BindView(R.id.f10a001e)
    RadioButton f10a001e;
    @BindView(R.id.f10a001888)
    RadioButton f10a001888;
    @BindView(R.id.f10a001888x)
    EditText f10a001888x;
    @BindView(R.id.f10a002)
    RadioGroup f10a002;
    @BindView(R.id.f10a002a)
    RadioButton f10a002a;
    @BindView(R.id.f10a002b)
    RadioButton f10a002b;
    @BindView(R.id.f10a002888)
    RadioButton f10a002888;
    @BindView(R.id.f10a002888x)
    EditText f10a002888x;
    @BindView(R.id.f10a003)
    DatePickerInputEditText f10a003;
    @BindView(R.id.f10a004)
    DatePickerInputEditText f10a004;
    @BindView(R.id.f10a005)
    RadioGroup f10a005;
    @BindView(R.id.f10a005a)
    RadioButton f10a005a;
    @BindView(R.id.f10a005b)
    RadioButton f10a005b;
    @BindView(R.id.f10a005c)
    RadioButton f10a005c;
    @BindView(R.id.f10a005888)
    RadioButton f10a005888;
    @BindView(R.id.f10a005888x)
    EditText f10a005888x;
    @BindView(R.id.fldGrpf10a06)
    LinearLayout fldGrpf10a06;
    @BindView(R.id.f10a006)
    RadioGroup f10a006;
    @BindView(R.id.f10a006a)
    RadioButton f10a006a;
    @BindView(R.id.f10a006b)
    RadioButton f10a006b;
    @BindView(R.id.f10a006c)
    RadioButton f10a006c;
    @BindView(R.id.f10a006d)
    RadioButton f10a006d;
    @BindView(R.id.f10a006e)
    RadioButton f10a006e;
    @BindView(R.id.f10a006888)
    RadioButton f10a006888;
    @BindView(R.id.f10a006888x)
    EditText f10a006888x;
    @BindView(R.id.f10a007)
    RadioGroup f10a007;
    @BindView(R.id.f10a007a)
    RadioButton f10a007a;
    @BindView(R.id.f10a007b)
    RadioButton f10a007b;
    @BindView(R.id.f10a007c)
    RadioButton f10a007c;
    @BindView(R.id.f10a007d)
    RadioButton f10a007d;
    @BindView(R.id.f10a007e)
    RadioButton f10a007e;
    @BindView(R.id.f10a007f)
    RadioButton f10a007f;
    @BindView(R.id.f10a007888)
    RadioButton f10a007888;
    @BindView(R.id.f10a007999)
    RadioButton f10a007999;
    @BindView(R.id.f10a007888x)
    EditText f10a007888x;
    @BindView(R.id.f10a008)
    RadioGroup f10a008;
    @BindView(R.id.f10a008a)
    RadioButton f10a008a;
    @BindView(R.id.f10a008b)
    RadioButton f10a008b;
    @BindView(R.id.f10a008999)
    RadioButton f10a008999;
    @BindView(R.id.fldGrpf10a009)
    LinearLayout fldGrpf10a009;
    @BindView(R.id.f10a009)
    RadioGroup f10a009;
    @BindView(R.id.f10a009a)
    RadioButton f10a009a;
    @BindView(R.id.f10a009b)
    RadioButton f10a009b;
    @BindView(R.id.f10a009c)
    RadioButton f10a009c;
    @BindView(R.id.f10a009d)
    RadioButton f10a009d;
    @BindView(R.id.f10a009e)
    RadioButton f10a009e;
    @BindView(R.id.f10a009f)
    RadioButton f10a009f;
    @BindView(R.id.f10a009g)
    RadioButton f10a009g;
    @BindView(R.id.f10a009888)
    RadioButton f10a009888;
    @BindView(R.id.f10a009999)
    RadioButton f10a009999;
    @BindView(R.id.f10a009888x)
    EditText f10a009888x;
    @BindView(R.id.f10a010)
    RadioGroup f10a010;
    @BindView(R.id.f10a010a)
    RadioButton f10a010a;
    @BindView(R.id.f10a010b)
    RadioButton f10a010b;
    @BindView(R.id.f10a010999)
    RadioButton f10a010999;
    @BindView(R.id.fldGrpf10a011)
    LinearLayout fldGrpf10a011;
    @BindView(R.id.f10a01101)
    RadioGroup f10a01101;
    @BindView(R.id.f10a01101a)
    RadioButton f10a01101a;
    @BindView(R.id.f10a01101b)
    RadioButton f10a01101b;
    @BindView(R.id.f10a01101999)
    RadioButton f10a01101999;
    @BindView(R.id.f10a01102)
    RadioGroup f10a01102;
    @BindView(R.id.f10a01102a)
    RadioButton f10a01102a;
    @BindView(R.id.f10a01102b)
    RadioButton f10a01102b;
    @BindView(R.id.f10a01102999)
    RadioButton f10a01102999;
    @BindView(R.id.f10a01103)
    RadioGroup f10a01103;
    @BindView(R.id.f10a01103a)
    RadioButton f10a01103a;
    @BindView(R.id.f10a01103b)
    RadioButton f10a01103b;
    @BindView(R.id.f10a01103999)
    RadioButton f10a01103999;
    @BindView(R.id.f10a01104)
    RadioGroup f10a01104;
    @BindView(R.id.f10a01104a)
    RadioButton f10a01104a;
    @BindView(R.id.f10a01104b)
    RadioButton f10a01104b;
    @BindView(R.id.f10a01104999)
    RadioButton f10a01104999;
    @BindView(R.id.f10a01105)
    RadioGroup f10a01105;
    @BindView(R.id.f10a01105a)
    RadioButton f10a01105a;
    @BindView(R.id.f10a01105b)
    RadioButton f10a01105b;
    @BindView(R.id.f10a01105999)
    RadioButton f10a01105999;
    @BindView(R.id.f10a01106)
    RadioGroup f10a01106;
    @BindView(R.id.f10a01106a)
    RadioButton f10a01106a;
    @BindView(R.id.f10a01106b)
    RadioButton f10a01106b;
    @BindView(R.id.f10a01106999)
    RadioButton f10a01106999;
    @BindView(R.id.f10a01107)
    RadioGroup f10a01107;
    @BindView(R.id.f10a01107a)
    RadioButton f10a01107a;
    @BindView(R.id.f10a01107b)
    RadioButton f10a01107b;
    @BindView(R.id.f10a01107999)
    RadioButton f10a01107999;
    @BindView(R.id.f10a01108)
    RadioGroup f10a01108;
    @BindView(R.id.f10a01108a)
    RadioButton f10a01108a;
    @BindView(R.id.f10a01108b)
    RadioButton f10a01108b;
    @BindView(R.id.f10a01108999)
    RadioButton f10a01108999;
    @BindView(R.id.f10a01109)
    RadioGroup f10a01109;
    @BindView(R.id.f10a01109a)
    RadioButton f10a01109a;
    @BindView(R.id.f10a01109b)
    RadioButton f10a01109b;
    @BindView(R.id.f10a01109999)
    RadioButton f10a01109999;
    @BindView(R.id.f10a01110)
    RadioGroup f10a01110;
    @BindView(R.id.f10a01110a)
    RadioButton f10a01110a;
    @BindView(R.id.f10a01110b)
    RadioButton f10a01110b;
    @BindView(R.id.f10a01110999)
    RadioButton f10a01110999;
    @BindView(R.id.f10a01111)
    RadioGroup f10a01111;
    @BindView(R.id.f10a01111a)
    RadioButton f10a01111a;
    @BindView(R.id.f10a01111b)
    RadioButton f10a01111b;
    @BindView(R.id.f10a01111999)
    RadioButton f10a01111999;
    @BindView(R.id.f10a01112)
    RadioGroup f10a01112;
    @BindView(R.id.f10a01112a)
    RadioButton f10a01112a;
    @BindView(R.id.f10a01112b)
    RadioButton f10a01112b;
    @BindView(R.id.f10a01112999)
    RadioButton f10a01112999;
    @BindView(R.id.f10a01113)
    RadioGroup f10a01113;
    @BindView(R.id.f10a01113a)
    RadioButton f10a01113a;
    @BindView(R.id.f10a01113b)
    RadioButton f10a01113b;
    @BindView(R.id.f10a01113999)
    RadioButton f10a01113999;
    @BindView(R.id.f10a01114)
    RadioGroup f10a01114;
    @BindView(R.id.f10a01114a)
    RadioButton f10a01114a;
    @BindView(R.id.f10a01114b)
    RadioButton f10a01114b;
    @BindView(R.id.f10a01114999)
    RadioButton f10a01114999;
    @BindView(R.id.f10a011888)
    RadioGroup f10a011888;
    @BindView(R.id.f10a011888a)
    RadioButton f10a011888a;
    @BindView(R.id.f10a011888b)
    RadioButton f10a011888b;
    @BindView(R.id.f10a011888999)
    RadioButton f10a011888999;
    @BindView(R.id.f10a011888x)
    EditText f10a011888x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f10_a);
        ButterKnife.bind(this);

        f10a003.setManager(getSupportFragmentManager());
        f10a004.setManager(getSupportFragmentManager());

        f10a001888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    f10a001888x.setVisibility(View.VISIBLE);
                } else {
                    f10a001888x.setVisibility(View.GONE);
                    f10a001888x.setText(null);
                }
            }
        });

        f10a002888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    f10a002888x.setVisibility(View.VISIBLE);
                } else {
                    f10a002888x.setVisibility(View.GONE);
                    f10a002888x.setText(null);
                }
            }
        });


        f10a005.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f10a005c.isChecked()) {
                    fldGrpf10a06.setVisibility(View.VISIBLE);
                } else {
                    fldGrpf10a06.setVisibility(View.GONE);
                    f10a006.clearCheck();
                    f10a006888x.setText(null);
                }

                if (f10a005888.isChecked()) {
                    f10a005888x.setVisibility(View.VISIBLE);
                } else {
                    f10a005888x.setVisibility(View.GONE);
                    f10a005888x.setText(null);
                }


            }
        });

        f10a006888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f10a006888.setVisibility(View.VISIBLE);
                } else {
                    f10a006888x.setVisibility(View.GONE);
                    f10a006888x.setText(null);
                }
            }
        });

        f10a007888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f10a007888.setVisibility(View.VISIBLE);
                } else {
                    f10a007888x.setVisibility(View.GONE);
                    f10a007888x.setText(null);
                }
            }
        });

        f10a008.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (!f10a008a.isChecked()) {
                    fldGrpf10a009.setVisibility(View.GONE);
                    f10a009.clearCheck();
                    f10a009888x.setText(null);
                } else {
                    fldGrpf10a009.setVisibility(View.VISIBLE);
                }

            }
        });

        f10a009888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f10a009888.setVisibility(View.VISIBLE);
                } else {
                    f10a009888x.setVisibility(View.GONE);
                    f10a009888x.setText(null);
                }
            }
        });

        f10a010.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (!f10a010a.isChecked()) {
                    fldGrpf10a011.setVisibility(View.GONE);
                    f10a01101.clearCheck();
                    f10a01102.clearCheck();
                    f10a01103.clearCheck();
                    f10a01104.clearCheck();
                    f10a01105.clearCheck();
                    f10a01106.clearCheck();
                    f10a01107.clearCheck();
                    f10a01108.clearCheck();
                    f10a01109.clearCheck();
                    f10a01110.clearCheck();
                    f10a01111.clearCheck();
                    f10a01112.clearCheck();
                    f10a01113.clearCheck();
                    f10a01114.clearCheck();
                    f10a011888.clearCheck();
                    f10a011888x.setText(null);

                } else {
                    fldGrpf10a011.setVisibility(View.VISIBLE);
                }
            }
        });

        f10a011888a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    f10a011888x.setVisibility(View.VISIBLE);
                } else {
                    f10a011888x.setVisibility(View.GONE);
                    f10a011888x.setText(null);
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


                startActivity(new Intent(this, F10BActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject f10a = new JSONObject();

        f10a.put("f10a001", f10a001a.isChecked() ? "1" : f10a001b.isChecked() ? "2" : f10a001c.isChecked() ? "3"
                : f10a001d.isChecked() ? "4" : f10a001e.isChecked() ? "5" : f10a001888.isChecked() ? "888" : "0");
        f10a.put("f10a001888x", f10a001888x.getText().toString());

        f10a.put("f10a002", f10a002a.isChecked() ? "1" : f10a002b.isChecked() ? "2" : f10a002888.isChecked() ? "888" : "0");
        f10a.put("f10a002888x", f10a002888x.getText().toString());

        f10a.put("f10a003", f10a003.getText().toString());
        f10a.put("f10a004", f10a004.getText().toString());
        f10a.put("f10a005", f10a005a.isChecked() ? "1" : f10a005b.isChecked() ? "2" : f10a005c.isChecked() ? "3"
                : f10a005888.isChecked() ? "888" : "0");
        f10a.put("f10a005888x", f10a005888x.getText().toString());
        f10a.put("f10a006", f10a006a.isChecked() ? "1" : f10a006b.isChecked() ? "2" : f10a006c.isChecked() ? "3"
                : f10a006d.isChecked() ? "4" : f10a006e.isChecked() ? "5" : f10a006888.isChecked() ? "888" : "0");
        f10a.put("f10a006888x", f10a006888x.getText().toString());

        f10a.put("f10a007", f10a007a.isChecked() ? "1" : f10a007b.isChecked() ? "2" : f10a007c.isChecked() ? "3"
                : f10a007d.isChecked() ? "4" : f10a007e.isChecked() ? "5" : f10a007f.isChecked() ? "6"
                : f10a007888.isChecked() ? "888" : f10a007999.isChecked() ? "999" : "0");
        f10a.put("f10a007888x", f10a007888x.getText().toString());

        f10a.put("f10a008", f10a008a.isChecked() ? "1" : f10a008b.isChecked() ? "2" : f10a008999.isChecked() ? "999" : "0");

        f10a.put("f10a009", f10a009a.isChecked() ? "1" : f10a009b.isChecked() ? "2" : f10a009c.isChecked() ? "3"
                : f10a009d.isChecked() ? "4" : f10a009e.isChecked() ? "5" : f10a009f.isChecked() ? "6" : f10a009g.isChecked() ? "7"
                : f10a009888.isChecked() ? "888" : f10a009999.isChecked() ? "999" : "0");
        f10a.put("f10a009888x", f10a009888x.getText().toString());
        f10a.put("f10a010", f10a010a.isChecked() ? "1" : f10a010b.isChecked() ? "2" : f10a010999.isChecked() ? "999" : "0");
        f10a.put("f10a01101", f10a01101a.isChecked() ? "1" : f10a01101b.isChecked() ? "2" : f10a01101999.isChecked() ? "999" : "0");
        f10a.put("f10a01102", f10a01102a.isChecked() ? "1" : f10a01102b.isChecked() ? "2" : f10a01102999.isChecked() ? "999" : "0");
        f10a.put("f10a01103", f10a01103a.isChecked() ? "1" : f10a01103b.isChecked() ? "2" : f10a01103999.isChecked() ? "999" : "0");
        f10a.put("f10a01104", f10a01104a.isChecked() ? "1" : f10a01104b.isChecked() ? "2" : f10a01104999.isChecked() ? "999" : "0");
        f10a.put("f10a01105", f10a01105a.isChecked() ? "1" : f10a01105b.isChecked() ? "2" : f10a01105999.isChecked() ? "999" : "0");
        f10a.put("f10a01106", f10a01106a.isChecked() ? "1" : f10a01106b.isChecked() ? "2" : f10a01106999.isChecked() ? "999" : "0");
        f10a.put("f10a01107", f10a01107a.isChecked() ? "1" : f10a01107b.isChecked() ? "2" : f10a01107999.isChecked() ? "999" : "0");
        f10a.put("f10a01108", f10a01108a.isChecked() ? "1" : f10a01108b.isChecked() ? "2" : f10a01108999.isChecked() ? "999" : "0");
        f10a.put("f10a01109", f10a01109a.isChecked() ? "1" : f10a01109b.isChecked() ? "2" : f10a01109999.isChecked() ? "999" : "0");
        f10a.put("f10a01110", f10a01110a.isChecked() ? "1" : f10a01110b.isChecked() ? "2" : f10a01110999.isChecked() ? "999" : "0");
        f10a.put("f10a01111", f10a01111a.isChecked() ? "1" : f10a01111b.isChecked() ? "2" : f10a01111999.isChecked() ? "999" : "0");
        f10a.put("f10a01112", f10a01112a.isChecked() ? "1" : f10a01112b.isChecked() ? "2" : f10a01112999.isChecked() ? "999" : "0");
        f10a.put("f10a01113", f10a01113a.isChecked() ? "1" : f10a01113b.isChecked() ? "2" : f10a01113999.isChecked() ? "999" : "0");
        f10a.put("f10a01114", f10a01114a.isChecked() ? "1" : f10a01114b.isChecked() ? "2" : f10a01114999.isChecked() ? "999" : "0");
        f10a.put("f10a011888", f10a011888a.isChecked() ? "1" : f10a011888b.isChecked() ? "2" : f10a011888999.isChecked() ? "999" : "0");
        f10a.put("f10a011888x", f10a011888x.getText().toString());

        MainApp.fc.setF10a(String.valueOf(f10a));



        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateF10A();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


        //return true;
    }

    public boolean ValidateForm() {

        if (f10a001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a001), Toast.LENGTH_SHORT).show();
            f10a001a.setError("This data is Required!");

            Log.i(TAG, "f10a001: This Data is Required!");
            return false;
        } else {
            f10a001a.setError(null);
        }

        if (f10a001888.isChecked() && f10a001888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a001) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f10a001888x.setError("This data is Required!");

            Log.i(TAG, "f10a001888x: This Data is Required!");
            return false;
        } else {
            f10a001888x.setError(null);
        }

        if (f10a002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a002), Toast.LENGTH_SHORT).show();
            f10a002a.setError("This data is Required!");

            Log.i(TAG, "f10a002: This Data is Required!");
            return false;
        } else {
            f10a002a.setError(null);
        }

        if (f10a002888.isChecked() && f10a002888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a002) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f10a002888x.setError("This data is Required!");

            Log.i(TAG, "f10a002888x: This Data is Required!");
            return false;
        } else {
            f10a002888x.setError(null);
        }

        if (f10a003.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a003), Toast.LENGTH_SHORT).show();
            f10a003.setError("This data is Required!");

            Log.i(TAG, "f10a003: This Data is Required!");
            return false;
        } else {
            f10a003.setError(null);
        }

        if (f10a004.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a004), Toast.LENGTH_SHORT).show();
            f10a004.setError("This data is Required!");

            Log.i(TAG, "f10a004: This Data is Required!");
            return false;
        } else {
            f10a004.setError(null);
        }

        if (f10a005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a005), Toast.LENGTH_SHORT).show();
            f10a005a.setError("This data is Required!");

            Log.i(TAG, "f10a005: This Data is Required!");
            return false;
        } else {
            f10a005a.setError(null);
        }

        if (f10a005888.isChecked() && f10a005888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a005) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f10a005888x.setError("This data is Required!");

            Log.i(TAG, "f10a005888x: This Data is Required!");
            return false;
        } else {
            f10a005888x.setError(null);
        }

        if (f10a005c.isChecked()) {
            if (f10a006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a006), Toast.LENGTH_SHORT).show();
                f10a006a.setError("This data is Required!");

                Log.i(TAG, "f10a006: This Data is Required!");
                return false;
            } else {
                f10a006a.setError(null);
            }

            if (f10a006888.isChecked() && f10a006888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a006) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f10a006888x.setError("This data is Required!");

                Log.i(TAG, "f10a006888x: This Data is Required!");
                return false;
            } else {
                f10a006888x.setError(null);
            }
        }

        if (f10a007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a007), Toast.LENGTH_SHORT).show();
            f10a007a.setError("This data is Required!");

            Log.i(TAG, "f10a007: This Data is Required!");
            return false;
        } else {
            f10a007a.setError(null);
        }

        if (f10a007888.isChecked() && f10a007888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a007) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f10a007888x.setError("This data is Required!");

            Log.i(TAG, "f10a007888x: This Data is Required!");
            return false;
        } else {
            f10a007888x.setError(null);
        }

        if (f10a008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a008), Toast.LENGTH_SHORT).show();
            f10a008a.setError("This data is Required!");

            Log.i(TAG, "f10a008: This Data is Required!");
            return false;
        } else {
            f10a008a.setError(null);
        }

        if (f10a008b.isChecked()) {
            if (f10a009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a009), Toast.LENGTH_SHORT).show();
                f10a009a.setError("This data is Required!");

                Log.i(TAG, "f10a009: This Data is Required!");
                return false;
            } else {
                f10a009a.setError(null);
            }

            if (f10a009888.isChecked() && f10a009888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a009) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f10a009888x.setError("This data is Required!");

                Log.i(TAG, "f10a009888x: This Data is Required!");
                return false;
            } else {
                f10a009888x.setError(null);
            }
        }

        if (f10a010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a010), Toast.LENGTH_SHORT).show();
            f10a010a.setError("This data is Required!");

            Log.i(TAG, "f10a010: This Data is Required!");
            return false;
        } else {
            f10a010a.setError(null);
        }

        if (f10a010a.isChecked()) {
            if (f10a01101.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01101), Toast.LENGTH_SHORT).show();
                f10a01101a.setError("This data is Required!");

                Log.i(TAG, "f10a01101: This Data is Required!");
                return false;
            } else {
                f10a01101a.setError(null);
            }

            if (f10a01102.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01102), Toast.LENGTH_SHORT).show();
                f10a01102a.setError("This data is Required!");

                Log.i(TAG, "f10a01102: This Data is Required!");
                return false;
            } else {
                f10a01102a.setError(null);
            }

            if (f10a01103.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01103), Toast.LENGTH_SHORT).show();
                f10a01103a.setError("This data is Required!");

                Log.i(TAG, "f10a01103: This Data is Required!");
                return false;
            } else {
                f10a01103a.setError(null);
            }

            if (f10a01104.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01104), Toast.LENGTH_SHORT).show();
                f10a01104a.setError("This data is Required!");

                Log.i(TAG, "f10a01104: This Data is Required!");
                return false;
            } else {
                f10a01104a.setError(null);
            }

            if (f10a01105.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01105), Toast.LENGTH_SHORT).show();
                f10a01105a.setError("This data is Required!");

                Log.i(TAG, "f10a01105: This Data is Required!");
                return false;
            } else {
                f10a01105a.setError(null);
            }

            if (f10a01106.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01106), Toast.LENGTH_SHORT).show();
                f10a01106a.setError("This data is Required!");

                Log.i(TAG, "f10a01106: This Data is Required!");
                return false;
            } else {
                f10a01106a.setError(null);
            }

            if (f10a01107.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01107), Toast.LENGTH_SHORT).show();
                f10a01107a.setError("This data is Required!");

                Log.i(TAG, "f10a01107: This Data is Required!");
                return false;
            } else {
                f10a01107a.setError(null);
            }

            if (f10a01108.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01108), Toast.LENGTH_SHORT).show();
                f10a01108a.setError("This data is Required!");

                Log.i(TAG, "f10a01108: This Data is Required!");
                return false;
            } else {
                f10a01108a.setError(null);
            }

            if (f10a01109.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01109), Toast.LENGTH_SHORT).show();
                f10a01109a.setError("This data is Required!");

                Log.i(TAG, "f10a01109: This Data is Required!");
                return false;
            } else {
                f10a01109a.setError(null);
            }

            if (f10a01110.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01110), Toast.LENGTH_SHORT).show();
                f10a01110a.setError("This data is Required!");

                Log.i(TAG, "f10a01110: This Data is Required!");
                return false;
            } else {
                f10a01110a.setError(null);
            }

            if (f10a01111.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01111), Toast.LENGTH_SHORT).show();
                f10a01111a.setError("This data is Required!");

                Log.i(TAG, "f10a01111: This Data is Required!");
                return false;
            } else {
                f10a01111a.setError(null);
            }

            if (f10a01112.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01112), Toast.LENGTH_SHORT).show();
                f10a01112a.setError("This data is Required!");

                Log.i(TAG, "f10a01112: This Data is Required!");
                return false;
            } else {
                f10a01112a.setError(null);
            }

            if (f10a01113.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01113), Toast.LENGTH_SHORT).show();
                f10a01113a.setError("This data is Required!");

                Log.i(TAG, "f10a01113: This Data is Required!");
                return false;
            } else {
                f10a01113a.setError(null);
            }

            if (f10a01114.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a01114), Toast.LENGTH_SHORT).show();
                f10a01114a.setError("This data is Required!");

                Log.i(TAG, "f10a01114: This Data is Required!");
                return false;
            } else {
                f10a01114a.setError(null);
            }

            if (f10a011888.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a011) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f10a011888a.setError("This data is Required!");

                Log.i(TAG, "f10a011888: This Data is Required!");
                return false;
            } else {
                f10a011888a.setError(null);
            }

            if (f10a011888a.isChecked() && f10a011888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f10a011) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f10a011888x.setError("This data is Required!");

                Log.i(TAG, "f10a011888x: This Data is Required!");
                return false;
            } else {
                f10a011888x.setError(null);
            }

        }


        return true;
    }

    /*@Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }*/


}
