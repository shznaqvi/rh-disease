package edu.aku.hassannaqvi.rhdisease.activities.Form13;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import edu.aku.hassannaqvi.rhdisease.R;
import edu.aku.hassannaqvi.rhdisease.activities.OtherActivities.EndingActivity;
import edu.aku.hassannaqvi.rhdisease.core.DatabaseHelper;
import edu.aku.hassannaqvi.rhdisease.core.MainApp;
import edu.aku.hassannaqvi.rhdisease.databinding.ActivityF13Binding;
import edu.aku.hassannaqvi.rhdisease.validation.validatorClass;

public class F13Activity extends AppCompatActivity {
    ActivityF13Binding bi;
    private static final String TAG = F13Activity.class.getSimpleName();
    String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());
    Date date = new GregorianCalendar(2018, Calendar.JUNE, 27).getTime(); // as told by amjad bhai
    String fixedminDate = new SimpleDateFormat("dd/MM/yyyy").format(date);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_f13);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_f13);
        bi.setCallback(this);
        bi.f13exd.setManager(getSupportFragmentManager());
        bi.f13ext.setManager(getSupportFragmentManager());
        bi.f13ext.setTimeFormat("HH:mm");
        bi.f13exd.setMinDate(fixedminDate);
        bi.f13exd.setMaxDate(dateToday);
        //=================== bi.f13a001b ==============
        bi.f13a001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (bi.f13a001a.isChecked()) {
                    bi.fldGrp001.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrp001.setVisibility(View.GONE);
                    bi.f13a002a.setChecked(false);
                    bi.f13a002b.setChecked(false);
                    bi.f13a002c.setChecked(false);
                    bi.f13a002d.setChecked(false);
                    bi.f13a002e.setChecked(false);
                    bi.f13a002f.setChecked(false);
                    bi.f13a002g.setChecked(false);
                    bi.f13a002h.setChecked(false);
                    bi.f13a002i.setChecked(false);
                    bi.f13a002j.setChecked(false);
                    bi.f13a002k.setChecked(false);
                    bi.f13a002l.setChecked(false);
                    bi.f13a002m.setChecked(false);
                    bi.f13a002n.setChecked(false);
                    bi.f13a002777.setChecked(false);
                    bi.f13a002888.setChecked(false);
                    bi.f13a002999.setChecked(false);
                    bi.f13a002888x.setText(null);
                    bi.f13a003a.setChecked(false);
                    bi.f13a003b.setChecked(false);
                    bi.f13a003c.setChecked(false);
                    bi.f13a003d.setChecked(false);
                    bi.f13a003e.setChecked(false);
                    bi.f13a003f.setChecked(false);
                    bi.f13a003g.setChecked(false);
                    bi.f13a003h.setChecked(false);
                    bi.f13a003i.setChecked(false);
                    bi.f13a003j.setChecked(false);
                    bi.f13a003k.setChecked(false);
                    bi.f13a003l.setChecked(false);
                    bi.f13a003m.setChecked(false);
                    bi.f13a003n.setChecked(false);
                    bi.f13a003o.setChecked(false);
                    bi.f13a003p.setChecked(false);
                    bi.f13a003q.setChecked(false);
                    bi.f13a003777.setChecked(false);
                    bi.f13a003888.setChecked(false);
                    bi.f13a003999.setChecked(false);
                    bi.f13a003888x.setText(null);
                    bi.f13a004a.setChecked(false);
                    bi.f13a004b.setChecked(false);
                    bi.f13a004c.setChecked(false);
                    bi.f13a004d.setChecked(false);
                    bi.f13a004e.setChecked(false);
                    bi.f13a004f.setChecked(false);
                    bi.f13a004g.setChecked(false);
                    bi.f13a004h.setChecked(false);
                    bi.f13a004i.setChecked(false);
                    bi.f13a004j.setChecked(false);
                    bi.f13a004k.setChecked(false);
                    bi.f13a004l.setChecked(false);
                    bi.f13a004m.setChecked(false);
                    bi.f13a004n.setChecked(false);
                    bi.f13a004o.setChecked(false);
                    bi.f13a004777.setChecked(false);
                    bi.f13a004888.setChecked(false);
                    bi.f13a004999.setChecked(false);
                    bi.f13a004888x.setText(null);
                    bi.f13a005a.setChecked(false);
                    bi.f13a005b.setChecked(false);
                    bi.f13a005c.setChecked(false);
                    bi.f13a005d.setChecked(false);
                    bi.f13a005e.setChecked(false);
                    bi.f13a005f.setChecked(false);
                    bi.f13a005g.setChecked(false);
                    bi.f13a005h.setChecked(false);
                    bi.f13a005i.setChecked(false);
                    bi.f13a005j.setChecked(false);
                    bi.f13a005k.setChecked(false);
                    bi.f13a005l.setChecked(false);
                    bi.f13a005m.setChecked(false);
                    bi.f13a005n.setChecked(false);
                    bi.f13a005o.setChecked(false);
                    bi.f13a005777.setChecked(false);
                    bi.f13a005888.setChecked(false);
                    bi.f13a005999.setChecked(false);
                    bi.f13a005888x.setText(null);
                    bi.f13a006a.setChecked(false);
                    bi.f13a006b.setChecked(false);
                    bi.f13a006c.setChecked(false);
                    bi.f13a006d.setChecked(false);
                    bi.f13a006e.setChecked(false);
                    bi.f13a006f.setChecked(false);
                    bi.f13a006g.setChecked(false);
                    bi.f13a006777.setChecked(false);
                    bi.f13a006888.setChecked(false);
                    bi.f13a006999.setChecked(false);
                    bi.f13a006888x.setText(null);
                    bi.f13a007a.setChecked(false);
                    bi.f13a007b.setChecked(false);
                    bi.f13a007c.setChecked(false);
                    bi.f13a007d.setChecked(false);
                    bi.f13a007e.setChecked(false);
                    bi.f13a007f.setChecked(false);
                    bi.f13a007777.setChecked(false);
                    bi.f13a007888.setChecked(false);
                    bi.f13a007999.setChecked(false);
                    bi.f13a007888x.setText(null);
                    bi.f13a008a.setChecked(false);
                    bi.f13a008b.setChecked(false);
                    bi.f13a008c.setChecked(false);
                    bi.f13a008d.setChecked(false);
                    bi.f13a008e.setChecked(false);
                    bi.f13a008f.setChecked(false);
                    bi.f13a008g.setChecked(false);
                    bi.f13a008h.setChecked(false);
                    bi.f13a008i.setChecked(false);
                    bi.f13a008777.setChecked(false);
                    bi.f13a008888.setChecked(false);
                    bi.f13a008999.setChecked(false);
                    bi.f13a008888x.setText(null);
                    bi.f13a009.clearCheck();
                    bi.f13a009888x.setText(null);
                    bi.f13a010a.setChecked(false);
                    bi.f13a010b.setChecked(false);
                    bi.f13a010c.setChecked(false);
                    bi.f13a010d.setChecked(false);
                    bi.f13a010e.setChecked(false);
                    bi.f13a010777.setChecked(false);
                    bi.f13a010888.setChecked(false);
                    bi.f13a010999.setChecked(false);
                    bi.f13a010888x.setText(null);
                    bi.f13a011.clearCheck();
                    bi.f13a011888x.setText(null);
                    bi.f13a012a.setChecked(false);
                    bi.f13a012b.setChecked(false);
                    bi.f13a012c.setChecked(false);
                    bi.f13a012d.setChecked(false);
                    bi.f13a012e.setChecked(false);
                    bi.f13a012f.setChecked(false);
                    bi.f13a012g.setChecked(false);
                    bi.f13a012h.setChecked(false);
                    bi.f13a012i.setChecked(false);
                    bi.f13a012j.setChecked(false);
                    bi.f13a012k.setChecked(false);
                    bi.f13a012l.setChecked(false);
                    bi.f13a012m.setChecked(false);
                    bi.f13a012n.setChecked(false);
                    bi.f13a012o.setChecked(false);
                    bi.f13a012p.setChecked(false);
                    bi.f13a012q.setChecked(false);
                    bi.f13a012r.setChecked(false);
                    bi.f13a012777.setChecked(false);
                    bi.f13a012888.setChecked(false);
                    bi.f13a012999.setChecked(false);
                    bi.f13a012888x.setText(null);

                }
            }
        });
        bi.f13a012m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.fldGrp012.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrp012.setVisibility(View.GONE);
                }
            }
        });
        bi.f13a012n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.fldGrp012.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrp012.setVisibility(View.GONE);
                }
            }
        });

        //=================== bi.f13a002888 ==============
        bi.f13a002888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a002888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a002888x.setVisibility(View.GONE);
                    bi.f13a002888x.setText(null);
                }
            }
        });

        //=================== bi.f13a003888 ==============
        bi.f13a003888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a003888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a003888x.setVisibility(View.GONE);
                    bi.f13a003888x.setText(null);
                }
            }
        });

        //=================== bi.f13a004888 ==============
        bi.f13a004888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a004888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a004888x.setVisibility(View.GONE);
                    bi.f13a004888x.setText(null);
                }
            }
        });

        //=================== bi.f13a005888 ==============
        bi.f13a005888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a005888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a005888x.setVisibility(View.GONE);
                    bi.f13a005888x.setText(null);
                }
            }
        });

        //=================== bi.f13a006888 ==============
        bi.f13a006888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a006888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a006888x.setVisibility(View.GONE);
                    bi.f13a006888x.setText(null);
                }
            }
        });

        //=================== bi.f13a007888 ==============
        bi.f13a007888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a007888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a007888x.setVisibility(View.GONE);
                    bi.f13a007888x.setText(null);
                }
            }
        });

        //=================== bi.f13a008888 ==============
        bi.f13a008888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a008888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a008888x.setVisibility(View.GONE);
                    bi.f13a008888x.setText(null);
                }
            }
        });

        //=================== bi.f13a009888 ==============
        bi.f13a009888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a009888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a009888x.setVisibility(View.GONE);
                    bi.f13a009888x.setText(null);
                }
            }
        });

        //=================== bi.f13a010888 ==============
        bi.f13a010888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a010888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a010888x.setVisibility(View.GONE);
                    bi.f13a010888x.setText(null);
                }
            }
        });

        //=================== bi.f13a011888 ==============
        bi.f13a011888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a011888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a011888x.setVisibility(View.GONE);
                    bi.f13a011888x.setText(null);
                }
            }
        });


        //=================== bi.f13a012888 ==============
        bi.f13a012888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a012888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a012888x.setVisibility(View.GONE);
                    bi.f13a012888x.setText(null);
                }
            }
        });

        //=================== bi.f13a013888 ==============
        bi.f13a013888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a013888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a013888x.setVisibility(View.GONE);
                    bi.f13a013888x.setText(null);
                }
            }
        });

        //=================== bi.f13a015888 ==============
        bi.f13a015888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a015888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a015888x.setVisibility(View.GONE);
                    bi.f13a015888x.setText(null);
                }
            }
        });

        //=================== bi.f13a017888 ==============
        bi.f13a017888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a017888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a017888x.setVisibility(View.GONE);
                    bi.f13a017888x.setText(null);
                }
            }
        });

        //=================== bi.f13a019888 ==============
        bi.f13a019888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a019888x.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a019888x.setVisibility(View.GONE);
                    bi.f13a019888x.setText(null);
                }
            }
        });

        //=================== bi.f13a019ix ==============
        bi.f13a019i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.f13a019ix.setVisibility(View.VISIBLE);
                } else {
                    bi.f13a019ix.setVisibility(View.GONE);
                    bi.f13a019ix.setText(null);
                }
            }
        });


        //=================== bi.f13a012m ==============
        bi.f13a012m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.fldGrp012.setVisibility(View.VISIBLE);

                } else {
                    bi.fldGrp012.setVisibility(View.GONE);
                    bi.f13a013.clearCheck();
                    bi.f13a013888x.setText(null);

                }
            }
        });

        //=================== bi.f13a012n ==============
        bi.f13a012n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.fldGrp012.setVisibility(View.VISIBLE);

                } else if (bi.f13a012m.isChecked()) {
                    bi.fldGrp012.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrp012.setVisibility(View.GONE);
                    bi.f13a013.clearCheck();
                    bi.f13a013888x.setText(null);

                }
            }
        });


        //=================== bi.f13a014 ==============
        bi.f13a014.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (bi.f13a014a.isChecked()) {
                    bi.fldGrp014.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrp014.setVisibility(View.GONE);
                    bi.f13a015a.setChecked(false);
                    bi.f13a015b.setChecked(false);
                    bi.f13a015c.setChecked(false);
                    bi.f13a015d.setChecked(false);
                    bi.f13a015e.setChecked(false);
                    bi.f13a015f.setChecked(false);
                    bi.f13a015g.setChecked(false);
                    bi.f13a015777.setChecked(false);
                    bi.f13a015888.setChecked(false);
                    bi.f13a015999.setChecked(false);
                    bi.f13a015888x.setText(null);

                }
            }
        });

        //=================== bi.f13a016 ==============
        bi.f13a016.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (bi.f13a016a.isChecked()) {
                    bi.fldGrp016.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrp016.setVisibility(View.GONE);
                    bi.f13a017a.setChecked(false);
                    bi.f13a017b.setChecked(false);
                    bi.f13a017c.setChecked(false);
                    bi.f13a017d.setChecked(false);
                    bi.f13a017e.setChecked(false);
                    bi.f13a017f.setChecked(false);
                    bi.f13a017g.setChecked(false);
                    bi.f13a017h.setChecked(false);
                    bi.f13a017i.setChecked(false);
                    bi.f13a017j.setChecked(false);
                    bi.f13a017k.setChecked(false);
                    bi.f13a017l.setChecked(false);
                    bi.f13a017m.setChecked(false);
                    bi.f13a017n.setChecked(false);
                    bi.f13a017o.setChecked(false);
                    bi.f13a017p.setChecked(false);
                    bi.f13a017q.setChecked(false);
                    bi.f13a017777.setChecked(false);
                    bi.f13a017888.setChecked(false);
                    bi.f13a017888x.setText(null);

                }
            }
        });

        //=================== bi.f13a018 ==============
        bi.f13a018.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (bi.f13a018a.isChecked()) {
                    bi.fldGrp018.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrp018.setVisibility(View.GONE);
                    bi.f13a019a.setChecked(false);
                    bi.f13a019b.setChecked(false);
                    bi.f13a019c.setChecked(false);
                    bi.f13a019d.setChecked(false);
                    bi.f13a019e.setChecked(false);
                    bi.f13a019f.setChecked(false);
                    bi.f13a019g.setChecked(false);
                    bi.f13a019h.setChecked(false);
                    bi.f13a019i.setChecked(false);
                    bi.f13a019j.setChecked(false);
                    bi.f13a019777.setChecked(false);
                    bi.f13a019888.setChecked(false);
                    bi.f13a019888x.setText(null);
                    bi.f13a019ix.setText(null);

                }
            }
        });

        bi.f13a002999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a002a.setEnabled(false);
                    bi.f13a002b.setEnabled(false);
                    bi.f13a002c.setEnabled(false);
                    bi.f13a002d.setEnabled(false);
                    bi.f13a002e.setEnabled(false);
                    bi.f13a002f.setEnabled(false);
                    bi.f13a002g.setEnabled(false);
                    bi.f13a002h.setEnabled(false);
                    bi.f13a002i.setEnabled(false);
                    bi.f13a002j.setEnabled(false);
                    bi.f13a002k.setEnabled(false);
                    bi.f13a002l.setEnabled(false);
                    bi.f13a002m.setEnabled(false);
                    bi.f13a002n.setEnabled(false);
                    bi.f13a002777.setEnabled(false);
                    bi.f13a002888.setEnabled(false);
                    bi.f13a002a.setChecked(false);
                    bi.f13a002b.setChecked(false);
                    bi.f13a002c.setChecked(false);
                    bi.f13a002d.setChecked(false);
                    bi.f13a002e.setChecked(false);
                    bi.f13a002f.setChecked(false);
                    bi.f13a002g.setChecked(false);
                    bi.f13a002h.setChecked(false);
                    bi.f13a002i.setChecked(false);
                    bi.f13a002j.setChecked(false);
                    bi.f13a002k.setChecked(false);
                    bi.f13a002l.setChecked(false);
                    bi.f13a002m.setChecked(false);
                    bi.f13a002n.setChecked(false);
                    bi.f13a002777.setChecked(false);
                    bi.f13a002888.setChecked(false);
                    bi.f13a002888x.setText(null);

                } else {
                    bi.f13a002a.setEnabled(true);
                    bi.f13a002b.setEnabled(true);
                    bi.f13a002c.setEnabled(true);
                    bi.f13a002d.setEnabled(true);
                    bi.f13a002e.setEnabled(true);
                    bi.f13a002f.setEnabled(true);
                    bi.f13a002g.setEnabled(true);
                    bi.f13a002h.setEnabled(true);
                    bi.f13a002i.setEnabled(true);
                    bi.f13a002j.setEnabled(true);
                    bi.f13a002k.setEnabled(true);
                    bi.f13a002l.setEnabled(true);
                    bi.f13a002m.setEnabled(true);
                    bi.f13a002n.setEnabled(true);
                    bi.f13a002777.setEnabled(true);
                    bi.f13a002888.setEnabled(true);
                }
            }
        });

        bi.f13a002777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a002a.setEnabled(false);
                    bi.f13a002b.setEnabled(false);
                    bi.f13a002c.setEnabled(false);
                    bi.f13a002d.setEnabled(false);
                    bi.f13a002e.setEnabled(false);
                    bi.f13a002f.setEnabled(false);
                    bi.f13a002g.setEnabled(false);
                    bi.f13a002h.setEnabled(false);
                    bi.f13a002i.setEnabled(false);
                    bi.f13a002j.setEnabled(false);
                    bi.f13a002k.setEnabled(false);
                    bi.f13a002l.setEnabled(false);
                    bi.f13a002m.setEnabled(false);
                    bi.f13a002n.setEnabled(false);
                    bi.f13a002999.setEnabled(false);
                    bi.f13a002888.setEnabled(false);
                    bi.f13a002a.setChecked(false);
                    bi.f13a002b.setChecked(false);
                    bi.f13a002c.setChecked(false);
                    bi.f13a002d.setChecked(false);
                    bi.f13a002e.setChecked(false);
                    bi.f13a002f.setChecked(false);
                    bi.f13a002g.setChecked(false);
                    bi.f13a002h.setChecked(false);
                    bi.f13a002i.setChecked(false);
                    bi.f13a002j.setChecked(false);
                    bi.f13a002k.setChecked(false);
                    bi.f13a002l.setChecked(false);
                    bi.f13a002m.setChecked(false);
                    bi.f13a002n.setChecked(false);
                    bi.f13a002999.setChecked(false);
                    bi.f13a002888.setChecked(false);
                    bi.f13a002888x.setText(null);

                } else {
                    bi.f13a002a.setEnabled(true);
                    bi.f13a002b.setEnabled(true);
                    bi.f13a002c.setEnabled(true);
                    bi.f13a002d.setEnabled(true);
                    bi.f13a002e.setEnabled(true);
                    bi.f13a002f.setEnabled(true);
                    bi.f13a002g.setEnabled(true);
                    bi.f13a002h.setEnabled(true);
                    bi.f13a002i.setEnabled(true);
                    bi.f13a002j.setEnabled(true);
                    bi.f13a002k.setEnabled(true);
                    bi.f13a002l.setEnabled(true);
                    bi.f13a002m.setEnabled(true);
                    bi.f13a002n.setEnabled(true);
                    bi.f13a002999.setEnabled(true);
                    bi.f13a002888.setEnabled(true);
                }
            }
        });


        bi.f13a003999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a003a.setEnabled(false);
                    bi.f13a003b.setEnabled(false);
                    bi.f13a003c.setEnabled(false);
                    bi.f13a003d.setEnabled(false);
                    bi.f13a003e.setEnabled(false);
                    bi.f13a003f.setEnabled(false);
                    bi.f13a003g.setEnabled(false);
                    bi.f13a003h.setEnabled(false);
                    bi.f13a003i.setEnabled(false);
                    bi.f13a003j.setEnabled(false);
                    bi.f13a003k.setEnabled(false);
                    bi.f13a003l.setEnabled(false);
                    bi.f13a003m.setEnabled(false);
                    bi.f13a003n.setEnabled(false);
                    bi.f13a003o.setEnabled(false);
                    bi.f13a003p.setEnabled(false);
                    bi.f13a003q.setEnabled(false);
                    bi.f13a003777.setEnabled(false);
                    bi.f13a003888.setEnabled(false);
                    bi.f13a003a.setChecked(false);
                    bi.f13a003b.setChecked(false);
                    bi.f13a003c.setChecked(false);
                    bi.f13a003d.setChecked(false);
                    bi.f13a003e.setChecked(false);
                    bi.f13a003f.setChecked(false);
                    bi.f13a003g.setChecked(false);
                    bi.f13a003h.setChecked(false);
                    bi.f13a003i.setChecked(false);
                    bi.f13a003j.setChecked(false);
                    bi.f13a003k.setChecked(false);
                    bi.f13a003l.setChecked(false);
                    bi.f13a003m.setChecked(false);
                    bi.f13a003n.setChecked(false);
                    bi.f13a003o.setChecked(false);
                    bi.f13a003p.setChecked(false);
                    bi.f13a003q.setChecked(false);
                    bi.f13a003777.setChecked(false);
                    bi.f13a003888.setChecked(false);
                    bi.f13a003888x.setText(null);

                } else {
                    bi.f13a003a.setEnabled(true);
                    bi.f13a003b.setEnabled(true);
                    bi.f13a003c.setEnabled(true);
                    bi.f13a003d.setEnabled(true);
                    bi.f13a003e.setEnabled(true);
                    bi.f13a003f.setEnabled(true);
                    bi.f13a003g.setEnabled(true);
                    bi.f13a003h.setEnabled(true);
                    bi.f13a003i.setEnabled(true);
                    bi.f13a003j.setEnabled(true);
                    bi.f13a003k.setEnabled(true);
                    bi.f13a003l.setEnabled(true);
                    bi.f13a003m.setEnabled(true);
                    bi.f13a003n.setEnabled(true);
                    bi.f13a003o.setEnabled(true);
                    bi.f13a003p.setEnabled(true);
                    bi.f13a003q.setEnabled(true);
                    bi.f13a003777.setEnabled(true);
                    bi.f13a003888.setEnabled(true);

                }
            }
        });


        bi.f13a003777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a003a.setEnabled(false);
                    bi.f13a003b.setEnabled(false);
                    bi.f13a003c.setEnabled(false);
                    bi.f13a003d.setEnabled(false);
                    bi.f13a003e.setEnabled(false);
                    bi.f13a003f.setEnabled(false);
                    bi.f13a003g.setEnabled(false);
                    bi.f13a003h.setEnabled(false);
                    bi.f13a003i.setEnabled(false);
                    bi.f13a003j.setEnabled(false);
                    bi.f13a003k.setEnabled(false);
                    bi.f13a003l.setEnabled(false);
                    bi.f13a003m.setEnabled(false);
                    bi.f13a003n.setEnabled(false);
                    bi.f13a003o.setEnabled(false);
                    bi.f13a003p.setEnabled(false);
                    bi.f13a003q.setEnabled(false);
                    bi.f13a003888.setEnabled(false);
                    bi.f13a003999.setEnabled(false);
                    bi.f13a003a.setChecked(false);
                    bi.f13a003b.setChecked(false);
                    bi.f13a003c.setChecked(false);
                    bi.f13a003d.setChecked(false);
                    bi.f13a003e.setChecked(false);
                    bi.f13a003f.setChecked(false);
                    bi.f13a003g.setChecked(false);
                    bi.f13a003h.setChecked(false);
                    bi.f13a003i.setChecked(false);
                    bi.f13a003j.setChecked(false);
                    bi.f13a003k.setChecked(false);
                    bi.f13a003l.setChecked(false);
                    bi.f13a003m.setChecked(false);
                    bi.f13a003n.setChecked(false);
                    bi.f13a003o.setChecked(false);
                    bi.f13a003p.setChecked(false);
                    bi.f13a003q.setChecked(false);
                    bi.f13a003888.setChecked(false);
                    bi.f13a003888x.setText(null);
                    bi.f13a003999.setChecked(false);
                } else {
                    bi.f13a003a.setEnabled(true);
                    bi.f13a003b.setEnabled(true);
                    bi.f13a003c.setEnabled(true);
                    bi.f13a003d.setEnabled(true);
                    bi.f13a003e.setEnabled(true);
                    bi.f13a003f.setEnabled(true);
                    bi.f13a003g.setEnabled(true);
                    bi.f13a003h.setEnabled(true);
                    bi.f13a003i.setEnabled(true);
                    bi.f13a003j.setEnabled(true);
                    bi.f13a003k.setEnabled(true);
                    bi.f13a003l.setEnabled(true);
                    bi.f13a003m.setEnabled(true);
                    bi.f13a003n.setEnabled(true);
                    bi.f13a003o.setEnabled(true);
                    bi.f13a003p.setEnabled(true);
                    bi.f13a003q.setEnabled(true);
                    bi.f13a003888.setEnabled(true);
                    bi.f13a003999.setEnabled(true);
                }
            }
        });

        bi.f13a004999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a004a.setEnabled(false);
                    bi.f13a004b.setEnabled(false);
                    bi.f13a004c.setEnabled(false);
                    bi.f13a004d.setEnabled(false);
                    bi.f13a004e.setEnabled(false);
                    bi.f13a004f.setEnabled(false);
                    bi.f13a004g.setEnabled(false);
                    bi.f13a004h.setEnabled(false);
                    bi.f13a004i.setEnabled(false);
                    bi.f13a004j.setEnabled(false);
                    bi.f13a004k.setEnabled(false);
                    bi.f13a004l.setEnabled(false);
                    bi.f13a004m.setEnabled(false);
                    bi.f13a004n.setEnabled(false);
                    bi.f13a004o.setEnabled(false);
                    bi.f13a004777.setEnabled(false);
                    bi.f13a004888.setEnabled(false);
                    bi.f13a004a.setChecked(false);
                    bi.f13a004b.setChecked(false);
                    bi.f13a004c.setChecked(false);
                    bi.f13a004d.setChecked(false);
                    bi.f13a004e.setChecked(false);
                    bi.f13a004f.setChecked(false);
                    bi.f13a004g.setChecked(false);
                    bi.f13a004h.setChecked(false);
                    bi.f13a004i.setChecked(false);
                    bi.f13a004j.setChecked(false);
                    bi.f13a004k.setChecked(false);
                    bi.f13a004l.setChecked(false);
                    bi.f13a004m.setChecked(false);
                    bi.f13a004n.setChecked(false);
                    bi.f13a004o.setChecked(false);
                    bi.f13a004777.setChecked(false);
                    bi.f13a004888.setChecked(false);
                    bi.f13a004888x.setText(null);

                } else {
                    bi.f13a004a.setEnabled(true);
                    bi.f13a004b.setEnabled(true);
                    bi.f13a004c.setEnabled(true);
                    bi.f13a004d.setEnabled(true);
                    bi.f13a004e.setEnabled(true);
                    bi.f13a004f.setEnabled(true);
                    bi.f13a004g.setEnabled(true);
                    bi.f13a004h.setEnabled(true);
                    bi.f13a004i.setEnabled(true);
                    bi.f13a004j.setEnabled(true);
                    bi.f13a004k.setEnabled(true);
                    bi.f13a004l.setEnabled(true);
                    bi.f13a004m.setEnabled(true);
                    bi.f13a004n.setEnabled(true);
                    bi.f13a004o.setEnabled(true);
                    bi.f13a004777.setEnabled(true);
                    bi.f13a004888.setEnabled(true);

                }
            }
        });


        bi.f13a004777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a004a.setEnabled(false);
                    bi.f13a004b.setEnabled(false);
                    bi.f13a004c.setEnabled(false);
                    bi.f13a004d.setEnabled(false);
                    bi.f13a004e.setEnabled(false);
                    bi.f13a004f.setEnabled(false);
                    bi.f13a004g.setEnabled(false);
                    bi.f13a004h.setEnabled(false);
                    bi.f13a004i.setEnabled(false);
                    bi.f13a004j.setEnabled(false);
                    bi.f13a004k.setEnabled(false);
                    bi.f13a004l.setEnabled(false);
                    bi.f13a004m.setEnabled(false);
                    bi.f13a004n.setEnabled(false);
                    bi.f13a004o.setEnabled(false);
                    bi.f13a004888.setEnabled(false);
                    bi.f13a004999.setEnabled(false);
                    bi.f13a004a.setChecked(false);
                    bi.f13a004b.setChecked(false);
                    bi.f13a004c.setChecked(false);
                    bi.f13a004d.setChecked(false);
                    bi.f13a004e.setChecked(false);
                    bi.f13a004f.setChecked(false);
                    bi.f13a004g.setChecked(false);
                    bi.f13a004h.setChecked(false);
                    bi.f13a004i.setChecked(false);
                    bi.f13a004j.setChecked(false);
                    bi.f13a004k.setChecked(false);
                    bi.f13a004l.setChecked(false);
                    bi.f13a004m.setChecked(false);
                    bi.f13a004n.setChecked(false);
                    bi.f13a004o.setChecked(false);
                    bi.f13a004888.setChecked(false);
                    bi.f13a004888x.setText(null);
                    bi.f13a004999.setChecked(false);
                } else {
                    bi.f13a004a.setEnabled(true);
                    bi.f13a004b.setEnabled(true);
                    bi.f13a004c.setEnabled(true);
                    bi.f13a004d.setEnabled(true);
                    bi.f13a004e.setEnabled(true);
                    bi.f13a004f.setEnabled(true);
                    bi.f13a004g.setEnabled(true);
                    bi.f13a004h.setEnabled(true);
                    bi.f13a004i.setEnabled(true);
                    bi.f13a004j.setEnabled(true);
                    bi.f13a004k.setEnabled(true);
                    bi.f13a004l.setEnabled(true);
                    bi.f13a004m.setEnabled(true);
                    bi.f13a004n.setEnabled(true);
                    bi.f13a004o.setEnabled(true);
                    bi.f13a004888.setEnabled(true);
                    bi.f13a004999.setEnabled(true);
                }
            }
        });


        bi.f13a005999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a005a.setEnabled(false);
                    bi.f13a005b.setEnabled(false);
                    bi.f13a005c.setEnabled(false);
                    bi.f13a005d.setEnabled(false);
                    bi.f13a005e.setEnabled(false);
                    bi.f13a005f.setEnabled(false);
                    bi.f13a005g.setEnabled(false);
                    bi.f13a005h.setEnabled(false);
                    bi.f13a005i.setEnabled(false);
                    bi.f13a005j.setEnabled(false);
                    bi.f13a005k.setEnabled(false);
                    bi.f13a005l.setEnabled(false);
                    bi.f13a005m.setEnabled(false);
                    bi.f13a005n.setEnabled(false);
                    bi.f13a005o.setEnabled(false);
                    bi.f13a005777.setEnabled(false);
                    bi.f13a005888.setEnabled(false);
                    bi.f13a005a.setChecked(false);
                    bi.f13a005b.setChecked(false);
                    bi.f13a005c.setChecked(false);
                    bi.f13a005d.setChecked(false);
                    bi.f13a005e.setChecked(false);
                    bi.f13a005f.setChecked(false);
                    bi.f13a005g.setChecked(false);
                    bi.f13a005h.setChecked(false);
                    bi.f13a005i.setChecked(false);
                    bi.f13a005j.setChecked(false);
                    bi.f13a005k.setChecked(false);
                    bi.f13a005l.setChecked(false);
                    bi.f13a005m.setChecked(false);
                    bi.f13a005n.setChecked(false);
                    bi.f13a005o.setChecked(false);
                    bi.f13a005777.setChecked(false);
                    bi.f13a005888.setChecked(false);
                    bi.f13a005888x.setText(null);

                } else {
                    bi.f13a005a.setEnabled(true);
                    bi.f13a005b.setEnabled(true);
                    bi.f13a005c.setEnabled(true);
                    bi.f13a005d.setEnabled(true);
                    bi.f13a005e.setEnabled(true);
                    bi.f13a005f.setEnabled(true);
                    bi.f13a005g.setEnabled(true);
                    bi.f13a005h.setEnabled(true);
                    bi.f13a005i.setEnabled(true);
                    bi.f13a005j.setEnabled(true);
                    bi.f13a005k.setEnabled(true);
                    bi.f13a005l.setEnabled(true);
                    bi.f13a005m.setEnabled(true);
                    bi.f13a005n.setEnabled(true);
                    bi.f13a005o.setEnabled(true);
                    bi.f13a005777.setEnabled(true);
                    bi.f13a005888.setEnabled(true);

                }
            }
        });


        bi.f13a005777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a005a.setEnabled(false);
                    bi.f13a005b.setEnabled(false);
                    bi.f13a005c.setEnabled(false);
                    bi.f13a005d.setEnabled(false);
                    bi.f13a005e.setEnabled(false);
                    bi.f13a005f.setEnabled(false);
                    bi.f13a005g.setEnabled(false);
                    bi.f13a005h.setEnabled(false);
                    bi.f13a005i.setEnabled(false);
                    bi.f13a005j.setEnabled(false);
                    bi.f13a005k.setEnabled(false);
                    bi.f13a005l.setEnabled(false);
                    bi.f13a005m.setEnabled(false);
                    bi.f13a005n.setEnabled(false);
                    bi.f13a005o.setEnabled(false);
                    bi.f13a005888.setEnabled(false);
                    bi.f13a005999.setEnabled(false);
                    bi.f13a005a.setChecked(false);
                    bi.f13a005b.setChecked(false);
                    bi.f13a005c.setChecked(false);
                    bi.f13a005d.setChecked(false);
                    bi.f13a005e.setChecked(false);
                    bi.f13a005f.setChecked(false);
                    bi.f13a005g.setChecked(false);
                    bi.f13a005h.setChecked(false);
                    bi.f13a005i.setChecked(false);
                    bi.f13a005j.setChecked(false);
                    bi.f13a005k.setChecked(false);
                    bi.f13a005l.setChecked(false);
                    bi.f13a005m.setChecked(false);
                    bi.f13a005n.setChecked(false);
                    bi.f13a005o.setChecked(false);
                    bi.f13a005888.setChecked(false);
                    bi.f13a005888x.setText(null);
                    bi.f13a005999.setChecked(false);
                } else {
                    bi.f13a005a.setEnabled(true);
                    bi.f13a005b.setEnabled(true);
                    bi.f13a005c.setEnabled(true);
                    bi.f13a005d.setEnabled(true);
                    bi.f13a005e.setEnabled(true);
                    bi.f13a005f.setEnabled(true);
                    bi.f13a005g.setEnabled(true);
                    bi.f13a005h.setEnabled(true);
                    bi.f13a005i.setEnabled(true);
                    bi.f13a005j.setEnabled(true);
                    bi.f13a005k.setEnabled(true);
                    bi.f13a005l.setEnabled(true);
                    bi.f13a005m.setEnabled(true);
                    bi.f13a005n.setEnabled(true);
                    bi.f13a005o.setEnabled(true);
                    bi.f13a005888.setEnabled(true);
                    bi.f13a005999.setEnabled(true);
                }
            }
        });

        bi.f13a007999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a007a.setEnabled(false);
                    bi.f13a007b.setEnabled(false);
                    bi.f13a007c.setEnabled(false);
                    bi.f13a007d.setEnabled(false);
                    bi.f13a007e.setEnabled(false);
                    bi.f13a007f.setEnabled(false);
                    bi.f13a007777.setEnabled(false);
                    bi.f13a007888.setEnabled(false);
                    bi.f13a007a.setChecked(false);
                    bi.f13a007b.setChecked(false);
                    bi.f13a007c.setChecked(false);
                    bi.f13a007d.setChecked(false);
                    bi.f13a007e.setChecked(false);
                    bi.f13a007f.setChecked(false);
                    bi.f13a007777.setChecked(false);
                    bi.f13a007888.setChecked(false);
                    bi.f13a007888x.setText(null);

                } else {
                    bi.f13a007a.setEnabled(true);
                    bi.f13a007b.setEnabled(true);
                    bi.f13a007c.setEnabled(true);
                    bi.f13a007d.setEnabled(true);
                    bi.f13a007e.setEnabled(true);
                    bi.f13a007f.setEnabled(true);
                    bi.f13a007777.setEnabled(true);
                    bi.f13a007888.setEnabled(true);

                }
            }
        });


        bi.f13a007777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a007a.setEnabled(false);
                    bi.f13a007b.setEnabled(false);
                    bi.f13a007c.setEnabled(false);
                    bi.f13a007d.setEnabled(false);
                    bi.f13a007e.setEnabled(false);
                    bi.f13a007f.setEnabled(false);
                    bi.f13a007888.setEnabled(false);
                    bi.f13a007999.setEnabled(false);
                    bi.f13a007a.setChecked(false);
                    bi.f13a007b.setChecked(false);
                    bi.f13a007c.setChecked(false);
                    bi.f13a007d.setChecked(false);
                    bi.f13a007e.setChecked(false);
                    bi.f13a007f.setChecked(false);
                    bi.f13a007888.setChecked(false);
                    bi.f13a007888x.setText(null);
                    bi.f13a007999.setChecked(false);
                } else {
                    bi.f13a007a.setEnabled(true);
                    bi.f13a007b.setEnabled(true);
                    bi.f13a007c.setEnabled(true);
                    bi.f13a007d.setEnabled(true);
                    bi.f13a007e.setEnabled(true);
                    bi.f13a007f.setEnabled(true);
                    bi.f13a007888.setEnabled(true);
                    bi.f13a007999.setEnabled(true);
                }
            }
        });

        bi.f13a008999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a008a.setEnabled(false);
                    bi.f13a008b.setEnabled(false);
                    bi.f13a008c.setEnabled(false);
                    bi.f13a008d.setEnabled(false);
                    bi.f13a008e.setEnabled(false);
                    bi.f13a008f.setEnabled(false);
                    bi.f13a008g.setEnabled(false);
                    bi.f13a008h.setEnabled(false);
                    bi.f13a008i.setEnabled(false);
                    bi.f13a008777.setEnabled(false);
                    bi.f13a008888.setEnabled(false);
                    bi.f13a008a.setChecked(false);
                    bi.f13a008b.setChecked(false);
                    bi.f13a008c.setChecked(false);
                    bi.f13a008d.setChecked(false);
                    bi.f13a008e.setChecked(false);
                    bi.f13a008f.setChecked(false);
                    bi.f13a008g.setChecked(false);
                    bi.f13a008h.setChecked(false);
                    bi.f13a008i.setChecked(false);
                    bi.f13a008777.setChecked(false);
                    bi.f13a008888.setChecked(false);
                    bi.f13a008888x.setText(null);

                } else {
                    bi.f13a008a.setEnabled(true);
                    bi.f13a008b.setEnabled(true);
                    bi.f13a008c.setEnabled(true);
                    bi.f13a008d.setEnabled(true);
                    bi.f13a008e.setEnabled(true);
                    bi.f13a008f.setEnabled(true);
                    bi.f13a008g.setEnabled(true);
                    bi.f13a008h.setEnabled(true);
                    bi.f13a008i.setEnabled(true);
                    bi.f13a008777.setEnabled(true);
                    bi.f13a008888.setEnabled(true);

                }
            }
        });


        bi.f13a008777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a008a.setEnabled(false);
                    bi.f13a008b.setEnabled(false);
                    bi.f13a008c.setEnabled(false);
                    bi.f13a008d.setEnabled(false);
                    bi.f13a008e.setEnabled(false);
                    bi.f13a008f.setEnabled(false);
                    bi.f13a008g.setEnabled(false);
                    bi.f13a008h.setEnabled(false);
                    bi.f13a008i.setEnabled(false);
                    bi.f13a008888.setEnabled(false);
                    bi.f13a008999.setEnabled(false);
                    bi.f13a008a.setChecked(false);
                    bi.f13a008b.setChecked(false);
                    bi.f13a008c.setChecked(false);
                    bi.f13a008d.setChecked(false);
                    bi.f13a008e.setChecked(false);
                    bi.f13a008f.setChecked(false);
                    bi.f13a008g.setChecked(false);
                    bi.f13a008h.setChecked(false);
                    bi.f13a008i.setChecked(false);
                    bi.f13a008888.setChecked(false);
                    bi.f13a008888x.setText(null);
                    bi.f13a008999.setChecked(false);
                } else {
                    bi.f13a008a.setEnabled(true);
                    bi.f13a008b.setEnabled(true);
                    bi.f13a008c.setEnabled(true);
                    bi.f13a008d.setEnabled(true);
                    bi.f13a008e.setEnabled(true);
                    bi.f13a008f.setEnabled(true);
                    bi.f13a008g.setEnabled(true);
                    bi.f13a008h.setEnabled(true);
                    bi.f13a008i.setEnabled(true);
                    bi.f13a008888.setEnabled(true);
                    bi.f13a008999.setEnabled(true);
                }
            }
        });

        bi.f13a010999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a010a.setEnabled(false);
                    bi.f13a010b.setEnabled(false);
                    bi.f13a010c.setEnabled(false);
                    bi.f13a010d.setEnabled(false);
                    bi.f13a010e.setEnabled(false);
                    bi.f13a010777.setEnabled(false);
                    bi.f13a010888.setEnabled(false);
                    bi.f13a010a.setChecked(false);
                    bi.f13a010b.setChecked(false);
                    bi.f13a010c.setChecked(false);
                    bi.f13a010d.setChecked(false);
                    bi.f13a010e.setChecked(false);
                    bi.f13a010777.setChecked(false);
                    bi.f13a010888.setChecked(false);
                    bi.f13a010888x.setText(null);

                } else {
                    bi.f13a010a.setEnabled(true);
                    bi.f13a010b.setEnabled(true);
                    bi.f13a010c.setEnabled(true);
                    bi.f13a010d.setEnabled(true);
                    bi.f13a010e.setEnabled(true);
                    bi.f13a010777.setEnabled(true);
                    bi.f13a010888.setEnabled(true);

                }
            }
        });


        bi.f13a010777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a010a.setEnabled(false);
                    bi.f13a010b.setEnabled(false);
                    bi.f13a010c.setEnabled(false);
                    bi.f13a010d.setEnabled(false);
                    bi.f13a010e.setEnabled(false);
                    bi.f13a010888.setEnabled(false);
                    bi.f13a010999.setEnabled(false);
                    bi.f13a010a.setChecked(false);
                    bi.f13a010b.setChecked(false);
                    bi.f13a010c.setChecked(false);
                    bi.f13a010d.setChecked(false);
                    bi.f13a010e.setChecked(false);
                    bi.f13a010888.setChecked(false);
                    bi.f13a010888x.setText(null);
                    bi.f13a010999.setChecked(false);
                } else {
                    bi.f13a010a.setEnabled(true);
                    bi.f13a010b.setEnabled(true);
                    bi.f13a010c.setEnabled(true);
                    bi.f13a010d.setEnabled(true);
                    bi.f13a010e.setEnabled(true);
                    bi.f13a010888.setEnabled(true);
                    bi.f13a010999.setEnabled(true);
                }
            }
        });

        bi.f13a012q.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a012a.setEnabled(false);
                    bi.f13a012b.setEnabled(false);
                    bi.f13a012c.setEnabled(false);
                    bi.f13a012d.setEnabled(false);
                    bi.f13a012e.setEnabled(false);
                    bi.f13a012f.setEnabled(false);
                    bi.f13a012g.setEnabled(false);
                    bi.f13a012h.setEnabled(false);
                    bi.f13a012i.setEnabled(false);
                    bi.f13a012j.setEnabled(false);
                    bi.f13a012k.setEnabled(false);
                    bi.f13a012l.setEnabled(false);
                    bi.f13a012m.setEnabled(false);
                    bi.f13a012n.setEnabled(false);
                    bi.f13a012o.setEnabled(false);
                    bi.f13a012p.setEnabled(false);
                    bi.f13a012r.setEnabled(false);
                    bi.f13a012777.setEnabled(false);
                    bi.f13a012888.setEnabled(false);
                    bi.f13a012999.setEnabled(false);
                    bi.f13a012a.setChecked(false);
                    bi.f13a012b.setChecked(false);
                    bi.f13a012c.setChecked(false);
                    bi.f13a012d.setChecked(false);
                    bi.f13a012e.setChecked(false);
                    bi.f13a012f.setChecked(false);
                    bi.f13a012g.setChecked(false);
                    bi.f13a012h.setChecked(false);
                    bi.f13a012i.setChecked(false);
                    bi.f13a012j.setChecked(false);
                    bi.f13a012k.setChecked(false);
                    bi.f13a012l.setChecked(false);
                    bi.f13a012m.setChecked(false);
                    bi.f13a012n.setChecked(false);
                    bi.f13a012o.setChecked(false);
                    bi.f13a012p.setChecked(false);
                    bi.f13a012r.setChecked(false);
                    bi.f13a012777.setChecked(false);
                    bi.f13a012888.setChecked(false);
                    bi.f13a012999.setChecked(false);
                    bi.f13a012888x.setText(null);

                } else {
                    bi.f13a012a.setEnabled(true);
                    bi.f13a012b.setEnabled(true);
                    bi.f13a012c.setEnabled(true);
                    bi.f13a012d.setEnabled(true);
                    bi.f13a012e.setEnabled(true);
                    bi.f13a012f.setEnabled(true);
                    bi.f13a012g.setEnabled(true);
                    bi.f13a012h.setEnabled(true);
                    bi.f13a012i.setEnabled(true);
                    bi.f13a012j.setEnabled(true);
                    bi.f13a012k.setEnabled(true);
                    bi.f13a012l.setEnabled(true);
                    bi.f13a012m.setEnabled(true);
                    bi.f13a012n.setEnabled(true);
                    bi.f13a012o.setEnabled(true);
                    bi.f13a012p.setEnabled(true);
                    bi.f13a012r.setEnabled(true);
                    bi.f13a012777.setEnabled(true);
                    bi.f13a012888.setEnabled(true);
                    bi.f13a012999.setEnabled(true);
                }
            }
        });
        bi.f13a012999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a012a.setEnabled(false);
                    bi.f13a012b.setEnabled(false);
                    bi.f13a012c.setEnabled(false);
                    bi.f13a012d.setEnabled(false);
                    bi.f13a012e.setEnabled(false);
                    bi.f13a012f.setEnabled(false);
                    bi.f13a012g.setEnabled(false);
                    bi.f13a012h.setEnabled(false);
                    bi.f13a012i.setEnabled(false);
                    bi.f13a012j.setEnabled(false);
                    bi.f13a012k.setEnabled(false);
                    bi.f13a012l.setEnabled(false);
                    bi.f13a012m.setEnabled(false);
                    bi.f13a012n.setEnabled(false);
                    bi.f13a012o.setEnabled(false);
                    bi.f13a012p.setEnabled(false);
                    bi.f13a012q.setEnabled(false);
                    bi.f13a012r.setEnabled(false);
                    bi.f13a012777.setEnabled(false);
                    bi.f13a012888.setEnabled(false);
                    bi.f13a012a.setChecked(false);
                    bi.f13a012b.setChecked(false);
                    bi.f13a012c.setChecked(false);
                    bi.f13a012d.setChecked(false);
                    bi.f13a012e.setChecked(false);
                    bi.f13a012f.setChecked(false);
                    bi.f13a012g.setChecked(false);
                    bi.f13a012h.setChecked(false);
                    bi.f13a012i.setChecked(false);
                    bi.f13a012j.setChecked(false);
                    bi.f13a012k.setChecked(false);
                    bi.f13a012l.setChecked(false);
                    bi.f13a012m.setChecked(false);
                    bi.f13a012n.setChecked(false);
                    bi.f13a012o.setChecked(false);
                    bi.f13a012p.setChecked(false);
                    bi.f13a012q.setChecked(false);
                    bi.f13a012r.setChecked(false);
                    bi.f13a012777.setChecked(false);
                    bi.f13a012888.setChecked(false);
                    bi.f13a012888x.setText(null);

                } else {
                    bi.f13a012a.setEnabled(true);
                    bi.f13a012b.setEnabled(true);
                    bi.f13a012c.setEnabled(true);
                    bi.f13a012d.setEnabled(true);
                    bi.f13a012e.setEnabled(true);
                    bi.f13a012f.setEnabled(true);
                    bi.f13a012g.setEnabled(true);
                    bi.f13a012h.setEnabled(true);
                    bi.f13a012i.setEnabled(true);
                    bi.f13a012j.setEnabled(true);
                    bi.f13a012k.setEnabled(true);
                    bi.f13a012l.setEnabled(true);
                    bi.f13a012m.setEnabled(true);
                    bi.f13a012n.setEnabled(true);
                    bi.f13a012o.setEnabled(true);
                    bi.f13a012p.setEnabled(true);
                    bi.f13a012q.setEnabled(true);
                    bi.f13a012r.setEnabled(true);
                    bi.f13a012777.setEnabled(true);
                    bi.f13a012888.setEnabled(true);

                }
            }
        });


        bi.f13a012777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a012a.setEnabled(false);
                    bi.f13a012b.setEnabled(false);
                    bi.f13a012c.setEnabled(false);
                    bi.f13a012d.setEnabled(false);
                    bi.f13a012e.setEnabled(false);
                    bi.f13a012f.setEnabled(false);
                    bi.f13a012g.setEnabled(false);
                    bi.f13a012h.setEnabled(false);
                    bi.f13a012i.setEnabled(false);
                    bi.f13a012j.setEnabled(false);
                    bi.f13a012k.setEnabled(false);
                    bi.f13a012l.setEnabled(false);
                    bi.f13a012m.setEnabled(false);
                    bi.f13a012n.setEnabled(false);
                    bi.f13a012o.setEnabled(false);
                    bi.f13a012p.setEnabled(false);
                    bi.f13a012q.setEnabled(false);
                    bi.f13a012r.setEnabled(false);
                    bi.f13a012888.setEnabled(false);
                    bi.f13a012999.setEnabled(false);
                    bi.f13a012a.setChecked(false);
                    bi.f13a012b.setChecked(false);
                    bi.f13a012c.setChecked(false);
                    bi.f13a012d.setChecked(false);
                    bi.f13a012e.setChecked(false);
                    bi.f13a012f.setChecked(false);
                    bi.f13a012g.setChecked(false);
                    bi.f13a012h.setChecked(false);
                    bi.f13a012i.setChecked(false);
                    bi.f13a012j.setChecked(false);
                    bi.f13a012k.setChecked(false);
                    bi.f13a012l.setChecked(false);
                    bi.f13a012m.setChecked(false);
                    bi.f13a012n.setChecked(false);
                    bi.f13a012o.setChecked(false);
                    bi.f13a012p.setChecked(false);
                    bi.f13a012q.setChecked(false);
                    bi.f13a012r.setChecked(false);
                    bi.f13a012888.setChecked(false);
                    bi.f13a012888x.setText(null);
                    bi.f13a012999.setChecked(false);
                } else {
                    bi.f13a012a.setEnabled(true);
                    bi.f13a012b.setEnabled(true);
                    bi.f13a012c.setEnabled(true);
                    bi.f13a012d.setEnabled(true);
                    bi.f13a012e.setEnabled(true);
                    bi.f13a012f.setEnabled(true);
                    bi.f13a012g.setEnabled(true);
                    bi.f13a012h.setEnabled(true);
                    bi.f13a012i.setEnabled(true);
                    bi.f13a012j.setEnabled(true);
                    bi.f13a012k.setEnabled(true);
                    bi.f13a012l.setEnabled(true);
                    bi.f13a012m.setEnabled(true);
                    bi.f13a012n.setEnabled(true);
                    bi.f13a012o.setEnabled(true);
                    bi.f13a012p.setEnabled(true);
                    bi.f13a012q.setEnabled(true);
                    bi.f13a012r.setEnabled(true);
                    bi.f13a012888.setEnabled(true);
                    bi.f13a012999.setEnabled(true);
                }
            }
        });


        bi.f13a015999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a015a.setEnabled(false);
                    bi.f13a015b.setEnabled(false);
                    bi.f13a015c.setEnabled(false);
                    bi.f13a015d.setEnabled(false);
                    bi.f13a015e.setEnabled(false);
                    bi.f13a015f.setEnabled(false);
                    bi.f13a015g.setEnabled(false);
                    bi.f13a015777.setEnabled(false);
                    bi.f13a015888.setEnabled(false);
                    bi.f13a015a.setChecked(false);
                    bi.f13a015b.setChecked(false);
                    bi.f13a015c.setChecked(false);
                    bi.f13a015d.setChecked(false);
                    bi.f13a015e.setChecked(false);
                    bi.f13a015f.setChecked(false);
                    bi.f13a015g.setChecked(false);
                    bi.f13a015777.setChecked(false);
                    bi.f13a015888.setChecked(false);
                    bi.f13a015888x.setText(null);

                } else {
                    bi.f13a015a.setEnabled(true);
                    bi.f13a015b.setEnabled(true);
                    bi.f13a015c.setEnabled(true);
                    bi.f13a015d.setEnabled(true);
                    bi.f13a015e.setEnabled(true);
                    bi.f13a015f.setEnabled(true);
                    bi.f13a015g.setEnabled(true);
                    bi.f13a015777.setEnabled(true);
                    bi.f13a015888.setEnabled(true);

                }
            }
        });


        bi.f13a015777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a015a.setEnabled(false);
                    bi.f13a015b.setEnabled(false);
                    bi.f13a015c.setEnabled(false);
                    bi.f13a015d.setEnabled(false);
                    bi.f13a015e.setEnabled(false);
                    bi.f13a015f.setEnabled(false);
                    bi.f13a015g.setEnabled(false);
                    bi.f13a015888.setEnabled(false);
                    bi.f13a015999.setEnabled(false);
                    bi.f13a015a.setChecked(false);
                    bi.f13a015b.setChecked(false);
                    bi.f13a015c.setChecked(false);
                    bi.f13a015d.setChecked(false);
                    bi.f13a015e.setChecked(false);
                    bi.f13a015f.setChecked(false);
                    bi.f13a015g.setChecked(false);
                    bi.f13a015888.setChecked(false);
                    bi.f13a015888x.setText(null);
                    bi.f13a015999.setChecked(false);
                } else {
                    bi.f13a015a.setEnabled(true);
                    bi.f13a015b.setEnabled(true);
                    bi.f13a015c.setEnabled(true);
                    bi.f13a015d.setEnabled(true);
                    bi.f13a015e.setEnabled(true);
                    bi.f13a015f.setEnabled(true);
                    bi.f13a015g.setEnabled(true);
                    bi.f13a015888.setEnabled(true);
                    bi.f13a015999.setEnabled(true);
                }
            }
        });

        bi.f13a017777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bi.f13a017a.setEnabled(false);
                    bi.f13a017b.setEnabled(false);
                    bi.f13a017c.setEnabled(false);
                    bi.f13a017d.setEnabled(false);
                    bi.f13a017e.setEnabled(false);
                    bi.f13a017f.setEnabled(false);
                    bi.f13a017g.setEnabled(false);
                    bi.f13a017h.setEnabled(false);
                    bi.f13a017i.setEnabled(false);
                    bi.f13a017j.setEnabled(false);
                    bi.f13a017k.setEnabled(false);
                    bi.f13a017l.setEnabled(false);
                    bi.f13a017m.setEnabled(false);
                    bi.f13a017n.setEnabled(false);
                    bi.f13a017o.setEnabled(false);
                    bi.f13a017p.setEnabled(false);
                    bi.f13a017q.setEnabled(false);
                    bi.f13a017888.setEnabled(false);
                    bi.f13a017a.setChecked(false);
                    bi.f13a017b.setChecked(false);
                    bi.f13a017c.setChecked(false);
                    bi.f13a017d.setChecked(false);
                    bi.f13a017e.setChecked(false);
                    bi.f13a017f.setChecked(false);
                    bi.f13a017g.setChecked(false);
                    bi.f13a017h.setChecked(false);
                    bi.f13a017i.setChecked(false);
                    bi.f13a017j.setChecked(false);
                    bi.f13a017k.setChecked(false);
                    bi.f13a017l.setChecked(false);
                    bi.f13a017m.setChecked(false);
                    bi.f13a017n.setChecked(false);
                    bi.f13a017o.setChecked(false);
                    bi.f13a017p.setChecked(false);
                    bi.f13a017q.setChecked(false);
                    bi.f13a017888.setChecked(false);
                    bi.f13a017888x.setText(null);
                } else {
                    bi.f13a017a.setEnabled(true);
                    bi.f13a017b.setEnabled(true);
                    bi.f13a017c.setEnabled(true);
                    bi.f13a017d.setEnabled(true);
                    bi.f13a017e.setEnabled(true);
                    bi.f13a017f.setEnabled(true);
                    bi.f13a017g.setEnabled(true);
                    bi.f13a017h.setEnabled(true);
                    bi.f13a017i.setEnabled(true);
                    bi.f13a017j.setEnabled(true);
                    bi.f13a017k.setEnabled(true);
                    bi.f13a017l.setEnabled(true);
                    bi.f13a017m.setEnabled(true);
                    bi.f13a017n.setEnabled(true);
                    bi.f13a017o.setEnabled(true);
                    bi.f13a017p.setEnabled(true);
                    bi.f13a017q.setEnabled(true);
                    bi.f13a017888.setEnabled(true);
                }
            }
        });


    }

    /*
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
            }
        }*/
    public void BtnEnd() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.endActivity(this, this);
    }

    public void BtnContinue() {
        if (ValidateForm()) {
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

        int updcount = db.updatef13();

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

        JSONObject f13 = new JSONObject();

        f13.put("f13exd", bi.f13exd.getText().toString());
        f13.put("f13ext", bi.f13ext.getText().toString());
        f13.put("f13a000", bi.facilityName1.isChecked() ? "1" : bi.facilityName2.isChecked() ? "2" : "0");
        f13.put("f13a001", bi.f13a001a.isChecked() ? "1" : bi.f13a001b.isChecked() ? "2" : "0");
        f13.put("f13a002a", bi.f13a002a.isChecked() ? "1" : "0");
        f13.put("f13a002b", bi.f13a002b.isChecked() ? "2" : "0");
        f13.put("f13a002c", bi.f13a002c.isChecked() ? "3" : "0");
        f13.put("f13a002d", bi.f13a002d.isChecked() ? "4" : "0");
        f13.put("f13a002e", bi.f13a002e.isChecked() ? "5" : "0");
        f13.put("f13a002f", bi.f13a002f.isChecked() ? "6" : "0");
        f13.put("f13a002g", bi.f13a002g.isChecked() ? "7" : "0");
        f13.put("f13a002h", bi.f13a002h.isChecked() ? "8" : "0");
        f13.put("f13a002i", bi.f13a002i.isChecked() ? "9" : "0");
        f13.put("f13a002j", bi.f13a002j.isChecked() ? "10" : "0");
        f13.put("f13a002k", bi.f13a002k.isChecked() ? "11" : "0");
        f13.put("f13a002l", bi.f13a002l.isChecked() ? "12" : "0");
        f13.put("f13a002m", bi.f13a002m.isChecked() ? "13" : "0");
        f13.put("f13a002n", bi.f13a002n.isChecked() ? "14" : "0");
        f13.put("f13a002777", bi.f13a002777.isChecked() ? "777" : "0");
        f13.put("f13a002888", bi.f13a002888.isChecked() ? "888" : "0");
        f13.put("f13a002999", bi.f13a002999.isChecked() ? "999" : "0");
        f13.put("f13a002888x", bi.f13a002888x.getText().toString());
        f13.put("f13a003a", bi.f13a003a.isChecked() ? "1" : "0");
        f13.put("f13a003b", bi.f13a003b.isChecked() ? "2" : "0");
        f13.put("f13a003c", bi.f13a003c.isChecked() ? "3" : "0");
        f13.put("f13a003d", bi.f13a003d.isChecked() ? "4" : "0");
        f13.put("f13a003e", bi.f13a003e.isChecked() ? "5" : "0");
        f13.put("f13a003f", bi.f13a003f.isChecked() ? "6" : "0");
        f13.put("f13a003g", bi.f13a003g.isChecked() ? "7" : "0");
        f13.put("f13a003h", bi.f13a003h.isChecked() ? "8" : "0");
        f13.put("f13a003i", bi.f13a003i.isChecked() ? "9" : "0");
        f13.put("f13a003j", bi.f13a003j.isChecked() ? "10" : "0");
        f13.put("f13a003k", bi.f13a003k.isChecked() ? "11" : "0");
        f13.put("f13a003l", bi.f13a003l.isChecked() ? "12" : "0");
        f13.put("f13a003m", bi.f13a003m.isChecked() ? "13" : "0");
        f13.put("f13a003n", bi.f13a003n.isChecked() ? "14" : "0");
        f13.put("f13a003o", bi.f13a003o.isChecked() ? "15" : "0");
        f13.put("f13a003p", bi.f13a003p.isChecked() ? "16" : "0");
        f13.put("f13a003q", bi.f13a003q.isChecked() ? "17" : "0");
        f13.put("f13a003777", bi.f13a003777.isChecked() ? "777" : "0");
        f13.put("f13a003888", bi.f13a003888.isChecked() ? "888" : "0");
        f13.put("f13a003999", bi.f13a003999.isChecked() ? "999" : "0");
        f13.put("f13a003888x", bi.f13a003888x.getText().toString());
        f13.put("f13a004a", bi.f13a004a.isChecked() ? "1" : "0");
        f13.put("f13a004b", bi.f13a004b.isChecked() ? "2" : "0");
        f13.put("f13a004c", bi.f13a004c.isChecked() ? "3" : "0");
        f13.put("f13a004d", bi.f13a004d.isChecked() ? "4" : "0");
        f13.put("f13a004e", bi.f13a004e.isChecked() ? "5" : "0");
        f13.put("f13a004f", bi.f13a004f.isChecked() ? "6" : "0");
        f13.put("f13a004g", bi.f13a004g.isChecked() ? "7" : "0");
        f13.put("f13a004h", bi.f13a004h.isChecked() ? "8" : "0");
        f13.put("f13a004i", bi.f13a004i.isChecked() ? "9" : "0");
        f13.put("f13a004j", bi.f13a004j.isChecked() ? "10" : "0");
        f13.put("f13a004k", bi.f13a004k.isChecked() ? "11" : "0");
        f13.put("f13a004l", bi.f13a004l.isChecked() ? "12" : "0");
        f13.put("f13a004m", bi.f13a004m.isChecked() ? "13" : "0");
        f13.put("f13a004n", bi.f13a004n.isChecked() ? "14" : "0");
        f13.put("f13a004o", bi.f13a004o.isChecked() ? "15" : "0");
        f13.put("f13a004777", bi.f13a004777.isChecked() ? "777" : "0");
        f13.put("f13a004888", bi.f13a004888.isChecked() ? "888" : "0");
        f13.put("f13a004999", bi.f13a004999.isChecked() ? "999" : "0");
        f13.put("f13a004888x", bi.f13a004888x.getText().toString());
        f13.put("f13a005a", bi.f13a005a.isChecked() ? "1" : "0");
        f13.put("f13a005b", bi.f13a005b.isChecked() ? "2" : "0");
        f13.put("f13a005c", bi.f13a005c.isChecked() ? "3" : "0");
        f13.put("f13a005d", bi.f13a005d.isChecked() ? "4" : "0");
        f13.put("f13a005e", bi.f13a005e.isChecked() ? "5" : "0");
        f13.put("f13a005f", bi.f13a005f.isChecked() ? "6" : "0");
        f13.put("f13a005g", bi.f13a005g.isChecked() ? "7" : "0");
        f13.put("f13a005h", bi.f13a005h.isChecked() ? "8" : "0");
        f13.put("f13a005i", bi.f13a005i.isChecked() ? "9" : "0");
        f13.put("f13a005j", bi.f13a005j.isChecked() ? "10" : "0");
        f13.put("f13a005k", bi.f13a005k.isChecked() ? "11" : "0");
        f13.put("f13a005l", bi.f13a005l.isChecked() ? "12" : "0");
        f13.put("f13a005m", bi.f13a005m.isChecked() ? "13" : "0");
        f13.put("f13a005n", bi.f13a005n.isChecked() ? "14" : "0");
        f13.put("f13a005o", bi.f13a005o.isChecked() ? "15" : "0");
        f13.put("f13a005777", bi.f13a005777.isChecked() ? "777" : "0");
        f13.put("f13a005888", bi.f13a005888.isChecked() ? "888" : "0");
        f13.put("f13a005999", bi.f13a005999.isChecked() ? "999" : "0");
        f13.put("f13a005888x", bi.f13a005888x.getText().toString());
        f13.put("f13a006a", bi.f13a006a.isChecked() ? "1" : "0");
        f13.put("f13a006b", bi.f13a006b.isChecked() ? "2" : "0");
        f13.put("f13a006c", bi.f13a006c.isChecked() ? "3" : "0");
        f13.put("f13a006d", bi.f13a006d.isChecked() ? "4" : "0");
        f13.put("f13a006e", bi.f13a006e.isChecked() ? "5" : "0");
        f13.put("f13a006f", bi.f13a006f.isChecked() ? "6" : "0");
        f13.put("f13a006g", bi.f13a006g.isChecked() ? "7" : "0");
        f13.put("f13a006777", bi.f13a006777.isChecked() ? "777" : "0");
        f13.put("f13a006888", bi.f13a006888.isChecked() ? "888" : "0");
        f13.put("f13a006999", bi.f13a006999.isChecked() ? "999" : "0");
        f13.put("f13a006888x", bi.f13a006888x.getText().toString());
        f13.put("f13a007a", bi.f13a007a.isChecked() ? "1" : "0");
        f13.put("f13a007b", bi.f13a007b.isChecked() ? "2" : "0");
        f13.put("f13a007c", bi.f13a007c.isChecked() ? "3" : "0");
        f13.put("f13a007d", bi.f13a007d.isChecked() ? "4" : "0");
        f13.put("f13a007e", bi.f13a007e.isChecked() ? "5" : "0");
        f13.put("f13a007f", bi.f13a007f.isChecked() ? "6" : "0");
        f13.put("f13a007777", bi.f13a007777.isChecked() ? "777" : "0");
        f13.put("f13a007888", bi.f13a007888.isChecked() ? "888" : "0");
        f13.put("f13a007999", bi.f13a007999.isChecked() ? "999" : "0");
        f13.put("f13a007888x", bi.f13a007888x.getText().toString());
        f13.put("f13a008a", bi.f13a008a.isChecked() ? "1" : "0");
        f13.put("f13a008b", bi.f13a008b.isChecked() ? "2" : "0");
        f13.put("f13a008c", bi.f13a008c.isChecked() ? "3" : "0");
        f13.put("f13a008d", bi.f13a008d.isChecked() ? "4" : "0");
        f13.put("f13a008e", bi.f13a008e.isChecked() ? "5" : "0");
        f13.put("f13a008f", bi.f13a008f.isChecked() ? "6" : "0");
        f13.put("f13a008g", bi.f13a008g.isChecked() ? "7" : "0");
        f13.put("f13a008h", bi.f13a008h.isChecked() ? "8" : "0");
        f13.put("f13a008i", bi.f13a008i.isChecked() ? "9" : "0");
        f13.put("f13a008777", bi.f13a008777.isChecked() ? "777" : "0");
        f13.put("f13a008888", bi.f13a008888.isChecked() ? "888" : "0");
        f13.put("f13a008999", bi.f13a008999.isChecked() ? "999" : "0");
        f13.put("f13a008888x", bi.f13a008888x.getText().toString());
        f13.put("f13a009", bi.f13a009a.isChecked() ? "1" : bi.f13a009b.isChecked() ? "2" : bi.f13a009c.isChecked() ? "3" : bi.f13a009d.isChecked() ? "4" : bi.f13a009777.isChecked() ? "777" : bi.f13a009888.isChecked() ? "888" : bi.f13a009999.isChecked() ? "999" : "0");
        f13.put("f13a009888x", bi.f13a009888x.getText().toString());
        f13.put("f13a010a", bi.f13a010a.isChecked() ? "1" : "0");
        f13.put("f13a010b", bi.f13a010b.isChecked() ? "2" : "0");
        f13.put("f13a010c", bi.f13a010c.isChecked() ? "3" : "0");
        f13.put("f13a010d", bi.f13a010d.isChecked() ? "4" : "0");
        f13.put("f13a010e", bi.f13a010e.isChecked() ? "5" : "0");
        f13.put("f13a010777", bi.f13a010777.isChecked() ? "777" : "0");
        f13.put("f13a010888", bi.f13a010888.isChecked() ? "888" : "0");
        f13.put("f13a010999", bi.f13a010999.isChecked() ? "999" : "0");
        f13.put("f13a010888x", bi.f13a010888x.getText().toString());
        f13.put("f13a011", bi.f13a011a.isChecked() ? "1" : bi.f13a011b.isChecked() ? "2" : bi.f13a011c.isChecked() ? "3" : bi.f13a011d.isChecked() ? "4" : bi.f13a011e.isChecked() ? "5" : bi.f13a011f.isChecked() ? "6" : bi.f13a011888.isChecked() ? "888" : bi.f13a011999.isChecked() ? "999" : "0");
        f13.put("f13a011888x", bi.f13a011888x.getText().toString());
        f13.put("f13a012a", bi.f13a012a.isChecked() ? "1" : "0");
        f13.put("f13a012b", bi.f13a012b.isChecked() ? "2" : "0");
        f13.put("f13a012c", bi.f13a012c.isChecked() ? "3" : "0");
        f13.put("f13a012d", bi.f13a012d.isChecked() ? "4" : "0");
        f13.put("f13a012e", bi.f13a012e.isChecked() ? "5" : "0");
        f13.put("f13a012f", bi.f13a012f.isChecked() ? "6" : "0");
        f13.put("f13a012g", bi.f13a012g.isChecked() ? "7" : "0");
        f13.put("f13a012h", bi.f13a012h.isChecked() ? "8" : "0");
        f13.put("f13a012i", bi.f13a012i.isChecked() ? "9" : "0");
        f13.put("f13a012j", bi.f13a012j.isChecked() ? "10" : "0");
        f13.put("f13a012k", bi.f13a012k.isChecked() ? "11" : "0");
        f13.put("f13a012l", bi.f13a012l.isChecked() ? "12" : "0");
        f13.put("f13a012m", bi.f13a012m.isChecked() ? "13" : "0");
        f13.put("f13a012n", bi.f13a012n.isChecked() ? "14" : "0");
        f13.put("f13a012o", bi.f13a012o.isChecked() ? "15" : "0");
        f13.put("f13a012p", bi.f13a012p.isChecked() ? "16" : "0");
        f13.put("f13a012q", bi.f13a012q.isChecked() ? "17" : "0");
        f13.put("f13a012r", bi.f13a012r.isChecked() ? "18" : "0");
        f13.put("f13a012777", bi.f13a012777.isChecked() ? "777" : "0");
        f13.put("f13a012888", bi.f13a012888.isChecked() ? "888" : "0");
        f13.put("f13a012999", bi.f13a012999.isChecked() ? "999" : "0");
        f13.put("f13a012888x", bi.f13a012888x.getText().toString());
        f13.put("f13a013", bi.f13a013a.isChecked() ? "1" : bi.f13a013b.isChecked() ? "2" : bi.f13a013c.isChecked() ? "3" : bi.f13a013d.isChecked() ? "4" : bi.f13a013e.isChecked() ? "5" : bi.f13a013f.isChecked() ? "6" : bi.f13a013777.isChecked() ? "777" : bi.f13a013888.isChecked() ? "888" : bi.f13a013999.isChecked() ? "999" : "0");
        f13.put("f13a013888x", bi.f13a013888x.getText().toString());
        f13.put("f13a014", bi.f13a014a.isChecked() ? "1" : bi.f13a014b.isChecked() ? "2" : bi.f13a014999.isChecked() ? "999" : "0");
        f13.put("f13a015a", bi.f13a015a.isChecked() ? "1" : "0");
        f13.put("f13a015b", bi.f13a015b.isChecked() ? "2" : "0");
        f13.put("f13a015c", bi.f13a015c.isChecked() ? "3" : "0");
        f13.put("f13a015d", bi.f13a015d.isChecked() ? "4" : "0");
        f13.put("f13a015e", bi.f13a015e.isChecked() ? "5" : "0");
        f13.put("f13a015f", bi.f13a015f.isChecked() ? "6" : "0");
        f13.put("f13a015g", bi.f13a015g.isChecked() ? "7" : "0");
        f13.put("f13a015777", bi.f13a015777.isChecked() ? "777" : "0");
        f13.put("f13a015888", bi.f13a015888.isChecked() ? "888" : "0");
        f13.put("f13a015999", bi.f13a015999.isChecked() ? "999" : "0");
        f13.put("f13a015888x", bi.f13a015888x.getText().toString());
        f13.put("f13a016", bi.f13a016a.isChecked() ? "1" : bi.f13a016b.isChecked() ? "2" : bi.f13a016999.isChecked() ? "999" : "0");
        f13.put("f13a017a", bi.f13a017a.isChecked() ? "1" : "0");
        f13.put("f13a017b", bi.f13a017b.isChecked() ? "2" : "0");
        f13.put("f13a017c", bi.f13a017c.isChecked() ? "3" : "0");
        f13.put("f13a017d", bi.f13a017d.isChecked() ? "4" : "0");
        f13.put("f13a017e", bi.f13a017e.isChecked() ? "5" : "0");
        f13.put("f13a017f", bi.f13a017f.isChecked() ? "6" : "0");
        f13.put("f13a017g", bi.f13a017g.isChecked() ? "7" : "0");
        f13.put("f13a017h", bi.f13a017h.isChecked() ? "8" : "0");
        f13.put("f13a017i", bi.f13a017i.isChecked() ? "9" : "0");
        f13.put("f13a017j", bi.f13a017j.isChecked() ? "10" : "0");
        f13.put("f13a017k", bi.f13a017k.isChecked() ? "11" : "0");
        f13.put("f13a017l", bi.f13a017l.isChecked() ? "12" : "0");
        f13.put("f13a017m", bi.f13a017m.isChecked() ? "13" : "0");
        f13.put("f13a017n", bi.f13a017n.isChecked() ? "14" : "0");
        f13.put("f13a017o", bi.f13a017o.isChecked() ? "15" : "0");
        f13.put("f13a017p", bi.f13a017p.isChecked() ? "16" : "0");
        f13.put("f13a017q", bi.f13a017q.isChecked() ? "17" : "0");
        f13.put("f13a017777", bi.f13a017777.isChecked() ? "777" : "0");
        f13.put("f13a017888", bi.f13a017888.isChecked() ? "888" : "0");
        f13.put("f13a017888x", bi.f13a017888x.getText().toString());
        f13.put("f13a018", bi.f13a018a.isChecked() ? "1" : bi.f13a018b.isChecked() ? "2" : bi.f13a018999.isChecked() ? "999" : bi.f13a018777.isChecked() ? "777" : "0");
        f13.put("f13a019", bi.f13a019a.isChecked() ? "1" : bi.f13a019b.isChecked() ? "2" : bi.f13a019c.isChecked() ? "3" : bi.f13a019d.isChecked() ? "4" : bi.f13a019e.isChecked() ? "5" : bi.f13a019f.isChecked() ? "6" : bi.f13a019g.isChecked() ? "7" : bi.f13a019h.isChecked() ? "8" : bi.f13a019i.isChecked() ? "9" : bi.f13a019j.isChecked() ? "10" : bi.f13a019777.isChecked() ? "777" : bi.f13a019888.isChecked() ? "888" : "0");
        f13.put("f13a019888x", bi.f13a019888x.getText().toString());
        f13.put("f13a019ix", bi.f13a019ix.getText().toString());

        //setGPS();

        MainApp.fc.setF13(String.valueOf(f13));
        //MainApp.fc.setf13(String.valueOf(f13));


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        if (!validatorClass.EmptyTextBox(this, bi.f13exd, getString(R.string.f13exdt) + " " + getString(R.string.date))) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.f13ext, getString(R.string.f13exdt) + " " + getString(R.string.time))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.facilityName, bi.facilityName1, getString(R.string.f13a000))) {
            return false;
        }


        //=================== bi.f13a001 ==============
        if (bi.f13a001.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a001), Toast.LENGTH_SHORT).show();
            bi.f13a001b.setError("This data is Required!");
            Log.i(TAG, "bi.f13a001: This Data is Required!");
            return false;
        } else {
            bi.f13a001b.setError(null);
        }

        if (bi.f13a001a.isChecked()) {
            // ====================== bi.f13a002 ===================
            if (!(bi.f13a002a.isChecked() || bi.f13a002b.isChecked() || bi.f13a002c.isChecked() || bi.f13a002d.isChecked()
                    || bi.f13a002e.isChecked() || bi.f13a002f.isChecked() || bi.f13a002g.isChecked() || bi.f13a002h.isChecked()
                    || bi.f13a002i.isChecked() || bi.f13a002j.isChecked() || bi.f13a002k.isChecked() || bi.f13a002l.isChecked()
                    || bi.f13a002m.isChecked() || bi.f13a002n.isChecked() || bi.f13a002777.isChecked() || bi.f13a002888.isChecked() || bi.f13a002999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a002), Toast.LENGTH_LONG).show();
                bi.f13a002999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a002: This data is Required!");
                return false;
            } else {
                bi.f13a002999.setError(null);
            }

            if (bi.f13a002888.isChecked() && bi.f13a002888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a002) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a002888x.setError("This data is required");
                Log.d(TAG, " bi.f13a002888x :empty ");
                return false;
            } else {
                bi.f13a002888x.setError(null);
            }

            // ====================== bi.f13a003 ===================
            if (!(bi.f13a003a.isChecked() || bi.f13a003b.isChecked() || bi.f13a003c.isChecked() || bi.f13a003d.isChecked()
                    || bi.f13a003e.isChecked() || bi.f13a003f.isChecked() || bi.f13a003g.isChecked() || bi.f13a003h.isChecked()
                    || bi.f13a003i.isChecked() || bi.f13a003j.isChecked() || bi.f13a003k.isChecked() || bi.f13a003l.isChecked()
                    || bi.f13a003m.isChecked() || bi.f13a003n.isChecked() || bi.f13a003o.isChecked() || bi.f13a003p.isChecked()
                    || bi.f13a003q.isChecked() || bi.f13a003777.isChecked() || bi.f13a003888.isChecked() || bi.f13a003999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a003), Toast.LENGTH_LONG).show();
                bi.f13a003999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a003: This data is Required!");
                return false;
            } else {
                bi.f13a003999.setError(null);
            }

            if (bi.f13a003888.isChecked() && bi.f13a003888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a003) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a003888x.setError("This data is required");
                Log.d(TAG, " bi.f13a003888x :empty ");
                return false;
            } else {
                bi.f13a003888x.setError(null);
            }

            // ====================== bi.f13a004 ===================
            if (!(bi.f13a004a.isChecked() || bi.f13a004b.isChecked() || bi.f13a004c.isChecked() || bi.f13a004d.isChecked()
                    || bi.f13a004e.isChecked() || bi.f13a004f.isChecked() || bi.f13a004g.isChecked() || bi.f13a004h.isChecked()
                    || bi.f13a004i.isChecked() || bi.f13a004j.isChecked() || bi.f13a004k.isChecked() || bi.f13a004l.isChecked()
                    || bi.f13a004m.isChecked() || bi.f13a004n.isChecked() || bi.f13a004o.isChecked() || bi.f13a004777.isChecked() || bi.f13a004888.isChecked() || bi.f13a004999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a004), Toast.LENGTH_LONG).show();
                bi.f13a004999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a004: This data is Required!");
                return false;
            } else {
                bi.f13a004999.setError(null);
            }

            if (bi.f13a004888.isChecked() && bi.f13a004888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a004) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a004888x.setError("This data is required");
                Log.d(TAG, " bi.f13a004888x :empty ");
                return false;
            } else {
                bi.f13a004888x.setError(null);
            }

            // ====================== bi.f13a005 ===================
            if (!(bi.f13a005a.isChecked() || bi.f13a005b.isChecked() || bi.f13a005c.isChecked() || bi.f13a005d.isChecked()
                    || bi.f13a005e.isChecked() || bi.f13a005f.isChecked() || bi.f13a005g.isChecked() || bi.f13a005h.isChecked()
                    || bi.f13a005i.isChecked() || bi.f13a005j.isChecked() || bi.f13a005k.isChecked() || bi.f13a005l.isChecked()
                    || bi.f13a005m.isChecked() || bi.f13a005n.isChecked() || bi.f13a005o.isChecked() || bi.f13a005777.isChecked() || bi.f13a005888.isChecked() || bi.f13a005999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a005), Toast.LENGTH_LONG).show();
                bi.f13a005999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a005: This data is Required!");
                return false;
            } else {
                bi.f13a005999.setError(null);
            }

            if (bi.f13a005888.isChecked() && bi.f13a005888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a005) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a005888x.setError("This data is required");
                Log.d(TAG, " bi.f13a005888x :empty ");
                return false;
            } else {
                bi.f13a005888x.setError(null);
            }

            // ====================== bi.f13a006 ===================

            if (bi.f13a006.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a006), Toast.LENGTH_SHORT).show();
                bi.f13a006999.setError("This data is Required!");
                Log.i(TAG, "bi.f13a006: This Data is Required!");
                return false;
            } else {
                bi.f13a006999.setError(null);
            }

            if (bi.f13a006888.isChecked() && bi.f13a006888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a006) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a006888x.setError("This data is required");
                Log.d(TAG, " bi.f13a006888x :empty ");
                return false;
            } else {
                bi.f13a006888x.setError(null);
            }

            // ====================== bi.f13a007 ===================
            if (!(bi.f13a007a.isChecked() || bi.f13a007b.isChecked() || bi.f13a007c.isChecked() || bi.f13a007d.isChecked()
                    || bi.f13a007e.isChecked() || bi.f13a007f.isChecked() || bi.f13a007777.isChecked() || bi.f13a007888.isChecked() || bi.f13a007999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a007), Toast.LENGTH_LONG).show();
                bi.f13a007999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a007: This data is Required!");
                return false;
            } else {
                bi.f13a007999.setError(null);
            }

            if (bi.f13a007888.isChecked() && bi.f13a007888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a007) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a007888x.setError("This data is required");
                Log.d(TAG, " bi.f13a007888x :empty ");
                return false;
            } else {
                bi.f13a007888x.setError(null);
            }

            // ====================== bi.f13a008 ===================
            if (!(bi.f13a008a.isChecked() || bi.f13a008b.isChecked() || bi.f13a008c.isChecked() || bi.f13a008d.isChecked()
                    || bi.f13a008e.isChecked() || bi.f13a008f.isChecked() || bi.f13a008g.isChecked() || bi.f13a008h.isChecked()
                    || bi.f13a008i.isChecked() || bi.f13a008777.isChecked() || bi.f13a008888.isChecked() || bi.f13a008999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a008), Toast.LENGTH_LONG).show();
                bi.f13a008999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a008: This data is Required!");
                return false;
            } else {
                bi.f13a008999.setError(null);
            }

            if (bi.f13a008888.isChecked() && bi.f13a008888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a008) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a008888x.setError("This data is required");
                Log.d(TAG, " bi.f13a008888x :empty ");
                return false;
            } else {
                bi.f13a008888x.setError(null);
            }

            // ====================== bi.f13a009 ===================

            if (bi.f13a009.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a009), Toast.LENGTH_SHORT).show();
                bi.f13a009999.setError("This data is Required!");
                Log.i(TAG, "bi.f13a009: This Data is Required!");
                return false;
            } else {
                bi.f13a009999.setError(null);
            }

            if (bi.f13a009888.isChecked() && bi.f13a009888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a009) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a009888x.setError("This data is required");
                Log.d(TAG, " bi.f13a009888x :empty ");
                return false;
            } else {
                bi.f13a009888x.setError(null);
            }

            // ====================== bi.f13a010 ===================
            if (!(bi.f13a010a.isChecked() || bi.f13a010b.isChecked() || bi.f13a010c.isChecked() || bi.f13a010d.isChecked()
                    || bi.f13a010e.isChecked() || bi.f13a010777.isChecked() || bi.f13a010888.isChecked() || bi.f13a010999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a010), Toast.LENGTH_LONG).show();
                bi.f13a010999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a010: This data is Required!");
                return false;
            } else {
                bi.f13a010999.setError(null);
            }

            if (bi.f13a010888.isChecked() && bi.f13a010888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a010) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a010888x.setError("This data is required");
                Log.d(TAG, " bi.f13a010888x :empty ");
                return false;
            } else {
                bi.f13a010888x.setError(null);
            }

            // ====================== bi.f13a011 ===================

            if (bi.f13a011.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a011), Toast.LENGTH_SHORT).show();
                bi.f13a011999.setError("This data is Required!");
                Log.i(TAG, "bi.f13a011: This Data is Required!");
                return false;
            } else {
                bi.f13a011999.setError(null);
            }

            if (bi.f13a011888.isChecked() && bi.f13a011888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a011) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a011888x.setError("This data is required");
                Log.d(TAG, " bi.f13a011888x :empty ");
                return false;
            } else {
                bi.f13a011888x.setError(null);
            }


            // ====================== bi.f13a012 ===================
            if (!(bi.f13a012a.isChecked() || bi.f13a012b.isChecked() || bi.f13a012c.isChecked() || bi.f13a012d.isChecked()
                    || bi.f13a012e.isChecked() || bi.f13a012f.isChecked() || bi.f13a012g.isChecked() || bi.f13a012h.isChecked()
                    || bi.f13a012i.isChecked() || bi.f13a012j.isChecked() || bi.f13a012k.isChecked() || bi.f13a012l.isChecked()
                    || bi.f13a012m.isChecked() || bi.f13a012n.isChecked() || bi.f13a012o.isChecked() || bi.f13a012p.isChecked()
                    || bi.f13a012q.isChecked() || bi.f13a012r.isChecked() || bi.f13a012777.isChecked()
                    || bi.f13a012888.isChecked() || bi.f13a012999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a012), Toast.LENGTH_LONG).show();
                bi.f13a012999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a012: This data is Required!");
                return false;
            } else {
                bi.f13a012999.setError(null);
            }

            if (bi.f13a012888.isChecked() && bi.f13a012888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a012) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a012888x.setError("This data is required");
                Log.d(TAG, " bi.f13a012888x :empty ");
                return false;
            } else {
                bi.f13a012888x.setError(null);
            }

            if (bi.f13a012m.isChecked() || bi.f13a012n.isChecked()) {
                // ====================== bi.f13a013 ===================
                if (bi.f13a013.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a013), Toast.LENGTH_SHORT).show();
                    bi.f13a013999.setError("This data is Required!");
                    Log.i(TAG, "bi.f13a013: This Data is Required!");
                    return false;
                } else {
                    bi.f13a013999.setError(null);
                }

                if (bi.f13a013888.isChecked() && bi.f13a013888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a013) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                    bi.f13a013888x.setError("This data is required");
                    Log.d(TAG, " bi.f13a013888x :empty ");
                    return false;
                } else {
                    bi.f13a013888x.setError(null);
                }
            }

        }

        // ====================== bi.f13a014 ===================
        if (bi.f13a014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a014), Toast.LENGTH_SHORT).show();
            bi.f13a014999.setError("This data is Required!");
            Log.i(TAG, "bi.f13a014: This Data is Required!");
            return false;
        } else {
            bi.f13a014999.setError(null);
        }


        if (bi.f13a014a.isChecked()) {
            // ====================== bi.f13a015 ===================
            if (!(bi.f13a015a.isChecked() || bi.f13a015b.isChecked() || bi.f13a015c.isChecked() || bi.f13a015d.isChecked()
                    || bi.f13a015e.isChecked() || bi.f13a015f.isChecked() || bi.f13a015g.isChecked() || bi.f13a015777.isChecked()
                    || bi.f13a015888.isChecked() || bi.f13a015999.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a015), Toast.LENGTH_LONG).show();
                bi.f13a015999.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a015: This data is Required!");
                return false;
            } else {
                bi.f13a015999.setError(null);
            }

            if (bi.f13a015888.isChecked() && bi.f13a015888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a015) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a015888x.setError("This data is required");
                Log.d(TAG, " bi.f13a015888x :empty ");
                return false;
            } else {
                bi.f13a015888x.setError(null);
            }
        }
        // ====================== bi.f13a016 ===================
        if (bi.f13a016.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a016), Toast.LENGTH_SHORT).show();
            bi.f13a016999.setError("This data is Required!");
            Log.i(TAG, "bi.f13a016: This Data is Required!");
            return false;
        } else {
            bi.f13a016999.setError(null);
        }

        if (bi.f13a016a.isChecked()) {
            // ====================== bi.f13a017 ===================
            if (!(bi.f13a017a.isChecked() || bi.f13a017b.isChecked() || bi.f13a017c.isChecked() || bi.f13a017d.isChecked()
                    || bi.f13a017e.isChecked() || bi.f13a017f.isChecked() || bi.f13a017g.isChecked() || bi.f13a017h.isChecked()
                    || bi.f13a017i.isChecked() || bi.f13a017j.isChecked() || bi.f13a017k.isChecked() || bi.f13a017l.isChecked()
                    || bi.f13a017m.isChecked() || bi.f13a017n.isChecked() || bi.f13a017o.isChecked() || bi.f13a017p.isChecked()
                    || bi.f13a017q.isChecked() || bi.f13a017777.isChecked()
                    || bi.f13a017888.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.f13a017), Toast.LENGTH_LONG).show();
                bi.f13a017888.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "bi.f13a017: This data is Required!");
                return false;
            } else {
                bi.f13a017888.setError(null);
            }

            if (bi.f13a017888.isChecked() && bi.f13a017888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a017) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a017888x.setError("This data is required");
                Log.d(TAG, " bi.f13a017888x :empty ");
                return false;
            } else {
                bi.f13a017888x.setError(null);
            }
        }

        // ====================== bi.f13a018 ===================
        if (bi.f13a018.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a018), Toast.LENGTH_SHORT).show();
            bi.f13a018777.setError("This data is Required!");
            Log.i(TAG, "bi.f13a018: This Data is Required!");
            return false;
        } else {
            bi.f13a018777.setError(null);
        }

        if (bi.f13a018a.isChecked()) {
            // ====================== bi.f13a019 ===================
            if (bi.f13a019.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a019), Toast.LENGTH_SHORT).show();
                bi.f13a019888.setError("This data is Required!");
                Log.i(TAG, "bi.f13a019: This Data is Required!");
                return false;
            } else {
                bi.f13a019888.setError(null);
            }

            if (bi.f13a019888.isChecked() && bi.f13a019888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a019) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                bi.f13a019888x.setError("This data is required");
                Log.d(TAG, " bi.f13a019888x :empty ");
                return false;
            } else {
                bi.f13a019888x.setError(null);
            }

            if (bi.f13a019i.isChecked() && bi.f13a019ix.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.f13a019) + " - " + getString(R.string.f13a019ix), Toast.LENGTH_SHORT).show();
                bi.f13a019ix.setError("This data is required");
                Log.d(TAG, " bi.f13a019ix :empty ");
                return false;
            } else {
                bi.f13a019ix.setError(null);
            }
        }


        return true;

    }

}
