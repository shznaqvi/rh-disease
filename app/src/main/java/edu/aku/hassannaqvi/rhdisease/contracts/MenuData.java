package edu.aku.hassannaqvi.rhdisease.contracts;

import android.widget.ImageView;

import edu.aku.hassannaqvi.rhdisease.R;

public class MenuData {
    public static Integer[] mIcons = {
            R.drawable.screeningicon, R.drawable.ultrasound1,
            R.drawable.poct, R.drawable.prophylaxis,
            R.drawable.newborn, R.drawable.adverse,
            R.drawable.upload, R.drawable.download
    };
    public static String[] mName = {
            "screeningicon", "ultrasound1",
            "poct", "prophylaxis",
            "newborn", "adverse",
            "upload", "download"
    };

    public static ImageView[] mimgName = new ImageView[8];

    public static int mFormNum[]={5,8,9,10,11,15,0,1};
    public static String mFormName[]={"Screening","Ultrasound","POCT Acceptance","Prophylaxis","Newborn Assesment","Adverse Event","Upload","Download Data"};

}
