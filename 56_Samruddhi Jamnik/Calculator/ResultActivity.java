package com.example.explicitintentcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = findViewById(R.id.resultText);

        double n1 = getIntent().getDoubleExtra("number1", 0);
        double n2 = getIntent().getDoubleExtra("number2", 0);
        String operator = getIntent().getStringExtra("operator");

        double result = 0;

        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }

        resultText.setText("Result: " + result);
    }
}