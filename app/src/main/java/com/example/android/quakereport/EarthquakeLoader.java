package com.example.android.quakereport;

import android.content.Context;
import android.content.AsyncTaskLoader;

import java.util.ArrayList;

public class EarthquakeLoader extends AsyncTaskLoader<ArrayList<Earthquake>> {

    private String mUrlRequest;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrlRequest = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public ArrayList<Earthquake> loadInBackground() {
        // Don't perform the request if URL is null.
        if (mUrlRequest == null) {
            return null;
        }

        // Perform the HTTP request for earthquake data and process the response.
        ArrayList<Earthquake> earthquakes = QueryUtils.fetchEarthquakesList(mUrlRequest);
        return earthquakes;
    }
}
