package com.example.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerCountry;
    private TextView tvResult;
    private String selectedCountry = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCountry = findViewById(R.id.spinnerCountry);
        tvResult = findViewById(R.id.tvResult);
        Button btnSubmit = findViewById(R.id.btnSubmit);


        String[] countries = {
                getString(R.string.country_india),
                getString(R.string.country_usa),
                getString(R.string.country_uk),
                getString(R.string.country_canada)
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                countries);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCountry.setAdapter(adapter);


        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedCountry = countries[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedCountry = "";
            }
        });


        btnSubmit.setOnClickListener(v -> {
            if (selectedCountry.isEmpty()) {
                Toast.makeText(MainActivity.this, R.string.select_option, Toast.LENGTH_SHORT).show();
            } else {
                tvResult.setText(getString(R.string.selected_country, selectedCountry));
            }
        });
    }
}