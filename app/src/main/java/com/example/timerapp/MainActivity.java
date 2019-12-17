package com.example.timerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // two ways to set counter
        // first way

        new CountDownTimer(10000, 1000) {
            public void onTick(long millisecondsUntilDone) {
                // counter is counting (every second)
                Log.i("Seconds left ", String.valueOf(millisecondsUntilDone / 1000));
            }

            public void onFinish() {
                // counter is finished!

            }
        }.start();

        // second way

//        final Handler handler = new Handler();
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                // Insert code to be run every second
//                Log.i("Runnable has run! A second must have passed.");
//                handler.postDelayed(this, 1000);
//            }
//        };
//
//        handler.post(run);
    }
}
