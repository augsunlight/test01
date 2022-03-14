package com.example.nhom8demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        sp=findViewById(R.id.sp2);
        String[] list={"PTIT","HUST","FPT","NEU"};
    }
}