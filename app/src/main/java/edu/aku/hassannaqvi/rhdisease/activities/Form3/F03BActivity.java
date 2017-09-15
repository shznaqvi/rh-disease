package edu.aku.hassannaqvi.rhdisease.activities.Form3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.rhdisease.R;

public class F03BActivity extends Activity
{

    @BindView(R.id.fldGrpEligible)
    LinearLayout fldGrpEligible;
    @BindView(R.id.f03a010)
    RadioGroup f03a010;
    @BindView(R.id.f03a010a)
    RadioButton f03a010a;
    @BindView(R.id.f03a010b)
    RadioButton f03a010b;
    @BindView(R.id.fldGrpf03a011)
    LinearLayout fldGrpf03a011;
    @BindView(R.id.f03a011)
    RadioGroup f03a011;
    @BindView(R.id.f03a011a)
    RadioButton f03a011a;
    @BindView(R.id.f03a011b)
    RadioButton f03a011b;
    @BindView(R.id.f03a011888)
    RadioButton f03a011888;
    @BindView(R.id.f03a011999)
    RadioButton f03a011999;
    @BindView(R.id.f03a011888x)
    EditText f03a011888x;
    @BindView(R.id.fldGrpf03a012)
    LinearLayout fldGrpf03a012;
    @BindView(R.id.f03a012)
    RadioGroup f03a012;
    @BindView(R.id.f03a012a)
    RadioButton f03a012a;
    @BindView(R.id.f03a012b)
    RadioButton f03a012b;
    @BindView(R.id.participantID)
    EditText participantID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f03_b);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }


}
