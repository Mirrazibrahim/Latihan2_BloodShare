package com.mirrazdev.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;

public class Verify extends AppCompatActivity {

    public void tohome(View view) {
        Intent tohome = new Intent(Verify.this, MenuUtama.class);
        startActivity(tohome);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }
}