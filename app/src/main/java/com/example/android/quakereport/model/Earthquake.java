package com.example.android.quakereport.model;

public class Earthquake {

    private String mMagnitude, mCity, mDate;

    public Earthquake (String cMagnitude, String cCity, String cDate) {
        mMagnitude = cMagnitude;
        mCity = cCity;
        mDate = cDate;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmCity() {
        return mCity;
    }

    public String getmDate() {
        return mDate;
    }
}
