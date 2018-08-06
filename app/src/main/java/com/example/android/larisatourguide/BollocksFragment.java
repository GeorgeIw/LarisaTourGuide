package com.example.android.larisatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BollocksFragment extends Fragment {


    public BollocksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflate the fragment to a certain layout
        View rootView =  inflater.inflate(R.layout.details_layout, container, false);

        //get the TextView with id.name and set it's text
        TextView BollocksName = rootView.findViewById(R.id.name);
        BollocksName.setText(R.string.bollocks_name);

        //get the TextView with id.address and set it's text
        TextView BollocksAddress = rootView.findViewById(R.id.address);
        BollocksAddress.setText(R.string.bollocks_address);

        //get the TextView with id.phone_number and set it's text
        TextView BollocksPhone = rootView.findViewById(R.id.phone_number);
        BollocksPhone.setText(R.string.bollocks_phone);

        //get the TextView with id.operating_hours and set it's text
        TextView BollocksOperatingHours = rootView.findViewById(R.id.operating_hours);
        BollocksOperatingHours.setText(R.string.bollocks_operating_hours);

        //get the TextView with id.description and se it's text
        TextView BollocksDesription = rootView.findViewById(R.id.description);
        BollocksDesription.setText(R.string.bollocks_description);

        return rootView;
    }

}
