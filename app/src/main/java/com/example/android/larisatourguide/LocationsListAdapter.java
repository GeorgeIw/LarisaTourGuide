package com.example.android.larisatourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationsListAdapter extends ArrayAdapter<Locations> {

    public LocationsListAdapter(Context context, ArrayList<Locations> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View LocationsView = convertView;
        if(LocationsView == null){
            LocationsView = LayoutInflater.from(getContext()).inflate(R.layout.locations_layout,parent,false);
        }

        Locations currentLocation = getItem(position);

        ImageView LocationImage = (ImageView) LocationsView.findViewById(R.id.location_image);
        LocationImage.setImageResource(currentLocation.getLocationImage());

        TextView LocationName = (TextView) LocationsView.findViewById(R.id.location_name);
        LocationName.setText(currentLocation.getLocationName());

        TextView LocationDescription = (TextView) LocationsView.findViewById(R.id.location_description);
        LocationDescription.setText(currentLocation.getLocationDescription());

        return LocationsView;
    }


}