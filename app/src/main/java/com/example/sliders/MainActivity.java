package com.example.sliders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/*
 * Main Activity is the entry point to our application
 */
public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Normally:
        // setContentView(R.layout.activity_main);
        setContentView(new Game(this));
    }
}