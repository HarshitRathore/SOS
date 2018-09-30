package com.example.window.intermediatemodule;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    private static final int Splash_Display_Length = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Creating intent that will start the login activity
                Intent mainIntent=new Intent(Splash.this, StartDriving.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, Splash_Display_Length);
    }
}
