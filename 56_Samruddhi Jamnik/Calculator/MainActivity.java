package com.example.explicitintentcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultText = findViewById(R.id.resultText);

        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnMul = findViewById(R.id.btnMul);
        Button btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(v -> calculate("+"));
        btnSub.setOnClickListener(v -> calculate("-"));
        btnMul.setOnClickListener(v -> calculate("*"));
        btnDiv.setOnClickListener(v -> calculate("/"));
    }

    private void calculate(String operator) {

        String s1 = num1.getText().toString().trim();
        String s2 = num2.getText().toString().trim();

        if (s1.isEmpty() || s2.isEmpty()) {
            resultText.setText("Please enter both numbers");
            return;
        }

        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);
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
                if (n2 == 0) {
                    resultText.setText("Cannot divide by zero");
                    return;
                }
                result = n1 / n2;
                break;
        }

        resultText.setText("Result: " + result);
    }
}