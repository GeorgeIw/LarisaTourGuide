package com.example.android.larisatourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LasRamblasFragment extends Fragment {

    public LasRamblasFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView =  inflater.inflate(R.layout.details_layout, container, false);

        //get the TextView with id.name and set it's text
        TextView LasRamblasName = rootView.findViewById(R.id.name);
        LasRamblasName.setText(R.string.las_ramblas_name);

        //get the TextView with id.address and set it's text
        TextView LasRamblasAddress = rootView.findViewById(R.id.address);
        LasRamblasAddress.setText(R.string.las_rablas_address);

        //get the TextView with id.phone_number and set it's text
        TextView LasRamblasPhone = rootView.findViewById(R.id.phone_number);
        LasRamblasPhone.setText(R.string.las_rablas_phone);

        //get the TextView with id.operating_hours and set it's text
        TextView LasRamblasOperatingHours = rootView.findViewById(R.id.operating_hours);
        LasRamblasOperatingHours.setText(R.string.las_ramblas_operating_hours);

        //get the TextView with id.description and se it's text
        TextView LasRamblasDescription = rootView.findViewById(R.id.description);
        LasRamblasDescription.setText(R.string.las_ramblas_description);

       return rootView;
    }

}
