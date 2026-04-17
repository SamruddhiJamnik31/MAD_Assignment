package com.example.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbReading, cbTraveling, cbGaming, cbCooking;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbReading = findViewById(R.id.cbReading);
        cbTraveling = findViewById(R.id.cbTraveling);
        cbGaming = findViewById(R.id.cbGaming);
        cbCooking = findViewById(R.id.cbCooking);

        Button btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(v -> {

            StringBuilder result = new StringBuilder();

            if (cbReading.isChecked()) result.append(cbReading.getText()).append(", ");
            if (cbTraveling.isChecked()) result.append(cbTraveling.getText()).append(", ");
            if (cbGaming.isChecked()) result.append(cbGaming.getText()).append(", ");
            if (cbCooking.isChecked()) result.append(cbCooking.getText()).append(", ");

            if (result.length() == 0) {
                Toast.makeText(MainActivity.this, R.string.select_option, Toast.LENGTH_SHORT).show();
            } else {
                // Remove last comma
                result.setLength(result.length() - 2);

                tvResult.setText(getString(R.string.selected, result.toString()));
            }
        });
    }
}