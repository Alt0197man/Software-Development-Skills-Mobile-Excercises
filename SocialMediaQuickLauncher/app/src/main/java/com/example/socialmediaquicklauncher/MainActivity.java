package com.example.socialmediaquicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tries to launch an info screen activity within the same app
        Button aboutButton = (Button) findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AboutActivity.class);

                // pass information to the other activity
                startIntent.putExtra("com.example.socialmediaquicklauncher.SOMETHING", ";)");
                startActivity(startIntent);
            }
        });

        // Attempts to launch Instagram (an activity outside our app)
        Button IGButton = (Button)findViewById(R.id.IGButton);
        IGButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String IG = "http://www.instagram.com";
                Uri IGaddress = Uri.parse(IG);

                Intent gotoInsta = new Intent(Intent.ACTION_VIEW, IGaddress);
                if (gotoInsta.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoInsta);
                }
            }
        });

        // Attempts to launch Facebook
        Button FBButton = (Button)findViewById(R.id.FBButton);
        FBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FB = "http://www.facebook.com";
                Uri FBaddress = Uri.parse(FB);

                Intent gotoFB = new Intent(Intent.ACTION_VIEW, FBaddress);
                if (gotoFB.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoFB);
                }
            }
        });

        // TODO: Add functionality to TIKTOK button

        // TODO: Add functionality to Twitter button
    }
}