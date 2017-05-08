package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {

    private String mMagnitud, mLocation, mDate, mTime;
    private Date dateObject;

    public Earthquake(String mMagnitud, String mLocation, long UnixDate) {
        this.mMagnitud = mMagnitud;
        this.mLocation = mLocation;
        this.dateObject = new Date(UnixDate);

        mDate = new SimpleDateFormat("LLL dd, yyyy").format(dateObject);
        mTime = new SimpleDateFormat("h:mm a").format(dateObject);
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

    public String getTime() {
        return mTime;
    }
}
