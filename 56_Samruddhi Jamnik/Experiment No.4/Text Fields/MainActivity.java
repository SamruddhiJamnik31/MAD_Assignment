package com.example.textfieldexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(v -> {

            String name = editTextName.getText().toString().trim();

            if (name.isEmpty()) {
                Toast.makeText(MainActivity.this, R.string.error_name, Toast.LENGTH_SHORT).show();
            } else {
                tvResult.setText(getString(R.string.result, name));
            }
        });
    }
}