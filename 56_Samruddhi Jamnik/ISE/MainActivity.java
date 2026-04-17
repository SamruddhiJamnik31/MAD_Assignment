package com.example.studentregistrationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etName, etContact, etRoll, etEnrollment,
            etBranch, etYear, etEmail;

    Button btnSubmit;

    // Static lists (store multiple students)
    public static ArrayList<String> nameList = new ArrayList<>();
    public static ArrayList<String> contactList = new ArrayList<>();
    public static ArrayList<String> rollList = new ArrayList<>();
    public static ArrayList<String> enrollmentList = new ArrayList<>();
    public static ArrayList<String> branchList = new ArrayList<>();
    public static ArrayList<String> yearList = new ArrayList<>();
    public static ArrayList<String> emailList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etContact = findViewById(R.id.etContact);
        etRoll = findViewById(R.id.etRoll);
        etEnrollment = findViewById(R.id.etEnrollment);
        etBranch = findViewById(R.id.etBranch);
        etYear = findViewById(R.id.etYear);
        etEmail = findViewById(R.id.etEmail);

        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {

            String name = etName.getText().toString().trim();
            String contact = etContact.getText().toString().trim();
            String roll = etRoll.getText().toString().trim();
            String enrollment = etEnrollment.getText().toString().trim();
            String branch = etBranch.getText().toString().trim();
            String year = etYear.getText().toString().trim();
            String email = etEmail.getText().toString().trim();

            if (!name.isEmpty() && !contact.isEmpty()
                    && !roll.isEmpty() && !enrollment.isEmpty()
                    && !branch.isEmpty() && !year.isEmpty()
                    && !email.isEmpty()) {

                // Add data to lists
                nameList.add(name);
                contactList.add(contact);
                rollList.add(roll);
                enrollmentList.add(enrollment);
                branchList.add(branch);
                yearList.add(year);
                emailList.add(email);

                // Open second activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

                // Clear all fields
                clearFields();
            }
        });
    }

    private void clearFields() {
        etName.setText("");
        etContact.setText("");
        etRoll.setText("");
        etEnrollment.setText("");
        etBranch.setText("");
        etYear.setText("");
        etEmail.setText("");
    }
}