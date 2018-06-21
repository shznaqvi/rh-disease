package edu.aku.hassannaqvi.rhdisease.activities.Form4;

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
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.Form3.F03BActivity;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class F04AActivity extends Activity implements CompoundButton.OnCheckedChangeListener {

    private static final String TAG = F04AActivity.class.getSimpleName();

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
    @BindView(R.id.f04a018777)
    RadioButton f04a018777;
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

    @BindViews({R.id.f04a012m, R.id.f04a012n})
    List<CheckBox> f04a12Skip;

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

        for (CheckBox ck : f04a12Skip) {
            ck.setOnCheckedChangeListener(this);
        }

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

                } else if (f04a012m.isChecked()) {
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

        f04a002999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a002a.setEnabled(false);
                    f04a002b.setEnabled(false);
                    f04a002c.setEnabled(false);
                    f04a002d.setEnabled(false);
                    f04a002e.setEnabled(false);
                    f04a002f.setEnabled(false);
                    f04a002g.setEnabled(false);
                    f04a002h.setEnabled(false);
                    f04a002i.setEnabled(false);
                    f04a002j.setEnabled(false);
                    f04a002k.setEnabled(false);
                    f04a002l.setEnabled(false);
                    f04a002m.setEnabled(false);
                    f04a002n.setEnabled(false);
                    f04a002777.setEnabled(false);
                    f04a002888.setEnabled(false);
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
                    f04a002888x.setText(null);

                } else {
                    f04a002a.setEnabled(true);
                    f04a002b.setEnabled(true);
                    f04a002c.setEnabled(true);
                    f04a002d.setEnabled(true);
                    f04a002e.setEnabled(true);
                    f04a002f.setEnabled(true);
                    f04a002g.setEnabled(true);
                    f04a002h.setEnabled(true);
                    f04a002i.setEnabled(true);
                    f04a002j.setEnabled(true);
                    f04a002k.setEnabled(true);
                    f04a002l.setEnabled(true);
                    f04a002m.setEnabled(true);
                    f04a002n.setEnabled(true);
                    f04a002777.setEnabled(true);
                    f04a002888.setEnabled(true);
                }
            }
        });

        f04a002777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a002a.setEnabled(false);
                    f04a002b.setEnabled(false);
                    f04a002c.setEnabled(false);
                    f04a002d.setEnabled(false);
                    f04a002e.setEnabled(false);
                    f04a002f.setEnabled(false);
                    f04a002g.setEnabled(false);
                    f04a002h.setEnabled(false);
                    f04a002i.setEnabled(false);
                    f04a002j.setEnabled(false);
                    f04a002k.setEnabled(false);
                    f04a002l.setEnabled(false);
                    f04a002m.setEnabled(false);
                    f04a002n.setEnabled(false);
                    f04a002999.setEnabled(false);
                    f04a002888.setEnabled(false);
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
                    f04a002999.setChecked(false);
                    f04a002888.setChecked(false);
                    f04a002888x.setText(null);

                } else {
                    f04a002a.setEnabled(true);
                    f04a002b.setEnabled(true);
                    f04a002c.setEnabled(true);
                    f04a002d.setEnabled(true);
                    f04a002e.setEnabled(true);
                    f04a002f.setEnabled(true);
                    f04a002g.setEnabled(true);
                    f04a002h.setEnabled(true);
                    f04a002i.setEnabled(true);
                    f04a002j.setEnabled(true);
                    f04a002k.setEnabled(true);
                    f04a002l.setEnabled(true);
                    f04a002m.setEnabled(true);
                    f04a002n.setEnabled(true);
                    f04a002999.setEnabled(true);
                    f04a002888.setEnabled(true);
                }
            }
        });


        f04a003999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a003a.setEnabled(false);
                    f04a003b.setEnabled(false);
                    f04a003c.setEnabled(false);
                    f04a003d.setEnabled(false);
                    f04a003e.setEnabled(false);
                    f04a003f.setEnabled(false);
                    f04a003g.setEnabled(false);
                    f04a003h.setEnabled(false);
                    f04a003i.setEnabled(false);
                    f04a003j.setEnabled(false);
                    f04a003k.setEnabled(false);
                    f04a003l.setEnabled(false);
                    f04a003m.setEnabled(false);
                    f04a003n.setEnabled(false);
                    f04a003o.setEnabled(false);
                    f04a003p.setEnabled(false);
                    f04a003q.setEnabled(false);
                    f04a003777.setEnabled(false);
                    f04a003888.setEnabled(false);
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
                    f04a003888x.setText(null);

                } else {
                    f04a003a.setEnabled(true);
                    f04a003b.setEnabled(true);
                    f04a003c.setEnabled(true);
                    f04a003d.setEnabled(true);
                    f04a003e.setEnabled(true);
                    f04a003f.setEnabled(true);
                    f04a003g.setEnabled(true);
                    f04a003h.setEnabled(true);
                    f04a003i.setEnabled(true);
                    f04a003j.setEnabled(true);
                    f04a003k.setEnabled(true);
                    f04a003l.setEnabled(true);
                    f04a003m.setEnabled(true);
                    f04a003n.setEnabled(true);
                    f04a003o.setEnabled(true);
                    f04a003p.setEnabled(true);
                    f04a003q.setEnabled(true);
                    f04a003777.setEnabled(true);
                    f04a003888.setEnabled(true);

                }
            }
        });


        f04a003777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a003a.setEnabled(false);
                    f04a003b.setEnabled(false);
                    f04a003c.setEnabled(false);
                    f04a003d.setEnabled(false);
                    f04a003e.setEnabled(false);
                    f04a003f.setEnabled(false);
                    f04a003g.setEnabled(false);
                    f04a003h.setEnabled(false);
                    f04a003i.setEnabled(false);
                    f04a003j.setEnabled(false);
                    f04a003k.setEnabled(false);
                    f04a003l.setEnabled(false);
                    f04a003m.setEnabled(false);
                    f04a003n.setEnabled(false);
                    f04a003o.setEnabled(false);
                    f04a003p.setEnabled(false);
                    f04a003q.setEnabled(false);
                    f04a003888.setEnabled(false);
                    f04a003999.setEnabled(false);
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
                    f04a003888.setChecked(false);
                    f04a003888x.setText(null);
                    f04a003999.setChecked(false);
                } else {
                    f04a003a.setEnabled(true);
                    f04a003b.setEnabled(true);
                    f04a003c.setEnabled(true);
                    f04a003d.setEnabled(true);
                    f04a003e.setEnabled(true);
                    f04a003f.setEnabled(true);
                    f04a003g.setEnabled(true);
                    f04a003h.setEnabled(true);
                    f04a003i.setEnabled(true);
                    f04a003j.setEnabled(true);
                    f04a003k.setEnabled(true);
                    f04a003l.setEnabled(true);
                    f04a003m.setEnabled(true);
                    f04a003n.setEnabled(true);
                    f04a003o.setEnabled(true);
                    f04a003p.setEnabled(true);
                    f04a003q.setEnabled(true);
                    f04a003888.setEnabled(true);
                    f04a003999.setEnabled(true);
                }
            }
        });

        f04a004999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a004a.setEnabled(false);
                    f04a004b.setEnabled(false);
                    f04a004c.setEnabled(false);
                    f04a004d.setEnabled(false);
                    f04a004e.setEnabled(false);
                    f04a004f.setEnabled(false);
                    f04a004g.setEnabled(false);
                    f04a004h.setEnabled(false);
                    f04a004i.setEnabled(false);
                    f04a004j.setEnabled(false);
                    f04a004k.setEnabled(false);
                    f04a004l.setEnabled(false);
                    f04a004m.setEnabled(false);
                    f04a004n.setEnabled(false);
                    f04a004o.setEnabled(false);
                    f04a004777.setEnabled(false);
                    f04a004888.setEnabled(false);
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
                    f04a004888x.setText(null);

                } else {
                    f04a004a.setEnabled(true);
                    f04a004b.setEnabled(true);
                    f04a004c.setEnabled(true);
                    f04a004d.setEnabled(true);
                    f04a004e.setEnabled(true);
                    f04a004f.setEnabled(true);
                    f04a004g.setEnabled(true);
                    f04a004h.setEnabled(true);
                    f04a004i.setEnabled(true);
                    f04a004j.setEnabled(true);
                    f04a004k.setEnabled(true);
                    f04a004l.setEnabled(true);
                    f04a004m.setEnabled(true);
                    f04a004n.setEnabled(true);
                    f04a004o.setEnabled(true);
                    f04a004777.setEnabled(true);
                    f04a004888.setEnabled(true);

                }
            }
        });


        f04a004777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a004a.setEnabled(false);
                    f04a004b.setEnabled(false);
                    f04a004c.setEnabled(false);
                    f04a004d.setEnabled(false);
                    f04a004e.setEnabled(false);
                    f04a004f.setEnabled(false);
                    f04a004g.setEnabled(false);
                    f04a004h.setEnabled(false);
                    f04a004i.setEnabled(false);
                    f04a004j.setEnabled(false);
                    f04a004k.setEnabled(false);
                    f04a004l.setEnabled(false);
                    f04a004m.setEnabled(false);
                    f04a004n.setEnabled(false);
                    f04a004o.setEnabled(false);
                    f04a004888.setEnabled(false);
                    f04a004999.setEnabled(false);
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
                    f04a004888.setChecked(false);
                    f04a004888x.setText(null);
                    f04a004999.setChecked(false);
                } else {
                    f04a004a.setEnabled(true);
                    f04a004b.setEnabled(true);
                    f04a004c.setEnabled(true);
                    f04a004d.setEnabled(true);
                    f04a004e.setEnabled(true);
                    f04a004f.setEnabled(true);
                    f04a004g.setEnabled(true);
                    f04a004h.setEnabled(true);
                    f04a004i.setEnabled(true);
                    f04a004j.setEnabled(true);
                    f04a004k.setEnabled(true);
                    f04a004l.setEnabled(true);
                    f04a004m.setEnabled(true);
                    f04a004n.setEnabled(true);
                    f04a004o.setEnabled(true);
                    f04a004888.setEnabled(true);
                    f04a004999.setEnabled(true);
                }
            }
        });


        f04a005999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a005a.setEnabled(false);
                    f04a005b.setEnabled(false);
                    f04a005c.setEnabled(false);
                    f04a005d.setEnabled(false);
                    f04a005e.setEnabled(false);
                    f04a005f.setEnabled(false);
                    f04a005g.setEnabled(false);
                    f04a005h.setEnabled(false);
                    f04a005i.setEnabled(false);
                    f04a005j.setEnabled(false);
                    f04a005k.setEnabled(false);
                    f04a005l.setEnabled(false);
                    f04a005m.setEnabled(false);
                    f04a005n.setEnabled(false);
                    f04a005o.setEnabled(false);
                    f04a005777.setEnabled(false);
                    f04a005888.setEnabled(false);
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
                    f04a005888x.setText(null);

                } else {
                    f04a005a.setEnabled(true);
                    f04a005b.setEnabled(true);
                    f04a005c.setEnabled(true);
                    f04a005d.setEnabled(true);
                    f04a005e.setEnabled(true);
                    f04a005f.setEnabled(true);
                    f04a005g.setEnabled(true);
                    f04a005h.setEnabled(true);
                    f04a005i.setEnabled(true);
                    f04a005j.setEnabled(true);
                    f04a005k.setEnabled(true);
                    f04a005l.setEnabled(true);
                    f04a005m.setEnabled(true);
                    f04a005n.setEnabled(true);
                    f04a005o.setEnabled(true);
                    f04a005777.setEnabled(true);
                    f04a005888.setEnabled(true);

                }
            }
        });


        f04a005777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a005a.setEnabled(false);
                    f04a005b.setEnabled(false);
                    f04a005c.setEnabled(false);
                    f04a005d.setEnabled(false);
                    f04a005e.setEnabled(false);
                    f04a005f.setEnabled(false);
                    f04a005g.setEnabled(false);
                    f04a005h.setEnabled(false);
                    f04a005i.setEnabled(false);
                    f04a005j.setEnabled(false);
                    f04a005k.setEnabled(false);
                    f04a005l.setEnabled(false);
                    f04a005m.setEnabled(false);
                    f04a005n.setEnabled(false);
                    f04a005o.setEnabled(false);
                    f04a005888.setEnabled(false);
                    f04a005999.setEnabled(false);
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
                    f04a005888.setChecked(false);
                    f04a005888x.setText(null);
                    f04a005999.setChecked(false);
                } else {
                    f04a005a.setEnabled(true);
                    f04a005b.setEnabled(true);
                    f04a005c.setEnabled(true);
                    f04a005d.setEnabled(true);
                    f04a005e.setEnabled(true);
                    f04a005f.setEnabled(true);
                    f04a005g.setEnabled(true);
                    f04a005h.setEnabled(true);
                    f04a005i.setEnabled(true);
                    f04a005j.setEnabled(true);
                    f04a005k.setEnabled(true);
                    f04a005l.setEnabled(true);
                    f04a005m.setEnabled(true);
                    f04a005n.setEnabled(true);
                    f04a005o.setEnabled(true);
                    f04a005888.setEnabled(true);
                    f04a005999.setEnabled(true);
                }
            }
        });

        f04a007999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a007a.setEnabled(false);
                    f04a007b.setEnabled(false);
                    f04a007c.setEnabled(false);
                    f04a007d.setEnabled(false);
                    f04a007e.setEnabled(false);
                    f04a007f.setEnabled(false);
                    f04a007777.setEnabled(false);
                    f04a007888.setEnabled(false);
                    f04a007a.setChecked(false);
                    f04a007b.setChecked(false);
                    f04a007c.setChecked(false);
                    f04a007d.setChecked(false);
                    f04a007e.setChecked(false);
                    f04a007f.setChecked(false);
                    f04a007777.setChecked(false);
                    f04a007888.setChecked(false);
                    f04a007888x.setText(null);

                } else {
                    f04a007a.setEnabled(true);
                    f04a007b.setEnabled(true);
                    f04a007c.setEnabled(true);
                    f04a007d.setEnabled(true);
                    f04a007e.setEnabled(true);
                    f04a007f.setEnabled(true);
                    f04a007777.setEnabled(true);
                    f04a007888.setEnabled(true);

                }
            }
        });


        f04a007777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a007a.setEnabled(false);
                    f04a007b.setEnabled(false);
                    f04a007c.setEnabled(false);
                    f04a007d.setEnabled(false);
                    f04a007e.setEnabled(false);
                    f04a007f.setEnabled(false);
                    f04a007888.setEnabled(false);
                    f04a007999.setEnabled(false);
                    f04a007a.setChecked(false);
                    f04a007b.setChecked(false);
                    f04a007c.setChecked(false);
                    f04a007d.setChecked(false);
                    f04a007e.setChecked(false);
                    f04a007f.setChecked(false);
                    f04a007888.setChecked(false);
                    f04a007888x.setText(null);
                    f04a007999.setChecked(false);
                } else {
                    f04a007a.setEnabled(true);
                    f04a007b.setEnabled(true);
                    f04a007c.setEnabled(true);
                    f04a007d.setEnabled(true);
                    f04a007e.setEnabled(true);
                    f04a007f.setEnabled(true);
                    f04a007888.setEnabled(true);
                    f04a007999.setEnabled(true);
                }
            }
        });

        f04a008999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a008a.setEnabled(false);
                    f04a008b.setEnabled(false);
                    f04a008c.setEnabled(false);
                    f04a008d.setEnabled(false);
                    f04a008e.setEnabled(false);
                    f04a008f.setEnabled(false);
                    f04a008g.setEnabled(false);
                    f04a008h.setEnabled(false);
                    f04a008i.setEnabled(false);
                    f04a008777.setEnabled(false);
                    f04a008888.setEnabled(false);
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
                    f04a008888x.setText(null);

                } else {
                    f04a008a.setEnabled(true);
                    f04a008b.setEnabled(true);
                    f04a008c.setEnabled(true);
                    f04a008d.setEnabled(true);
                    f04a008e.setEnabled(true);
                    f04a008f.setEnabled(true);
                    f04a008g.setEnabled(true);
                    f04a008h.setEnabled(true);
                    f04a008i.setEnabled(true);
                    f04a008777.setEnabled(true);
                    f04a008888.setEnabled(true);

                }
            }
        });


        f04a008777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a008a.setEnabled(false);
                    f04a008b.setEnabled(false);
                    f04a008c.setEnabled(false);
                    f04a008d.setEnabled(false);
                    f04a008e.setEnabled(false);
                    f04a008f.setEnabled(false);
                    f04a008g.setEnabled(false);
                    f04a008h.setEnabled(false);
                    f04a008i.setEnabled(false);
                    f04a008888.setEnabled(false);
                    f04a008999.setEnabled(false);
                    f04a008a.setChecked(false);
                    f04a008b.setChecked(false);
                    f04a008c.setChecked(false);
                    f04a008d.setChecked(false);
                    f04a008e.setChecked(false);
                    f04a008f.setChecked(false);
                    f04a008g.setChecked(false);
                    f04a008h.setChecked(false);
                    f04a008i.setChecked(false);
                    f04a008888.setChecked(false);
                    f04a008888x.setText(null);
                    f04a008999.setChecked(false);
                } else {
                    f04a008a.setEnabled(true);
                    f04a008b.setEnabled(true);
                    f04a008c.setEnabled(true);
                    f04a008d.setEnabled(true);
                    f04a008e.setEnabled(true);
                    f04a008f.setEnabled(true);
                    f04a008g.setEnabled(true);
                    f04a008h.setEnabled(true);
                    f04a008i.setEnabled(true);
                    f04a008888.setEnabled(true);
                    f04a008999.setEnabled(true);
                }
            }
        });

        f04a010999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a010a.setEnabled(false);
                    f04a010b.setEnabled(false);
                    f04a010c.setEnabled(false);
                    f04a010d.setEnabled(false);
                    f04a010e.setEnabled(false);
                    f04a010777.setEnabled(false);
                    f04a010888.setEnabled(false);
                    f04a010a.setChecked(false);
                    f04a010b.setChecked(false);
                    f04a010c.setChecked(false);
                    f04a010d.setChecked(false);
                    f04a010e.setChecked(false);
                    f04a010777.setChecked(false);
                    f04a010888.setChecked(false);
                    f04a010888x.setText(null);

                } else {
                    f04a010a.setEnabled(true);
                    f04a010b.setEnabled(true);
                    f04a010c.setEnabled(true);
                    f04a010d.setEnabled(true);
                    f04a010e.setEnabled(true);
                    f04a010777.setEnabled(true);
                    f04a010888.setEnabled(true);

                }
            }
        });


        f04a010777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a010a.setEnabled(false);
                    f04a010b.setEnabled(false);
                    f04a010c.setEnabled(false);
                    f04a010d.setEnabled(false);
                    f04a010e.setEnabled(false);
                    f04a010888.setEnabled(false);
                    f04a010999.setEnabled(false);
                    f04a010a.setChecked(false);
                    f04a010b.setChecked(false);
                    f04a010c.setChecked(false);
                    f04a010d.setChecked(false);
                    f04a010e.setChecked(false);
                    f04a010888.setChecked(false);
                    f04a010888x.setText(null);
                    f04a010999.setChecked(false);
                } else {
                    f04a010a.setEnabled(true);
                    f04a010b.setEnabled(true);
                    f04a010c.setEnabled(true);
                    f04a010d.setEnabled(true);
                    f04a010e.setEnabled(true);
                    f04a010888.setEnabled(true);
                    f04a010999.setEnabled(true);
                }
            }
        });

        f04a012q.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a012a.setEnabled(false);
                    f04a012b.setEnabled(false);
                    f04a012c.setEnabled(false);
                    f04a012d.setEnabled(false);
                    f04a012e.setEnabled(false);
                    f04a012f.setEnabled(false);
                    f04a012g.setEnabled(false);
                    f04a012h.setEnabled(false);
                    f04a012i.setEnabled(false);
                    f04a012j.setEnabled(false);
                    f04a012k.setEnabled(false);
                    f04a012l.setEnabled(false);
                    f04a012m.setEnabled(false);
                    f04a012n.setEnabled(false);
                    f04a012o.setEnabled(false);
                    f04a012p.setEnabled(false);
                    f04a012r.setEnabled(false);
                    f04a012777.setEnabled(false);
                    f04a012888.setEnabled(false);
                    f04a012999.setEnabled(false);
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
                    f04a012r.setChecked(false);
                    f04a012777.setChecked(false);
                    f04a012888.setChecked(false);
                    f04a012999.setChecked(false);
                    f04a012888x.setText(null);

                } else {
                    f04a012a.setEnabled(true);
                    f04a012b.setEnabled(true);
                    f04a012c.setEnabled(true);
                    f04a012d.setEnabled(true);
                    f04a012e.setEnabled(true);
                    f04a012f.setEnabled(true);
                    f04a012g.setEnabled(true);
                    f04a012h.setEnabled(true);
                    f04a012i.setEnabled(true);
                    f04a012j.setEnabled(true);
                    f04a012k.setEnabled(true);
                    f04a012l.setEnabled(true);
                    f04a012m.setEnabled(true);
                    f04a012n.setEnabled(true);
                    f04a012o.setEnabled(true);
                    f04a012p.setEnabled(true);
                    f04a012r.setEnabled(true);
                    f04a012777.setEnabled(true);
                    f04a012888.setEnabled(true);
                    f04a012999.setEnabled(true);
                }
            }
        });
        f04a012999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a012a.setEnabled(false);
                    f04a012b.setEnabled(false);
                    f04a012c.setEnabled(false);
                    f04a012d.setEnabled(false);
                    f04a012e.setEnabled(false);
                    f04a012f.setEnabled(false);
                    f04a012g.setEnabled(false);
                    f04a012h.setEnabled(false);
                    f04a012i.setEnabled(false);
                    f04a012j.setEnabled(false);
                    f04a012k.setEnabled(false);
                    f04a012l.setEnabled(false);
                    f04a012m.setEnabled(false);
                    f04a012n.setEnabled(false);
                    f04a012o.setEnabled(false);
                    f04a012p.setEnabled(false);
                    f04a012q.setEnabled(false);
                    f04a012r.setEnabled(false);
                    f04a012777.setEnabled(false);
                    f04a012888.setEnabled(false);
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
                    f04a012888x.setText(null);

                } else {
                    f04a012a.setEnabled(true);
                    f04a012b.setEnabled(true);
                    f04a012c.setEnabled(true);
                    f04a012d.setEnabled(true);
                    f04a012e.setEnabled(true);
                    f04a012f.setEnabled(true);
                    f04a012g.setEnabled(true);
                    f04a012h.setEnabled(true);
                    f04a012i.setEnabled(true);
                    f04a012j.setEnabled(true);
                    f04a012k.setEnabled(true);
                    f04a012l.setEnabled(true);
                    f04a012m.setEnabled(true);
                    f04a012n.setEnabled(true);
                    f04a012o.setEnabled(true);
                    f04a012p.setEnabled(true);
                    f04a012q.setEnabled(true);
                    f04a012r.setEnabled(true);
                    f04a012777.setEnabled(true);
                    f04a012888.setEnabled(true);

                }
            }
        });


        f04a012777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a012a.setEnabled(false);
                    f04a012b.setEnabled(false);
                    f04a012c.setEnabled(false);
                    f04a012d.setEnabled(false);
                    f04a012e.setEnabled(false);
                    f04a012f.setEnabled(false);
                    f04a012g.setEnabled(false);
                    f04a012h.setEnabled(false);
                    f04a012i.setEnabled(false);
                    f04a012j.setEnabled(false);
                    f04a012k.setEnabled(false);
                    f04a012l.setEnabled(false);
                    f04a012m.setEnabled(false);
                    f04a012n.setEnabled(false);
                    f04a012o.setEnabled(false);
                    f04a012p.setEnabled(false);
                    f04a012q.setEnabled(false);
                    f04a012r.setEnabled(false);
                    f04a012888.setEnabled(false);
                    f04a012999.setEnabled(false);
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
                    f04a012888.setChecked(false);
                    f04a012888x.setText(null);
                    f04a012999.setChecked(false);
                } else {
                    f04a012a.setEnabled(true);
                    f04a012b.setEnabled(true);
                    f04a012c.setEnabled(true);
                    f04a012d.setEnabled(true);
                    f04a012e.setEnabled(true);
                    f04a012f.setEnabled(true);
                    f04a012g.setEnabled(true);
                    f04a012h.setEnabled(true);
                    f04a012i.setEnabled(true);
                    f04a012j.setEnabled(true);
                    f04a012k.setEnabled(true);
                    f04a012l.setEnabled(true);
                    f04a012m.setEnabled(true);
                    f04a012n.setEnabled(true);
                    f04a012o.setEnabled(true);
                    f04a012p.setEnabled(true);
                    f04a012q.setEnabled(true);
                    f04a012r.setEnabled(true);
                    f04a012888.setEnabled(true);
                    f04a012999.setEnabled(true);
                }
            }
        });


        f04a015999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a015a.setEnabled(false);
                    f04a015b.setEnabled(false);
                    f04a015c.setEnabled(false);
                    f04a015d.setEnabled(false);
                    f04a015e.setEnabled(false);
                    f04a015f.setEnabled(false);
                    f04a015g.setEnabled(false);
                    f04a015777.setEnabled(false);
                    f04a015888.setEnabled(false);
                    f04a015a.setChecked(false);
                    f04a015b.setChecked(false);
                    f04a015c.setChecked(false);
                    f04a015d.setChecked(false);
                    f04a015e.setChecked(false);
                    f04a015f.setChecked(false);
                    f04a015g.setChecked(false);
                    f04a015777.setChecked(false);
                    f04a015888.setChecked(false);
                    f04a015888x.setText(null);

                } else {
                    f04a015a.setEnabled(true);
                    f04a015b.setEnabled(true);
                    f04a015c.setEnabled(true);
                    f04a015d.setEnabled(true);
                    f04a015e.setEnabled(true);
                    f04a015f.setEnabled(true);
                    f04a015g.setEnabled(true);
                    f04a015777.setEnabled(true);
                    f04a015888.setEnabled(true);

                }
            }
        });


        f04a015777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a015a.setEnabled(false);
                    f04a015b.setEnabled(false);
                    f04a015c.setEnabled(false);
                    f04a015d.setEnabled(false);
                    f04a015e.setEnabled(false);
                    f04a015f.setEnabled(false);
                    f04a015g.setEnabled(false);
                    f04a015888.setEnabled(false);
                    f04a015999.setEnabled(false);
                    f04a015a.setChecked(false);
                    f04a015b.setChecked(false);
                    f04a015c.setChecked(false);
                    f04a015d.setChecked(false);
                    f04a015e.setChecked(false);
                    f04a015f.setChecked(false);
                    f04a015g.setChecked(false);
                    f04a015888.setChecked(false);
                    f04a015888x.setText(null);
                    f04a015999.setChecked(false);
                } else {
                    f04a015a.setEnabled(true);
                    f04a015b.setEnabled(true);
                    f04a015c.setEnabled(true);
                    f04a015d.setEnabled(true);
                    f04a015e.setEnabled(true);
                    f04a015f.setEnabled(true);
                    f04a015g.setEnabled(true);
                    f04a015888.setEnabled(true);
                    f04a015999.setEnabled(true);
                }
            }
        });

        f04a017777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    f04a017a.setEnabled(false);
                    f04a017b.setEnabled(false);
                    f04a017c.setEnabled(false);
                    f04a017d.setEnabled(false);
                    f04a017e.setEnabled(false);
                    f04a017f.setEnabled(false);
                    f04a017g.setEnabled(false);
                    f04a017h.setEnabled(false);
                    f04a017i.setEnabled(false);
                    f04a017j.setEnabled(false);
                    f04a017k.setEnabled(false);
                    f04a017l.setEnabled(false);
                    f04a017m.setEnabled(false);
                    f04a017n.setEnabled(false);
                    f04a017o.setEnabled(false);
                    f04a017p.setEnabled(false);
                    f04a017q.setEnabled(false);
                    f04a017888.setEnabled(false);
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
                    f04a017888.setChecked(false);
                    f04a017888x.setText(null);
                } else {
                    f04a017a.setEnabled(true);
                    f04a017b.setEnabled(true);
                    f04a017c.setEnabled(true);
                    f04a017d.setEnabled(true);
                    f04a017e.setEnabled(true);
                    f04a017f.setEnabled(true);
                    f04a017g.setEnabled(true);
                    f04a017h.setEnabled(true);
                    f04a017i.setEnabled(true);
                    f04a017j.setEnabled(true);
                    f04a017k.setEnabled(true);
                    f04a017l.setEnabled(true);
                    f04a017m.setEnabled(true);
                    f04a017n.setEnabled(true);
                    f04a017o.setEnabled(true);
                    f04a017p.setEnabled(true);
                    f04a017q.setEnabled(true);
                    f04a017888.setEnabled(true);
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

                if (MainApp.eligibleFlag) {
//                     TODO (2): Activity is not moving to Form 7. find out the case and Collect data for form 7!
                    startActivity(new Intent(this, F03BActivity.class));
                } else {
                    startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
                }



            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateF04();

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


        //MainApp.fc4 = new FormsContract();

        /*MainApp.formType = "4";
        MainApp.fc4.setFormType("4");
        MainApp.fc4.setDevicetagID(MainApp.fc.getDevicetagID());
        MainApp.fc4.setFormDate(new Date().toString());
        MainApp.fc4.setUser(MainApp.userName);
        MainApp.fc4.setDeviceID(MainApp.fc.getDeviceID());
        MainApp.fc4.setApp_version(MainApp.fc.getApp_version());
        //MainApp.fc4.setParticipantID(MainApp.fc.getParticipantID());
        MainApp.fc4.set_UUID(MainApp.fc.get_UID())*/

        JSONObject f04 = new JSONObject();

        f04.put("f04a001", f04a001a.isChecked() ? "1" : f04a001b.isChecked() ? "2" : "0");
        f04.put("f04a002a", f04a002a.isChecked() ? "1" : "0");
        f04.put("f04a002b", f04a002b.isChecked() ? "2" : "0");
        f04.put("f04a002c", f04a002c.isChecked() ? "3" : "0");
        f04.put("f04a002d", f04a002d.isChecked() ? "4" : "0");
        f04.put("f04a002e", f04a002e.isChecked() ? "5" : "0");
        f04.put("f04a002f", f04a002f.isChecked() ? "6" : "0");
        f04.put("f04a002g", f04a002g.isChecked() ? "7" : "0");
        f04.put("f04a002h", f04a002h.isChecked() ? "8" : "0");
        f04.put("f04a002i", f04a002i.isChecked() ? "9" : "0");
        f04.put("f04a002j", f04a002j.isChecked() ? "10" : "0");
        f04.put("f04a002k", f04a002k.isChecked() ? "11" : "0");
        f04.put("f04a002l", f04a002l.isChecked() ? "12" : "0");
        f04.put("f04a002m", f04a002m.isChecked() ? "13" : "0");
        f04.put("f04a002n", f04a002n.isChecked() ? "14" : "0");
        f04.put("f04a002777", f04a002777.isChecked() ? "777" : "0");
        f04.put("f04a002888", f04a002888.isChecked() ? "888" : "0");
        f04.put("f04a002999", f04a002999.isChecked() ? "999" : "0");
        f04.put("f04a002888x", f04a002888x.getText().toString());
        f04.put("f04a003a", f04a003a.isChecked() ? "1" : "0");
        f04.put("f04a003b", f04a003b.isChecked() ? "2" : "0");
        f04.put("f04a003c", f04a003c.isChecked() ? "3" : "0");
        f04.put("f04a003d", f04a003d.isChecked() ? "4" : "0");
        f04.put("f04a003e", f04a003e.isChecked() ? "5" : "0");
        f04.put("f04a003f", f04a003f.isChecked() ? "6" : "0");
        f04.put("f04a003g", f04a003g.isChecked() ? "7" : "0");
        f04.put("f04a003h", f04a003h.isChecked() ? "8" : "0");
        f04.put("f04a003i", f04a003i.isChecked() ? "9" : "0");
        f04.put("f04a003j", f04a003j.isChecked() ? "10" : "0");
        f04.put("f04a003k", f04a003k.isChecked() ? "11" : "0");
        f04.put("f04a003l", f04a003l.isChecked() ? "12" : "0");
        f04.put("f04a003m", f04a003m.isChecked() ? "13" : "0");
        f04.put("f04a003n", f04a003n.isChecked() ? "14" : "0");
        f04.put("f04a003o", f04a003o.isChecked() ? "15" : "0");
        f04.put("f04a003p", f04a003p.isChecked() ? "16" : "0");
        f04.put("f04a003q", f04a003q.isChecked() ? "17" : "0");
        f04.put("f04a003777", f04a003777.isChecked() ? "777" : "0");
        f04.put("f04a003888", f04a003888.isChecked() ? "888" : "0");
        f04.put("f04a003999", f04a003999.isChecked() ? "999" : "0");
        f04.put("f04a003888x", f04a003888x.getText().toString());
        f04.put("f04a004a", f04a004a.isChecked() ? "1" : "0");
        f04.put("f04a004b", f04a004b.isChecked() ? "2" : "0");
        f04.put("f04a004c", f04a004c.isChecked() ? "3" : "0");
        f04.put("f04a004d", f04a004d.isChecked() ? "4" : "0");
        f04.put("f04a004e", f04a004e.isChecked() ? "5" : "0");
        f04.put("f04a004f", f04a004f.isChecked() ? "6" : "0");
        f04.put("f04a004g", f04a004g.isChecked() ? "7" : "0");
        f04.put("f04a004h", f04a004h.isChecked() ? "8" : "0");
        f04.put("f04a004i", f04a004i.isChecked() ? "9" : "0");
        f04.put("f04a004j", f04a004j.isChecked() ? "10" : "0");
        f04.put("f04a004k", f04a004k.isChecked() ? "11" : "0");
        f04.put("f04a004l", f04a004l.isChecked() ? "12" : "0");
        f04.put("f04a004m", f04a004m.isChecked() ? "13" : "0");
        f04.put("f04a004n", f04a004n.isChecked() ? "14" : "0");
        f04.put("f04a004o", f04a004o.isChecked() ? "15" : "0");
        f04.put("f04a004777", f04a004777.isChecked() ? "777" : "0");
        f04.put("f04a004888", f04a004888.isChecked() ? "888" : "0");
        f04.put("f04a004999", f04a004999.isChecked() ? "999" : "0");
        f04.put("f04a004888x", f04a004888x.getText().toString());
        f04.put("f04a005a", f04a005a.isChecked() ? "1" : "0");
        f04.put("f04a005b", f04a005b.isChecked() ? "2" : "0");
        f04.put("f04a005c", f04a005c.isChecked() ? "3" : "0");
        f04.put("f04a005d", f04a005d.isChecked() ? "4" : "0");
        f04.put("f04a005e", f04a005e.isChecked() ? "5" : "0");
        f04.put("f04a005f", f04a005f.isChecked() ? "6" : "0");
        f04.put("f04a005g", f04a005g.isChecked() ? "7" : "0");
        f04.put("f04a005h", f04a005h.isChecked() ? "8" : "0");
        f04.put("f04a005i", f04a005i.isChecked() ? "9" : "0");
        f04.put("f04a005j", f04a005j.isChecked() ? "10" : "0");
        f04.put("f04a005k", f04a005k.isChecked() ? "11" : "0");
        f04.put("f04a005l", f04a005l.isChecked() ? "12" : "0");
        f04.put("f04a005m", f04a005m.isChecked() ? "13" : "0");
        f04.put("f04a005n", f04a005n.isChecked() ? "14" : "0");
        f04.put("f04a005o", f04a005o.isChecked() ? "15" : "0");
        f04.put("f04a005777", f04a005777.isChecked() ? "777" : "0");
        f04.put("f04a005888", f04a005888.isChecked() ? "888" : "0");
        f04.put("f04a005999", f04a005999.isChecked() ? "999" : "0");
        f04.put("f04a005888x", f04a005888x.getText().toString());
        f04.put("f04a006a", f04a006a.isChecked() ? "1" : "0");
        f04.put("f04a006b", f04a006b.isChecked() ? "2" : "0");
        f04.put("f04a006c", f04a006c.isChecked() ? "3" : "0");
        f04.put("f04a006d", f04a006d.isChecked() ? "4" : "0");
        f04.put("f04a006e", f04a006e.isChecked() ? "5" : "0");
        f04.put("f04a006f", f04a006f.isChecked() ? "6" : "0");
        f04.put("f04a006g", f04a006g.isChecked() ? "7" : "0");
        f04.put("f04a006777", f04a006777.isChecked() ? "777" : "0");
        f04.put("f04a006888", f04a006888.isChecked() ? "888" : "0");
        f04.put("f04a006999", f04a006999.isChecked() ? "999" : "0");
        f04.put("f04a006888x", f04a006888x.getText().toString());
        f04.put("f04a007a", f04a007a.isChecked() ? "1" : "0");
        f04.put("f04a007b", f04a007b.isChecked() ? "2" : "0");
        f04.put("f04a007c", f04a007c.isChecked() ? "3" : "0");
        f04.put("f04a007d", f04a007d.isChecked() ? "4" : "0");
        f04.put("f04a007e", f04a007e.isChecked() ? "5" : "0");
        f04.put("f04a007f", f04a007f.isChecked() ? "6" : "0");
        f04.put("f04a007777", f04a007777.isChecked() ? "777" : "0");
        f04.put("f04a007888", f04a007888.isChecked() ? "888" : "0");
        f04.put("f04a007999", f04a007999.isChecked() ? "999" : "0");
        f04.put("f04a007888x", f04a007888x.getText().toString());
        f04.put("f04a008a", f04a008a.isChecked() ? "1" : "0");
        f04.put("f04a008b", f04a008b.isChecked() ? "2" : "0");
        f04.put("f04a008c", f04a008c.isChecked() ? "3" : "0");
        f04.put("f04a008d", f04a008d.isChecked() ? "4" : "0");
        f04.put("f04a008e", f04a008e.isChecked() ? "5" : "0");
        f04.put("f04a008f", f04a008f.isChecked() ? "6" : "0");
        f04.put("f04a008g", f04a008g.isChecked() ? "7" : "0");
        f04.put("f04a008h", f04a008h.isChecked() ? "8" : "0");
        f04.put("f04a008i", f04a008i.isChecked() ? "9" : "0");
        f04.put("f04a008777", f04a008777.isChecked() ? "777" : "0");
        f04.put("f04a008888", f04a008888.isChecked() ? "888" : "0");
        f04.put("f04a008999", f04a008999.isChecked() ? "999" : "0");
        f04.put("f04a008888x", f04a008888x.getText().toString());
        f04.put("f04a009", f04a009a.isChecked() ? "1" : f04a009b.isChecked() ? "2" : f04a009c.isChecked() ? "3" : f04a009d.isChecked() ? "4" : f04a009777.isChecked() ? "777" : f04a009888.isChecked() ? "888" : f04a009999.isChecked() ? "999" : "0");
        f04.put("f04a009888x", f04a009888x.getText().toString());
        f04.put("f04a010a", f04a010a.isChecked() ? "1" : "0");
        f04.put("f04a010b", f04a010b.isChecked() ? "2" : "0");
        f04.put("f04a010c", f04a010c.isChecked() ? "3" : "0");
        f04.put("f04a010d", f04a010d.isChecked() ? "4" : "0");
        f04.put("f04a010e", f04a010e.isChecked() ? "5" : "0");
        f04.put("f04a010777", f04a010777.isChecked() ? "777" : "0");
        f04.put("f04a010888", f04a010888.isChecked() ? "888" : "0");
        f04.put("f04a010999", f04a010999.isChecked() ? "999" : "0");
        f04.put("f04a010888x", f04a010888x.getText().toString());
        f04.put("f04a011", f04a011a.isChecked() ? "1" : f04a011b.isChecked() ? "2" : f04a011c.isChecked() ? "3" : f04a011d.isChecked() ? "4" : f04a011e.isChecked() ? "5" : f04a011f.isChecked() ? "6" : f04a011888.isChecked() ? "888" : f04a011999.isChecked() ? "999" : "0");
        f04.put("f04a011888x", f04a011888x.getText().toString());
        f04.put("f04a012a", f04a012a.isChecked() ? "1" : "0");
        f04.put("f04a012b", f04a012b.isChecked() ? "2" : "0");
        f04.put("f04a012c", f04a012c.isChecked() ? "3" : "0");
        f04.put("f04a012d", f04a012d.isChecked() ? "4" : "0");
        f04.put("f04a012e", f04a012e.isChecked() ? "5" : "0");
        f04.put("f04a012f", f04a012f.isChecked() ? "6" : "0");
        f04.put("f04a012g", f04a012g.isChecked() ? "7" : "0");
        f04.put("f04a012h", f04a012h.isChecked() ? "8" : "0");
        f04.put("f04a012i", f04a012i.isChecked() ? "9" : "0");
        f04.put("f04a012j", f04a012j.isChecked() ? "10" : "0");
        f04.put("f04a012k", f04a012k.isChecked() ? "11" : "0");
        f04.put("f04a012l", f04a012l.isChecked() ? "12" : "0");
        f04.put("f04a012m", f04a012m.isChecked() ? "13" : "0");
        f04.put("f04a012n", f04a012n.isChecked() ? "14" : "0");
        f04.put("f04a012o", f04a012o.isChecked() ? "15" : "0");
        f04.put("f04a012p", f04a012p.isChecked() ? "16" : "0");
        f04.put("f04a012q", f04a012q.isChecked() ? "17" : "0");
        f04.put("f04a012r", f04a012r.isChecked() ? "18" : "0");
        f04.put("f04a012777", f04a012777.isChecked() ? "777" : "0");
        f04.put("f04a012888", f04a012888.isChecked() ? "888" : "0");
        f04.put("f04a012999", f04a012999.isChecked() ? "999" : "0");
        f04.put("f04a012888x", f04a012888x.getText().toString());
        f04.put("f04a013", f04a013a.isChecked() ? "1" : f04a013b.isChecked() ? "2" : f04a013c.isChecked() ? "3" : f04a013d.isChecked() ? "4" : f04a013e.isChecked() ? "5" : f04a013f.isChecked() ? "6" : f04a013777.isChecked() ? "777" : f04a013888.isChecked() ? "888" : f04a013999.isChecked() ? "999" : "0");
        f04.put("f04a013888x", f04a013888x.getText().toString());
        f04.put("f04a014", f04a014a.isChecked() ? "1" : f04a014b.isChecked() ? "2" : f04a014999.isChecked() ? "999" : "0");
        f04.put("f04a015a", f04a015a.isChecked() ? "1" : "0");
        f04.put("f04a015b", f04a015b.isChecked() ? "2" : "0");
        f04.put("f04a015c", f04a015c.isChecked() ? "3" : "0");
        f04.put("f04a015d", f04a015d.isChecked() ? "4" : "0");
        f04.put("f04a015e", f04a015e.isChecked() ? "5" : "0");
        f04.put("f04a015f", f04a015f.isChecked() ? "6" : "0");
        f04.put("f04a015g", f04a015g.isChecked() ? "7" : "0");
        f04.put("f04a015777", f04a015777.isChecked() ? "777" : "0");
        f04.put("f04a015888", f04a015888.isChecked() ? "888" : "0");
        f04.put("f04a015999", f04a015999.isChecked() ? "999" : "0");
        f04.put("f04a015888x", f04a015888x.getText().toString());
        f04.put("f04a016", f04a016a.isChecked() ? "1" : f04a016b.isChecked() ? "2" : f04a016999.isChecked() ? "999" : "0");
        f04.put("f04a017a", f04a017a.isChecked() ? "1" : "0");
        f04.put("f04a017b", f04a017b.isChecked() ? "2" : "0");
        f04.put("f04a017c", f04a017c.isChecked() ? "3" : "0");
        f04.put("f04a017d", f04a017d.isChecked() ? "4" : "0");
        f04.put("f04a017e", f04a017e.isChecked() ? "5" : "0");
        f04.put("f04a017f", f04a017f.isChecked() ? "6" : "0");
        f04.put("f04a017g", f04a017g.isChecked() ? "7" : "0");
        f04.put("f04a017h", f04a017h.isChecked() ? "8" : "0");
        f04.put("f04a017i", f04a017i.isChecked() ? "9" : "0");
        f04.put("f04a017j", f04a017j.isChecked() ? "10" : "0");
        f04.put("f04a017k", f04a017k.isChecked() ? "11" : "0");
        f04.put("f04a017l", f04a017l.isChecked() ? "12" : "0");
        f04.put("f04a017m", f04a017m.isChecked() ? "13" : "0");
        f04.put("f04a017n", f04a017n.isChecked() ? "14" : "0");
        f04.put("f04a017o", f04a017o.isChecked() ? "15" : "0");
        f04.put("f04a017p", f04a017p.isChecked() ? "16" : "0");
        f04.put("f04a017q", f04a017q.isChecked() ? "17" : "0");
        f04.put("f04a017777", f04a017777.isChecked() ? "777" : "0");
        f04.put("f04a017888", f04a017888.isChecked() ? "888" : "0");
        f04.put("f04a017888x", f04a017888x.getText().toString());
        f04.put("f04a018", f04a018a.isChecked() ? "1" : f04a018b.isChecked() ? "2" : f04a018999.isChecked() ? "999" : f04a018777.isChecked() ? "777" : "0");
        f04.put("f04a019", f04a019a.isChecked() ? "1" : f04a019b.isChecked() ? "2" : f04a019c.isChecked() ? "3" : f04a019d.isChecked() ? "4" : f04a019e.isChecked() ? "5" : f04a019f.isChecked() ? "6" : f04a019g.isChecked() ? "7" : f04a019h.isChecked() ? "8" : f04a019i.isChecked() ? "9" : f04a019j.isChecked() ? "10" : f04a019777.isChecked() ? "777" : f04a019888.isChecked() ? "888" : "0");
        f04.put("f04a019888x", f04a019888x.getText().toString());
        f04.put("f04a019ix", f04a019ix.getText().toString());

        //setGPS();

        MainApp.fc.setF04(String.valueOf(f04));
        //MainApp.fc.setF04(String.valueOf(f04));



        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {


        //=================== f04a001 ==============
        if (f04a001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a001), Toast.LENGTH_SHORT).show();
            f04a001b.setError("This data is Required!");
            Log.i(TAG, "f04a001: This Data is Required!");
            return false;
        } else {
            f04a001b.setError(null);
        }

        if (f04a001a.isChecked()) {
            // ====================== f04a002 ===================
            if (!(f04a002a.isChecked() || f04a002b.isChecked() || f04a002c.isChecked() || f04a002d.isChecked()
                    || f04a002e.isChecked() || f04a002f.isChecked() || f04a002g.isChecked() || f04a002h.isChecked()
                    || f04a002i.isChecked() || f04a002j.isChecked() || f04a002k.isChecked() || f04a002l.isChecked()
                    || f04a002m.isChecked() || f04a002n.isChecked() || f04a002777.isChecked() || f04a002888.isChecked() || f04a002999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a002), Toast.LENGTH_LONG).show();
                f04a002999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a002: This data is Required!");
                return false;
            } else {
                f04a002999.setError(null);
            }

            if (f04a002888.isChecked() && f04a002888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a002) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a002888x.setError("This data is required");
                Log.d(TAG, " f04a002888x :empty ");
                return false;
            } else {
                f04a002888x.setError(null);
            }

            // ====================== f04a003 ===================
            if (!(f04a003a.isChecked() || f04a003b.isChecked() || f04a003c.isChecked() || f04a003d.isChecked()
                    || f04a003e.isChecked() || f04a003f.isChecked() || f04a003g.isChecked() || f04a003h.isChecked()
                    || f04a003i.isChecked() || f04a003j.isChecked() || f04a003k.isChecked() || f04a003l.isChecked()
                    || f04a003m.isChecked() || f04a003n.isChecked() || f04a003o.isChecked() || f04a003p.isChecked()
                    || f04a003q.isChecked() || f04a003777.isChecked() || f04a003888.isChecked() || f04a003999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a003), Toast.LENGTH_LONG).show();
                f04a003999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a003: This data is Required!");
                return false;
            } else {
                f04a003999.setError(null);
            }

            if (f04a003888.isChecked() && f04a003888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a003) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a003888x.setError("This data is required");
                Log.d(TAG, " f04a003888x :empty ");
                return false;
            } else {
                f04a003888x.setError(null);
            }

            // ====================== f04a004 ===================
            if (!(f04a004a.isChecked() || f04a004b.isChecked() || f04a004c.isChecked() || f04a004d.isChecked()
                    || f04a004e.isChecked() || f04a004f.isChecked() || f04a004g.isChecked() || f04a004h.isChecked()
                    || f04a004i.isChecked() || f04a004j.isChecked() || f04a004k.isChecked() || f04a004l.isChecked()
                    || f04a004m.isChecked() || f04a004n.isChecked() || f04a004o.isChecked() || f04a004777.isChecked() || f04a004888.isChecked() || f04a004999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a004), Toast.LENGTH_LONG).show();
                f04a004999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a004: This data is Required!");
                return false;
            } else {
                f04a004999.setError(null);
            }

            if (f04a004888.isChecked() && f04a004888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a004) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a004888x.setError("This data is required");
                Log.d(TAG, " f04a004888x :empty ");
                return false;
            } else {
                f04a004888x.setError(null);
            }

            // ====================== f04a005 ===================
            if (!(f04a005a.isChecked() || f04a005b.isChecked() || f04a005c.isChecked() || f04a005d.isChecked()
                    || f04a005e.isChecked() || f04a005f.isChecked() || f04a005g.isChecked() || f04a005h.isChecked()
                    || f04a005i.isChecked() || f04a005j.isChecked() || f04a005k.isChecked() || f04a005l.isChecked()
                    || f04a005m.isChecked() || f04a005n.isChecked() || f04a005o.isChecked() || f04a005777.isChecked() || f04a005888.isChecked() || f04a005999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a005), Toast.LENGTH_LONG).show();
                f04a005999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a005: This data is Required!");
                return false;
            } else {
                f04a005999.setError(null);
            }

            if (f04a005888.isChecked() && f04a005888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a005) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a005888x.setError("This data is required");
                Log.d(TAG, " f04a005888x :empty ");
                return false;
            } else {
                f04a005888x.setError(null);
            }

            // ====================== f04a006 ===================

            if (f04a006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a006), Toast.LENGTH_SHORT).show();
                f04a006999.setError("This data is Required!");
                Log.i(TAG, "f04a006: This Data is Required!");
                return false;
            } else {
                f04a006999.setError(null);
            }

            if (f04a006888.isChecked() && f04a006888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a006) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a006888x.setError("This data is required");
                Log.d(TAG, " f04a006888x :empty ");
                return false;
            } else {
                f04a006888x.setError(null);
            }

            // ====================== f04a007 ===================
            if (!(f04a007a.isChecked() || f04a007b.isChecked() || f04a007c.isChecked() || f04a007d.isChecked()
                    || f04a007e.isChecked() || f04a007f.isChecked() || f04a007777.isChecked() || f04a007888.isChecked() || f04a007999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a007), Toast.LENGTH_LONG).show();
                f04a007999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a007: This data is Required!");
                return false;
            } else {
                f04a007999.setError(null);
            }

            if (f04a007888.isChecked() && f04a007888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a007) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a007888x.setError("This data is required");
                Log.d(TAG, " f04a007888x :empty ");
                return false;
            } else {
                f04a007888x.setError(null);
            }

            // ====================== f04a008 ===================
            if (!(f04a008a.isChecked() || f04a008b.isChecked() || f04a008c.isChecked() || f04a008d.isChecked()
                    || f04a008e.isChecked() || f04a008f.isChecked() || f04a008g.isChecked() || f04a008h.isChecked()
                    || f04a008i.isChecked() || f04a008777.isChecked() || f04a008888.isChecked() || f04a008999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a008), Toast.LENGTH_LONG).show();
                f04a008999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a008: This data is Required!");
                return false;
            } else {
                f04a008999.setError(null);
            }

            if (f04a008888.isChecked() && f04a008888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a008) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a008888x.setError("This data is required");
                Log.d(TAG, " f04a008888x :empty ");
                return false;
            } else {
                f04a008888x.setError(null);
            }

            // ====================== f04a009 ===================

            if (f04a009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a009), Toast.LENGTH_SHORT).show();
                f04a009999.setError("This data is Required!");
                Log.i(TAG, "f04a009: This Data is Required!");
                return false;
            } else {
                f04a009999.setError(null);
            }

            if (f04a009888.isChecked() && f04a009888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a009) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a009888x.setError("This data is required");
                Log.d(TAG, " f04a009888x :empty ");
                return false;
            } else {
                f04a009888x.setError(null);
            }

            // ====================== f04a010 ===================
            if (!(f04a010a.isChecked() || f04a010b.isChecked() || f04a010c.isChecked() || f04a010d.isChecked()
                    || f04a010e.isChecked() || f04a010777.isChecked() || f04a010888.isChecked() || f04a010999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a010), Toast.LENGTH_LONG).show();
                f04a010999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a010: This data is Required!");
                return false;
            } else {
                f04a010999.setError(null);
            }

            if (f04a010888.isChecked() && f04a010888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a010) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a010888x.setError("This data is required");
                Log.d(TAG, " f04a010888x :empty ");
                return false;
            } else {
                f04a010888x.setError(null);
            }

            // ====================== f04a011 ===================

            if (f04a011.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a011), Toast.LENGTH_SHORT).show();
                f04a011999.setError("This data is Required!");
                Log.i(TAG, "f04a011: This Data is Required!");
                return false;
            } else {
                f04a011999.setError(null);
            }

            if (f04a011888.isChecked() && f04a011888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a011) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a011888x.setError("This data is required");
                Log.d(TAG, " f04a011888x :empty ");
                return false;
            } else {
                f04a011888x.setError(null);
            }


            // ====================== f04a012 ===================
            if (!(f04a012a.isChecked() || f04a012b.isChecked() || f04a012c.isChecked() || f04a012d.isChecked()
                    || f04a012e.isChecked() || f04a012f.isChecked() || f04a012g.isChecked() || f04a012h.isChecked()
                    || f04a012i.isChecked() || f04a012j.isChecked() || f04a012k.isChecked() || f04a012l.isChecked()
                    || f04a012m.isChecked() || f04a012n.isChecked() || f04a012o.isChecked() || f04a012p.isChecked()
                    || f04a012q.isChecked() || f04a012r.isChecked() || f04a012777.isChecked()
                    || f04a012888.isChecked() || f04a012999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a012), Toast.LENGTH_LONG).show();
                f04a012999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a012: This data is Required!");
                return false;
            } else {
                f04a012999.setError(null);
            }

            if (f04a012888.isChecked() && f04a012888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a012) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a012888x.setError("This data is required");
                Log.d(TAG, " f04a012888x :empty ");
                return false;
            } else {
                f04a012888x.setError(null);
            }

            if (f04a012m.isChecked() || f04a012n.isChecked()) {      // ====================== f04a013 ===================
                if (f04a013.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a013), Toast.LENGTH_SHORT).show();
                    f04a013999.setError("This data is Required!");
                    Log.i(TAG, "f04a013: This Data is Required!");
                    return false;
                } else {
                    f04a013999.setError(null);
                }

                if (f04a013888.isChecked() && f04a013888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a013) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f04a013888x.setError("This data is required");
                    Log.d(TAG, " f04a013888x :empty ");
                    return false;
                } else {
                    f04a013888x.setError(null);
                }
            }

        }

        // ====================== f04a014 ===================
        if (f04a014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a014), Toast.LENGTH_SHORT).show();
            f04a014999.setError("This data is Required!");
            Log.i(TAG, "f04a014: This Data is Required!");
            return false;
        } else {
            f04a014999.setError(null);
        }


        if (f04a014a.isChecked()) {
            // ====================== f04a015 ===================
            if (!(f04a015a.isChecked() || f04a015b.isChecked() || f04a015c.isChecked() || f04a015d.isChecked()
                    || f04a015e.isChecked() || f04a015f.isChecked() || f04a015g.isChecked() || f04a015777.isChecked()
                    || f04a015888.isChecked() || f04a015999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a015), Toast.LENGTH_LONG).show();
                f04a015999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a015: This data is Required!");
                return false;
            } else {
                f04a015999.setError(null);
            }

            if (f04a015888.isChecked() && f04a015888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a015) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a015888x.setError("This data is required");
                Log.d(TAG, " f04a015888x :empty ");
                return false;
            } else {
                f04a015888x.setError(null);
            }
        }
        // ====================== f04a016 ===================
        if (f04a016.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a016), Toast.LENGTH_SHORT).show();
            f04a016999.setError("This data is Required!");
            Log.i(TAG, "f04a016: This Data is Required!");
            return false;
        } else {
            f04a016999.setError(null);
        }

        if (f04a016a.isChecked()) {
            // ====================== f04a017 ===================
            if (!(f04a017a.isChecked() || f04a017b.isChecked() || f04a017c.isChecked() || f04a017d.isChecked()
                    || f04a017e.isChecked() || f04a017f.isChecked() || f04a017g.isChecked() || f04a017h.isChecked()
                    || f04a017i.isChecked() || f04a017j.isChecked() || f04a017k.isChecked() || f04a017l.isChecked()
                    || f04a017m.isChecked() || f04a017n.isChecked() || f04a017o.isChecked() || f04a017p.isChecked()
                    || f04a017q.isChecked() || f04a017777.isChecked()
                    || f04a017888.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f04a017), Toast.LENGTH_LONG).show();
                f04a017888.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "f04a017: This data is Required!");
                return false;
            } else {
                f04a017888.setError(null);
            }

            if (f04a017888.isChecked() && f04a017888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a017) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a017888x.setError("This data is required");
                Log.d(TAG, " f04a017888x :empty ");
                return false;
            } else {
                f04a017888x.setError(null);
            }
        }

        // ====================== f04a018 ===================
        if (f04a018.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a018), Toast.LENGTH_SHORT).show();
            f04a018777.setError("This data is Required!");
            Log.i(TAG, "f04a018: This Data is Required!");
            return false;
        } else {
            f04a018777.setError(null);
        }

        if (f04a018a.isChecked()) {
            // ====================== f04a019 ===================
            if (f04a019.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a019), Toast.LENGTH_SHORT).show();
                f04a019888.setError("This data is Required!");
                Log.i(TAG, "f04a019: This Data is Required!");
                return false;
            } else {
                f04a019888.setError(null);
            }

            if (f04a019888.isChecked() && f04a019888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a019) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                f04a019888x.setError("This data is required");
                Log.d(TAG, " f04a019888x :empty ");
                return false;
            } else {
                f04a019888x.setError(null);
            }

            if (f04a019i.isChecked() && f04a019ix.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f04a019) + " - " + getString(R.string.f04a019ix), Toast.LENGTH_SHORT).show();
                f04a019ix.setError("This data is required");
                Log.d(TAG, " f04a019ix :empty ");
                return false;
            } else {
                f04a019ix.setError(null);
            }
        }


        return true;

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (f04a012m.isChecked() || f04a012n.isChecked()) {
            fldGrp012.setVisibility(View.VISIBLE);
        } else {
            fldGrp012.setVisibility(View.GONE);
        }
    }


}

