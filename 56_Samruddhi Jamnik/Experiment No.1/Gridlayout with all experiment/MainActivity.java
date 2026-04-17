package com.example.gridlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn10 = findViewById(R.id.button10);
        btn11 = findViewById(R.id.button11);
        btn12 = findViewById(R.id.button12);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.verticallinlay",
                        "com.example.verticallinlay.MainActivity"
                );
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.horizontallayout",
                        "com.example.horizontallayout.MainActivity"
                );
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.verticallinlay",
                        "com.example.verticallinlay.MainActivity"
                );
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.tablelayout",
                        "com.example.tablelayout.MainActivity"
                );
                startActivity(i);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.framelayout",
                        "com.example.framelayout.MainActivity"
                );
                startActivity(i);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.relativelay",
                        "com.example.verticallinlay.MainActivity"
                );
                startActivity(i);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.listlayout",
                        "com.example.listlayout.MainActivity"
                );
                startActivity(i);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.colorchange",
                        "com.example.colorchange.MainActivity"
                );
                startActivity(i);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.backimg",
                        "com.example.backimg.MainActivity"
                );
                startActivity(i);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.profile",
                        "com.example.profile.MainActivity"
                );
                startActivity(i);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.implicitintent",
                        "com.example.implicitintent.MainActivity"
                );
                startActivity(i);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName(
                        "com.example.proflogin",
                        "com.example.proflogin.MainActivity"
                );
                startActivity(i);
            }
        });

    }
}