package com.example.circularprogressbar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CircularProgressView circularProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularProgress = findViewById(R.id.circularProgress);

        // Animate progress from 0 to 75
        new Thread(() -> {
            for (int i = 0; i <= 75; i++) {
                int value = i;
                runOnUiThread(() -> circularProgress.setProgress(value));

                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}