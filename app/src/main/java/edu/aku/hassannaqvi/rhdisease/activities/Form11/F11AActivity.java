package edu.aku.hassannaqvi.rhdisease.activities.Form11;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.contracts.FetusContract;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class F11AActivity extends AppCompatActivity {

    private static final String TAG = F11AActivity.class.getName();

    @BindView(R.id.f11a001)
    DatePickerInputEditText f11a001;
    @BindView(R.id.f11a002)
    RadioGroup f11a002;
    @BindView(R.id.f11a002a)
    RadioButton f11a002a;
    @BindView(R.id.f11a002b)
    RadioButton f11a002b;
    @BindView(R.id.f11a003)
    RadioGroup f11a003;
    @BindView(R.id.f11a003a)
    RadioButton f11a003a;
    @BindView(R.id.f11a003b)
    RadioButton f11a003b;
    @BindView(R.id.f11a004)
    RadioGroup f11a004;
    @BindView(R.id.f11a004a)
    RadioButton f11a004a;
    @BindView(R.id.f11a004b)
    RadioButton f11a004b;
    @BindView(R.id.f11a004c)
    RadioButton f11a004c;
    @BindView(R.id.f11a004d)
    RadioButton f11a004d;
    @BindView(R.id.f11a004e)
    RadioButton f11a004e;
    @BindView(R.id.f11a004f)
    RadioButton f11a004f;
    @BindView(R.id.f11b001)
    RadioGroup f11b001;
    @BindView(R.id.f11b001a)
    RadioButton f11b001a;
    @BindView(R.id.f11b001b)
    RadioButton f11b001b;
    @BindView(R.id.f11b002a)
    CheckBox f11b002a;
    @BindView(R.id.f11b002b)
    CheckBox f11b002b;
    @BindView(R.id.f11b002c)
    CheckBox f11b002c;
    @BindView(R.id.f11b002d)
    CheckBox f11b002d;
    @BindView(R.id.f11b002e)
    CheckBox f11b002e;
    @BindView(R.id.f11b002f)
    CheckBox f11b002f;
    @BindView(R.id.f11b002888)
    CheckBox f11b002888;
    @BindView(R.id.f11b002888x)
    EditText f11b002888x;
    @BindView(R.id.f11b003)
    RadioGroup f11b003;
    @BindView(R.id.f11b003a)
    RadioButton f11b003a;
    @BindView(R.id.f11b003b)
    RadioButton f11b003b;
    @BindView(R.id.f11b003999)
    RadioButton f11b003999;
    @BindView(R.id.f11b004)
    RadioGroup f11b004;
    @BindView(R.id.f11b004a)
    RadioButton f11b004a;
    @BindView(R.id.f11b004b)
    RadioButton f11b004b;
    @BindView(R.id.f11b004999)
    RadioButton f11b004999;
    @BindView(R.id.f11b005)
    RadioGroup f11b005;
    @BindView(R.id.f11b005a)
    RadioButton f11b005a;
    @BindView(R.id.f11b005b)
    RadioButton f11b005b;
    @BindView(R.id.f11b005999)
    RadioButton f11b005999;
    @BindView(R.id.f11b006)
    RadioGroup f11b006;
    @BindView(R.id.f11b006a)
    RadioButton f11b006a;
    @BindView(R.id.f11b006b)
    RadioButton f11b006b;
    @BindView(R.id.f11b006999)
    RadioButton f11b006999;
    @BindView(R.id.f11b007)
    RadioGroup f11b007;
    @BindView(R.id.f11b007a)
    RadioButton f11b007a;
    @BindView(R.id.f11b007b)
    RadioButton f11b007b;
    @BindView(R.id.f11b007c)
    RadioButton f11b007c;
    @BindView(R.id.f11b007999)
    RadioButton f11b007999;
    @BindView(R.id.f11b008)
    RadioGroup f11b008;
    @BindView(R.id.f11b008a)
    RadioButton f11b008a;
    @BindView(R.id.f11b008b)
    RadioButton f11b008b;
    @BindView(R.id.f11b008999)
    RadioButton f11b008999;
    @BindView(R.id.f11b009)
    RadioGroup f11b009;
    @BindView(R.id.f11b009a)
    RadioButton f11b009a;
    @BindView(R.id.f11b009b)
    RadioButton f11b009b;
    @BindView(R.id.f11b009c)
    RadioButton f11b009c;
    @BindView(R.id.f11b009d)
    RadioButton f11b009d;
    @BindView(R.id.f11b009e)
    RadioButton f11b009e;
    @BindView(R.id.f11b009888)
    RadioButton f11b009888;
    @BindView(R.id.f11b009888x)
    EditText f11b009888x;
    @BindView(R.id.f11b010)
    RadioGroup f11b010;
    @BindView(R.id.f11b010a)
    RadioButton f11b010a;
    @BindView(R.id.f11b010b)
    RadioButton f11b010b;
    @BindView(R.id.f11b010999)
    RadioButton f11b010999;
    @BindView(R.id.f11b011)
    RadioGroup f11b011;
    @BindView(R.id.f11b011a)
    RadioButton f11b011a;
    @BindView(R.id.f11b011b)
    RadioButton f11b011b;
    @BindView(R.id.f11b011c)
    RadioButton f11b011c;
    @BindView(R.id.f11b011d)
    RadioButton f11b011d;
    @BindView(R.id.f11b011e)
    RadioButton f11b011e;
    @BindView(R.id.f11b011888)
    RadioButton f11b011888;
    @BindView(R.id.f11b011888x)
    EditText f11b011888x;
    @BindView(R.id.f11b012)
    RadioGroup f11b012;
    @BindView(R.id.f11b012a)
    RadioButton f11b012a;
    @BindView(R.id.f11b012b)
    RadioButton f11b012b;
    @BindView(R.id.f11b012c)
    RadioButton f11b012c;
    @BindView(R.id.f11b012d)
    RadioButton f11b012d;
    @BindView(R.id.f11b012e)
    RadioButton f11b012e;
    @BindView(R.id.f11b012f)
    RadioButton f11b012f;
    @BindView(R.id.f11b012g)
    RadioButton f11b012g;
    @BindView(R.id.f11b012888)
    RadioButton f11b012888;
    @BindView(R.id.f11b012888x)
    EditText f11b012888x;
    @BindView(R.id.f11b013)
    RadioGroup f11b013;
    @BindView(R.id.f11b013a)
    RadioButton f11b013a;
    @BindView(R.id.f11b013b)
    RadioButton f11b013b;
    @BindView(R.id.f11b013999)
    RadioButton f11b013999;
    @BindView(R.id.f11b014)
    RadioGroup f11b014;
    @BindView(R.id.f11b014a)
    RadioButton f11b014a;
    @BindView(R.id.f11b014b)
    RadioButton f11b014b;
    @BindView(R.id.f11b015)
    RadioGroup f11b015;
    @BindView(R.id.f11b015a)
    RadioButton f11b015a;
    @BindView(R.id.f11b015b)
    RadioButton f11b015b;
    @BindView(R.id.f11b016)
    RadioGroup f11b016;
    @BindView(R.id.f11b016a)
    RadioButton f11b016a;
    @BindView(R.id.f11b016b)
    RadioButton f11b016b;
    @BindView(R.id.f11b017)
    RadioGroup f11b017;
    @BindView(R.id.f11b017a)
    RadioButton f11b017a;
    @BindView(R.id.f11b017b)
    RadioButton f11b017b;
    @BindView(R.id.f11b018)
    RadioGroup f11b018;
    @BindView(R.id.f11b018a)
    RadioButton f11b018a;
    @BindView(R.id.f11b018b)
    RadioButton f11b018b;
    @BindView(R.id.f11b019)
    RadioGroup f11b019;
    @BindView(R.id.f11b019a)
    RadioButton f11b019a;
    @BindView(R.id.f11b019b)
    RadioButton f11b019b;
    @BindView(R.id.f11b020)
    EditText f11b020;
    @BindView(R.id.f11b021)
    RadioGroup f11b021;
    @BindView(R.id.f11b021a)
    RadioButton f11b021a;
    @BindView(R.id.f11b021b)
    RadioButton f11b021b;
    @BindView(R.id.f11b021c)
    RadioButton f11b021c;
    @BindView(R.id.f11b021888)
    RadioButton f11b021888;
    @BindView(R.id.f11b021888x)
    EditText f11b021888x;
    @BindView(R.id.f11b022a)
    CheckBox f11b022a;
    @BindView(R.id.f11b022b)
    CheckBox f11b022b;
    @BindView(R.id.f11b022c)
    CheckBox f11b022c;
    @BindView(R.id.f11b022d)
    CheckBox f11b022d;
    @BindView(R.id.f11b022888)
    CheckBox f11b022888;
    @BindView(R.id.f11b022888x)
    EditText f11b022888x;
    @BindView(R.id.f11b023)
    RadioGroup f11b023;
    @BindView(R.id.f11b023a)
    RadioButton f11b023a;
    @BindView(R.id.f11b023b)
    RadioButton f11b023b;
    @BindView(R.id.f11b023999)
    RadioButton f11b023999;
    @BindView(R.id.f11b024)
    RadioGroup f11b024;
    @BindView(R.id.f11b024a)
    RadioButton f11b024a;
    @BindView(R.id.f11b024b)
    RadioButton f11b024b;
    @BindView(R.id.f11b024c)
    RadioButton f11b024c;
    @BindView(R.id.f11b024d)
    RadioButton f11b024d;
    @BindView(R.id.f11b024e)
    RadioButton f11b024e;
    @BindView(R.id.f11b024f)
    RadioButton f11b024f;
    @BindView(R.id.f11b024g)
    RadioButton f11b024g;
    @BindView(R.id.f11b024888)
    RadioButton f11b024888;
    @BindView(R.id.f11b024888x)
    EditText f11b024888x;

    @BindView(R.id.fldGrpf11a003)
    LinearLayout fldGrpf11a003;

    @BindView(R.id.fldGrpf11a004)
    LinearLayout fldGrpf11a004;

    @BindView(R.id.fldGrpf11b001)
    LinearLayout fldGrpf11b001;

    @BindView(R.id.fldGrpf11b002a)
    LinearLayout fldGrpf11b002a;

    @BindView(R.id.fldGrpf11b003)
    LinearLayout fldGrpf11b003;

    @BindView(R.id.fldGrpf11b011)
    LinearLayout fldGrpf11b011;

    @BindView(R.id.fldGrpf11b012)
    LinearLayout fldGrpf11b012;

    @BindView(R.id.fldGrpf11b014)
    LinearLayout fldGrpf11b014;

    @BindView(R.id.fldGrpf11b015)
    LinearLayout fldGrpf11b015;

    @BindView(R.id.fldGrpf11b016)
    LinearLayout fldGrpf11b016;

    @BindView(R.id.fldGrpf11b017)
    LinearLayout fldGrpf11b017;

    @BindView(R.id.fldGrpf11b018)
    LinearLayout fldGrpf11b018;

    @BindView(R.id.fldGrpf11b019)
    LinearLayout fldGrpf11b019;

    @BindView(R.id.fldGrpf11b022)
    LinearLayout fldGrpf11b022;

    @BindView(R.id.fldGrpf11b024)
    LinearLayout fldGrpf11b024;

    @BindView(R.id.btn_Continue)
    Button btn_Continue;

    @BindView(R.id.btn_End)
    Button btn_End;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f11_a);
        ButterKnife.bind(this);


        String date13Weeks = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        f11a001.setManager(getSupportFragmentManager());
        f11a001.setMaxDate(date13Weeks);


        f11a002.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11a002b.isChecked()) {

                    f11a004.clearCheck();

                    fldGrpf11a003.setVisibility(View.VISIBLE);
                    fldGrpf11a004.setVisibility(View.GONE);
                } else {

                    f11a003.clearCheck();

                    fldGrpf11a003.setVisibility(View.GONE);
                    fldGrpf11a004.setVisibility(View.VISIBLE);
                }
            }
        });


        f11a003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11a003b.isChecked()) {

                    f11b001.clearCheck();
                    f11b002a.setChecked(false);
                    f11b002b.setChecked(false);
                    f11b002c.setChecked(false);
                    f11b002d.setChecked(false);
                    f11b002e.setChecked(false);
                    f11b002f.setChecked(false);
                    f11b002888.setChecked(false);
                    f11b002888x.setText(null);

                    f11b003.clearCheck();
                    f11b004.clearCheck();
                    f11b005.clearCheck();
                    f11b006.clearCheck();
                    f11b007.clearCheck();
                    f11b008.clearCheck();
                    f11b009.clearCheck();
                    f11b009888x.setText(null);

                    f11b010.clearCheck();

                    f11b011.clearCheck();
                    f11b011888x.setText(null);

                    f11b012.clearCheck();
                    f11b012888x.setText(null);

                    f11b013.clearCheck();
                    f11b014.clearCheck();
                    f11b015.clearCheck();
                    f11b016.clearCheck();
                    f11b017.clearCheck();
                    f11b018.clearCheck();
                    f11b019.clearCheck();

                    f11b020.setText(null);

                    f11b021.clearCheck();
                    f11b021888x.setText(null);

                    f11b022a.setChecked(false);
                    f11b022b.setChecked(false);
                    f11b022c.setChecked(false);
                    f11b022d.setChecked(false);
                    f11b022888.setChecked(false);

                    f11b022888x.setText(null);

                    f11b023.clearCheck();
                    f11b024.clearCheck();
                    f11b024888x.setText(null);

                    fldGrpf11b001.setVisibility(View.GONE);

                } else {

                    fldGrpf11b001.setVisibility(View.VISIBLE);

                }
            }
        });


        f11b001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b001b.isChecked()) {

                    f11b002a.setChecked(false);
                    f11b002b.setChecked(false);
                    f11b002c.setChecked(false);
                    f11b002d.setChecked(false);
                    f11b002e.setChecked(false);
                    f11b002f.setChecked(false);
                    f11b002888.setChecked(false);
                    f11b002888x.setText(null);

                    fldGrpf11b002a.setVisibility(View.VISIBLE);
                    fldGrpf11b003.setVisibility(View.GONE);
                } else {

                    f11b003.clearCheck();
                    f11b004.clearCheck();
                    f11b005.clearCheck();
                    f11b006.clearCheck();
                    f11b007.clearCheck();
                    f11b008.clearCheck();
                    f11b009.clearCheck();
                    f11b009888x.setText(null);

                    f11b010.clearCheck();

                    f11b011.clearCheck();
                    f11b011888x.setText(null);

                    f11b012.clearCheck();
                    f11b012888x.setText(null);

                    f11b013.clearCheck();
                    f11b014.clearCheck();
                    f11b015.clearCheck();
                    f11b016.clearCheck();
                    f11b017.clearCheck();
                    f11b018.clearCheck();
                    f11b019.clearCheck();

                    f11b020.setText(null);

                    f11b021.clearCheck();
                    f11b021888x.setText(null);


                    f11b022a.setChecked(false);
                    f11b022b.setChecked(false);
                    f11b022c.setChecked(false);
                    f11b022d.setChecked(false);
                    f11b022888.setChecked(false);
                    f11b022888x.setText(null);

                    f11b023.clearCheck();
                    f11b024.clearCheck();
                    f11b024888x.setText(null);

                    fldGrpf11b002a.setVisibility(View.GONE);
                    fldGrpf11b003.setVisibility(View.VISIBLE);
                }
            }
        });


        f11b002888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (f11b002888.isChecked()) {
                    f11b002888x.setVisibility(View.VISIBLE);
                    f11b002888x.requestFocus();
                } else {
                    f11b002888x.setText(null);
                    f11b002888x.setVisibility(View.GONE);
                }
            }
        });


        f11b009888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (f11b009888.isChecked()) {
                    f11b009888x.setVisibility(View.VISIBLE);
                    f11b009888x.requestFocus();
                } else {
                    f11b009888x.setText(null);
                    f11b009888x.setVisibility(View.GONE);
                }
            }
        });


        f11b010.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b010b.isChecked()) {
                    fldGrpf11b011.setVisibility(View.VISIBLE);
                    fldGrpf11b012.setVisibility(View.GONE);
                } else {
                    f11b011.clearCheck();
                    fldGrpf11b011.setVisibility(View.GONE);
                    fldGrpf11b012.setVisibility(View.VISIBLE);
                }
            }
        });

        f11b011.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b011e.isChecked()) {
                    fldGrpf11b012.setVisibility(View.VISIBLE);
                } else {

                    f11b012.clearCheck();
                    f11b012888x.setText(null);

                    f11b013.clearCheck();
                    f11b014.clearCheck();
                    f11b015.clearCheck();
                    f11b016.clearCheck();
                    f11b017.clearCheck();
                    f11b018.clearCheck();
                    f11b019.clearCheck();

                    f11b020.setText(null);

                    f11b021.clearCheck();
                    f11b021888x.setText(null);

                    f11b022a.setChecked(false);
                    f11b022b.setChecked(false);
                    f11b022c.setChecked(false);
                    f11b022d.setChecked(false);
                    f11b022888.setChecked(false);
                    f11b022888x.setText(null);

                    fldGrpf11b012.setVisibility(View.GONE);
                }
            }
        });


        f11b011888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (f11b011888.isChecked()) {
                    f11b011888x.setVisibility(View.VISIBLE);
                    f11b011888x.requestFocus();
                } else {
                    f11b011888x.setText(null);
                    f11b011888x.setVisibility(View.GONE);
                }
            }
        });


        f11b012888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (f11b012888.isChecked()) {
                    f11b012888x.setVisibility(View.VISIBLE);
                    f11b012888x.requestFocus();
                } else {
                    f11b012888x.setText(null);
                    f11b012888x.setVisibility(View.GONE);
                }
            }
        });


        f11b013.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b013b.isChecked()) {

                    f11b014.clearCheck();
                    f11b015.clearCheck();
                    f11b016.clearCheck();
                    f11b017.clearCheck();
                    f11b018.clearCheck();
                    f11b019.clearCheck();

                    f11b020.setText(null);

                    f11b021.clearCheck();
                    f11b021888x.setText(null);

                    fldGrpf11b014.setVisibility(View.GONE);

                    fldGrpf11b022.setVisibility(View.VISIBLE);
                } else {
                    fldGrpf11b014.setVisibility(View.VISIBLE);
                    fldGrpf11b022.setVisibility(View.GONE);
                    f11b022a.setChecked(false);
                    f11b022b.setChecked(false);
                    f11b022c.setChecked(false);
                    f11b022d.setChecked(false);
                    f11b022888.setChecked(false);
                    f11b022888x.setText(null);
                }
            }
        });


        f11b014.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b014b.isChecked()) {

                    f11b015.clearCheck();
                    f11b016.clearCheck();
                    f11b017.clearCheck();
                    f11b018.clearCheck();
                    f11b019.clearCheck();

                    fldGrpf11b015.setVisibility(View.GONE);
                    fldGrpf11b019.setVisibility(View.GONE);
                } else {
                    fldGrpf11b015.setVisibility(View.VISIBLE);
                    fldGrpf11b019.setVisibility(View.VISIBLE);
                }
            }
        });


        f11b015.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b015b.isChecked()) {

                    f11b016.clearCheck();
                    f11b017.clearCheck();
                    f11b018.clearCheck();
                    f11b019.clearCheck();

                    fldGrpf11b016.setVisibility(View.GONE);
                    fldGrpf11b019.setVisibility(View.GONE);
                } else {
                    fldGrpf11b016.setVisibility(View.VISIBLE);
                    fldGrpf11b019.setVisibility(View.VISIBLE);
                }
            }
        });


        f11b016.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b016b.isChecked()) {

                    f11b017.clearCheck();
                    f11b018.clearCheck();
                    f11b019.clearCheck();

                    fldGrpf11b017.setVisibility(View.GONE);
                } else {
                    fldGrpf11b017.setVisibility(View.VISIBLE);
                }
            }
        });


        f11b017.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b017b.isChecked()) {

                    f11b018.clearCheck();
                    f11b019.clearCheck();

                    fldGrpf11b018.setVisibility(View.GONE);
                } else {
                    fldGrpf11b018.setVisibility(View.VISIBLE);
                }
            }
        });


        f11b018.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b018b.isChecked()) {
                    f11b019.clearCheck();
                    fldGrpf11b019.setVisibility(View.GONE);
                } else {
                    fldGrpf11b019.setVisibility(View.VISIBLE);
                }
            }
        });


        f11b021.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b021888.isChecked()) {
                    f11b021888x.setVisibility(View.VISIBLE);

                } else {
                    f11b021888x.setText(null);
                    f11b021888x.setVisibility(View.GONE);

                }
            }
        });


        f11b022888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (f11b022888.isChecked()) {
                    f11b022888x.setVisibility(View.VISIBLE);
                    f11b022888x.requestFocus();
                } else {
                    f11b022888x.setText(null);
                    f11b022888x.setVisibility(View.GONE);
                }
            }
        });


        f11b023.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b023b.isChecked()) {
                    f11b024.clearCheck();
                    fldGrpf11b024.setVisibility(View.GONE);
                } else {
                    fldGrpf11b024.setVisibility(View.VISIBLE);
                }
            }
        });

        f11b024.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f11b024888.isChecked()) {
                    f11b024888.setVisibility(View.VISIBLE);
                    f11b024888.requestFocus();
                } else {
                    f11b024888.setText(null);
                    f11b024888.setVisibility(View.GONE);
                }
            }
        });


    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        //f11a001
        if (f11a001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11a001), Toast.LENGTH_SHORT).show();
            f11a001.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11a001: This data is Required!");
            return false;
        } else {
            f11a001.setError(null);
        }

        //f11a002a
        if (f11a002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11a002), Toast.LENGTH_SHORT).show();
            f11a002a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11a002: This data is Required!");
            return false;
        } else {
            f11a002a.setError(null);
        }


        if (f11a002b.isChecked()) {

            //f11a003
            if (f11a003.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11a003), Toast.LENGTH_SHORT).show();
                f11a003a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f11a003: This data is Required!");
                return false;
            } else {
                f11a003a.setError(null);
            }

        } else {

            //f11a004
            if (f11a004.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11a004), Toast.LENGTH_SHORT).show();
                f11a004a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f11a004: This data is Required!");
                return false;
            } else {
                f11a004a.setError(null);
            }

        }


        if (f11a003b.isChecked()) {
            return true;
        }


        //f11b001
        if (f11b001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b001), Toast.LENGTH_SHORT).show();
            f11b001a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b001: This data is Required!");
            return false;
        } else {
            f11b001a.setError(null);
        }


        if (f11b001b.isChecked()) {

            //f11b002
            if (!f11b002a.isChecked() && !f11b002b.isChecked()
                    && !f11b002c.isChecked()
                    && !f11b002d.isChecked()
                    && !f11b002e.isChecked()
                    && !f11b002f.isChecked()
                    && !f11b002888.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b002), Toast.LENGTH_SHORT).show();
                f11b002a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f11b002: This data is Required!");
                return false;
            } else {
                f11b002a.setError(null);
            }


            if (f11b002888.isChecked()) {
                //f11a001
                if (f11b002888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f11b002888x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f11a001: This data is Required!");
                    return false;
                } else {
                    f11b002888x.setError(null);
                }
            }

        }


        if (f11b001b.isChecked()) {
            return true;
        }

        //f11b003
        if (f11b003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b003), Toast.LENGTH_SHORT).show();
            f11b003a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b003: This data is Required!");
            return false;
        } else {
            f11b003a.setError(null);
        }


        //f11b004
        if (f11b004.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b004), Toast.LENGTH_SHORT).show();
            f11b004a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b004: This data is Required!");
            return false;
        } else {
            f11b004a.setError(null);
        }


        //f11b005
        if (f11b005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b005), Toast.LENGTH_SHORT).show();
            f11b005a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b005: This data is Required!");
            return false;
        } else {
            f11b005a.setError(null);
        }


        //f11b006
        if (f11b006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b006), Toast.LENGTH_SHORT).show();
            f11b006a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b006: This data is Required!");
            return false;
        } else {
            f11b006a.setError(null);
        }


        //f11b007
        if (f11b007.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b007), Toast.LENGTH_SHORT).show();
            f11b007a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b007: This data is Required!");
            return false;
        } else {
            f11b007a.setError(null);
        }


        //f11b008
        if (f11b008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b008), Toast.LENGTH_SHORT).show();
            f11b008a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b008: This data is Required!");
            return false;
        } else {
            f11b008a.setError(null);
        }


        //f11b009
        if (f11b009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b009), Toast.LENGTH_SHORT).show();
            f11b009a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b009: This data is Required!");
            return false;
        } else {
            f11b009a.setError(null);
        }


        if (f11b009888.isChecked()) {
            //f11b009888x
            if (f11b009888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f11b009888x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f11b009888x: This data is Required!");
                return false;
            } else {
                f11b009888x.setError(null);
            }
        }


        //f11b010
        if (f11b010.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b010), Toast.LENGTH_SHORT).show();
            f11b010a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b010: This data is Required!");
            return false;
        } else {
            f11b010a.setError(null);
        }


        if (f11b010b.isChecked()) {

            //f11b011
            if (f11b011.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b011), Toast.LENGTH_SHORT).show();
                f11b011a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f11b011: This data is Required!");
                return false;
            } else {
                f11b011a.setError(null);
            }


            if (f11b011888.isChecked()) {
                //f11b011888x
                if (f11b011888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f11b011888x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f11b011888x: This data is Required!");
                    return false;
                } else {
                    f11b011888x.setError(null);
                }
            }

        }


        if (f11b010a.isChecked() || f11b010999.isChecked() || f11b011e.isChecked()) {

            //f11b012
            if (f11b012.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b012), Toast.LENGTH_SHORT).show();
                f11b012a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f11b012: This data is Required!");
                return false;
            } else {
                f11b012a.setError(null);
            }


            if (f11b012888.isChecked()) {
                //f11b012888x
                if (f11b012888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f11b012888x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f11b012888x: This data is Required!");
                    return false;
                } else {
                    f11b012888x.setError(null);
                }
            }


            //f11b013
            if (f11b013.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b013), Toast.LENGTH_SHORT).show();
                f11b013a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f11b013: This data is Required!");
                return false;
            } else {
                f11b013a.setError(null);
            }


            if (f11b013a.isChecked() || f11b013999.isChecked()) {

                //f11b014
                if (f11b014.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b014), Toast.LENGTH_SHORT).show();
                    f11b014a.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f11b014: This data is Required!");
                    return false;
                } else {
                    f11b014a.setError(null);
                }


                if (f11b014a.isChecked()) {


                    //f11b015
                    if (f11b015.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b015), Toast.LENGTH_SHORT).show();
                        f11b015a.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f11b015: This data is Required!");
                        return false;
                    } else {
                        f11b015a.setError(null);
                    }


                    if (f11b015a.isChecked()) {

                        //f11b016
                        if (f11b016.getCheckedRadioButtonId() == -1) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b016), Toast.LENGTH_SHORT).show();
                            f11b016a.setError("This data is Required!");    // Set Error on last radio button
                            Log.i(TAG, "f11b016: This data is Required!");
                            return false;
                        } else {
                            f11b016a.setError(null);
                        }


                        if (f11b016a.isChecked()) {


                            //f11b017
                            if (f11b017.getCheckedRadioButtonId() == -1) {
                                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b017), Toast.LENGTH_SHORT).show();
                                f11b017a.setError("This data is Required!");    // Set Error on last radio button
                                Log.i(TAG, "f11b017: This data is Required!");
                                return false;
                            } else {
                                f11b017a.setError(null);
                            }


                            if (f11b017a.isChecked()) {

                                //f11b018
                                if (f11b018.getCheckedRadioButtonId() == -1) {
                                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b018), Toast.LENGTH_SHORT).show();
                                    f11b018a.setError("This data is Required!");    // Set Error on last radio button
                                    Log.i(TAG, "f11b018: This data is Required!");
                                    return false;
                                } else {
                                    f11b018a.setError(null);
                                }


                                if (f11b018a.isChecked()) {

                                    //f11b019
                                    if (f11b019.getCheckedRadioButtonId() == -1) {
                                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b019), Toast.LENGTH_SHORT).show();
                                        f11b019a.setError("This data is Required!");    // Set Error on last radio button
                                        Log.i(TAG, "f11b019: This data is Required!");
                                        return false;
                                    } else {
                                        f11b019a.setError(null);
                                    }

                                }

                            }

                        }

                    }

                }


                //f11b020
                if (f11b020.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b020), Toast.LENGTH_SHORT).show();
                    f11b020.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f11b020: This data is Required!");
                    return false;
                } else {
                    f11b020.setError(null);
                }


                //f11b021
                if (f11b021.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b021), Toast.LENGTH_SHORT).show();
                    f11b021a.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f11b021: This data is Required!");
                    return false;
                } else {
                    f11b021a.setError(null);
                }


                if (f11b021888.isChecked()) {
                    //f11b021888x
                    if (f11b021888x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                        f11b021888x.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f11b022888x: This data is Required!");
                        return false;
                    } else {
                        f11b021888x.setError(null);
                    }
                }


                if (f11b021a.isChecked()
                        || f11b021b.isChecked()
                        || f11b021c.isChecked()
                        || f11b021888.isChecked()) {

                    //f11b022
                    if (!f11b022a.isChecked()
                            && !f11b022b.isChecked()
                            && !f11b022c.isChecked()
                            && !f11b022d.isChecked()
                            && !f11b022888.isChecked()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b022), Toast.LENGTH_SHORT).show();
                        f11b022a.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f11b022: This data is Required!");
                        return false;
                    } else {
                        f11b022a.setError(null);
                    }


                    if (f11b022888.isChecked()) {
                        //f11b022888x
                        if (f11b022888x.getText().toString().isEmpty()) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                            f11b022888x.setError("This data is Required!");    // Set Error on last radio button
                            Log.i(TAG, "f11b022888x: This data is Required!");
                            return false;
                        } else {
                            f11b022888x.setError(null);
                        }
                    }

                }


            }


        }


        if (f11b013b.isChecked()) {

            //f11b022
            if (!f11b022a.isChecked()
                    && !f11b022b.isChecked()
                    && !f11b022c.isChecked()
                    && !f11b022d.isChecked()
                    && !f11b022888.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b022), Toast.LENGTH_SHORT).show();
                f11b022a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f11b022: This data is Required!");
                return false;
            } else {
                f11b022a.setError(null);
            }


            if (f11b022888.isChecked()) {
                //f11b022888x
                if (f11b022888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f11b022888x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f11b022888x: This data is Required!");
                    return false;
                } else {
                    f11b022888x.setError(null);
                }
            }

        }


        //f11b023
        if (f11b023.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b023), Toast.LENGTH_SHORT).show();
            f11b023a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f11b023: This data is Required!");
            return false;
        } else {
            f11b023a.setError(null);
        }


        if (f11b023a.isChecked() || f11b023999.isChecked()) {

            //f11b024
            if (f11b024.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f11b024), Toast.LENGTH_SHORT).show();
                f11b024a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f11b024: This data is Required!");
                return false;
            } else {
                f11b024a.setError(null);
            }


            if (f11b024888.isChecked()) {
                //f11b024888x
                if (f11b024888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f11b024888x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f11b024888x: This data is Required!");
                    return false;
                } else {
                    f11b024888x.setError(null);
                }
            }

        }


        return true;
    }

    private void SaveDraft() throws JSONException {


        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.fec = new FetusContract();

        MainApp.fec.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fec.setUser(MainApp.userName);
        MainApp.fec.set_UUID(MainApp.fc.get_UID());
        MainApp.fec.setParticipantID(MainApp.fc.getParticipantID());
        MainApp.fec.setFormType(MainApp.fc.getFormType());
        MainApp.fec.setFormDate(MainApp.fc.getFormDate());
        MainApp.fec.setDeviceID(MainApp.fc.getDeviceID());


        JSONObject f11 = new JSONObject();


        f11.put("f11a001", f11a001.getText().toString());
        f11.put("f11a002", f11a002a.isChecked() ? "1" : f11a002b.isChecked() ? "2" : "0");
        f11.put("f11a003", f11a003a.isChecked() ? "1" : f11a003b.isChecked() ? "2" : "0");
        f11.put("f11a004", f11a004a.isChecked() ? "1"
                : f11a004b.isChecked() ? "2"
                : f11a004c.isChecked() ? "3"
                : f11a004d.isChecked() ? "4"
                : f11a004e.isChecked() ? "5"
                : f11a004f.isChecked() ? "6"
                : "0");

        f11.put("f11b001", f11b001a.isChecked() ? "1" : f11b001b.isChecked() ? "2" : "0");

        f11.put("f11b002a", f11b002a.isChecked() ? "1" : "0");
        f11.put("f11b002b", f11b002b.isChecked() ? "2" : "0");
        f11.put("f11b002c", f11b002c.isChecked() ? "3" : "0");
        f11.put("f11b002d", f11b002d.isChecked() ? "4" : "0");
        f11.put("f11b002e", f11b002e.isChecked() ? "5" : "0");
        f11.put("f11b002f", f11b002f.isChecked() ? "6" : "0");
        f11.put("f11b002888", f11b002888.isChecked() ? "888" : "0");
        f11.put("f11b002888x", f11b002888x.getText().toString());

        f11.put("f11b003", f11b003a.isChecked() ? "1" : f11b003b.isChecked() ? "2"
                : f11b003999.isChecked() ? "999"
                : "0");


        f11.put("f11b004", f11b004a.isChecked() ? "1" : f11b004b.isChecked() ? "2"
                : f11b004999.isChecked() ? "999"
                : "0");


        f11.put("f11b005", f11b005a.isChecked() ? "1" : f11b005b.isChecked() ? "2"
                : f11b005999.isChecked() ? "999"
                : "0");


        f11.put("f11b006", f11b006a.isChecked() ? "1" : f11b006b.isChecked() ? "2"
                : f11b006999.isChecked() ? "999"
                : "0");


        f11.put("f11b007", f11b007a.isChecked() ? "1" : f11b007b.isChecked() ? "2"
                : f11b007c.isChecked() ? "3"
                : f11b007999.isChecked() ? "999"
                : "0");


        f11.put("f11b008", f11b008a.isChecked() ? "1" : f11b008b.isChecked() ? "2"
                : f11b008999.isChecked() ? "999"
                : "0");


        f11.put("f11b009", f11b009a.isChecked() ? "1"
                : f11b009b.isChecked() ? "2"
                : f11b009c.isChecked() ? "3"
                : f11b009d.isChecked() ? "4"
                : f11b009e.isChecked() ? "5"
                : f11b009888.isChecked() ? "888"
                : "0");


        f11.put("f11b009888x", f11b009888x.getText().toString());


        f11.put("f11b010", f11b010a.isChecked() ? "1" : f11b010b.isChecked() ? "2"
                : f11b010999.isChecked() ? "999"
                : "0");


        f11.put("f11b011", f11b011a.isChecked() ? "1"
                : f11b011b.isChecked() ? "2"
                : f11b011c.isChecked() ? "3"
                : f11b011d.isChecked() ? "4"
                : f11b011e.isChecked() ? "5"
                : f11b011888.isChecked() ? "888"
                : "0");

        f11.put("f11b011888x", f11b011888x.getText().toString());


        f11.put("f11b012", f11b012a.isChecked() ? "1"
                : f11b012b.isChecked() ? "2"
                : f11b012c.isChecked() ? "3"
                : f11b012d.isChecked() ? "4"
                : f11b012e.isChecked() ? "5"
                : f11b012f.isChecked() ? "6"
                : f11b012g.isChecked() ? "7"
                : f11b012888.isChecked() ? "888"
                : "0");


        f11.put("f11b013", f11b013a.isChecked() ? "1" : f11b013b.isChecked() ? "2"
                : f11b013999.isChecked() ? "999"
                : "0");


        f11.put("f11b014", f11b014a.isChecked() ? "1" : f11b014b.isChecked() ? "2"
                : "0");


        f11.put("f11b015", f11b015a.isChecked() ? "1" : f11b015b.isChecked() ? "2"
                : "0");


        f11.put("f11b016", f11b016a.isChecked() ? "1" : f11b016b.isChecked() ? "2"
                : "0");


        f11.put("f11b017", f11b017a.isChecked() ? "1" : f11b017a.isChecked() ? "2"
                : "0");


        f11.put("f11b018", f11b018a.isChecked() ? "1" : f11b018b.isChecked() ? "2"
                : "0");


        f11.put("f11b019", f11b019a.isChecked() ? "1" : f11b019b.isChecked() ? "2"
                : "0");


        f11.put("f11b020", f11b020.getText().toString());

        f11.put("f11b021", f11b021a.isChecked() ? "1"
                : f11b021b.isChecked() ? "2"
                : f11b021c.isChecked() ? "3"
                : f11b021888.isChecked() ? "888"
                : "0");


        f11.put("f11b021888x", f11b021888x.getText().toString());


        f11.put("f11b022", f11b022a.isChecked() ? "1"
                : f11b022b.isChecked() ? "2"
                : f11b022c.isChecked() ? "3"
                : f11b022d.isChecked() ? "4"
                : f11b022888.isChecked() ? "888"
                : "0");

        f11.put("f11b022888x", f11b022888x.getText().toString());


        f11.put("f11b023", f11b023a.isChecked() ? "1"
                : f11b023b.isChecked() ? "2"
                : f11b023999.isChecked() ? "999"
                : "0");


        f11.put("f11b024", f11b024a.isChecked() ? "1"
                : f11b024b.isChecked() ? "2"
                : f11b024b.isChecked() ? "3"
                : f11b024c.isChecked() ? "4"
                : f11b024d.isChecked() ? "5"
                : f11b024e.isChecked() ? "6"
                : f11b024f.isChecked() ? "7"
                : f11b024g.isChecked() ? "8"
                : f11b024888.isChecked() ? "888"
                : "0");

        f11.put("f11b024888x", f11b024888x.getText().toString());

        MainApp.fc.setF11(String.valueOf(f11));

    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.endActivity(this, this);
    }

    @OnClick(R.id.btn_Continue)
    void SaveData() {
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

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateF011();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }
}