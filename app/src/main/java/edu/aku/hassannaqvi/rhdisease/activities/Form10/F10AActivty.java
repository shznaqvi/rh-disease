package edu.aku.hassannaqvi.rhdisease.activities.Form10;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class F10AActivity extends AppCompatActivity {

    private static final String TAG = F10AActivity.class.getSimpleName();
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

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


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {


        return true
    }

    public boolean ValidateForm() {

       /* if (cen25.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cen25), Toast.LENGTH_SHORT).show();
            cen25.setError("This data is Required!");

            Log.i(TAG, "cen25: This Data is Required!");
            return false;
        } else {
            cen25.setError(null);
        }*/


        return true;
    }

    /*@Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }*/



}
