package com.example.raga.belajarlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] namapemain = {
            "aubameyang",
            "dybala",
            "ibrahimovic",
            "luiz suares",
            "k.mbappe",
            "messi",
            "neymar",
            "ozil",
            "pogba",
            "reus",
            "ronaldo",
            "rooney",

    };

//    String[] subtitle = {
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//            "decripsi pemain ",
//
//    };



    ListView listview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview1 =(ListView)findViewById(R.id.list1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, namapemain);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subtitle);
        listview1.setAdapter(arrayAdapter);

    }
}
