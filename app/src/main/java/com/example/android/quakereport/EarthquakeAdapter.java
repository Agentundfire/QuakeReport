package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_item, parent, false);
        }

        Earthquake currentQuake = getItem(position);

        TextView textMagnitud = (TextView) listItemView.findViewById(R.id.text_magnitud);
        textMagnitud.setText(currentQuake.getMagnitud());

        TextView textLocation = (TextView) listItemView.findViewById(R.id.text_location);
        textLocation.setText(currentQuake.getLocation());

        TextView textDate = (TextView) listItemView.findViewById(R.id.text_date);
        textDate.setText(currentQuake.getDate());

        return listItemView;
    }
}
