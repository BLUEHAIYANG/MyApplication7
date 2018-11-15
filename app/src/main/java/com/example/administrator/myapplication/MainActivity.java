package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0,"apple");
        arrayList.add(0,"banana");
        arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana11");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"apple");
        arrayList.add(0,"banana");arrayList.add(0,"banana");
        arrayList.add(0,"banana");


        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        TextView textView = new TextView(this);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        textView.setText("hhhh");

        relativeLayout.addView(textView);
        Button button = (Button) findViewById(R.id.button_add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"firstButton",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
