package com.example.notificationdemo;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    String channelId = "assignment_channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnNotify);

        // 🔐 Request Permission
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.POST_NOTIFICATIONS}, 1);
        }

        // 🔔 Create Channel
        createNotificationChannel();

        // 🔘 Button Click
        btn.setOnClickListener(v -> showNotification());
    }

    private void createNotificationChannel() {
        NotificationChannel channel = new NotificationChannel(
                channelId,
                "Assignment Alerts",
                NotificationManager.IMPORTANCE_HIGH
        );

        NotificationManager manager = getSystemService(NotificationManager.class);
        manager.createNotificationChannel(channel);
    }

    private void showNotification() {

        // ✅ Check Permission
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) {

            Toast.makeText(this, "Permission not granted", Toast.LENGTH_SHORT).show();
            return;
        }

        // 📚 Big Text Style (Assignment Details)
        NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle()
                .bigText("Your assignment submission deadline is today at 11:59 PM. "
                        + "Make sure you complete all questions and upload your file before time. "
                        + "Late submission may result in marks deduction.")
                .setBigContentTitle("Assignment Due Today")
                .setSummaryText("Submit on time!");

        // 🔔 Build Notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, channelId)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Assignment Due")
                .setContentText("Submit your assignment before deadline!")
                .setStyle(bigText)
                .setPriority(NotificationCompat.PRIORITY_HIGH);

        // 🔔 Show Notification
        NotificationManagerCompat.from(this).notify(101, builder.build());
    }
}