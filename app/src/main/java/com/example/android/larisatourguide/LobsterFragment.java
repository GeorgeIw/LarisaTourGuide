package com.example.android.larisatourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LobsterFragment extends Fragment {

    public LobsterFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.details_layout, container, false);

        //get the TextView with id.name and set it's text
        TextView LobsterName = rootView.findViewById(R.id.name);
        LobsterName.setText(R.string.lobster_name);

        //get the TextView with id.address and set it's text
        TextView LobsterAddress = rootView.findViewById(R.id.address);
        LobsterAddress.setText(R.string.lobster_address);

        //get the TextView with id.phone_number and set it's text
        TextView LobsterPhone = rootView.findViewById(R.id.phone_number);
        LobsterPhone.setText(R.string.lobster_phone);

        //get the TextView with id.operating_hours and set it's text
        TextView LobsterOperatingHours = rootView.findViewById(R.id.operating_hours);
        LobsterOperatingHours.setText(R.string.lobster_operating_hours);

        //get the TextView with id.description and se it's text
        TextView LobsterDescription = rootView.findViewById(R.id.description);
        LobsterDescription.setText(R.string.lobster_description);

        return rootView;
    }

}
