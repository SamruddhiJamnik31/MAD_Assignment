package com.example.profileloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnProfile = findViewById(R.id.btnProfile);

        btnProfile.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity.class));
        });
    }
}