package com.flipkart.flipperf.newlib.toolbox;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by anirudh.r on 12/05/16 at 3:24 PM.
 */
public class PreferenceManager {

    private static final String PREFERENCES = "PREFERENCES";
    private final SharedPreferences mSharedPreferences;

    public PreferenceManager(Context context) {
        this.mSharedPreferences = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
    }

    public void setAverageSpeed(String networkType, float avgSpeed) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putFloat(networkType, avgSpeed);
        editor.apply();
    }

    public float getAverageSpeed(String networkType) {
        return this.mSharedPreferences.getFloat(networkType, 0F);
    }

    public boolean hasAvgSpeed(String networkType) {
        return mSharedPreferences.contains(networkType);
    }
}