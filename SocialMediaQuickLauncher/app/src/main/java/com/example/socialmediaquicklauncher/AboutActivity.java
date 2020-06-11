package com.example.socialmediaquicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        if (getIntent().hasExtra("com.example.socialmediaquicklauncher.SOMETHING")) {
            TextView hiddenTextView = (TextView)findViewById(R.id.hiddenTextView);
            String text = getIntent().getExtras().getString("com.example.socialmediaquicklauncher.SOMETHING");
            hiddenTextView.setText(text);
        }
    }
}