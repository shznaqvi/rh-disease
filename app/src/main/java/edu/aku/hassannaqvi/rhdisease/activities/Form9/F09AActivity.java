package edu.aku.hassannaqvi.rhdisease.activities.Form9;

import android.app.Activity;
import android.os.Bundle;


import butterknife.ButterKnife;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;

import org.json.JSONObject;
import org.json.JSONException;

import android.util.Log;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;


public class F09AActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f09_a);
        ButterKnife.bind(this);
    }


    private void SaveDraft() throws JSONException {

        JSONObject f9 = new JSONObject();

        f9.put("f09hcwid", f09hcwid.getText().toString());
        f9.put("f09facid", f09facid.getText().toString());
        f9.put("f09gawk", f09gawk.getText().toString());
        f9.put("f09gad", f09gad.getText().toString());

        f9.put("f09a001a", f09a001a.isChecked() ? "1"
                : f09a001b.isChecked() ? "2"
                : 0);


        f9.put("f09a002a", f09a002a.isChecked() ? "1"
                : f09a002b.isChecked() ? "2"
                : f09a002c.isChecked() ? "3"
                : f09a002d.isChecked() ? "4"
                : f09a00288.isChecked() ? "88"
                : 0);

        f9.put("f09a002888x", f09a002888x.getText().toString());


        f9.put("f09a003a", f09a003aa.isChecked() ? "1"
                : f09a003ab.isChecked() ? "2"
                : f09a003ac.isChecked() ? "3"
                : f09a003ad.isChecked() ? "4"
                : 0);


        f9.put("f09a003b", f09a003ba.isChecked() ? "1"
                : f09a003bb.isChecked() ? "2"
                : 0);


        f9.put("f09a004a", f09a004aa.isChecked() ? "1"
                : f09a004ab.isChecked() ? "2"
                : f09a004ac.isChecked() ? "3"
                : f09a004ad.isChecked() ? "4"
                : 0);


        f9.put("f09a004b", f09a004ba.isChecked() ? "1"
                : f09a004bb.isChecked() ? "2"
                : 0);


        f9.put("f09b001", f09b001a.isChecked() ? "1"
                : f09b001b.isChecked() ? "2"
                : f09b001999.isChecked() ? "999"
                : 0);


        f9.put("f09b002", f09b002a.isChecked() ? "1"
                : f09b002b.isChecked() ? "2"
                : f09b002999.isChecked() ? "999"
                : 0);


        f9.put("f09b003", f09b003a.isChecked() ? "1"
                : f09b003b.isChecked() ? "2"
                : f09b003999.isChecked() ? "999"
                : 0);


        f9.put("f09b004", f09b004.getText().toString());


        f9.put("f09b005", f09b005a.isChecked() ? "1"
                : f09b005b.isChecked() ? "2"
                : f09b005c.isChecked() ? "3"
                : f09b005999.isChecked() ? "999"
                : 0);


        f9.put("f09b006", f09b006a.isChecked() ? "1"
                : f09b006b.isChecked() ? "2"
                : f09b006c.isChecked() ? "3"
                : f09b006999.isChecked() ? "999"
                : 0);


        f9.put("f09b007", f09b007a.isChecked() ? "1"
                : f09b007b.isChecked() ? "2"
                : f09b007c.isChecked() ? "3"
                : f09b007d.isChecked() ? "3"
                : f09b007888.isChecked() ? "888"
                : 0);


        f9.put("f09b007888x", f09b007888x.getText().toString());


        f9.put("f09b008", f09b008a.isChecked() ? "1"
                : f09b008b.isChecked() ? "2"
                : f09b008999.isChecked() ? "999"
                : 0);


        f9.put("f09b009", f09b009a.isChecked() ? "1"
                : f09b009b.isChecked() ? "2"
                : f09b009c.isChecked() ? "3"
                : f09b009d.isChecked() ? "4"
                : f09b009888.isChecked() ? "888"
                : 0);


        f9.put("f09b009888x", f09b009888x.getText().toString());


        f9.put("f09b011", f09b011a.isChecked() ? "1"
                : f09b011b.isChecked() ? "2"
                : f09b011999.isChecked() ? "999"
                : 0);


        f9.put("f09b012", f09b012a.isChecked() ? "1"
                : f09b012b.isChecked() ? "2"
                : 0);


        f9.put("f09b013", f09b013a.isChecked() ? "1"
                : f09b013b.isChecked() ? "2"
                : 0);


        f9.put("f09b014", f09b014a.isChecked() ? "1"
                : f09b014b.isChecked() ? "2"
                : 0);


        f9.put("f09b015", f09b015a.isChecked() ? "1"
                : f09b015b.isChecked() ? "2"
                : 0);


        f9.put("f09b016", f09b016a.isChecked() ? "1"
                : f09b016b.isChecked() ? "2"
                : 0);


        f9.put("f09b017", f09b017.getText().toString());

        f9.put("f09b018", f09b018a.isChecked() ? "1"
                : f09b018b.isChecked() ? "2"
                : f09b018c.isChecked() ? "3"
                : f09b018888.isChecked() ? "888"
                : 0);


        f9.put("f09b018888x", f09b018888x.getText().toString());


        f9.put("f09b019", f09b019a.isChecked() ? "1"
                : f09b019b.isChecked() ? "2"
                : f09b019c.isChecked() ? "3"
                : f09b019d.isChecked() ? "4"
                : f09b019888.isChecked() ? "888"
                : 0);


        f9.put("f09b019888x", f09b019888x.getText().toString());

        //MainApp.fc.setsF(String.valueOf(f9));

    }

}