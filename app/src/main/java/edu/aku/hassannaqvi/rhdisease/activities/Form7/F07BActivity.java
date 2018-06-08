package edu.aku.hassannaqvi.rhdisease.activities.Form7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
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
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;


public class F07BActivity extends Activity
{

    private static final String TAG = F07BActivity.class.getSimpleName();
    @BindView(R.id.f07b001)
    RadioGroup f07b001;
    @BindView(R.id.f07b001a)
    RadioButton f07b001a;
    @BindView(R.id.f07b001b)
    RadioButton f07b001b;
    @BindView(R.id.f07b001c)
    RadioButton f07b001c;
    @BindView(R.id.f07b001d)
    RadioButton f07b001d;
    @BindView(R.id.f07b001e)
    RadioButton f07b001e;
    @BindView(R.id.f07b001f)
    RadioButton f07b001f;
    @BindView(R.id.f07b001g)
    RadioButton f07b001g;
    @BindView(R.id.f07b001h)
    RadioButton f07b001h;
    @BindView(R.id.f07b001i)
    RadioButton f07b001i;
    @BindView(R.id.f07b001j)
    RadioButton f07b001j;
    @BindView(R.id.f07b001k)
    RadioButton f07b001k;
    @BindView(R.id.f07b001l)
    RadioButton f07b001l;
    @BindView(R.id.f07b001m)
    RadioButton f07b001m;
    @BindView(R.id.f07b001888)
    RadioButton f07b001888;
    @BindView(R.id.f07b001888x)
    EditText f07b001888x;
    @BindView(R.id.f07b002)
    RadioGroup f07b002;
    @BindView(R.id.f07b002a)
    RadioButton f07b002a;
    @BindView(R.id.f07b002b)
    RadioButton f07b002b;
    @BindView(R.id.f07b002c)
    RadioButton f07b002c;
    @BindView(R.id.f07b002cmin)
    EditText f07b002cmin;
    @BindView(R.id.f07b003)
    RadioGroup f07b003;
    @BindView(R.id.f07b003a)
    RadioButton f07b003a;
    @BindView(R.id.f07b003b)
    RadioButton f07b003b;
    @BindView(R.id.f07b003999)
    RadioButton f07b003999;
    //@BindView(R.id.f07b004) RadioGroup f07b004;
    @BindView(R.id.f07b004a)
    CheckBox f07b004a;
    @BindView(R.id.f07b004b)
    CheckBox f07b004b;
    @BindView(R.id.f07b004c)
    CheckBox f07b004c;
    @BindView(R.id.f07b004d)
    CheckBox f07b004d;
    @BindView(R.id.f07b004e)
    CheckBox f07b004e;
    @BindView(R.id.f07b004f)
    CheckBox f07b004f;
    @BindView(R.id.f07b004888)
    CheckBox f07b004888;
    @BindView(R.id.f07b004999)
    CheckBox f07b004999;
    @BindView(R.id.f07b004888x)
    EditText f07b004888x;
    @BindView(R.id.f07b005)
    RadioGroup f07b005;
    @BindView(R.id.f07b005a)
    RadioButton f07b005a;
    @BindView(R.id.f07b005b)
    RadioButton f07b005b;
    @BindView(R.id.f07b005c)
    RadioButton f07b005c;
    @BindView(R.id.f07b005d)
    RadioButton f07b005d;
    @BindView(R.id.f07b005e)
    RadioButton f07b005e;
    @BindView(R.id.f07b005f)
    RadioButton f07b005f;
    @BindView(R.id.f07b005g)
    RadioButton f07b005g;
    @BindView(R.id.f07b005h)
    RadioButton f07b005h;
    @BindView(R.id.f07b005i)
    RadioButton f07b005i;
    @BindView(R.id.f07b005j)
    RadioButton f07b005j;
    @BindView(R.id.f07b005k)
    RadioButton f07b005k;
    @BindView(R.id.f07b005l)
    RadioButton f07b005l;
    @BindView(R.id.f07b005888)
    RadioButton f07b005888;
    @BindView(R.id.f07b005999)
    RadioButton f07b005999;
    @BindView(R.id.f07b005888x)
    EditText f07b005888x;
    @BindView(R.id.f07b006)
    RadioGroup f07b006;
    @BindView(R.id.f07b006a)
    RadioButton f07b006a;
    @BindView(R.id.f07b006b)
    RadioButton f07b006b;
    @BindView(R.id.f07b00701)
    RadioGroup f07b00701;
    @BindView(R.id.f07b00701a)
    RadioButton f07b00701a;
    @BindView(R.id.f07b00701b)
    RadioButton f07b00701b;
    @BindView(R.id.f07b00701999)
    RadioButton f07b00701999;
    @BindView(R.id.f07b00702)
    RadioGroup f07b00702;
    @BindView(R.id.f07b00702a)
    RadioButton f07b00702a;
    @BindView(R.id.f07b00702b)
    RadioButton f07b00702b;
    @BindView(R.id.f07b00702999)
    RadioButton f07b00702999;
    @BindView(R.id.f07b00703)
    RadioGroup f07b00703;
    @BindView(R.id.f07b00703a)
    RadioButton f07b00703a;
    @BindView(R.id.f07b00703b)
    RadioButton f07b00703b;
    @BindView(R.id.f07b00703999)
    RadioButton f07b00703999;
    @BindView(R.id.f07b00704)
    RadioGroup f07b00704;
    @BindView(R.id.f07b00704a)
    RadioButton f07b00704a;
    @BindView(R.id.f07b00704b)
    RadioButton f07b00704b;
    @BindView(R.id.f07b00704999)
    RadioButton f07b00704999;
    @BindView(R.id.f07b00705)
    RadioGroup f07b00705;
    @BindView(R.id.f07b00705a)
    RadioButton f07b00705a;
    @BindView(R.id.f07b00705b)
    RadioButton f07b00705b;
    @BindView(R.id.f07b00705999)
    RadioButton f07b00705999;
    @BindView(R.id.f07b00706)
    RadioGroup f07b00706;
    @BindView(R.id.f07b00706a)
    RadioButton f07b00706a;
    @BindView(R.id.f07b00706b)
    RadioButton f07b00706b;
    @BindView(R.id.f07b00706999)
    RadioButton f07b00706999;
    @BindView(R.id.f07b00707)
    RadioGroup f07b00707;
    @BindView(R.id.f07b00707a)
    RadioButton f07b00707a;
    @BindView(R.id.f07b00707b)
    RadioButton f07b00707b;
    @BindView(R.id.f07b00707999)
    RadioButton f07b00707999;
    @BindView(R.id.f07b00708)
    RadioGroup f07b00708;
    @BindView(R.id.f07b00708a)
    RadioButton f07b00708a;
    @BindView(R.id.f07b00708b)
    RadioButton f07b00708b;
    @BindView(R.id.f07b00708999)
    RadioButton f07b00708999;
    @BindView(R.id.f07b00709)
    RadioGroup f07b00709;
    @BindView(R.id.f07b00709a)
    RadioButton f07b00709a;
    @BindView(R.id.f07b00709b)
    RadioButton f07b00709b;
    @BindView(R.id.f07b00709999)
    RadioButton f07b00709999;
    @BindView(R.id.f07b00710)
    RadioGroup f07b00710;
    @BindView(R.id.f07b00710a)
    RadioButton f07b00710a;
    @BindView(R.id.f07b00710b)
    RadioButton f07b00710b;
    @BindView(R.id.f07b00710999)
    RadioButton f07b00710999;
    @BindView(R.id.f07b00711)
    RadioGroup f07b00711;
    @BindView(R.id.f07b00711a)
    RadioButton f07b00711a;
    @BindView(R.id.f07b00711b)
    RadioButton f07b00711b;
    @BindView(R.id.f07b00711999)
    RadioButton f07b00711999;
    @BindView(R.id.f07b00712)
    RadioGroup f07b00712;
    @BindView(R.id.f07b00712a)
    RadioButton f07b00712a;
    @BindView(R.id.f07b00712b)
    RadioButton f07b00712b;
    @BindView(R.id.f07b00712999)
    RadioButton f07b00712999;
    @BindView(R.id.f07b00713)
    RadioGroup f07b00713;
    @BindView(R.id.f07b00713a)
    RadioButton f07b00713a;
    @BindView(R.id.f07b00713b)
    RadioButton f07b00713b;
    @BindView(R.id.f07b00713999)
    RadioButton f07b00713999;
    @BindView(R.id.f07b00714)
    RadioGroup f07b00714;
    @BindView(R.id.f07b00714a)
    RadioButton f07b00714a;
    @BindView(R.id.f07b00714b)
    RadioButton f07b00714b;
    @BindView(R.id.f07b00714999)
    RadioButton f07b00714999;
    @BindView(R.id.f07b00715)
    RadioGroup f07b00715;
    @BindView(R.id.f07b00715a)
    RadioButton f07b00715a;
    @BindView(R.id.f07b00715b)
    RadioButton f07b00715b;
    @BindView(R.id.f07b00715999)
    RadioButton f07b00715999;
    @BindView(R.id.f07b00716)
    RadioGroup f07b00716;
    @BindView(R.id.f07b00716a)
    RadioButton f07b00716a;
    @BindView(R.id.f07b00716b)
    RadioButton f07b00716b;
    @BindView(R.id.f07b00716999)
    RadioButton f07b00716999;
    @BindView(R.id.f07b00717)
    RadioGroup f07b00717;
    @BindView(R.id.f07b00717a)
    RadioButton f07b00717a;
    @BindView(R.id.f07b00717b)
    RadioButton f07b00717b;
    @BindView(R.id.f07b00717999)
    RadioButton f07b00717999;
    @BindView(R.id.f07b00718)
    RadioGroup f07b00718;
    @BindView(R.id.f07b00718a)
    RadioButton f07b00718a;
    @BindView(R.id.f07b00718b)
    RadioButton f07b00718b;
    @BindView(R.id.f07b00718999)
    RadioButton f07b00718999;
    @BindView(R.id.f07b008)
    RadioGroup f07b008;
    @BindView(R.id.f07b008a)
    RadioButton f07b008a;
    @BindView(R.id.f07b008b)
    RadioButton f07b008b;
    @BindView(R.id.f07b008c)
    RadioButton f07b008c;
    @BindView(R.id.f07b008d)
    RadioButton f07b008d;
    @BindView(R.id.f07b008e)
    RadioButton f07b008e;
    @BindView(R.id.f07b008f)
    RadioButton f07b008f;
    @BindView(R.id.f07b008g)
    RadioButton f07b008g;
    @BindView(R.id.f07b008h)
    RadioButton f07b008h;
    @BindView(R.id.f07b008i)
    RadioButton f07b008i;
    @BindView(R.id.f07b008j)
    RadioButton f07b008j;
    @BindView(R.id.f07b008k)
    RadioButton f07b008k;
    @BindView(R.id.f07b008888)
    RadioButton f07b008888;
    @BindView(R.id.f07b008999)
    RadioButton f07b008999;
    @BindView(R.id.f07b008888x)
    EditText f07b008888x;
    @BindView(R.id.f07b009)
    RadioGroup f07b009;
    @BindView(R.id.f07b009a)
    RadioButton f07b009a;
    @BindView(R.id.f07b009b)
    RadioButton f07b009b;
    @BindView(R.id.f07b009c)
    RadioButton f07b009c;
    @BindView(R.id.f07b009888)
    RadioButton f07b009888;
    @BindView(R.id.f07b009999)
    RadioButton f07b009999;
    @BindView(R.id.f07b009888x)
    EditText f07b009888x;
    @BindView(R.id.f07b010)
    RadioGroup f07b010;
    @BindView(R.id.f07b010a)
    RadioButton f07b010a;
    @BindView(R.id.f07b010b)
    RadioButton f07b010b;
    @BindView(R.id.f07b011)
    RadioGroup f07b011;
    @BindView(R.id.f07b011a)
    RadioButton f07b011a;
    @BindView(R.id.f07b011b)
    RadioButton f07b011b;
    @BindView(R.id.f07b011c)
    RadioButton f07b011c;
    @BindView(R.id.f07b011d)
    RadioButton f07b011d;
    @BindView(R.id.f07b011e)
    RadioButton f07b011e;
    @BindView(R.id.f07b012)
    RadioGroup f07b012;
    @BindView(R.id.f07b012a)
    RadioButton f07b012a;
    @BindView(R.id.f07b012b)
    RadioButton f07b012b;
    @BindView(R.id.f07b012c)
    RadioButton f07b012c;
    @BindView(R.id.f07b012d)
    RadioButton f07b012d;
    @BindView(R.id.f07b012e)
    RadioButton f07b012e;
    @BindView(R.id.f07b012f)
    RadioButton f07b012f;
    @BindView(R.id.f07b012g)
    RadioButton f07b012g;
    @BindView(R.id.f07b012h)
    RadioButton f07b012h;
    @BindView(R.id.f07b012i)
    RadioButton f07b012i;
    @BindView(R.id.f07b012j)
    RadioButton f07b012j;
    @BindView(R.id.f07b012888)
    RadioButton f07b012888;
    @BindView(R.id.f07b012999)
    RadioButton f07b012999;
    @BindView(R.id.f07b012888x)
    EditText f07b012888x;
    @BindView(R.id.f07b013)
    RadioGroup f07b013;
    @BindView(R.id.f07b013a)
    RadioButton f07b013a;
    @BindView(R.id.f07b013b)
    RadioButton f07b013b;
    @BindView(R.id.f07b013c)
    RadioButton f07b013c;
    @BindView(R.id.f07b013d)
    RadioButton f07b013d;
    @BindView(R.id.f07b013e)
    RadioButton f07b013e;
    @BindView(R.id.f07b013f)
    RadioButton f07b013f;
    @BindView(R.id.f07b013g)
    RadioButton f07b013g;
    @BindView(R.id.f07b013h)
    RadioButton f07b013h;
    @BindView(R.id.f07b013i)
    RadioButton f07b013i;
    @BindView(R.id.f07b013888)
    RadioButton f07b013888;
    @BindView(R.id.f07b013999)
    RadioButton f07b013999;
    @BindView(R.id.f07b013888x)
    EditText f07b013888x;
    @BindView(R.id.f07b014)
    RadioGroup f07b014;
    @BindView(R.id.f07b014a)
    RadioButton f07b014a;
    @BindView(R.id.f07b014b)
    RadioButton f07b014b;
    @BindView(R.id.f07b014c)
    RadioButton f07b014c;
    @BindView(R.id.f07b014d)
    RadioButton f07b014d;
    @BindView(R.id.f07b014e)
    RadioButton f07b014e;
    @BindView(R.id.f07b014f)
    RadioButton f07b014f;
    @BindView(R.id.f07b014888)
    RadioButton f07b014888;
    @BindView(R.id.f07b014999)
    RadioButton f07b014999;
    @BindView(R.id.f07b014888x)
    EditText f07b014888x;
    @BindView(R.id.f07b015)
    EditText f07b015;
    @BindView(R.id.f07b01601)
    RadioGroup f07b01601;
    @BindView(R.id.f07b01601a)
    RadioButton f07b01601a;
    @BindView(R.id.f07b01601b)
    RadioButton f07b01601b;
    @BindView(R.id.f07b01601999)
    RadioButton f07b01601999;
    @BindView(R.id.f07b01602)
    RadioGroup f07b01602;
    @BindView(R.id.f07b01602a)
    RadioButton f07b01602a;
    @BindView(R.id.f07b01602b)
    RadioButton f07b01602b;
    @BindView(R.id.f07b01602999)
    RadioButton f07b01602999;
    @BindView(R.id.f07b01603)
    RadioGroup f07b01603;
    @BindView(R.id.f07b01603a)
    RadioButton f07b01603a;
    @BindView(R.id.f07b01603b)
    RadioButton f07b01603b;
    @BindView(R.id.f07b01603999)
    RadioButton f07b01603999;
    @BindView(R.id.f07b01604)
    RadioGroup f07b01604;
    @BindView(R.id.f07b01604a)
    RadioButton f07b01604a;
    @BindView(R.id.f07b01604b)
    RadioButton f07b01604b;
    @BindView(R.id.f07b01604999)
    RadioButton f07b01604999;
    @BindView(R.id.f07b017)
    RadioGroup f07b017;
    @BindView(R.id.f07b017a)
    RadioButton f07b017a;
    @BindView(R.id.f07b017b)
    RadioButton f07b017b;
    @BindView(R.id.f07b017999)
    RadioButton f07b017999;
    @BindView(R.id.f07b018)
    RadioGroup f07b018;
    @BindView(R.id.f07b018a)
    RadioButton f07b018a;
    @BindView(R.id.f07b018b)
    RadioButton f07b018b;
    @BindView(R.id.f07b018999)
    RadioButton f07b018999;
    @BindView(R.id.f07b01901)
    EditText f07b01901;
    @BindView(R.id.f07b01902)
    EditText f07b01902;
    @BindView(R.id.f07b01903)
    EditText f07b01903;
    @BindView(R.id.f07b01904)
    EditText f07b01904;
    @BindView(R.id.f07b01905)
    EditText f07b01905;
    @BindView(R.id.f07b01906)
    EditText f07b01906;
    @BindView(R.id.f07b01907)
    EditText f07b01907;
    @BindView(R.id.fldGrpf07b004)
    LinearLayout fldGrpf07b004;
    @BindView(R.id.fldGrpf07b010)
    LinearLayout fldGrpf07b010;
    @BindView(R.id.fldGrpf07b019)
    LinearLayout fldGrpf07b019;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f07_b);
        ButterKnife.bind(this);

        f07b001888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07b001888x.setVisibility(View.VISIBLE);
                } else {
                    f07b001888x.setVisibility(View.GONE);
                    f07b001888x.setText(null);
                }
            }
        });

        f07b002c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07b002cmin.setVisibility(View.VISIBLE);
                } else {
                    f07b002cmin.setVisibility(View.GONE);
                    f07b002cmin.setText(null);
                }
            }
        });

        f07b003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f07b003b.isChecked()) {
                    fldGrpf07b004.setVisibility(View.GONE);
                    f07b004a.setChecked(false);
                    f07b004b.setChecked(false);
                    f07b004c.setChecked(false);
                    f07b004d.setChecked(false);
                    f07b004e.setChecked(false);
                    f07b004f.setChecked(false);
                    f07b004888.setChecked(false);
                    f07b004999.setChecked(false);
                    f07b004888x.setText(null);
                } else {
                    fldGrpf07b004.setVisibility(View.VISIBLE);
                }
            }
        });

        f07b004888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07b004888x.setVisibility(View.VISIBLE);
                } else {
                    f07b004888x.setVisibility(View.GONE);
                    f07b004888x.setText(null);
                }
            }
        });

        f07b004999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {

                    f07b004a.setEnabled(false);
                    f07b004b.setEnabled(false);
                    f07b004c.setEnabled(false);
                    f07b004d.setEnabled(false);
                    f07b004e.setEnabled(false);
                    f07b004f.setEnabled(false);
                    f07b004888.setEnabled(false);
                    f07b004a.setChecked(false);
                    f07b004b.setChecked(false);
                    f07b004c.setChecked(false);
                    f07b004d.setChecked(false);
                    f07b004e.setChecked(false);
                    f07b004f.setChecked(false);
                    f07b004888.setChecked(false);
                    f07b004888x.setText(null);

                } else {

                    f07b004a.setEnabled(true);
                    f07b004b.setEnabled(true);
                    f07b004c.setEnabled(true);
                    f07b004d.setEnabled(true);
                    f07b004e.setEnabled(true);
                    f07b004f.setEnabled(true);
                    f07b004888.setEnabled(true);
                }

            }
        });

        f07b005888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07b005888x.setVisibility(View.VISIBLE);
                } else {
                    f07b005888x.setVisibility(View.GONE);
                    f07b005888x.setText(null);
                }

            }
        });

        f07b008888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07b008888x.setVisibility(View.VISIBLE);
                } else {
                    f07b008888x.setVisibility(View.GONE);
                    f07b008888x.setText(null);
                }

            }
        });

        f07b009.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f07b009b.isChecked() || f07b009c.isChecked()) {
                    fldGrpf07b010.setVisibility(View.GONE);
                    f07b010.clearCheck();
                } else {
                    fldGrpf07b010.setVisibility(View.VISIBLE);
                }

            }
        });

        f07b009888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07b009888x.setVisibility(View.VISIBLE);
                } else {
                    f07b009888x.setVisibility(View.GONE);
                    f07b009888x.setText(null);
                }
            }
        });


        f07b012888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07b012888x.setVisibility(View.VISIBLE);
                } else {
                    f07b012888x.setVisibility(View.GONE);
                    f07b012888x.setText(null);
                }
            }
        });

        f07b013888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07b013888x.setVisibility(View.VISIBLE);
                } else {
                    f07b013888x.setVisibility(View.GONE);
                    f07b013888x.setText(null);
                }
            }
        });

        f07b014888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f07b014888x.setVisibility(View.VISIBLE);
                } else {
                    f07b014888x.setVisibility(View.GONE);
                    f07b014888x.setText(null);
                }
            }
        });

        f07b018.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f07b018b.isChecked()) {
                    fldGrpf07b019.setVisibility(View.GONE);
                    f07b01901.setText(null);
                    f07b01902.setText(null);
                    f07b01903.setText(null);
                    f07b01904.setText(null);
                    f07b01905.setText(null);
                    f07b01906.setText(null);
                    f07b01907.setText(null);
                } else {
                    fldGrpf07b019.setVisibility(View.VISIBLE);
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
            {
                try {
                    SaveDraft();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (UpdateDB()) {
                    Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                    finish();
                    Intent endSec = new Intent(this, F07CActivity.class);
                    endSec.putExtra("complete", true);
                    startActivity(endSec);

                } else {
                    Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
                }
            }

        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateF07B();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for This Section", Toast.LENGTH_SHORT).show();

        JSONObject f07 = new JSONObject();

        f07.put("f07b001", f07b001a.isChecked() ? "1"
                : f07b001b.isChecked() ? "2"
                : f07b001c.isChecked() ? "3"
                : f07b001d.isChecked() ? "4"
                : f07b001e.isChecked() ? "5"
                : f07b001f.isChecked() ? "6"
                : f07b001g.isChecked() ? "7"
                : f07b001h.isChecked() ? "8"
                : f07b001i.isChecked() ? "9"
                : f07b001j.isChecked() ? "10"
                : f07b001k.isChecked() ? "11"
                : f07b001l.isChecked() ? "12"
                : f07b001m.isChecked() ? "13"
                : f07b001888.isChecked() ? "888"
                : "0");
        f07.put("f07b001888x", f07b001888x.getText().toString());
        f07.put("f07b002", f07b002a.isChecked() ? "1"
                : f07b002b.isChecked() ? "2"
                : f07b002c.isChecked() ? "3"
                : "0");
        f07.put("f07b002cmin", f07b002cmin.getText().toString());
        f07.put("f07b003", f07b003a.isChecked() ? "1"
                : f07b003b.isChecked() ? "2"
                : f07b003999.isChecked() ? "999"
                : "0");
        f07.put("f07b004a", f07b004a.isChecked() ? "1" : "0");
        f07.put("f07b004b", f07b004b.isChecked() ? "2" : "0");
        f07.put("f07b004c", f07b004c.isChecked() ? "3" : "0");
        f07.put("f07b004d", f07b004d.isChecked() ? "4" : "0");
        f07.put("f07b004e", f07b004e.isChecked() ? "5" : "0");
        f07.put("f07b004f", f07b004f.isChecked() ? "6" : "0");
        f07.put("f07b004888", f07b004888.isChecked() ? "888" : "0");
        f07.put("f07b004999", f07b004999.isChecked() ? "999" : "0");
        f07.put("f07b004888x", f07b004888x.getText().toString());
        f07.put("f07b005", f07b005a.isChecked() ? "1"
                : f07b005b.isChecked() ? "2"
                : f07b005c.isChecked() ? "3"
                : f07b005d.isChecked() ? "4"
                : f07b005e.isChecked() ? "5"
                : f07b005f.isChecked() ? "6"
                : f07b005g.isChecked() ? "7"
                : f07b005h.isChecked() ? "8"
                : f07b005i.isChecked() ? "9"
                : f07b005j.isChecked() ? "10"
                : f07b005k.isChecked() ? "11"
                : f07b005l.isChecked() ? "12"
                : f07b005888.isChecked() ? "888"
                : f07b005999.isChecked() ? "999"
                : "0");
        f07.put("f07b005888x", f07b005888x.getText().toString());
        f07.put("f07b006", f07b006a.isChecked() ? "1"
                : f07b006b.isChecked() ? "2"
                : "0");
        //701
        f07.put("f07b00701", f07b00701a.isChecked() ? "1"
                : f07b00701b.isChecked() ? "2"
                : f07b00701999.isChecked() ? "999"
                : "0");
        //702
        f07.put("f07b00702", f07b00702a.isChecked() ? "1"
                : f07b00702b.isChecked() ? "2"
                : f07b00702999.isChecked() ? "999"
                : "0");
        //703
        f07.put("f07b00703", f07b00703a.isChecked() ? "1"
                : f07b00703b.isChecked() ? "2"
                : f07b00703999.isChecked() ? "999"
                : "0");
        //704
        f07.put("f07b00704", f07b00704a.isChecked() ? "1"
                : f07b00704b.isChecked() ? "2"
                : f07b00704999.isChecked() ? "999"
                : "0");
        //705
        f07.put("f07b00705", f07b00705a.isChecked() ? "1"
                : f07b00705b.isChecked() ? "2"
                : f07b00705999.isChecked() ? "999"
                : "0");
        //706
        f07.put("f07b00706", f07b00706a.isChecked() ? "1"
                : f07b00706b.isChecked() ? "2"
                : f07b00706999.isChecked() ? "999"
                : "0");
        //707
        f07.put("f07b00707", f07b00707a.isChecked() ? "1"
                : f07b00707b.isChecked() ? "2"
                : f07b00707999.isChecked() ? "999"
                : "0");
        //708
        f07.put("f07b00708", f07b00708a.isChecked() ? "1"
                : f07b00708b.isChecked() ? "2"
                : f07b00708999.isChecked() ? "999"
                : "0");
        //709
        f07.put("f07b00709", f07b00709a.isChecked() ? "1"
                : f07b00709b.isChecked() ? "2"
                : f07b00709999.isChecked() ? "999"
                : "0");
        //710
        f07.put("f07b00710", f07b00710a.isChecked() ? "1"
                : f07b00710b.isChecked() ? "2"
                : f07b00710999.isChecked() ? "999"
                : "0");
        //711
        f07.put("f07b00711", f07b00711a.isChecked() ? "1"
                : f07b00711b.isChecked() ? "2"
                : f07b00711999.isChecked() ? "999"
                : "0");
        //712
        f07.put("f07b00712", f07b00712a.isChecked() ? "1"
                : f07b00712b.isChecked() ? "2"
                : f07b00712999.isChecked() ? "999"
                : "0");
        //713
        f07.put("f07b00713", f07b00713a.isChecked() ? "1"
                : f07b00713b.isChecked() ? "2"
                : f07b00713999.isChecked() ? "999"
                : "0");
        //714
        f07.put("f07b00714", f07b00714a.isChecked() ? "1"
                : f07b00714b.isChecked() ? "2"
                : f07b00714999.isChecked() ? "999"
                : "0");
        //715
        f07.put("f07b00715", f07b00715a.isChecked() ? "1"
                : f07b00715b.isChecked() ? "2"
                : f07b00715999.isChecked() ? "999"
                : "0");
        //716
        f07.put("f07b00716", f07b00716a.isChecked() ? "1"
                : f07b00716b.isChecked() ? "2"
                : f07b00716999.isChecked() ? "999"
                : "0");
        //717
        f07.put("f07b00717", f07b00717a.isChecked() ? "1"
                : f07b00717b.isChecked() ? "2"
                : f07b00717999.isChecked() ? "999"
                : "0");
        //718
        f07.put("f07b00718", f07b00718a.isChecked() ? "1"
                : f07b00718b.isChecked() ? "2"
                : f07b00718999.isChecked() ? "999"
                : "0");
        //8
        f07.put("f07b00801", f07b008a.isChecked() ? "1"
                : f07b008b.isChecked() ? "2"
                : f07b008c.isChecked() ? "3"
                : f07b008d.isChecked() ? "4"
                : f07b008e.isChecked() ? "5"
                : f07b008f.isChecked() ? "6"
                : f07b008g.isChecked() ? "7"
                : f07b008h.isChecked() ? "8"
                : f07b008i.isChecked() ? "9"
                : f07b008j.isChecked() ? "10"
                : f07b008k.isChecked() ? "11"
                : f07b008888.isChecked() ? "888"
                : f07b008999.isChecked() ? "999"
                : "0");

        f07.put("f07b008888x", f07b008888x.getText().toString());

        //9
        f07.put("f07b009", f07b009a.isChecked() ? "1"
                : f07b009b.isChecked() ? "2"
                : f07b009c.isChecked() ? "3"
                : f07b009888.isChecked() ? "888"
                : f07b00718999.isChecked() ? "999"
                : "0");
        //10
        f07.put("f07b010", f07b010a.isChecked() ? "1"
                : f07b010b.isChecked() ? "2"
                : "0");

        //11
        f07.put("f07b011", f07b011a.isChecked() ? "1"
                : f07b011a.isChecked() ? "2"
                : f07b011c.isChecked() ? "3"
                : f07b011d.isChecked() ? "4"
                : f07b011e.isChecked() ? "5"
                : "0");

        //12
        f07.put("f07b012", f07b012a.isChecked() ? "1"
                : f07b012b.isChecked() ? "2"
                : f07b012c.isChecked() ? "3"
                : f07b012d.isChecked() ? "4"
                : f07b012e.isChecked() ? "5"
                : f07b012f.isChecked() ? "6"
                : f07b012g.isChecked() ? "7"
                : f07b012h.isChecked() ? "8"
                : f07b012i.isChecked() ? "9"
                : f07b012j.isChecked() ? "10"
                : f07b012888.isChecked() ? "888"
                : f07b012999.isChecked() ? "999"
                : "0");

        f07.put("f07b012888x", f07b012888x.getText().toString());

        //13
        f07.put("f07b013", f07b013a.isChecked() ? "1"
                : f07b013b.isChecked() ? "2"
                : f07b013c.isChecked() ? "3"
                : f07b013d.isChecked() ? "4"
                : f07b013e.isChecked() ? "5"
                : f07b013f.isChecked() ? "6"
                : f07b013g.isChecked() ? "7"
                : f07b013h.isChecked() ? "8"
                : f07b013i.isChecked() ? "9"
                : f07b013888.isChecked() ? "888"
                : f07b013999.isChecked() ? "999"
                : "0");
        f07.put("f07b013888x", f07b013888x.getText().toString());

        //14
        f07.put("f07b014", f07b014a.isChecked() ? "1"
                : f07b014b.isChecked() ? "2"
                : f07b014c.isChecked() ? "3"
                : f07b014d.isChecked() ? "4"
                : f07b014e.isChecked() ? "5"
                : f07b014f.isChecked() ? "6"
                : f07b014888.isChecked() ? "888"
                : f07b014999.isChecked() ? "999"
                : "0");
        f07.put("f07b014888x", f07b014888x.getText().toString());
        //15
        f07.put("f07b015", f07b015.getText().toString());
        //1601
        f07.put("f07b01601", f07b01601a.isChecked() ? "1"
                : f07b01601b.isChecked() ? "2"
                : f07b01601999.isChecked() ? "999"
                : "0");

        //1602
        f07.put("f07b01602", f07b01602a.isChecked() ? "1"
                : f07b01602b.isChecked() ? "2"
                : f07b01602999.isChecked() ? "999"
                : "0");

        //1603
        f07.put("f07b01603a", f07b01603a.isChecked() ? "1"
                : f07b01603b.isChecked() ? "2"
                : f07b01603999.isChecked() ? "999"
                : "0");

        //1604
        f07.put("f07b01604", f07b01604a.isChecked() ? "1"
                : f07b01604b.isChecked() ? "2"
                : f07b01604999.isChecked() ? "999"
                : "0");

        //17
        f07.put("f07b017", f07b017a.isChecked() ? "1"
                : f07b017b.isChecked() ? "2"
                : f07b017999.isChecked() ? "999"
                : "0");

        //18
        f07.put("f07b018", f07b018a.isChecked() ? "1"
                : f07b018b.isChecked() ? "2"
                : f07b018999.isChecked() ? "999"
                : "0");

        //1901
        f07.put("f07b01901", f07b01901.getText().toString());
        f07.put("f07b01902", f07b01902.getText().toString());
        f07.put("f07b01903", f07b01903.getText().toString());
        f07.put("f07b01904", f07b01904.getText().toString());
        f07.put("f07b01905", f07b01905.getText().toString());
        f07.put("f07b01906", f07b01906.getText().toString());
        f07.put("f07b01907", f07b01907.getText().toString());

        MainApp.fc4.setF07b(String.valueOf(f07));

    }


    public boolean ValidateForm() {


        // =================== 1 ====================
        if (f07b001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b001), Toast.LENGTH_SHORT).show();
            f07b001a.setError("This data is required");
            Log.d(TAG, "f07b001:empty ");
            return false;
        } else {
            f07b001a.setError(null);
        }

        if (f07b001888.isChecked() && f07b001888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b001) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f07b001888x.setError("This data is Required!");

            Log.i(TAG, "f07b001888x: This Data is Required!");
            return false;
        } else {
            f07b001888x.setError(null);
        }

        if (f07b002.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b002), Toast.LENGTH_SHORT).show();
            f07b002a.setError("This data is required");
            Log.d(TAG, "f07b002:empty ");
            return false;
        } else {
            f07b002a.setError(null);
        }

        if (f07b002c.isChecked() && f07b002cmin.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b002) + " - " + getString(R.string.f07b002c), Toast.LENGTH_SHORT).show();
            f07b002cmin.setError("This data is Required!");

            Log.i(TAG, "f07b002cmin: This Data is Required!");
            return false;
        } else {
            f07b002cmin.setError(null);
        }

        if (f07b003.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b003), Toast.LENGTH_SHORT).show();
            f07b003a.setError("This data is required");
            Log.d(TAG, "f07b003:empty ");
            return false;
        } else {
            f07b003a.setError(null);
        }

        if (!f07b003b.isChecked()) {
            if (!(f07b004a.isChecked() || f07b004b.isChecked() || f07b004c.isChecked() || f07b004d.isChecked()
                    || f07b004e.isChecked() || f07b004f.isChecked() || f07b004888.isChecked() || f07b004999.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b004), Toast.LENGTH_SHORT).show();
                f07b004a.setError("This data is required");
                Log.d(TAG, "f07b004:empty ");
                return false;
            } else {
                f07b004a.setError(null);
            }
        }

        if (f07b005.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b005), Toast.LENGTH_SHORT).show();
            f07b005a.setError("This data is required");
            Log.d(TAG, "f07b005:empty ");
            return false;
        } else {
            f07b005a.setError(null);
        }

        if (f07b005888.isChecked() && f07b005888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b005) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f07b005888x.setError("This data is Required!");

            Log.i(TAG, "f07b005888x: This Data is Required!");
            return false;
        } else {
            f07b005888x.setError(null);
        }

        if (f07b006.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b006), Toast.LENGTH_SHORT).show();
            f07b006a.setError("This data is required");
            Log.d(TAG, "f07b006:empty ");
            return false;
        } else {
            f07b006a.setError(null);
        }

        if (f07b00701.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00701), Toast.LENGTH_SHORT).show();
            f07b00701a.setError("This data is required");
            Log.d(TAG, "f07b00701:empty ");
            return false;
        } else {
            f07b00701a.setError(null);
        }

        if (f07b00702.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00702), Toast.LENGTH_SHORT).show();
            f07b00702a.setError("This data is required");
            Log.d(TAG, "f07b00702:empty ");
            return false;
        } else {
            f07b00702a.setError(null);
        }

        if (f07b00703.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00703), Toast.LENGTH_SHORT).show();
            f07b00703a.setError("This data is required");
            Log.d(TAG, "f07b00703:empty ");
            return false;
        } else {
            f07b00703a.setError(null);
        }

        if (f07b00704.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00704), Toast.LENGTH_SHORT).show();
            f07b00704a.setError("This data is required");
            Log.d(TAG, "f07b00704:empty ");
            return false;
        } else {
            f07b00704a.setError(null);
        }

        if (f07b00705.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00705), Toast.LENGTH_SHORT).show();
            f07b00705a.setError("This data is required");
            Log.d(TAG, "f07b00705:empty ");
            return false;
        } else {
            f07b00705a.setError(null);
        }

        if (f07b00706.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00706), Toast.LENGTH_SHORT).show();
            f07b00706a.setError("This data is required");
            Log.d(TAG, "f07b00706:empty ");
            return false;
        } else {
            f07b00706a.setError(null);
        }

        if (f07b00707.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00707), Toast.LENGTH_SHORT).show();
            f07b00707a.setError("This data is required");
            Log.d(TAG, "f07b00707:empty ");
            return false;
        } else {
            f07b00707a.setError(null);
        }

        if (f07b00708.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00708), Toast.LENGTH_SHORT).show();
            f07b00708a.setError("This data is required");
            Log.d(TAG, "f07b00708:empty ");
            return false;
        } else {
            f07b00708a.setError(null);
        }

        if (f07b00709.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00709), Toast.LENGTH_SHORT).show();
            f07b00709a.setError("This data is required");
            Log.d(TAG, "f07b00709:empty ");
            return false;
        } else {
            f07b00709a.setError(null);
        }

        if (f07b00710.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00710), Toast.LENGTH_SHORT).show();
            f07b00710a.setError("This data is required");
            Log.d(TAG, "f07b00701:empty ");
            return false;
        } else {
            f07b00710a.setError(null);
        }

        if (f07b00711.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00711), Toast.LENGTH_SHORT).show();
            f07b00711a.setError("This data is required");
            Log.d(TAG, "f07b00711:empty ");
            return false;
        } else {
            f07b00711a.setError(null);
        }

        if (f07b00712.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00712), Toast.LENGTH_SHORT).show();
            f07b00712a.setError("This data is required");
            Log.d(TAG, "f07b00712:empty ");
            return false;
        } else {
            f07b00712a.setError(null);
        }

        if (f07b00713.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00713), Toast.LENGTH_SHORT).show();
            f07b00713a.setError("This data is required");
            Log.d(TAG, "f07b00713:empty ");
            return false;
        } else {
            f07b00713a.setError(null);
        }

        if (f07b00714.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00714), Toast.LENGTH_SHORT).show();
            f07b00714a.setError("This data is required");
            Log.d(TAG, "f07b00714:empty ");
            return false;
        } else {
            f07b00714a.setError(null);
        }

        if (f07b00715.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00715), Toast.LENGTH_SHORT).show();
            f07b00715a.setError("This data is required");
            Log.d(TAG, "f07b00715:empty ");
            return false;
        } else {
            f07b00715a.setError(null);
        }

        if (f07b00716.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00716), Toast.LENGTH_SHORT).show();
            f07b00716a.setError("This data is required");
            Log.d(TAG, "f07b00716:empty ");
            return false;
        } else {
            f07b00716a.setError(null);
        }

        if (f07b00717.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00717), Toast.LENGTH_SHORT).show();
            f07b00717a.setError("This data is required");
            Log.d(TAG, "f07b00717:empty ");
            return false;
        } else {
            f07b00717a.setError(null);
        }

        if (f07b00718.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b00718), Toast.LENGTH_SHORT).show();
            f07b00718a.setError("This data is required");
            Log.d(TAG, "f07b00718:empty ");
            return false;
        } else {
            f07b00718a.setError(null);
        }

        if (f07b008.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b008), Toast.LENGTH_SHORT).show();
            f07b008a.setError("This data is required");
            Log.d(TAG, "f07b008:empty ");
            return false;
        } else {
            f07b008a.setError(null);
        }

        if (f07b008888.isChecked() && f07b008888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b008) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f07b008888x.setError("This data is Required!");

            Log.i(TAG, "f07b008888x: This Data is Required!");
            return false;
        } else {
            f07b008888x.setError(null);
        }

        if (f07b009.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b009), Toast.LENGTH_SHORT).show();
            f07b009a.setError("This data is required");
            Log.d(TAG, "f07b009:empty ");
            return false;
        } else {
            f07b009a.setError(null);
        }

        if (f07b009888.isChecked() && f07b009888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b009) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f07b009888x.setError("This data is Required!");

            Log.i(TAG, "f07b009888x: This Data is Required!");
            return false;
        } else {
            f07b009888x.setError(null);
        }

        if (f07b009a.isChecked() || f07b009888.isChecked() || f07b009999.isChecked()) {

            if (f07b010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b010), Toast.LENGTH_SHORT).show();
                f07b010b.setError("This data is required");
                Log.d(TAG, "f07b010:empty ");
                return false;
            } else {
                f07b010b.setError(null);
            }
        }

        if (f07b011.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b011), Toast.LENGTH_SHORT).show();
            f07b011a.setError("This data is required");
            Log.d(TAG, "f07b011:empty ");
            return false;
        } else {
            f07b011a.setError(null);
        }

        if (f07b012.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b012), Toast.LENGTH_SHORT).show();
            f07b012a.setError("This data is required");
            Log.d(TAG, "f07b012:empty ");
            return false;
        } else {
            f07b012a.setError(null);
        }

        if (f07b012888.isChecked() && f07b012888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b012) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f07b012888x.setError("This data is Required!");

            Log.i(TAG, "f07b012888x: This Data is Required!");
            return false;
        } else {
            f07b012888x.setError(null);
        }

        if (f07b013.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b013), Toast.LENGTH_SHORT).show();
            f07b013a.setError("This data is required");
            Log.d(TAG, "f07b013:empty ");
            return false;
        } else {
            f07b013a.setError(null);
        }

        if (f07b013888.isChecked() && f07b013888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b013) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f07b013888x.setError("This data is Required!");

            Log.i(TAG, "f07b013888x: This Data is Required!");
            return false;
        } else {
            f07b013888x.setError(null);
        }

        if (f07b014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b014), Toast.LENGTH_SHORT).show();
            f07b014a.setError("This data is required");
            Log.d(TAG, "f07b014:empty ");
            return false;
        } else {
            f07b014a.setError(null);
        }

        if (f07b014888.isChecked() && f07b014888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b014) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            f07b014888x.setError("This data is Required!");

            Log.i(TAG, "f07b014888x: This Data is Required!");
            return false;
        } else {
            f07b014888x.setError(null);
        }

        if (f07b015.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b015), Toast.LENGTH_SHORT).show();
            f07b015.setError("This data is required");
            Log.d(TAG, "f07b015:empty ");
            return false;
        } else {
            f07b015.setError(null);
        }

        if (Integer.valueOf(f07b015.getText().toString().isEmpty() ? "0" : f07b015.getText().toString()) < 1) {
            Toast.makeText(this, "ERROR(invalid)" + getString(R.string.f07b015), Toast.LENGTH_SHORT).show();
            f07b015.setError("Zero not valid");
            Log.d(TAG, "f07b015: invalid ");
            return false;
        } else {
            f07b015.setError(null);
        }

        if (f07b01601.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01601), Toast.LENGTH_SHORT).show();
            f07b01601a.setError("This data is required");
            Log.d(TAG, "f07b01601:empty ");
            return false;
        } else {
            f07b01601a.setError(null);
        }

        if (f07b01602.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01602), Toast.LENGTH_SHORT).show();
            f07b01602a.setError("This data is required");
            Log.d(TAG, "f07b01602:empty ");
            return false;
        } else {
            f07b01602a.setError(null);
        }

        if (f07b01603.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01603), Toast.LENGTH_SHORT).show();
            f07b01603a.setError("This data is required");
            Log.d(TAG, "f07b01603:empty ");
            return false;
        } else {
            f07b01603a.setError(null);
        }

        if (f07b01604.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01604), Toast.LENGTH_SHORT).show();
            f07b01604a.setError("This data is required");
            Log.d(TAG, "f07b01601:empty ");
            return false;
        } else {
            f07b01604a.setError(null);
        }

        if (f07b017.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b017), Toast.LENGTH_SHORT).show();
            f07b017a.setError("This data is required");
            Log.d(TAG, "f07b017:empty ");
            return false;
        } else {
            f07b017a.setError(null);
        }

        if (f07b018.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b018), Toast.LENGTH_SHORT).show();
            f07b018a.setError("This data is required");
            Log.d(TAG, "f07b018:empty ");
            return false;
        } else {
            f07b018a.setError(null);
        }

        if (!f07b018b.isChecked()) {
            if (f07b01901.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01901), Toast.LENGTH_SHORT).show();
                f07b01901.setError("This data is required");
                Log.d(TAG, "f07b01901:empty ");
                return false;
            } else {
                f07b01901.setError(null);
            }
            if (!validatorClass.RangeTextBox(this,f07b01901,0,20,getString(R.string.f07b01901)," number")) {
                return false;
            }

            if (f07b01902.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01902), Toast.LENGTH_SHORT).show();
                f07b01902.setError("This data is required");
                Log.d(TAG, "f07b01902:empty ");
                return false;
            } else {
                f07b01902.setError(null);
            }

            if (!validatorClass.RangeTextBox(this,f07b01902,0,20,getString(R.string.f07b01902)," number")) {
                return false;
            }
            if (f07b01903.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01903), Toast.LENGTH_SHORT).show();
                f07b01903.setError("This data is required");
                Log.d(TAG, "f07b01903:empty ");
                return false;
            } else {
                f07b01903.setError(null);
            }

            if (!validatorClass.RangeTextBox(this,f07b01903,0,20,getString(R.string.f07b01903)," number")) {
                return false;
            }
            if (f07b01904.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01904), Toast.LENGTH_SHORT).show();
                f07b01904.setError("This data is required");
                Log.d(TAG, "f07b01904:empty ");
                return false;
            } else {
                f07b01904.setError(null);
            }

            if (!validatorClass.RangeTextBox(this,f07b01904,0,20,getString(R.string.f07b01904)," number")) {
                return false;
            }
            if (f07b01905.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01905), Toast.LENGTH_SHORT).show();
                f07b01905.setError("This data is required");
                Log.d(TAG, "f07b01905:empty ");
                return false;
            } else {
                f07b01905.setError(null);
            }

            if (!validatorClass.RangeTextBox(this,f07b01905,0,20,getString(R.string.f07b01905)," number")) {
                return false;
            }
            if (f07b01906.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01906), Toast.LENGTH_SHORT).show();
                f07b01906.setError("This data is required");
                Log.d(TAG, "f07b01906:empty ");
                return false;
            } else {
                f07b01906.setError(null);
            }

            if (!validatorClass.RangeTextBox(this,f07b01906,0,20,getString(R.string.f07b01906)," number")) {
                return false;
            }
            if (f07b01907.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f07b01907), Toast.LENGTH_SHORT).show();
                f07b01907.setError("This data is required");
                Log.d(TAG, "f07b01907:empty ");
                return false;
            } else {
                f07b01907.setError(null);
            }

            if (!validatorClass.RangeTextBox(this,f07b01907,0,20,getString(R.string.f07b01907)," number")) {
                return false;
            }
        }

        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
        //super.onBackPressed();
    }


}
