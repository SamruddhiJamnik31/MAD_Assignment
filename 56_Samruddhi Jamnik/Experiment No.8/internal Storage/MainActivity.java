package com.example.internalstorageexample;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText etData;
    Button btnSave, btnRead;
    TextView tvOutput;

    String fileName = "myfile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etData = findViewById(R.id.etData);
        btnSave = findViewById(R.id.btnSave);
        btnRead = findViewById(R.id.btnRead);
        tvOutput = findViewById(R.id.tvOutput);

        // Save Data
        btnSave.setOnClickListener(v -> {
            String data = etData.getText().toString();

            try {
                FileOutputStream fos = openFileOutput(fileName, MODE_PRIVATE);
                fos.write(data.getBytes());
                fos.close();

                Toast.makeText(MainActivity.this,
                        "Data Saved",
                        Toast.LENGTH_SHORT).show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Read Data
        btnRead.setOnClickListener(v -> {
            try {
                FileInputStream fis = openFileInput(fileName);
                int i;
                StringBuilder data = new StringBuilder();

                while ((i = fis.read()) != -1) {
                    data.append((char) i);
                }

                fis.close();
                tvOutput.setText(data.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}