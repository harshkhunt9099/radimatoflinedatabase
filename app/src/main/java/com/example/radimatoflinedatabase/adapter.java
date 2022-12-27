package com.example.radimatoflinedatabase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends BaseAdapter {
    MainActivity mainActivity;
    ArrayList brand_id,brand_name;

    public adapter(MainActivity mainActivity, ArrayList brand_id, ArrayList brand_name) {

        this.mainActivity=mainActivity;
        this.brand_id=brand_id;
        this.brand_name=brand_name;

    }

    @Override
    public int getCount() {
        return brand_name.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view= LayoutInflater.from(mainActivity).inflate(R.layout.item1,viewGroup,false);
        TextView textView =view.findViewById(R.id.text);
        TextView textView1 =view.findViewById(R.id.text1);

        textView.setText(brand_id.get(i).toString());
        textView1.setText(brand_name.get(i).toString());

        return view;
    }
}
