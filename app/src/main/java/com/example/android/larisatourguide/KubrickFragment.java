package com.example.android.larisatourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class KubrickFragment extends Fragment {

    public KubrickFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.details_layout, container, false);

        //get the TextView with id.name and set it's text
        TextView KubrickName = rootView.findViewById(R.id.name);
        KubrickName.setText(R.string.kubrick_name);

        //get the TextView with id.address and set it's text
        TextView KubrickAddress = rootView.findViewById(R.id.address);
        KubrickAddress.setText(R.string.kubrick_address);

        //get the TextView with id.phone_number and set it's text
        TextView KubrickPhone = rootView.findViewById(R.id.phone_number);
        KubrickPhone.setText(R.string.kubrick_phone);

        //get the TextView with id.operating_hours and set it's text
        TextView KubrickOperatingHours = rootView.findViewById(R.id.operating_hours);
        KubrickOperatingHours.setText(R.string.kubrick_operating_hours);

        //get the TextView with id.description and se it's text
        TextView KubrickDescription = rootView.findViewById(R.id.description);
        KubrickDescription.setText(R.string.kubrick_description);
        return rootView;
    }
}
