package com.example.relativelayoutexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnBottom = findViewById(R.id.btnBottom);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Button One Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnTwo.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Button Two Clicked",
                        Toast.LENGTH_SHORT).show());

        btnBottom.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Bottom Button Clicked",
                        Toast.LENGTH_SHORT).show());
    }
}
