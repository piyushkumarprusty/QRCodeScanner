package com.example.android.qrcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.budiyev.android.codescanner.CodeScanner;

public class MainActivity extends AppCompatActivity {
CodeScanner mCodeScanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}