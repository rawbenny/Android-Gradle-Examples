package com.pwc.sample.lib1.receiver;

import com.pwc.sample.lib1.dao.RunManager;

import android.content.Context;
import android.location.Location;

public class TrackingLocationReceiver extends LocationReceiver {
    
    @Override
    protected void onLocationReceived(Context c, Location loc) {
        RunManager.get(c).insertLocation(loc);
    }

}
