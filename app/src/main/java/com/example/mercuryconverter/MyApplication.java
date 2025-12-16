package com.example.mercuryconverter;

import  android.app.Application;
import android.util.Log;

import com.yausername.youtubedl_android.YoutubeDL;

public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();

        new Thread(() -> {
            try {
                Log.d(TAG, "Initializing YoutubeDL...");
                YoutubeDL.getInstance().init(getApplicationContext());
                Log.d(TAG, "YoutubeDL is ready!");
            } catch (Exception e) {
                Log.e(TAG, "YoutubeDL initialization error", e);
            }
        }).start();
    }
}
