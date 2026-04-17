package com.example.horizontallinearlayout;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout parentLayout = new LinearLayout(MainActivity.this);
        parentLayout.setOrientation(LinearLayout.VERTICAL);
        parentLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        parentLayout.setGravity(Gravity.TOP);
        parentLayout.setPadding(0, 200, 0, 0);

        LinearLayout linearLayout = new LinearLayout(MainActivity.this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setPadding(16, 16, 16, 16);
        linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(16, 0, 16, 0);

        Button button1 = new Button(MainActivity.this);
        button1.setText("Button 1");
        button1.setLayoutParams(params);

        Button button2 = new Button(MainActivity.this);
        button2.setText("Button 2");
        button2.setLayoutParams(params);

        Button button3 = new Button(MainActivity.this);
        button3.setText("Button 3");
        button3.setLayoutParams(params);

        linearLayout.addView(button1);
        linearLayout.addView(button2);
        linearLayout.addView(button3);

        parentLayout.addView(linearLayout);

        setContentView(parentLayout);
    }
}