package com.example.radimatoflinedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {
    ListView listView;
    ArrayList model_id,model_name,model_base_price;
    String brand_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        listView=findViewById(R.id.list1);
        model_id=new ArrayList();
        model_name=new ArrayList();
        model_base_price=new ArrayList();

        brand_id=getIntent().getStringExtra("brand_id");
        DataBaseHelper mydb = new DataBaseHelper(this);

        Cursor c = mydb.getmodel(Integer.parseInt(brand_id));

        while (c.moveToNext())
        {
            model_id.add(c.getInt(0));
            model_name.add(c.getString(1));
            model_base_price.add(c.getString(2));
        }

        adapter1 adapter = new adapter1(this,model_id,model_name,model_base_price);
        listView.setAdapter(adapter);

    }
}