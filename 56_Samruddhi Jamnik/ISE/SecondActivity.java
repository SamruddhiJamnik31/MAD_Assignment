package com.example.studentregistrationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    ListView listView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView = findViewById(R.id.listView);

        adapter = new MyAdapter();
        listView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (adapter != null) {
            adapter.notifyDataSetChanged(); // Refresh list when coming back
        }
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return MainActivity.nameList.size();
        }

        @Override
        public Object getItem(int position) {
            return MainActivity.nameList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = LayoutInflater.from(SecondActivity.this)
                        .inflate(R.layout.row_design, parent, false);
            }

            TextView tvName = convertView.findViewById(R.id.tvName);
            TextView tvContact = convertView.findViewById(R.id.tvContact);
            Button btnCall = convertView.findViewById(R.id.btnCall);

            tvName.setText(MainActivity.nameList.get(position));
            tvContact.setText(MainActivity.contactList.get(position));

            btnCall.setOnClickListener(v -> {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + MainActivity.contactList.get(position)));
                startActivity(intent);

            });

            return convertView;
        }
    }
}