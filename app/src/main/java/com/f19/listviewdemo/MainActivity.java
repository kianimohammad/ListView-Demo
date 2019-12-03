package com.f19.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView daysList = findViewById(R.id.daysList);
/*
* adding a data model for the week days
* we can add the data in string.xml file
* take a look at there
* */
//        final String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
/*
* adapter is a bridge to connect the data to our string array
* here we are using array adapter*/
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, days);



//        daysList.setAdapter(adapter);

        daysList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("week day", "Happy " + parent.getItemAtPosition(position));
            }
        });
    }
}
