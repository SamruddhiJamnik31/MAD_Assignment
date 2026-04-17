package com.example.popupmenuexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonShowMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShowMenu = findViewById(R.id.buttonShowMenu);

        buttonShowMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(view);
            }
        });
    }

    private void showPopupMenu(View view) {

        PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);


        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popupMenu.getMenu());


        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id == R.id.item1) {
                    Toast.makeText(MainActivity.this, "Home clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if (id == R.id.item2) {
                    Toast.makeText(MainActivity.this, "About clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if (id == R.id.item3) {
                    Toast.makeText(MainActivity.this, "Setting clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else {
                    return false;
                }
            }
        });

        popupMenu.show();
    }
}