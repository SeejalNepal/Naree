package com.seejal.naree;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.core.app.NotificationCompat;

import static com.seejal.naree.App.CHANNEL_ID;

public class Foreground extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Intent notificationIntent = new Intent(this, TrigActivity.class);
        PendingIntent pendingIntent =
                PendingIntent.getActivity(this, 0, notificationIntent, 0);

        Notification notification =
                new NotificationCompat.Builder(this, CHANNEL_ID)
                        .setContentTitle("EMERGENCY")
                        .setContentText("Emergency Service Activated , SHAKE TO SEND YOUR LOCATION!!")
                        .setContentIntent(pendingIntent)
                        .build();

        startForeground(1, notification);

        return START_NOT_STICKY;

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
