package com.mirrazdev.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public void toregister(View view) {
        Intent toregister = new Intent(MainActivity.this, Register.class);
        startActivity(toregister);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}