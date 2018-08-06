package com.example.android.larisatourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class JaxxFragment extends Fragment {


    public JaxxFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.details_layout, container, false);

        //get the TextView with id.name and set it's text
        TextView JaxxName = rootView.findViewById(R.id.name);
        JaxxName.setText(R.string.jaxx_name);

        //get the TextView with id.address and set it's text
        TextView JaxxAddress = rootView.findViewById(R.id.address);
        JaxxAddress.setText(R.string.jaxx_address);

        //get the TextView with id.phone_number and set it's text
        TextView JaxxPhone = rootView.findViewById(R.id.phone_number);
        JaxxPhone.setText(R.string.jaxx_phone);

        //get the TextView with id.operating_hours and set it's text
        TextView JaxxOperatingHours = rootView.findViewById(R.id.operating_hours);
        JaxxOperatingHours.setText(R.string.jaxx_operating_hours);

        //get the TextView with id.description and se it's text
        TextView JaxxDescription = rootView.findViewById(R.id.description);
        JaxxDescription.setText(R.string.jaxx_description);

        return rootView;
    }

}
