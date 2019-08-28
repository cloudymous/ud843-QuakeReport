package com.example.android.quakereport.model;

public class Earthquake {

    private int mMagnitude;
    private String mCity, mDate;

    public Earthquake (int cMagnitude, String cCity, String cDate) {
        mMagnitude = cMagnitude;
        mCity = cCity;
        mDate = cDate;
    }

    public int getmMagnitude() {
        return mMagnitude;
    }

    public String getmCity() {
        return mCity;
    }

    public String getmDate() {
        return mDate;
    }
}
