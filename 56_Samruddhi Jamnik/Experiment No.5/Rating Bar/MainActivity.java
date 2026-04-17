package com.example.ratingbarlive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        tvResult = findViewById(R.id.tvResult);

        // Listen to rating changes instantly
        ratingBar.setOnRatingBarChangeListener((ratingBar1, rating, fromUser) -> {
            tvResult.setText(String.format(getString(R.string.rating_live), rating));
        });
    }
}