package com.example.android.larisatourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GossipFragment extends Fragment {

    public GossipFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.details_layout, container, false);

        //get the TextView with id.name and set it's text
        TextView gossipName = rootView.findViewById(R.id.name);
        gossipName.setText(R.string.gossip_name);

        //get the TextView with id.address and set it's text
        TextView gossipAddress = rootView.findViewById(R.id.address);
        gossipAddress.setText(R.string.gossip_address);

        //get the TextView with id.phone_number and set it's text
        TextView gossipNumber = rootView.findViewById(R.id.phone_number);
        gossipNumber.setText(R.string.gossip_phone);

        //get the TextView with id.operating_hours and set it's text
        TextView gossipOperatingHours = rootView.findViewById(R.id.operating_hours);
        gossipOperatingHours.setText(R.string.gossip_operating_hours);

        //get the TextView with id.description and se it's text
        TextView gossipDescription = rootView.findViewById(R.id.description);
        gossipDescription.setText(R.string.gossip_description);

        return rootView;
    }
}
