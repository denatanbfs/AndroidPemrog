package com.denatan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleSiswa(View view) {
        Intent intent =  new Intent(this,FormSiswaActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }
}