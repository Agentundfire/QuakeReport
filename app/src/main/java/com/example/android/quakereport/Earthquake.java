package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitud, mLocation, mDate;

    public Earthquake(String mMagnitud, String mLocation, String mDate) {
        this.mMagnitud = mMagnitud;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public String getMagnitud() {
        return mMagnitud;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }
}
