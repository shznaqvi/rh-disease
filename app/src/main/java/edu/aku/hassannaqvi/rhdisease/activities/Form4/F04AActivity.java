package edu.aku.hassannaqvi.rhdisease.activities.Form4;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;

public class F04AActivity extends Activity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.f04a001)
    RadioGroup f04a001;
    @BindView(R.id.f04a001a)
    RadioButton f04a001a;
    @BindView(R.id.f04a001b)
    RadioButton f04a001b;
    @BindView(R.id.fldGrp001)
    LinearLayout fldGrp001;
    @BindView(R.id.f04a002a)
    CheckBox f04a002a;
    @BindView(R.id.f04a002b)
    CheckBox f04a002b;
    @BindView(R.id.f04a002c)
    CheckBox f04a002c;
    @BindView(R.id.f04a002d)
    CheckBox f04a002d;
    @BindView(R.id.f04a002e)
    CheckBox f04a002e;
    @BindView(R.id.f04a002f)
    CheckBox f04a002f;
    @BindView(R.id.f04a002g)
    CheckBox f04a002g;
    @BindView(R.id.f04a002h)
    CheckBox f04a002h;
    @BindView(R.id.f04a002i)
    CheckBox f04a002i;
    @BindView(R.id.f04a002j)
    CheckBox f04a002j;
    @BindView(R.id.f04a002k)
    CheckBox f04a002k;
    @BindView(R.id.f04a002l)
    CheckBox f04a002l;
    @BindView(R.id.f04a002m)
    CheckBox f04a002m;
    @BindView(R.id.f04a002n)
    CheckBox f04a002n;
    @BindView(R.id.f04a002777)
    CheckBox f04a002777;
    @BindView(R.id.f04a002888)
    CheckBox f04a002888;
    @BindView(R.id.f04a002999)
    CheckBox f04a002999;
    @BindView(R.id.f04a002888x)
    EditText f04a002888x;
    @BindView(R.id.f04a003a)
    CheckBox f04a003a;
    @BindView(R.id.f04a003b)
    CheckBox f04a003b;
    @BindView(R.id.f04a003c)
    CheckBox f04a003c;
    @BindView(R.id.f04a003d)
    CheckBox f04a003d;
    @BindView(R.id.f04a003e)
    CheckBox f04a003e;
    @BindView(R.id.f04a003f)
    CheckBox f04a003f;
    @BindView(R.id.f04a003g)
    CheckBox f04a003g;
    @BindView(R.id.f04a003h)
    CheckBox f04a003h;
    @BindView(R.id.f04a003i)
    CheckBox f04a003i;
    @BindView(R.id.f04a003j)
    CheckBox f04a003j;
    @BindView(R.id.f04a003k)
    CheckBox f04a003k;
    @BindView(R.id.f04a003l)
    CheckBox f04a003l;
    @BindView(R.id.f04a003m)
    CheckBox f04a003m;
    @BindView(R.id.f04a003n)
    CheckBox f04a003n;
    @BindView(R.id.f04a003o)
    CheckBox f04a003o;
    @BindView(R.id.f04a003p)
    CheckBox f04a003p;
    @BindView(R.id.f04a003q)
    CheckBox f04a003q;
    @BindView(R.id.f04a003777)
    CheckBox f04a003777;
    @BindView(R.id.f04a003888)
    CheckBox f04a003888;
    @BindView(R.id.f04a003999)
    CheckBox f04a003999;
    @BindView(R.id.f04a003888x)
    EditText f04a003888x;
    @BindView(R.id.f04a004a)
    CheckBox f04a004a;
    @BindView(R.id.f04a004b)
    CheckBox f04a004b;
    @BindView(R.id.f04a004c)
    CheckBox f04a004c;
    @BindView(R.id.f04a004d)
    CheckBox f04a004d;
    @BindView(R.id.f04a004e)
    CheckBox f04a004e;
    @BindView(R.id.f04a004f)
    CheckBox f04a004f;
    @BindView(R.id.f04a004g)
    CheckBox f04a004g;
    @BindView(R.id.f04a004h)
    CheckBox f04a004h;
    @BindView(R.id.f04a004i)
    CheckBox f04a004i;
    @BindView(R.id.f04a004j)
    CheckBox f04a004j;
    @BindView(R.id.f04a004k)
    CheckBox f04a004k;
    @BindView(R.id.f04a004l)
    CheckBox f04a004l;
    @BindView(R.id.f04a004m)
    CheckBox f04a004m;
    @BindView(R.id.f04a004n)
    CheckBox f04a004n;
    @BindView(R.id.f04a004o)
    CheckBox f04a004o;
    @BindView(R.id.f04a004777)
    CheckBox f04a004777;
    @BindView(R.id.f04a004888)
    CheckBox f04a004888;
    @BindView(R.id.f04a004999)
    CheckBox f04a004999;
    @BindView(R.id.f04a004888x)
    EditText f04a004888x;
    @BindView(R.id.f04a005a)
    CheckBox f04a005a;
    @BindView(R.id.f04a005b)
    CheckBox f04a005b;
    @BindView(R.id.f04a005c)
    CheckBox f04a005c;
    @BindView(R.id.f04a005d)
    CheckBox f04a005d;
    @BindView(R.id.f04a005e)
    CheckBox f04a005e;
    @BindView(R.id.f04a005f)
    CheckBox f04a005f;
    @BindView(R.id.f04a005g)
    CheckBox f04a005g;
    @BindView(R.id.f04a005h)
    CheckBox f04a005h;
    @BindView(R.id.f04a005i)
    CheckBox f04a005i;
    @BindView(R.id.f04a005j)
    CheckBox f04a005j;
    @BindView(R.id.f04a005k)
    CheckBox f04a005k;
    @BindView(R.id.f04a005l)
    CheckBox f04a005l;
    @BindView(R.id.f04a005m)
    CheckBox f04a005m;
    @BindView(R.id.f04a005n)
    CheckBox f04a005n;
    @BindView(R.id.f04a005o)
    CheckBox f04a005o;
    @BindView(R.id.f04a005777)
    CheckBox f04a005777;
    @BindView(R.id.f04a005888)
    CheckBox f04a005888;
    @BindView(R.id.f04a005999)
    CheckBox f04a005999;
    @BindView(R.id.f04a005888x)
    EditText f04a005888x;
    @BindView(R.id.f04a006)
    RadioGroup f04a006;
    @BindView(R.id.f04a006a)
    RadioButton f04a006a;
    @BindView(R.id.f04a006b)
    RadioButton f04a006b;
    @BindView(R.id.f04a006c)
    RadioButton f04a006c;
    @BindView(R.id.f04a006d)
    RadioButton f04a006d;
    @BindView(R.id.f04a006e)
    RadioButton f04a006e;
    @BindView(R.id.f04a006f)
    RadioButton f04a006f;
    @BindView(R.id.f04a006g)
    RadioButton f04a006g;
    @BindView(R.id.f04a006777)
    RadioButton f04a006777;
    @BindView(R.id.f04a006888)
    RadioButton f04a006888;
    @BindView(R.id.f04a006999)
    RadioButton f04a006999;
    @BindView(R.id.f04a006888x)
    EditText f04a006888x;
    @BindView(R.id.f04a007a)
    CheckBox f04a007a;
    @BindView(R.id.f04a007b)
    CheckBox f04a007b;
    @BindView(R.id.f04a007c)
    CheckBox f04a007c;
    @BindView(R.id.f04a007d)
    CheckBox f04a007d;
    @BindView(R.id.f04a007e)
    CheckBox f04a007e;
    @BindView(R.id.f04a007f)
    CheckBox f04a007f;
    @BindView(R.id.f04a007777)
    CheckBox f04a007777;
    @BindView(R.id.f04a007888)
    CheckBox f04a007888;
    @BindView(R.id.f04a007999)
    CheckBox f04a007999;
    @BindView(R.id.f04a007888x)
    EditText f04a007888x;
    @BindView(R.id.f04a008a)
    CheckBox f04a008a;
    @BindView(R.id.f04a008b)
    CheckBox f04a008b;
    @BindView(R.id.f04a008c)
    CheckBox f04a008c;
    @BindView(R.id.f04a008d)
    CheckBox f04a008d;
    @BindView(R.id.f04a008e)
    CheckBox f04a008e;
    @BindView(R.id.f04a008f)
    CheckBox f04a008f;
    @BindView(R.id.f04a008g)
    CheckBox f04a008g;
    @BindView(R.id.f04a008h)
    CheckBox f04a008h;
    @BindView(R.id.f04a008i)
    CheckBox f04a008i;
    @BindView(R.id.f04a008777)
    CheckBox f04a008777;
    @BindView(R.id.f04a008888)
    CheckBox f04a008888;
    @BindView(R.id.f04a008999)
    CheckBox f04a008999;
    @BindView(R.id.f04a008888x)
    EditText f04a008888x;
    @BindView(R.id.f04a009)
    RadioGroup f04a009;
    @BindView(R.id.f04a009a)
    RadioButton f04a009a;
    @BindView(R.id.f04a009b)
    RadioButton f04a009b;
    @BindView(R.id.f04a009c)
    RadioButton f04a009c;
    @BindView(R.id.f04a009d)
    RadioButton f04a009d;
    @BindView(R.id.f04a009777)
    RadioButton f04a009777;
    @BindView(R.id.f04a009888)
    RadioButton f04a009888;
    @BindView(R.id.f04a009999)
    RadioButton f04a009999;
    @BindView(R.id.f04a009888x)
    EditText f04a009888x;
    @BindView(R.id.f04a010a)
    CheckBox f04a010a;
    @BindView(R.id.f04a010b)
    CheckBox f04a010b;
    @BindView(R.id.f04a010c)
    CheckBox f04a010c;
    @BindView(R.id.f04a010d)
    CheckBox f04a010d;
    @BindView(R.id.f04a010e)
    CheckBox f04a010e;
    @BindView(R.id.f04a010777)
    CheckBox f04a010777;
    @BindView(R.id.f04a010888)
    CheckBox f04a010888;
    @BindView(R.id.f04a010999)
    CheckBox f04a010999;
    @BindView(R.id.f04a010888x)
    EditText f04a010888x;
    @BindView(R.id.f04a011)
    RadioGroup f04a011;
    @BindView(R.id.f04a011a)
    RadioButton f04a011a;
    @BindView(R.id.f04a011b)
    RadioButton f04a011b;
    @BindView(R.id.f04a011c)
    RadioButton f04a011c;
    @BindView(R.id.f04a011d)
    RadioButton f04a011d;
    @BindView(R.id.f04a011e)
    RadioButton f04a011e;
    @BindView(R.id.f04a011f)
    RadioButton f04a011f;
    @BindView(R.id.f04a011888)
    RadioButton f04a011888;
    @BindView(R.id.f04a011999)
    RadioButton f04a011999;
    @BindView(R.id.f04a011888x)
    EditText f04a011888x;
    @BindView(R.id.f04a012a)
    CheckBox f04a012a;
    @BindView(R.id.f04a012b)
    CheckBox f04a012b;
    @BindView(R.id.f04a012c)
    CheckBox f04a012c;
    @BindView(R.id.f04a012d)
    CheckBox f04a012d;
    @BindView(R.id.f04a012e)
    CheckBox f04a012e;
    @BindView(R.id.f04a012f)
    CheckBox f04a012f;
    @BindView(R.id.f04a012g)
    CheckBox f04a012g;
    @BindView(R.id.f04a012h)
    CheckBox f04a012h;
    @BindView(R.id.f04a012i)
    CheckBox f04a012i;
    @BindView(R.id.f04a012j)
    CheckBox f04a012j;
    @BindView(R.id.f04a012k)
    CheckBox f04a012k;
    @BindView(R.id.f04a012l)
    CheckBox f04a012l;
    @BindView(R.id.f04a012m)
    CheckBox f04a012m;
    @BindView(R.id.f04a012n)
    CheckBox f04a012n;
    @BindView(R.id.f04a012o)
    CheckBox f04a012o;
    @BindView(R.id.f04a012p)
    CheckBox f04a012p;
    @BindView(R.id.f04a012q)
    CheckBox f04a012q;
    @BindView(R.id.f04a012r)
    CheckBox f04a012r;
    @BindView(R.id.f04a012777)
    CheckBox f04a012777;
    @BindView(R.id.f04a012888)
    CheckBox f04a012888;
    @BindView(R.id.f04a012999)
    CheckBox f04a012999;
    @BindView(R.id.f04a012888x)
    EditText f04a012888x;
    @BindView(R.id.fldGrp012)
    LinearLayout fldGrp012;
    @BindView(R.id.f04a013)
    RadioGroup f04a013;
    @BindView(R.id.f04a013a)
    RadioButton f04a013a;
    @BindView(R.id.f04a013b)
    RadioButton f04a013b;
    @BindView(R.id.f04a013c)
    RadioButton f04a013c;
    @BindView(R.id.f04a013d)
    RadioButton f04a013d;
    @BindView(R.id.f04a013e)
    RadioButton f04a013e;
    @BindView(R.id.f04a013f)
    RadioButton f04a013f;
    @BindView(R.id.f04a013777)
    RadioButton f04a013777;
    @BindView(R.id.f04a013888)
    RadioButton f04a013888;
    @BindView(R.id.f04a013999)
    RadioButton f04a013999;
    @BindView(R.id.f04a013888x)
    EditText f04a013888x;
    @BindView(R.id.f04a014)
    RadioGroup f04a014;
    @BindView(R.id.f04a014a)
    RadioButton f04a014a;
    @BindView(R.id.f04a014b)
    RadioButton f04a014b;
    @BindView(R.id.f04a014999)
    RadioButton f04a014999;
    @BindView(R.id.fldGrp014)
    LinearLayout fldGrp014;
    @BindView(R.id.f04a015a)
    CheckBox f04a015a;
    @BindView(R.id.f04a015b)
    CheckBox f04a015b;
    @BindView(R.id.f04a015c)
    CheckBox f04a015c;
    @BindView(R.id.f04a015d)
    CheckBox f04a015d;
    @BindView(R.id.f04a015e)
    CheckBox f04a015e;
    @BindView(R.id.f04a015f)
    CheckBox f04a015f;
    @BindView(R.id.f04a015g)
    CheckBox f04a015g;
    @BindView(R.id.f04a015777)
    CheckBox f04a015777;
    @BindView(R.id.f04a015888)
    CheckBox f04a015888;
    @BindView(R.id.f04a015999)
    CheckBox f04a015999;
    @BindView(R.id.f04a015888x)
    EditText f04a015888x;
    @BindView(R.id.f04a016)
    RadioGroup f04a016;
    @BindView(R.id.f04a016a)
    RadioButton f04a016a;
    @BindView(R.id.f04a016b)
    RadioButton f04a016b;
    @BindView(R.id.f04a016999)
    RadioButton f04a016999;
    @BindView(R.id.fldGrp016)
    LinearLayout fldGrp016;
    @BindView(R.id.f04a017a)
    CheckBox f04a017a;
    @BindView(R.id.f04a017b)
    CheckBox f04a017b;
    @BindView(R.id.f04a017c)
    CheckBox f04a017c;
    @BindView(R.id.f04a017d)
    CheckBox f04a017d;
    @BindView(R.id.f04a017e)
    CheckBox f04a017e;
    @BindView(R.id.f04a017f)
    CheckBox f04a017f;
    @BindView(R.id.f04a017g)
    CheckBox f04a017g;
    @BindView(R.id.f04a017h)
    CheckBox f04a017h;
    @BindView(R.id.f04a017i)
    CheckBox f04a017i;
    @BindView(R.id.f04a017j)
    CheckBox f04a017j;
    @BindView(R.id.f04a017k)
    CheckBox f04a017k;
    @BindView(R.id.f04a017l)
    CheckBox f04a017l;
    @BindView(R.id.f04a017m)
    CheckBox f04a017m;
    @BindView(R.id.f04a017n)
    CheckBox f04a017n;
    @BindView(R.id.f04a017o)
    CheckBox f04a017o;
    @BindView(R.id.f04a017p)
    CheckBox f04a017p;
    @BindView(R.id.f04a017q)
    CheckBox f04a017q;
    @BindView(R.id.f04a017777)
    CheckBox f04a017777;
    @BindView(R.id.f04a017888)
    CheckBox f04a017888;
    @BindView(R.id.f04a017888x)
    EditText f04a017888x;
    @BindView(R.id.f04a018)
    RadioGroup f04a018;
    @BindView(R.id.f04a018a)
    RadioButton f04a018a;
    @BindView(R.id.f04a018b)
    RadioButton f04a018b;
    @BindView(R.id.f04a018999)
    RadioButton f04a018999;
    @BindView(R.id.fldGrp018)
    LinearLayout fldGrp018;
    @BindView(R.id.f04a019)
    RadioGroup f04a019;
    @BindView(R.id.f04a019a)
    RadioButton f04a019a;
    @BindView(R.id.f04a019b)
    RadioButton f04a019b;
    @BindView(R.id.f04a019c)
    RadioButton f04a019c;
    @BindView(R.id.f04a019d)
    RadioButton f04a019d;
    @BindView(R.id.f04a019e)
    RadioButton f04a019e;
    @BindView(R.id.f04a019f)
    RadioButton f04a019f;
    @BindView(R.id.f04a019g)
    RadioButton f04a019g;
    @BindView(R.id.f04a019h)
    RadioButton f04a019h;
    @BindView(R.id.f04a019i)
    RadioButton f04a019i;
    @BindView(R.id.f04a019j)
    RadioButton f04a019j;
    @BindView(R.id.f04a019777)
    RadioButton f04a019777;
    @BindView(R.id.f04a019888)
    RadioButton f04a019888;
    @BindView(R.id.f04a019ix)
    EditText f04a019ix;
    @BindView(R.id.f04a019888x)
    EditText f04a019888x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f04_a);
        ButterKnife.bind(this);

        //=================== f04a001b ==============
        f04a001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (f04a001a.isChecked()) {
                    fldGrp001.setVisibility(View.VISIBLE);
                } else {
                    fldGrp001.setVisibility(View.GONE);
                    f04a002a.setChecked(false);
                    f04a002b.setChecked(false);
                    f04a002c.setChecked(false);
                    f04a002d.setChecked(false);
                    f04a002e.setChecked(false);
                    f04a002f.setChecked(false);
                    f04a002g.setChecked(false);
                    f04a002h.setChecked(false);
                    f04a002i.setChecked(false);
                    f04a002j.setChecked(false);
                    f04a002k.setChecked(false);
                    f04a002l.setChecked(false);
                    f04a002m.setChecked(false);
                    f04a002n.setChecked(false);
                    f04a002777.setChecked(false);
                    f04a002888.setChecked(false);
                    f04a002999.setChecked(false);
                    f04a002888x.setText(null);
                    f04a003a.setChecked(false);
                    f04a003b.setChecked(false);
                    f04a003c.setChecked(false);
                    f04a003d.setChecked(false);
                    f04a003e.setChecked(false);
                    f04a003f.setChecked(false);
                    f04a003g.setChecked(false);
                    f04a003h.setChecked(false);
                    f04a003i.setChecked(false);
                    f04a003j.setChecked(false);
                    f04a003k.setChecked(false);
                    f04a003l.setChecked(false);
                    f04a003m.setChecked(false);
                    f04a003n.setChecked(false);
                    f04a003o.setChecked(false);
                    f04a003p.setChecked(false);
                    f04a003q.setChecked(false);
                    f04a003777.setChecked(false);
                    f04a003888.setChecked(false);
                    f04a003999.setChecked(false);
                    f04a003888x.setText(null);
                    f04a004a.setChecked(false);
                    f04a004b.setChecked(false);
                    f04a004c.setChecked(false);
                    f04a004d.setChecked(false);
                    f04a004e.setChecked(false);
                    f04a004f.setChecked(false);
                    f04a004g.setChecked(false);
                    f04a004h.setChecked(false);
                    f04a004i.setChecked(false);
                    f04a004j.setChecked(false);
                    f04a004k.setChecked(false);
                    f04a004l.setChecked(false);
                    f04a004m.setChecked(false);
                    f04a004n.setChecked(false);
                    f04a004o.setChecked(false);
                    f04a004777.setChecked(false);
                    f04a004888.setChecked(false);
                    f04a004999.setChecked(false);
                    f04a004888x.setText(null);
                    f04a005a.setChecked(false);
                    f04a005b.setChecked(false);
                    f04a005c.setChecked(false);
                    f04a005d.setChecked(false);
                    f04a005e.setChecked(false);
                    f04a005f.setChecked(false);
                    f04a005g.setChecked(false);
                    f04a005h.setChecked(false);
                    f04a005i.setChecked(false);
                    f04a005j.setChecked(false);
                    f04a005k.setChecked(false);
                    f04a005l.setChecked(false);
                    f04a005m.setChecked(false);
                    f04a005n.setChecked(false);
                    f04a005o.setChecked(false);
                    f04a005777.setChecked(false);
                    f04a005888.setChecked(false);
                    f04a005999.setChecked(false);
                    f04a005888x.setText(null);
                    f04a006a.setChecked(false);
                    f04a006b.setChecked(false);
                    f04a006c.setChecked(false);
                    f04a006d.setChecked(false);
                    f04a006e.setChecked(false);
                    f04a006f.setChecked(false);
                    f04a006g.setChecked(false);
                    f04a006777.setChecked(false);
                    f04a006888.setChecked(false);
                    f04a006999.setChecked(false);
                    f04a006888x.setText(null);
                    f04a007a.setChecked(false);
                    f04a007b.setChecked(false);
                    f04a007c.setChecked(false);
                    f04a007d.setChecked(false);
                    f04a007e.setChecked(false);
                    f04a007f.setChecked(false);
                    f04a007777.setChecked(false);
                    f04a007888.setChecked(false);
                    f04a007999.setChecked(false);
                    f04a007888x.setText(null);
                    f04a008a.setChecked(false);
                    f04a008b.setChecked(false);
                    f04a008c.setChecked(false);
                    f04a008d.setChecked(false);
                    f04a008e.setChecked(false);
                    f04a008f.setChecked(false);
                    f04a008g.setChecked(false);
                    f04a008h.setChecked(false);
                    f04a008i.setChecked(false);
                    f04a008777.setChecked(false);
                    f04a008888.setChecked(false);
                    f04a008999.setChecked(false);
                    f04a008888x.setText(null);
                    f04a009.clearCheck();
                    f04a009888x.setText(null);
                    f04a010a.setChecked(false);
                    f04a010b.setChecked(false);
                    f04a010c.setChecked(false);
                    f04a010d.setChecked(false);
                    f04a010e.setChecked(false);
                    f04a010777.setChecked(false);
                    f04a010888.setChecked(false);
                    f04a010999.setChecked(false);
                    f04a010888x.setText(null);
                    f04a011.clearCheck();
                    f04a011888x.setText(null);
                    f04a012a.setChecked(false);
                    f04a012b.setChecked(false);
                    f04a012c.setChecked(false);
                    f04a012d.setChecked(false);
                    f04a012e.setChecked(false);
                    f04a012f.setChecked(false);
                    f04a012g.setChecked(false);
                    f04a012h.setChecked(false);
                    f04a012i.setChecked(false);
                    f04a012j.setChecked(false);
                    f04a012k.setChecked(false);
                    f04a012l.setChecked(false);
                    f04a012m.setChecked(false);
                    f04a012n.setChecked(false);
                    f04a012o.setChecked(false);
                    f04a012p.setChecked(false);
                    f04a012q.setChecked(false);
                    f04a012r.setChecked(false);
                    f04a012777.setChecked(false);
                    f04a012888.setChecked(false);
                    f04a012999.setChecked(false);
                    f04a012888x.setText(null);

                }
            }
        });

        //=================== f04a002888 ==============
        f04a002888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a002888x.setVisibility(View.VISIBLE);
                } else {
                    f04a002888x.setVisibility(View.GONE);
                    f04a002888x.setText(null);
                }
            }
        });

        //=================== f04a003888 ==============
        f04a003888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a003888x.setVisibility(View.VISIBLE);
                } else {
                    f04a003888x.setVisibility(View.GONE);
                    f04a003888x.setText(null);
                }
            }
        });

        //=================== f04a004888 ==============
        f04a004888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a004888x.setVisibility(View.VISIBLE);
                } else {
                    f04a004888x.setVisibility(View.GONE);
                    f04a004888x.setText(null);
                }
            }
        });

        //=================== f04a005888 ==============
        f04a005888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a005888x.setVisibility(View.VISIBLE);
                } else {
                    f04a005888x.setVisibility(View.GONE);
                    f04a005888x.setText(null);
                }
            }
        });

        //=================== f04a006888 ==============
        f04a006888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a006888x.setVisibility(View.VISIBLE);
                } else {
                    f04a006888x.setVisibility(View.GONE);
                    f04a006888x.setText(null);
                }
            }
        });

        //=================== f04a007888 ==============
        f04a007888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a007888x.setVisibility(View.VISIBLE);
                } else {
                    f04a007888x.setVisibility(View.GONE);
                    f04a007888x.setText(null);
                }
            }
        });

        //=================== f04a008888 ==============
        f04a008888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a008888x.setVisibility(View.VISIBLE);
                } else {
                    f04a008888x.setVisibility(View.GONE);
                    f04a008888x.setText(null);
                }
            }
        });

        //=================== f04a009888 ==============
        f04a009888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a009888x.setVisibility(View.VISIBLE);
                } else {
                    f04a009888x.setVisibility(View.GONE);
                    f04a009888x.setText(null);
                }
            }
        });

        //=================== f04a010888 ==============
        f04a010888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a010888x.setVisibility(View.VISIBLE);
                } else {
                    f04a010888x.setVisibility(View.GONE);
                    f04a010888x.setText(null);
                }
            }
        });

        //=================== f04a011888 ==============
        f04a011888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a011888x.setVisibility(View.VISIBLE);
                } else {
                    f04a011888x.setVisibility(View.GONE);
                    f04a011888x.setText(null);
                }
            }
        });

        //=================== f04a012888 ==============
        f04a012888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a012888x.setVisibility(View.VISIBLE);
                } else {
                    f04a012888x.setVisibility(View.GONE);
                    f04a012888x.setText(null);
                }
            }
        });

        //=================== f04a013888 ==============
        f04a013888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a013888x.setVisibility(View.VISIBLE);
                } else {
                    f04a013888x.setVisibility(View.GONE);
                    f04a013888x.setText(null);
                }
            }
        });

        //=================== f04a015888 ==============
        f04a015888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a015888x.setVisibility(View.VISIBLE);
                } else {
                    f04a015888x.setVisibility(View.GONE);
                    f04a015888x.setText(null);
                }
            }
        });

        //=================== f04a017888 ==============
        f04a017888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a017888x.setVisibility(View.VISIBLE);
                } else {
                    f04a017888x.setVisibility(View.GONE);
                    f04a017888x.setText(null);
                }
            }
        });

        //=================== f04a019888 ==============
        f04a019888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a019888x.setVisibility(View.VISIBLE);
                } else {
                    f04a019888x.setVisibility(View.GONE);
                    f04a019888x.setText(null);
                }
            }
        });

        //=================== f04a019ix ==============
        f04a019i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    f04a019ix.setVisibility(View.VISIBLE);
                } else {
                    f04a019ix.setVisibility(View.GONE);
                    f04a019ix.setText(null);
                }
            }
        });


        //=================== f04a012m ==============
        f04a012m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp012.setVisibility(View.VISIBLE);

                } else {
                    fldGrp012.setVisibility(View.GONE);
                    f04a013.clearCheck();
                    f04a013888x.setText(null);

                }
            }
        });

        //=================== f04a012n ==============
        f04a012n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrp012.setVisibility(View.VISIBLE);

                } else {
                    fldGrp012.setVisibility(View.GONE);
                    f04a013.clearCheck();
                    f04a013888x.setText(null);

                }
            }
        });

        //=================== f04a014 ==============
        f04a014.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (f04a014a.isChecked()) {
                    fldGrp014.setVisibility(View.VISIBLE);
                } else {
                    fldGrp014.setVisibility(View.GONE);
                    f04a015a.setChecked(false);
                    f04a015b.setChecked(false);
                    f04a015c.setChecked(false);
                    f04a015d.setChecked(false);
                    f04a015e.setChecked(false);
                    f04a015f.setChecked(false);
                    f04a015g.setChecked(false);
                    f04a015777.setChecked(false);
                    f04a015888.setChecked(false);
                    f04a015999.setChecked(false);
                    f04a015888x.setText(null);

                }
            }
        });

        //=================== f04a016 ==============
        f04a016.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (f04a016a.isChecked()) {
                    fldGrp016.setVisibility(View.VISIBLE);
                } else {
                    fldGrp016.setVisibility(View.GONE);
                    f04a017a.setChecked(false);
                    f04a017b.setChecked(false);
                    f04a017c.setChecked(false);
                    f04a017d.setChecked(false);
                    f04a017e.setChecked(false);
                    f04a017f.setChecked(false);
                    f04a017g.setChecked(false);
                    f04a017h.setChecked(false);
                    f04a017i.setChecked(false);
                    f04a017j.setChecked(false);
                    f04a017k.setChecked(false);
                    f04a017l.setChecked(false);
                    f04a017m.setChecked(false);
                    f04a017n.setChecked(false);
                    f04a017o.setChecked(false);
                    f04a017p.setChecked(false);
                    f04a017q.setChecked(false);
                    f04a017777.setChecked(false);
                    f04a017888.setChecked(false);
                    f04a017888x.setText(null);

                }
            }
        });

        //=================== f04a018 ==============
        f04a018.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (f04a018a.isChecked()) {
                    fldGrp018.setVisibility(View.VISIBLE);
                } else {
                    fldGrp018.setVisibility(View.GONE);
                    f04a019a.setChecked(false);
                    f04a019b.setChecked(false);
                    f04a019c.setChecked(false);
                    f04a019d.setChecked(false);
                    f04a019e.setChecked(false);
                    f04a019f.setChecked(false);
                    f04a019g.setChecked(false);
                    f04a019h.setChecked(false);
                    f04a019i.setChecked(false);
                    f04a019j.setChecked(false);
                    f04a019777.setChecked(false);
                    f04a019888.setChecked(false);
                    f04a019888x.setText(null);
                    f04a019ix.setText(null);

                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

//        if (ValidateForm()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
       /* Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);*/
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }
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


                // startActivity(new Intent(this, SectionEActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
       /* DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addForm(MainApp.fc);

        MainApp.fc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fc.set_UID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.get_ID()));
            db.updateFormsUID();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        }*/

        return true;

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject sa = new JSONObject();

        sa.put("f04a001", f04a001a.isChecked() ? "1" : f04a001b.isChecked() ? "2" : "0");
        sa.put("f04a002a", f04a002a.isChecked() ? "1" : "0");
        sa.put("f04a002b", f04a002b.isChecked() ? "2" : "0");
        sa.put("f04a002c", f04a002c.isChecked() ? "3" : "0");
        sa.put("f04a002d", f04a002d.isChecked() ? "4" : "0");
        sa.put("f04a002e", f04a002e.isChecked() ? "5" : "0");
        sa.put("f04a002f", f04a002f.isChecked() ? "6" : "0");
        sa.put("f04a002g", f04a002g.isChecked() ? "7" : "0");
        sa.put("f04a002h", f04a002h.isChecked() ? "8" : "0");
        sa.put("f04a002i", f04a002i.isChecked() ? "9" : "0");
        sa.put("f04a002j", f04a002j.isChecked() ? "10" : "0");
        sa.put("f04a002k", f04a002k.isChecked() ? "11" : "0");
        sa.put("f04a002l", f04a002l.isChecked() ? "12" : "0");
        sa.put("f04a002m", f04a002m.isChecked() ? "13" : "0");
        sa.put("f04a002n", f04a002n.isChecked() ? "14" : "0");
        sa.put("f04a002777", f04a002777.isChecked() ? "777" : "0");
        sa.put("f04a002888", f04a002888.isChecked() ? "888" : "0");
        sa.put("f04a002999", f04a002999.isChecked() ? "999" : "0");
        sa.put("f04a002888x", f04a002888x.getText().toString());

        //  MainApp.fc.setsA(String.valueOf(sa));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        return true;

    }

}

