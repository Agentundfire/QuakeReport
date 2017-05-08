package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {

    private double mMagnitude;
    private String mLocation, mDate, mTime;
    private Date dateObject;

    public Earthquake(double mMagnitude, String mLocation, long UnixDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.dateObject = new Date(UnixDate);

        mDate = new SimpleDateFormat("LLL dd, yyyy").format(dateObject);
        mTime = new SimpleDateFormat("h:mm a").format(dateObject);
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }

    public String getTime() {
        return mTime;
    }
}
