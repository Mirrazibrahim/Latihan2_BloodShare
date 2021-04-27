package com.mirrazdev.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostThere extends AppCompatActivity {

    public void toverify(View view) {
        Intent toverify = new Intent(AlmostThere.this, Verify.class);
        startActivity(toverify);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }
}