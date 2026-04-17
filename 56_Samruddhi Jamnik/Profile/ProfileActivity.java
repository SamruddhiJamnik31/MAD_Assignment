package com.example.profileloginapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnBack = findViewById(R.id.btnBack);

        // Back button click
        btnBack.setOnClickListener(v -> {
            Toast.makeText(ProfileActivity.this, "Back to Login", Toast.LENGTH_SHORT).show();
            finish();
        });

        // Modern back handling
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Toast.makeText(ProfileActivity.this, "Going back", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}