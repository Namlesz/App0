package com.example.app0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lib0.Matematyka;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(Double.toString(Matematyka.Dodaj(1.2,3.0)));
    }
}