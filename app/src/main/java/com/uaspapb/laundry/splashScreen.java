package com.uaspapb.laundry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

import com.uaspapb.laundry.Activity.MainActivity;

public class splashScreen extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_sreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke main activity
                Intent MainActivity=new Intent(splashScreen.this, com.uaspapb.laundry.Activity.MainActivity.class);
                startActivity(MainActivity);
                finish();

            }
        },waktu_loading);
    }
}