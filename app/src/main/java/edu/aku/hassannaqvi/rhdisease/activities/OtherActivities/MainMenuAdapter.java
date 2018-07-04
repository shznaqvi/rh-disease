package edu.aku.hassannaqvi.rhdisease.activities.OtherActivities;

import android.content.Context;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import edu.aku.hassannaqvi.rhdisease.contracts.MenuData;

import edu.aku.hassannaqvi.rhdisease.R;

public class MainMenuAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;

    public MainMenuAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return MenuData.mIcons.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return MenuData.mIcons.length;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
ViewHolder holder;

        if(view == null){
            inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            view = inflater.inflate(R.layout.main_menu_adapter,viewGroup,false);
           // view = LayoutInflater.from(context).inflate(R.layout.main_menu_adapter,viewGroup,false);





            holder = new ViewHolder();
            holder.formName = view.findViewById(R.id.tv_form_name);
            holder.formNum = view.findViewById(R.id.tv_form_num);
            holder.imgIcon = view.findViewById(R.id.img_icon);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        if (MenuData.mFormNum[i] != 0 && MenuData.mFormNum[i] != 1) {
            holder.formNum.setText("Form "+MenuData.mFormNum[i]);
        }else {
            holder.formNum.setText(" ");
        }
        holder.formName.setText(MenuData.mFormName[i]);
//        holder.imgIcon.setImageResource(MenuData.mIcons[i]);
com.bumptech.glide.Glide.with(context).load(getImage(MenuData.mName[i])).into(holder.imgIcon);

        if (MenuData.mFormNum[i] == 0 || MenuData.mFormNum[i] == 1) {
            holder.formName.setBackgroundColor((ContextCompat.getColor(context, R.color.mintDark)));
        }

      return view;
    }
    public class ViewHolder{
        public ImageView imgIcon;
        public TextView formNum,formName;

    }
    public int getImage(String imageName) {

    int drawableResourceId = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());

    return drawableResourceId;
}
}
