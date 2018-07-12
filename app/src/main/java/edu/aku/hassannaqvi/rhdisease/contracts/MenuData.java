package edu.aku.hassannaqvi.rhdisease.contracts;

import android.widget.ImageView;

import edu.aku.hassannaqvi.rhdisease.R;

public class MenuData {
    public static Integer[] mIcons = {
            R.drawable.screeningicon, R.drawable.ultrasound1,
            R.drawable.poct, R.drawable.prophylaxis,
            R.drawable.delivery, R.drawable.adverse,
            R.drawable.newborn,R.drawable.pw_uptake,
            R.drawable.upload, R.drawable.download
    };
    public static String[] mName = {
            "screeningicon", "ultrasound1",
            "poct", "prophylaxis",
            "delivery", "adverse",
            "newborn","pw_uptake",
            "upload", "download"
    };

    public static ImageView[] mimgName = new ImageView[10];

    public static int mFormNum[]={5,8,9,10,11,15,12,13,0,1};
    public static String mFormName[]={"Screening","Ultrasound","POCT Acceptance","Prophylaxis","Delivery Characteristics","Adverse Event","Newborn Assesment","PW Uptake","Upload","Download Data"};

}
