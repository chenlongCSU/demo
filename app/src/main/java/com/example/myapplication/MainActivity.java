package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        myLinear myLinear = findViewById(R.id.myLinear);
//        leftLinear leftLinear = new leftLinear(MainActivity.this,null);
//        leftLinear.addView(new myText(MainActivity.this));
//        myLinear.addView(leftLinear);
        Log.i("daronchen","1");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.i("daronchen","2");
            }
        },4000);
        Log.i("daronchen","3");
        Log.i("daronchen","5");
        Log.i("daronchen","6");
        Log.i("daronchen","7");
    }

}
