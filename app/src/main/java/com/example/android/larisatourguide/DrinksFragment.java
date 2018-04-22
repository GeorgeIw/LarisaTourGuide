package com.example.android.larisatourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class DrinksFragment extends Fragment {

    public DrinksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_locations, container, false);

        final ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(R.drawable.details_icon, R.string.category_coffee, R.string.category_drinks));

        LocationsListAdapter adapter = new LocationsListAdapter(getActivity(),locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);



        return rootView;
    }
}