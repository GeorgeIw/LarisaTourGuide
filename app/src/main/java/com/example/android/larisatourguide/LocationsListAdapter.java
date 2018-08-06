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

    //create the new LocationsListAdapter object
    //create the constructor for the object
    public LocationsListAdapter(Context context, ArrayList<Locations> places) {
        super(context, 0, places);
    }

    //take the views that are for use and set their variables
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //check if an existing view is reused, otherwise inflate the view
        View LocationsView = convertView;
        if(LocationsView == null){
            LocationsView = LayoutInflater.from(getContext()).inflate(R.layout.locations_layout,parent,false);
        }

        //get the Locations object located at this position of the list
        Locations currentLocation = getItem(position);

        //get the TextView with id.location_image
        ImageView LocationImage = (ImageView) LocationsView.findViewById(R.id.location_image);

        //get the LocationImage from the currentLocation object
        //set the image at the ImageView LocationImage
        LocationImage.setImageResource(currentLocation.getLocationImage());

        //get the TextView with id.location_name
        TextView LocationName = (TextView) LocationsView.findViewById(R.id.location_name);

        //get the LocationName from the currentLocation object
        //set the text at the TextView LocationName
        LocationName.setText(currentLocation.getLocationName());

        //get the TextView with id.location_Description
        TextView LocationDescription = (TextView) LocationsView.findViewById(R.id.location_description);

        //get the LocationDescription from the currentLocation object
        //set the text at the TextView LocationDescription
        LocationDescription.setText(currentLocation.getLocationDescription());

        return LocationsView;
    }


}