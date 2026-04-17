package com.example.explicit_intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView tvName, tvAbout, tvEducation, tvSkills, tvProjects, tvInterests, tvContact;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvName = findViewById(R.id.tvName);
        tvAbout = findViewById(R.id.tvAbout);
        tvEducation = findViewById(R.id.tvEducation);
        tvSkills = findViewById(R.id.tvSkills);
        tvProjects = findViewById(R.id.tvProjects);
        tvInterests = findViewById(R.id.tvInterests);
        tvContact = findViewById(R.id.tvContact);
        btnLogout = findViewById(R.id.btnLogout);

        String username = getIntent().getStringExtra("username");

        if (username == null) username = "User";

        tvName.setText(username);

        tvAbout.setText("I am a Computer Science student interested in mobile and web development. I enjoy building real-world applications.");
        tvEducation.setText("B.Tech Computer Science Engineering");

        tvSkills.setText("• Java Programming\n• Android Development\n• Web Development");

        tvProjects.setText("• Task Manager App\n• URL Shortener\n• Payment System");

        tvInterests.setText("• Coding\n• Learning New Technologies\n• Problem Solving");

        tvContact.setText("Email: " + username + "@gmail.com\nPhone: 9657665556");

        // Logout button
        btnLogout.setOnClickListener(v -> {
            finish(); // go back to login
        });
    }
}