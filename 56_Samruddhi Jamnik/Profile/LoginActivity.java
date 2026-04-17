package com.example.profileloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText username, password;
    private Button btnLogin;

    private final String correctUser = "admin";
    private final String correctPass = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> loginUser());
    }

    private void loginUser() {

        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();

        if (user.isEmpty()) {
            username.setError("Username required");
            return;
        }

        if (pass.isEmpty()) {
            password.setError("Password required");
            return;
        }

        if (user.equals(correctUser) && pass.equals(correctPass)) {
            startActivity(new Intent(this, ProfileActivity.class));
            finish();
        } else {
            Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
        }
    }
}