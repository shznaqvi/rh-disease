package edu.aku.hassannaqvi.rhdisease.activities.Form7;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.MainActivity;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

public class F07BActivity extends Activity {

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
    @BindView(R.id.f07b004)
    RadioGroup f07b004;
    @BindView(R.id.f07b004a)
    RadioButton f07b004a;
    @BindView(R.id.f07b004b)
    RadioButton f07b004b;
    @BindView(R.id.f07b004c)
    RadioButton f07b004c;
    @BindView(R.id.f07b004d)
    RadioButton f07b004d;
    @BindView(R.id.f07b004e)
    RadioButton f07b004e;
    @BindView(R.id.f07b004f)
    RadioButton f07b004f;
    @BindView(R.id.f07b004888)
    RadioButton f07b004888;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f07_b);
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
                : 0);


        f07.put("f07b001888x", f07b001888x.getText().toString());

        f07.put("f07b002", f07b002a.isChecked() ? "1"
                : f07b002b.isChecked() ? "2"
                : f07b002c.isChecked() ? "3"
                : 0);

        f07.put("f07b002cmin", f07b002cmin.getText().toString());


        f07.put("f07b003", f07b003a.isChecked() ? "1"
                : f07b003b.isChecked() ? "2"
                : f07b003999.isChecked() ? "999"
                : 0);


        f07.put("f07b004", f07b004a.isChecked() ? "1"
                : f07b004b.isChecked() ? "2"
                : f07b004c.isChecked() ? "3"
                : f07b004d.isChecked() ? "4"
                : f07b004e.isChecked() ? "5"
                : f07b004f.isChecked() ? "6"
                : f07b004888.isChecked() ? "888"
                : 0);


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
                : 0);

        f07.put("f07b005888x", f07b005888x.getText().toString());


        f07.put("f07b006", f07b006a.isChecked() ? "1"
                : f07b006b.isChecked() ? "2"
                : 0);


        f07.put("f07b00701", f07b00701a.isChecked() ? "1"
                : f07b00701b.isChecked() ? "2"
                : f07b00701999.isChecked() ? "999"
                : 0);


        f07.put("f07b00702", f07b00702a.isChecked() ? "1"
                : f07b00702b.isChecked() ? "2"
                : f07b00702999.isChecked() ? "999"
                : 0);


        f07.put("f07b00703", f07b00703a.isChecked() ? "1"
                : f07b00703b.isChecked() ? "2"
                : f07b00703999.isChecked() ? "999"
                : 0);


        f07.put("f07b00704", f07b00704a.isChecked() ? "1"
                : f07b00704b.isChecked() ? "2"
                : f07b00704999.isChecked() ? "999"
                : 0);


        f07.put("f07b00705", f07b00705a.isChecked() ? "1"
                : f07b00705b.isChecked() ? "2"
                : f07b00705999.isChecked() ? "999"
                : 0);


        f07.put("f07b00706", f07b00706a.isChecked() ? "1"
                : f07b00706b.isChecked() ? "2"
                : f07b00706999.isChecked() ? "999"
                : 0);


        f07.put("f07b00707", f07b00707a.isChecked() ? "1"
                : f07b00707b.isChecked() ? "2"
                : f07b00707999.isChecked() ? "999"
                : 0);


        f07.put("f07b00708", f07b00708a.isChecked() ? "1"
                : f07b00708b.isChecked() ? "2"
                : f07b00708999.isChecked() ? "999"
                : 0);


        f07.put("f07b00709", f07b00709a.isChecked() ? "1"
                : f07b00709b.isChecked() ? "2"
                : f07b00709999.isChecked() ? "999"
                : 0);


        f07.put("f07b00710", f07b00710a.isChecked() ? "1"
                : f07b00710b.isChecked() ? "2"
                : f07b00710999.isChecked() ? "999"
                : 0);


        f07.put("f07b00711", f07b00711a.isChecked() ? "1"
                : f07b00711b.isChecked() ? "2"
                : f07b00711999.isChecked() ? "999"
                : 0);


        f07.put("f07b00712", f07b00712a.isChecked() ? "1"
                : f07b00712b.isChecked() ? "2"
                : f07b00712999.isChecked() ? "999"
                : 0);


        f07.put("f07b00713", f07b00713a.isChecked() ? "1"
                : f07b00713b.isChecked() ? "2"
                : f07b00713999.isChecked() ? "999"
                : 0);


        f07.put("f07b00714", f07b00714a.isChecked() ? "1"
                : f07b00714b.isChecked() ? "2"
                : f07b00714999.isChecked() ? "999"
                : 0);


        f07.put("f07b00715", f07b00715a.isChecked() ? "1"
                : f07b00715b.isChecked() ? "2"
                : f07b00715999.isChecked() ? "999"
                : 0);


        f07.put("f07b00716", f07b00716a.isChecked() ? "1"
                : f07b00716b.isChecked() ? "2"
                : f07b00716999.isChecked() ? "999"
                : 0);


        f07.put("f07b00717", f07b00717a.isChecked() ? "1"
                : f07b00717b.isChecked() ? "2"
                : f07b00717999.isChecked() ? "999"
                : 0);


        f07.put("f07b00718", f07b00718a.isChecked() ? "1"
                : f07b00718b.isChecked() ? "2"
                : f07b00718999.isChecked() ? "999"
                : 0);


        f07.put("f07b008", f07b008a.isChecked() ? "1"
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
                : 0);


        f07.put("f07b008888x", f07b008888x.getText().toString());


        f07.put("f07b009", f07b009a.isChecked() ? "1"
                : f07b009b.isChecked() ? "2"
                : f07b009c.isChecked() ? "3"
                : f07b009888.isChecked() ? "888"
                : f07b00718999.isChecked() ? "999"
                : 0);


        f07.put("f07b010", f07b010a.isChecked() ? "1"
                : f07b010b.isChecked() ? "2"
                : 0);


        f07.put("f07b011", f07b011a.isChecked() ? "1"
                : f07b011a.isChecked() ? "2"
                : f07b011c.isChecked() ? "3"
                : f07b011d.isChecked() ? "4"
                : f07b011e.isChecked() ? "5"
                : 0);


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
                : 0);


        f07.put("f07b012888x", f07b012888x.getText().toString());


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
                : 0);


        f07.put("f07b013888x", f07b013888x.getText().toString());


        f07.put("f07b014", f07b014a.isChecked() ? "1"
                : f07b014b.isChecked() ? "2"
                : f07b014c.isChecked() ? "3"
                : f07b014d.isChecked() ? "4"
                : f07b014e.isChecked() ? "5"
                : f07b014f.isChecked() ? "6"
                : f07b014888.isChecked() ? "888"
                : f07b014999.isChecked() ? "999"
                : 0);


        f07.put("f07b014888x", f07b014888x.getText().toString());
        f07.put("f07b015", f07b015.getText().toString());


        f07.put("f07b01601", f07b01601a.isChecked() ? "1"
                : f07b01601b.isChecked() ? "2"
                : f07b01601999.isChecked() ? "999"
                : 0);


        f07.put("f07b01602", f07b01602a.isChecked() ? "1"
                : f07b01602b.isChecked() ? "2"
                : f07b01602999.isChecked() ? "999"
                : 0);


        f07.put("f07b01603a", f07b01603a.isChecked() ? "1"
                : f07b01603b.isChecked() ? "2"
                : f07b01603999.isChecked() ? "999"
                : 0);


        f07.put("f07b01604", f07b01604a.isChecked() ? "1"
                : f07b01604b.isChecked() ? "2"
                : f07b01604999.isChecked() ? "999"
                : 0);


        f07.put("f07b017", f07b017a.isChecked() ? "1"
                : f07b017b.isChecked() ? "2"
                : f07b017999.isChecked() ? "999"
                : 0);


        f07.put("f07b018", f07b018a.isChecked() ? "1"
                : f07b018b.isChecked() ? "2"
                : f07b018999.isChecked() ? "999"
                : 0);


        f07.put("f07b01901", f07b01901.getText().toString());
        f07.put("f07b01902", f07b01902.getText().toString());
        f07.put("f07b01903", f07b01903.getText().toString());
        f07.put("f07b01904", f07b01904.getText().toString());
        f07.put("f07b01905", f07b01905.getText().toString());
        f07.put("f07b01906", f07b01906.getText().toString());
        f07.put("f07b01907", f07b01907.getText().toString());

        MainApp.fc.setF07b(String.valueOf(f07));

    }
}

