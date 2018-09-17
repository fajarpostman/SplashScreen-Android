package com.example.fajar.digilibumb;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

       
        new CountDownTimer(5000, 1000){ //ContDown Timer with the formaat is milisecond

            @Override
            public void onFinish() {

                Intent intent = new Intent(SplashScreen.this, LoginPage.class); //Targeting class after splash screen finish

                startActivity(intent);

                finish();
            }

            @Override
            public void onTick(long millisUntilFinished) {

            }
        }.start();
    }
}
