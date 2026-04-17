package com.example.listlayoutexample;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] students = {
            "Samruddhi",
            "Amit",
            "Priya",
            "Rahul",
            "Neha",
            "Karan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                students
        );

        listView.setAdapter(adapter);

        // Click Event
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selected = students[position];

            Toast.makeText(MainActivity.this,
                    "Selected: " + selected,
                    Toast.LENGTH_SHORT).show();
        });
    }
}