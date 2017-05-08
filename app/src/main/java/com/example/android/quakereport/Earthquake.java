package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitud;
    private String mLocation;
    private String mDate;

    public Earthquake(double mMagnitud, String mLocation, String mDate) {
        this.mMagnitud = mMagnitud;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public double getMagnitud() {
        return mMagnitud;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }
}
