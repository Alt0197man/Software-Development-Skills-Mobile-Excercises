package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    String[] items;
    String[] durations;
    String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        items = res.getStringArray(R.array.activities);
        durations = res.getStringArray(R.array.durations);
        descriptions = res.getStringArray(R.array.decriptions);

        ItemAdapter itemAdapter = new ItemAdapter(this, items, durations, descriptions);
        myListView.setAdapter(itemAdapter);

    }
}