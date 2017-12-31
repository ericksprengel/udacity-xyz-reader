package com.example.xyzreader.ui;

import android.app.Application;

import com.facebook.stetho.BuildConfig;
import com.facebook.stetho.Stetho;

public class XYZReaderApp extends Application {
    public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }
}
