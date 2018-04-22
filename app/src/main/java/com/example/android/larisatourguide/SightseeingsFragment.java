package com.example.android.larisatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SightseeingsFragment extends Fragment {

    public SightseeingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_locations, container, false);

        final ArrayList<Locations> locations = new ArrayList<>();
        locations.add(new Locations(R.drawable.ancient_theater, R.string.ancient_theater_name, R.string.ancient_theater_description));
        locations.add(new Locations(R.drawable.b_ancient_theater, R.string.b_ancient_theater_name, R.string.b_ancient_theater_description));
        locations.add(new Locations(R.drawable.diachronic_museum, R.string.diachronic_museum_name, R.string.diachronic_museum_description));
        locations.add(new Locations(R.drawable.pinios_river, R.string.pinios_river_name, R.string.pinios_river_description));
        locations.add(new Locations(R.drawable.municipal_art_gallery, R.string.municipal_art_gallery_name, R.string.municipal_art_gallery_description));
        locations.add(new Locations(R.drawable.folklore_museum, R.string.folklore_museum_name, R.string.folklore_museum_description));


        LocationsListAdapter adapter = new LocationsListAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}