package com.example.radimatoflinedatabase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter1 extends BaseAdapter {

    MainActivity1 mainActivity1;
    ArrayList model_id,model_name,model_base_price;
    public adapter1(MainActivity1 mainActivity1, ArrayList model_id, ArrayList model_name, ArrayList model_base_price) {

        this.mainActivity1=mainActivity1;
        this.model_id=model_id;
        this.model_name=model_name;
        this.model_base_price=model_base_price;

    }

    @Override
    public int getCount() {
        return model_id.size();
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

        view= LayoutInflater.from(mainActivity1).inflate(R.layout.item2,viewGroup,false);
        TextView textView =view.findViewById(R.id.text);
        TextView textView1 =view.findViewById(R.id.text1);
        TextView textView2 =view.findViewById(R.id.text2);

        textView.setText(model_id.get(i).toString());
        textView1.setText(model_name.get(i).toString());
        textView2.setText(model_base_price.get(i).toString());

        return view;
    }
}
