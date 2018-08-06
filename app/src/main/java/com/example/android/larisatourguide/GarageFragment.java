package com.example.android.larisatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GarageFragment extends Fragment {


    public GarageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflate the fragment to a certain layout
        View rootView =  inflater.inflate(R.layout.details_layout, container, false);

        //get the TextView with id.name and set it's text
        TextView GarageName = rootView.findViewById(R.id.name);
        GarageName.setText(R.string.garage_name);

        //get the TextView with id.address and set it's text
        TextView GarageAddress = rootView.findViewById(R.id.address);
        GarageAddress.setText(R.string.garage_address);

        //get the TextView with id.phone_number and set it's text
        TextView GaragePhone = rootView.findViewById(R.id.phone_number);
        GaragePhone.setText(R.string.garage_phone);

        //get the TextView with id.operating_hours and set it's text
        TextView GarageOperatingHours = rootView.findViewById(R.id.operating_hours);
        GarageOperatingHours.setText(R.string.garage_operating_hours);

        //get the TextView with id.description and se it's text
        TextView GarageDescription = rootView.findViewById(R.id.description);
        GarageDescription.setText(R.string.garage_description);

        return rootView;
    }

}
