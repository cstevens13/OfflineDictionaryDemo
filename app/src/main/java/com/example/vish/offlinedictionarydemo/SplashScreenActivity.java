package com.example.vish.offlinedictionarydemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000; //declaring a variable SPLASH_TIME_OUT

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed (new Runnable() {
            @Override
            public void run() {
                Intent mainintent = new Intent(SplashScreenActivity.this, NextActivity.class);
                startActivity(mainintent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
    }

