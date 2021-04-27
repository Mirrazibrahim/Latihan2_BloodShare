package com.mirrazdev.bloodshare;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    public void back(View view) {
        Intent back = new Intent(Register.this, MainActivity.class);
        startActivity(back);
    }

    public void toalmost(View view) {
        Intent toalmost = new Intent(Register.this, AlmostThere.class);
        startActivity(toalmost);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.male:
                if (checked)
                    break;
            case R.id.female:
                if (checked)
                    break;
        }
    }

    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.personal:
                if (checked)
                    break;
            case R.id.organization:
                if (checked)
                    break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}