package com.example.android.quakereport.model;

public class Earthquake {

    private double mMagnitude;
    private String mCity;
    private long mDate;

    public Earthquake(double cMagnitude, String cCity, long cDate) {
        mMagnitude = cMagnitude;
        mCity = cCity;
        mDate = cDate;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmCity() {
        return mCity;
    }

    public long getmDate() {
        return mDate;
    }
}
