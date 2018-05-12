package edu.aku.hassannaqvi.rhdisease.activities.Form9;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
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

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;


public class F09AActivity extends Activity {

    private static final String TAG = F09AActivity.class.getSimpleName();
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    String participantID = null;
    String lmp = null;
    public static String PARTICIPANT_ID_TAG = "participantID";
    public static String LMP_TAG = "lmp";
    @BindView(R.id.f09hcwid)
    EditText f09hcwid;
    @BindView(R.id.f09facid)
    EditText f09facid;
    @BindView(R.id.f09gawk)
    EditText f09gawk;
    @BindView(R.id.f09gad)
    EditText f09gad;
    @BindView(R.id.f09a001)
    RadioGroup f09a001;
    @BindView(R.id.f09a001a)
    RadioButton f09a001a;
    @BindView(R.id.f09a001b)
    RadioButton f09a001b;
    @BindView(R.id.f09a002)
    RadioGroup f09a002;
    @BindView(R.id.f09a002a)
    RadioButton f09a002a;
    @BindView(R.id.f09a002b)
    RadioButton f09a002b;
    @BindView(R.id.f09a002c)
    RadioButton f09a002c;
    @BindView(R.id.f09a002d)
    RadioButton f09a002d;
    @BindView(R.id.f09a002888)
    RadioButton f09a002888;
    @BindView(R.id.f09a002888x)
    EditText f09a002888x;
    @BindView(R.id.f09a003bg)
    RadioGroup f09a003bg;
    @BindView(R.id.f09a003bg01)
    RadioButton f09a003bg01;
    @BindView(R.id.f09a003bg02)
    RadioButton f09a003bg02;
    @BindView(R.id.f09a003bg03)
    RadioButton f09a003bg03;
    @BindView(R.id.f09a003bg04)
    RadioButton f09a003bg04;
    @BindView(R.id.f09a003rh)
    RadioGroup f09a003rh;
    @BindView(R.id.f09a003rh01)
    RadioButton f09a003rh01;
    @BindView(R.id.f09a003rh02)
    RadioButton f09a003rh02;
    @BindView(R.id.f09a004bg)
    RadioGroup f09a004bg;
    @BindView(R.id.f09a004bg01)
    RadioButton f09a004bg01;
    @BindView(R.id.f09a004bg02)
    RadioButton f09a004bg02;
    @BindView(R.id.f09a004bg03)
    RadioButton f09a004bg03;
    @BindView(R.id.f09a004bg04)
    RadioButton f09a004bg04;
    @BindView(R.id.f09a004rh)
    RadioGroup f09a004rh;
    @BindView(R.id.f09a004rh01)
    RadioButton f09a004rh01;
    @BindView(R.id.f09a004rh02)
    RadioButton f09a004rh02;
    @BindView(R.id.f09b001)
    RadioGroup f09b001;
    @BindView(R.id.f09b001a)
    RadioButton f09b001a;
    @BindView(R.id.f09b001b)
    RadioButton f09b001b;
    @BindView(R.id.f09b001999)
    RadioButton f09b001999;
    @BindView(R.id.f09b002)
    RadioGroup f09b002;
    @BindView(R.id.f09b002a)
    RadioButton f09b002a;
    @BindView(R.id.f09b002b)
    RadioButton f09b002b;
    @BindView(R.id.f09b002999)
    RadioButton f09b002999;
    @BindView(R.id.f09b003)
    RadioGroup f09b003;
    @BindView(R.id.f09b003a)
    RadioButton f09b003a;
    @BindView(R.id.f09b003b)
    RadioButton f09b003b;
    @BindView(R.id.f09b003999)
    RadioButton f09b003999;
    @BindView(R.id.f09b004)
    EditText f09b004;
    @BindView(R.id.f09b005)
    RadioGroup f09b005;
    @BindView(R.id.f09b005a)
    RadioButton f09b005a;
    @BindView(R.id.f09b005b)
    RadioButton f09b005b;
    @BindView(R.id.f09b005c)
    RadioButton f09b005c;
    @BindView(R.id.f09b005999)
    RadioButton f09b005999;
    @BindView(R.id.f09b006)
    RadioGroup f09b006;
    @BindView(R.id.f09b006a)
    RadioButton f09b006a;
    @BindView(R.id.f09b006b)
    RadioButton f09b006b;
    @BindView(R.id.f09b006999)
    RadioButton f09b006999;
    @BindView(R.id.f09b007)
    RadioGroup f09b007;
    @BindView(R.id.f09b007a)
    RadioButton f09b007a;
    @BindView(R.id.f09b007b)
    RadioButton f09b007b;
    @BindView(R.id.f09b007c)
    RadioButton f09b007c;
    @BindView(R.id.f09b007d)
    RadioButton f09b007d;
    @BindView(R.id.f09b007888)
    RadioButton f09b007888;
    @BindView(R.id.f09b007888x)
    EditText f09b007888x;
    @BindView(R.id.f09b008)
    RadioGroup f09b008;
    @BindView(R.id.f09b008a)
    RadioButton f09b008a;
    @BindView(R.id.f09b008b)
    RadioButton f09b008b;
    @BindView(R.id.f09b008999)
    RadioButton f09b008999;
    @BindView(R.id.f09b009)
    RadioGroup f09b009;
    @BindView(R.id.f09b009a)
    RadioButton f09b009a;
    @BindView(R.id.f09b009b)
    RadioButton f09b009b;
    @BindView(R.id.f09b009c)
    RadioButton f09b009c;
    @BindView(R.id.f09b009d)
    RadioButton f09b009d;
    @BindView(R.id.f09b009e)
    RadioButton f09b009e;
    @BindView(R.id.f09b009888)
    RadioButton f09b009888;
    @BindView(R.id.f09b009888x)
    EditText f09b009888x;
    @BindView(R.id.f09b010)
    RadioGroup f09b010;
    @BindView(R.id.f09b010a)
    RadioButton f09b010a;
    @BindView(R.id.f09b010b)
    RadioButton f09b010b;
    @BindView(R.id.f09b010c)
    RadioButton f09b010c;
    @BindView(R.id.f09b010d)
    RadioButton f09b010d;
    @BindView(R.id.f09b010e)
    RadioButton f09b010e;
    @BindView(R.id.f09b010f)
    RadioButton f09b010f;
    @BindView(R.id.f09b010g)
    RadioButton f09b010g;
    @BindView(R.id.f09b010888)
    RadioButton f09b010888;
    @BindView(R.id.f09b010888x)
    EditText f09b010888x;
    @BindView(R.id.f09b011)
    RadioGroup f09b011;
    @BindView(R.id.f09b011a)
    RadioButton f09b011a;
    @BindView(R.id.f09b011b)
    RadioButton f09b011b;
    @BindView(R.id.f09b011999)
    RadioButton f09b011999;
    @BindView(R.id.f09b012)
    RadioGroup f09b012;
    @BindView(R.id.f09b012a)
    RadioButton f09b012a;
    @BindView(R.id.f09b012b)
    RadioButton f09b012b;
    @BindView(R.id.f09b013)
    RadioGroup f09b013;
    @BindView(R.id.f09b013a)
    RadioButton f09b013a;
    @BindView(R.id.f09b013b)
    RadioButton f09b013b;
    @BindView(R.id.f09b014)
    RadioGroup f09b014;
    @BindView(R.id.f09b014a)
    RadioButton f09b014a;
    @BindView(R.id.f09b014b)
    RadioButton f09b014b;
    @BindView(R.id.f09b015)
    RadioGroup f09b015;
    @BindView(R.id.f09b015a)
    RadioButton f09b015a;
    @BindView(R.id.f09b015b)
    RadioButton f09b015b;
    @BindView(R.id.f09b016)
    RadioGroup f09b016;
    @BindView(R.id.f09b016a)
    RadioButton f09b016a;
    @BindView(R.id.f09b016b)
    RadioButton f09b016b;
    @BindView(R.id.f09b017)
    EditText f09b017;
    @BindView(R.id.f09b018)
    RadioGroup f09b018;
    @BindView(R.id.f09b018a)
    RadioButton f09b018a;
    @BindView(R.id.f09b018b)
    RadioButton f09b018b;
    @BindView(R.id.f09b018c)
    RadioButton f09b018c;
    @BindView(R.id.f09b018888)
    RadioButton f09b018888;
    @BindView(R.id.f09b018888x)
    EditText f09b018888x;

    @BindView(R.id.f09b019a)
    CheckBox f09b019a;
    @BindView(R.id.f09b019b)
    CheckBox f09b019b;
    @BindView(R.id.f09b019c)
    CheckBox f09b019c;
    @BindView(R.id.f09b019d)
    CheckBox f09b019d;
    @BindView(R.id.f09b019888)
    CheckBox f09b019888;
    @BindView(R.id.f09b019888x)
    EditText f09b019888x;

    @BindView(R.id.fldGrpf09a001)
    LinearLayout fldGrpf09a001;

    @BindView(R.id.fldGrpf09a002)
    LinearLayout fldGrpf09a002;

    @BindView(R.id.fldGrpf09b003)
    LinearLayout fldGrpf09b003;

    @BindView(R.id.fldGrpf09b006)
    LinearLayout fldGrpf09b006;

    @BindView(R.id.fldGrpf09b008)
    LinearLayout fldGrpf09b008;

    @BindView(R.id.fldGrpf09b011)
    LinearLayout fldGrpf09b011;

    @BindView(R.id.fldGrpf09b012)
    LinearLayout fldGrpf09b012;

    @BindView(R.id.fldGrpf09b013)
    LinearLayout fldGrpf09b013;

    @BindView(R.id.fldGrpf09b014)
    LinearLayout fldGrpf09b014;

    @BindView(R.id.fldGrpf09b015)
    LinearLayout fldGrpf09b015;

    @BindView(R.id.fldGrpf09b022)
    LinearLayout fldGrpf09b022;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f09_a);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        if (intent.hasExtra(PARTICIPANT_ID_TAG)) {
            participantID = intent.getStringExtra(PARTICIPANT_ID_TAG);
        }
        if (intent.hasExtra(LMP_TAG)) {
            lmp = intent.getStringExtra(LMP_TAG);
        }


        f09a001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09a001a.isChecked()) {
                    f09a002.clearCheck();
                    fldGrpf09a001.setVisibility(View.GONE);
                    fldGrpf09a002.setVisibility(View.VISIBLE);
                } else {

                    f09a003bg.clearCheck();
                    f09a003rh.clearCheck();
                    f09a004bg.clearCheck();
                    f09a004rh.clearCheck();
                    f09b001.clearCheck();
                    f09b002.clearCheck();
                    f09b003.clearCheck();
                    f09b004.setText(null);
                    f09b005.clearCheck();
                    f09b006.clearCheck();

                    f09b007.clearCheck();
                    f09b007888x.setText(null);

                    f09b008.clearCheck();

                    f09b009.clearCheck();
                    f09b009888x.setText(null);

                    f09b010.clearCheck();
                    f09b010888x.setText(null);

                    f09b011.clearCheck();
                    f09b012.clearCheck();
                    f09b013.clearCheck();
                    f09b014.clearCheck();
                    f09b015.clearCheck();
                    f09b016.clearCheck();
                    f09b017.setText(null);

                    f09b018.clearCheck();
                    f09b018888x.setText(null);

                    f09b019a.setChecked(false);
                    f09b019b.setChecked(false);
                    f09b019c.setChecked(false);
                    f09b019d.setChecked(false);
                    f09b009e.setChecked(false);
                    f09b019888.setChecked(false);

                    f09b019888x.setText(null);


                    fldGrpf09a001.setVisibility(View.VISIBLE);
                    fldGrpf09a002.setVisibility(View.GONE);
                }
            }
        });


        f09a002888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (f09a002888.isChecked()) {
                    f09a002888x.setVisibility(View.VISIBLE);
                    f09a002888x.requestFocus();
                } else {
                    f09a002888x.setText(null);
                    f09a002888x.setVisibility(View.GONE);
                }
            }
        });


        f09b003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b003b.isChecked()) {
                    fldGrpf09b003.setVisibility(View.VISIBLE);
                    f09b004.requestFocus();
                } else {
                    f09b004.setText(null);
                    fldGrpf09b003.setVisibility(View.GONE);
                }
            }
        });


        f09b006.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b006b.isChecked()) {
                    fldGrpf09b006.setVisibility(View.VISIBLE);
                } else {
                    f09b007.clearCheck();
                    fldGrpf09b006.setVisibility(View.GONE);
                }
            }
        });


        f09b007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b007888.isChecked()) {
                    f09b007888x.setVisibility(View.VISIBLE);
                    f09b007888x.requestFocus();
                } else {
                    f09b007888x.setText(null);
                    f09b007888x.setVisibility(View.GONE);
                }
            }
        });

        f09b008.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b008b.isChecked()) {
                    fldGrpf09b008.setVisibility(View.VISIBLE);
                } else {
                    f09b009.clearCheck();
                    fldGrpf09b008.setVisibility(View.GONE);
                }
            }
        });


        f09b009888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (f09b009888.isChecked()) {
                    f09b009888x.setVisibility(View.VISIBLE);
                    f09b009888x.requestFocus();
                } else {
                    f09b009888x.setText(null);
                    f09b009888x.setVisibility(View.GONE);
                }
            }
        });


        f09b010888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (f09b010888.isChecked()) {
                    f09b010888x.setVisibility(View.VISIBLE);
                    f09b010888x.requestFocus();
                } else {
                    f09b010888x.setText(null);
                    f09b010888x.setVisibility(View.GONE);
                }
            }
        });


        f09b011.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b011b.isChecked()) {
                    f09b012.clearCheck();
                    f09b013.clearCheck();
                    f09b014.clearCheck();
                    f09b015.clearCheck();
                    f09b016.clearCheck();
                    f09b017.setText(null);
                    f09b018.clearCheck();

                    fldGrpf09b011.setVisibility(View.GONE);
                    fldGrpf09b022.setVisibility(View.VISIBLE);
                } else {
                    fldGrpf09b011.setVisibility(View.VISIBLE);

                    f09b019a.setChecked(false);
                    f09b019b.setChecked(false);
                    f09b019c.setChecked(false);
                    f09b019d.setChecked(false);
                    f09b019888.setChecked(false);

                    fldGrpf09b022.setVisibility(View.GONE);
                }
            }
        });

        f09b012.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b012b.isChecked()) {
                    f09b013.clearCheck();
                    f09b014.clearCheck();
                    f09b015.clearCheck();
                    f09b016.clearCheck();

                    fldGrpf09b012.setVisibility(View.GONE);
                } else {
                    fldGrpf09b012.setVisibility(View.VISIBLE);
                }
            }
        });


        f09b013.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b013b.isChecked()) {
                    f09b014.clearCheck();
                    f09b015.clearCheck();
                    f09b016.clearCheck();

                    fldGrpf09b013.setVisibility(View.GONE);
                } else {
                    fldGrpf09b013.setVisibility(View.VISIBLE);
                }
            }
        });


        f09b014.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b014b.isChecked()) {
                    f09b015.clearCheck();
                    f09b016.clearCheck();

                    fldGrpf09b014.setVisibility(View.GONE);
                } else {
                    fldGrpf09b014.setVisibility(View.VISIBLE);
                }
            }
        });


        f09b015.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b015b.isChecked()) {
                    f09b016.clearCheck();

                    fldGrpf09b015.setVisibility(View.GONE);
                } else {
                    fldGrpf09b015.setVisibility(View.VISIBLE);
                }
            }
        });

        f09b018.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (f09b018888.isChecked()) {
                    f09b018888x.setVisibility(View.VISIBLE);
                    f09b018888x.requestFocus();
                } else {
                    f09b018888x.setText(null);
                    f09b018888x.setVisibility(View.GONE);
                }
            }
        });


        f09b019888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (f09b019888.isChecked()) {
                    f09b019888x.setVisibility(View.VISIBLE);
                    f09b019888x.requestFocus();
                } else {
                    f09b019888x.setText(null);
                    f09b019888x.setVisibility(View.GONE);
                }
            }
        });


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
          // MainApp.fc.set_UUID(db.getForm5_UID(participantID));
            if(MainApp.fc.get_UUID().equals("") || MainApp.fc.get_UUID() == null) {
                MainApp.fc.set_UUID(db.getForm5_UID(participantID,MainApp.FORM5));
            }

        int updcount = db.updateF09();


        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

        //return true;

    }


    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        //f09hcwid
        if (f09hcwid.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09hcwid), Toast.LENGTH_SHORT).show();
            f09hcwid.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f09hcwid: This data is Required!");
            return false;
        } else {
            f09hcwid.setError(null);
        }


        //f09facid
        if (f09facid.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09facid), Toast.LENGTH_SHORT).show();
            f09facid.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f09facid: This data is Required!");
            return false;
        } else {
            f09facid.setError(null);
        }


        //f09gawk
        if (f09gawk.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09gawk), Toast.LENGTH_SHORT).show();
            f09gawk.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f09gawk: This data is Required!");
            return false;
        } else {
            f09gawk.setError(null);
        }


        //f09gad
        if (f09gad.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09gad), Toast.LENGTH_SHORT).show();
            f09gad.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f09gad: This data is Required!");
            return false;
        } else {
            f09gad.setError(null);
        }


        //f09a001
        if (f09a001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09a001), Toast.LENGTH_SHORT).show();
            f09a001a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "f09a001: This data is Required!");
            return false;
        } else {
            f09a001a.setError(null);
        }


        if (f09a001b.isChecked()) {

            //f09a002
            if (f09a002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09a002), Toast.LENGTH_SHORT).show();
                f09a002a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09a002: This data is Required!");
                return false;
            } else {
                f09a002a.setError(null);
            }


            if (f09a002888.isChecked()) {

                //f09a002888x
                if (f09a002888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f09a002888x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f09a002888x: This data is Required!");
                    return false;
                } else {
                    f09a002888x.setError(null);
                }

            }


        } else {


            //f09a003bg
            if (f09a003bg.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09a003bg), Toast.LENGTH_SHORT).show();
                f09a003bg01.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09a003bg: This data is Required!");
                return false;
            } else {
                f09a003bg01.setError(null);
            }


            //f09a003rh
            if (f09a003rh.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09a003rh), Toast.LENGTH_SHORT).show();
                f09a003rh01.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09a003rh: This data is Required!");
                return false;
            } else {
                f09a003rh01.setError(null);
            }


            //f09a004bg
            if (f09a004bg.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09a003bg), Toast.LENGTH_SHORT).show();
                f09a004bg01.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09a004bg: This data is Required!");
                return false;
            } else {
                f09a004bg01.setError(null);
            }


            //f09a004rh
            if (f09a004rh.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09a003rh), Toast.LENGTH_SHORT).show();
                f09a004rh01.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09a004bg: This data is Required!");
                return false;
            } else {
                f09a004rh01.setError(null);
            }


            //f09b001
            if (f09b001.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b001), Toast.LENGTH_SHORT).show();
                f09b001a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09b001: This data is Required!");
                return false;
            } else {
                f09b001a.setError(null);
            }


            //f09b002
            if (f09b002.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b002), Toast.LENGTH_SHORT).show();
                f09b002a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09b002: This data is Required!");
                return false;
            } else {
                f09b002a.setError(null);
            }


            //f09b003
            if (f09b003.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b003), Toast.LENGTH_SHORT).show();
                f09b003a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09b003: This data is Required!");
                return false;
            } else {
                f09b003a.setError(null);
            }


            if (f09b003b.isChecked()) {

                //f09b004
                if (f09b004.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b004), Toast.LENGTH_SHORT).show();
                    f09b004.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f09b004: This data is Required!");
                    return false;
                } else {
                    f09b004.setError(null);
                }

            }


            //f09b005
            if (f09b005.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b005), Toast.LENGTH_SHORT).show();
                f09b005a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09b005: This data is Required!");
                return false;
            } else {
                f09b005a.setError(null);
            }


            //f09b006
            if (f09b006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b006), Toast.LENGTH_SHORT).show();
                f09b006a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09b006: This data is Required!");
                return false;
            } else {
                f09b006a.setError(null);
            }


            if (f09b006b.isChecked()) {

                //f09b007
                if (f09b007.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b007), Toast.LENGTH_SHORT).show();
                    f09b007a.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f09b007: This data is Required!");
                    return false;
                } else {
                    f09b007a.setError(null);
                }


                if (f09b007888.isChecked()) {

                    //f09b007888x
                    if (f09b007888x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                        f09b007888x.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f09b007888x: This data is Required!");
                        return false;
                    } else {
                        f09b007888x.setError(null);
                    }

                }

            }


            //f09b008
            if (f09b008.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b008), Toast.LENGTH_SHORT).show();
                f09b008a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09b008: This data is Required!");
                return false;
            } else {
                f09b008a.setError(null);
            }


            if (f09b008b.isChecked()) {

                //f09b009
                if (f09b009.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b009), Toast.LENGTH_SHORT).show();
                    f09b009a.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f09b009: This data is Required!");
                    return false;
                } else {
                    f09b009a.setError(null);
                }


                if (f09b009888.isChecked()) {

                    //f09b009888x
                    if (f09b009888x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                        f09b009888x.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f09b009888x: This data is Required!");
                        return false;
                    } else {
                        f09b009888x.setError(null);
                    }

                }

            }


            //f09b010
            if (f09b010.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b010), Toast.LENGTH_SHORT).show();
                f09b010a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09b010: This data is Required!");
                return false;
            } else {
                f09b010a.setError(null);
            }


            if (f09b010888.isChecked()) {

                //f09b010888x
                if (f09b010888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    f09b010888x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f09b010888x: This data is Required!");
                    return false;
                } else {
                    f09b010888x.setError(null);
                }

            }


            //f09b011
            if (f09b011.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b011), Toast.LENGTH_SHORT).show();
                f09b011a.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "f09b011: This data is Required!");
                return false;
            } else {
                f09b011a.setError(null);
            }


            if (f09b011b.isChecked()) {

                //f09b019
                if (!f09b019a.isChecked() && !f09b019b.isChecked() && !f09b019c.isChecked()
                        && !f09b019d.isChecked()
                        && !f09b019888.isChecked()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b019), Toast.LENGTH_SHORT).show();
                    f09b019a.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f09b019: This data is Required!");
                    return false;
                } else {
                    f09b019a.setError(null);
                }


                if (f09b019888.isChecked()) {

                    //f09b019888x
                    if (f09b019888x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                        f09b019888x.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f09b019888x: This data is Required!");
                        return false;
                    } else {
                        f09b019888x.setError(null);
                    }

                }


            } else {

                //f09b012
                if (f09b012.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b012), Toast.LENGTH_SHORT).show();
                    f09b012a.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f09b012: This data is Required!");
                    return false;
                } else {
                    f09b012a.setError(null);
                }


                if (f09b012a.isChecked()) {

                    //f09b013
                    if (f09b013.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b013), Toast.LENGTH_SHORT).show();
                        f09b013a.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f09b013: This data is Required!");
                        return false;
                    } else {
                        f09b013a.setError(null);
                    }

                }


                if (f09b013a.isChecked()) {

                    //f09b014
                    if (f09b014.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b014), Toast.LENGTH_SHORT).show();
                        f09b014a.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f09b014: This data is Required!");
                        return false;
                    } else {
                        f09b014a.setError(null);
                    }

                }


                if (f09b014a.isChecked()) {

                    //f09b015
                    if (f09b015.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b015), Toast.LENGTH_SHORT).show();
                        f09b015a.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f09b015: This data is Required!");
                        return false;
                    } else {
                        f09b015a.setError(null);
                    }

                }


                if (f09b015a.isChecked()) {

                    //f09b016
                    if (f09b016.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b016), Toast.LENGTH_SHORT).show();
                        f09b016a.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f09b016: This data is Required!");
                        return false;
                    } else {
                        f09b016a.setError(null);
                    }

                }


                //f09b017
                if (f09b017.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b017), Toast.LENGTH_SHORT).show();
                    f09b017.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f09b017: This data is Required!");
                    return false;
                } else {
                    f09b017.setError(null);
                }


                //f09b018
                if (f09b018.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.f09b018), Toast.LENGTH_SHORT).show();
                    f09b018a.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "f09b018: This data is Required!");
                    return false;
                } else {
                    f09b018a.setError(null);
                }


                if (f09b018888.isChecked()) {

                    //f09b018
                    if (f09b018888x.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                        f09b018888x.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "f09b018888x: This data is Required!");
                        return false;
                    } else {
                        f09b018888x.setError(null);
                    }

                }

            }

        }

        return true;
    }


    private void SaveDraft() throws JSONException {
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.fc.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fc.setFormDate(dtToday);
        MainApp.fc.setUser(MainApp.userName);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        //MainApp.fc.setParticipantID(participantID.getText().toString());
        MainApp.fc.setFormType(MainApp.FORM9);
        MainApp.fc.setApp_version(MainApp.versionName + "." + MainApp.versionCode);
        MainApp.fc.setLmp(lmp);
        MainApp.fc.setRh_status(f09a003rh01.isChecked()?"1":"2");


        //SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

       /* MainApp.fec = new FetusContract();

        MainApp.fec.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fec.setUser(MainApp.userName);
        MainApp.fec.set_UUID(MainApp.fc.get_UID());
        MainApp.fec.setParticipantID(MainApp.fc.getParticipantID());
        MainApp.fec.setFormType(MainApp.fc.getFormType());
        MainApp.fec.setFormDate(MainApp.fc.getFormDate());
        MainApp.fec.setDeviceID(MainApp.fc.getDeviceID());*/


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
                : f09a002888.isChecked() ? "88"
                : 0);

        f9.put("f09a002888x", f09a002888x.getText().toString());


        f9.put("f09a003a", f09a003bg01.isChecked() ? "1"
                : f09a003bg02.isChecked() ? "2"
                : f09a003bg03.isChecked() ? "3"
                : f09a003bg04.isChecked() ? "4"
                : 0);


        f9.put("f09a003b", f09a003rh01.isChecked() ? "1"
                : f09a003rh02.isChecked() ? "2"
                : 0);


        f9.put("f09a004a", f09a004bg01.isChecked() ? "1"
                : f09a004bg02.isChecked() ? "2"
                : f09a004bg03.isChecked() ? "3"
                : f09a004bg04.isChecked() ? "4"
                : 0);


        f9.put("f09a004b", f09a004rh01.isChecked() ? "1"
                : f09a004rh02.isChecked() ? "2"
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
                : f09b009e.isChecked() ? "5"
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


        f9.put("f09b019a", f09b019a.isChecked() ? "1" : "0");
        f9.put("f09b019b", f09b019b.isChecked() ? "2" : "0");
        f9.put("f09b019c", f09b019c.isChecked() ? "3" : "0");
        f9.put("f09b019d", f09b019d.isChecked() ? "4" : "0");
        f9.put("f09b019888", f09b019888.isChecked() ? "888" : "0");


        f9.put("f09b019888x", f09b019888x.getText().toString());

        MainApp.fc.setF09(String.valueOf(f9));

    }

}