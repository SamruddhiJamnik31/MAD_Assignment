package com.example.background_image;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnImg1, btnImg2, btnImg3;
    LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);

        btnImg1 = findViewById(R.id.btnImg1);
        btnImg2 = findViewById(R.id.btnImg2);
        btnImg3 = findViewById(R.id.btnImg3);

        btnImg1.setOnClickListener(v ->
                mainLayout.setBackgroundResource(R.drawable.img1)
        );

        btnImg2.setOnClickListener(v ->
                mainLayout.setBackgroundResource(R.drawable.img2)
        );

        btnImg3.setOnClickListener(v ->
                mainLayout.setBackgroundResource(R.drawable.img3)
        );
    }
}