package com.pwc.sample;

import android.app.Application;
import android.util.Log;

/**
 * Created by ryan on 5/27/14.
 */
public class SampleApplication extends Application {
    private static final String TAG = SampleApplication.class.getSimpleName();

    private int counter;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "On application create");
        counter = 1;
    }

    public void countForward() {
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }
}