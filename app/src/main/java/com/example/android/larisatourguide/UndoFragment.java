package com.example.android.larisatourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UndoFragment extends Fragment {

    public UndoFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.details_layout, container, false);

        //get the TextView with id.name and set it's text
        TextView UndoName = rootView.findViewById(R.id.name);
        UndoName.setText(R.string.undo_name);

        //get the TextView with id.address and set it's text
        TextView UndoAddress = rootView.findViewById(R.id.address);
        UndoAddress.setText(R.string.undo_address);

        //get the TextView with id.phone_number and set it's text
        TextView UndoPhone = rootView.findViewById(R.id.phone_number);
        UndoPhone.setText(R.string.undo_phone);

        //get the TextView with id.operating_hours and set it's text
        TextView UndoOperatingHours = rootView.findViewById(R.id.operating_hours);
        UndoOperatingHours.setText(R.string.undo_operating_hours);

        //get the TextView with id.description and se it's text
        TextView UndoDescription = rootView.findViewById(R.id.description);
        UndoDescription.setText(R.string.undo_description);

        return rootView;
    }

}
