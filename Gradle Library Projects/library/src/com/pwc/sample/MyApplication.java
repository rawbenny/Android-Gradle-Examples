package com.pwc.sample;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
	private static final String TAG = MyApplication.class.getSimpleName();
	
	private int counter;
	
	@Override
	public void onCreate() {
		super.onCreate();
		Log.d(TAG, "On application create");
		counter = 1;
	}
	
	public void countForward(){
		this.counter ++;
	}
	public int getCounter(){
		return counter;
	}
}
