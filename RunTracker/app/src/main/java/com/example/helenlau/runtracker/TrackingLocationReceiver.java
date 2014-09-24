package com.example.helenlau.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by helenlau on 9/24/14.
 */
public class TrackingLocationReceiver extends LocationReceiver {

    @Override
    protected void onLocationReceived(Context c, Location loc) {
        RunManager.get(c).insertLocation(loc);
    }
}
