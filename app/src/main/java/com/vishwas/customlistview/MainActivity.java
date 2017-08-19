package com.vishwas.customlistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // declaring variables
    ListView myView;
    Context context;
    ArrayList progList;

    //creating arrays for name and numbers
    public static String[]name={"Vishwas","Nitish","Bhawani","Mithun",
            "Varun","Amit","Raju","Pradeep"};
    public static String[]number={"8447708327","880008781","9654113690","7421004821",
            "8470113366","9532666662","8287277772","8448882288"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    // creating MyListAdapter and passing context and arrays
        MyListAdapter adapter=new MyListAdapter(this,name,number);
        myView =(ListView)findViewById(R.id.listView);
        myView.setAdapter(adapter);
        // in here creating a setOnItemClickListener
        myView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Contact with "+name[position],Toast.LENGTH_LONG).show();
            }
        });

    }

}
