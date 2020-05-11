package com.chandrasalim.aplikasipenjualanbuku.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chandrasalim.aplikasipenjualanbuku.R;

public class RegisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);


        getSupportActionBar().hide();
    }
}

