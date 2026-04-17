package com.example.alertexample;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlert = findViewById(R.id.btnAlert);

        btnAlert.setOnClickListener(v -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            builder.setTitle("Alert");
            builder.setMessage("Do you want to continue?");

            builder.setPositiveButton("Yes", (dialog, which) -> {
                Toast.makeText(MainActivity.this,
                        "You clicked Yes",
                        Toast.LENGTH_SHORT).show();
            });

            builder.setNegativeButton("No", (dialog, which) -> {
                Toast.makeText(MainActivity.this,
                        "You clicked No",
                        Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            builder.setCancelable(false); // User must click a button

            builder.show();
        });
    }
}