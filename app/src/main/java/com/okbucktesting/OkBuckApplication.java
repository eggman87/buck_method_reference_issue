package com.okbucktesting;

import android.app.Application;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;

public class OkBuckApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseApp.initializeApp(this);
        Log.d("Firebase", "Firebase Token: " + FirebaseInstanceId.getInstance().getToken());
    }
}
