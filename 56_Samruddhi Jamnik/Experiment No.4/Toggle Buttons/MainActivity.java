package com.example.toggleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        mainLayout = findViewById(R.id.mainLayout);

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {

            if (isChecked) {

                mainLayout.setBackgroundColor(Color.BLACK);
            } else {

                mainLayout.setBackgroundColor(Color.WHITE);
            }
        });
    }
}