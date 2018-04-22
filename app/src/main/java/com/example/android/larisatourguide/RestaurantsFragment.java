package com.example.android.larisatourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    int position = 0;
    public RestaurantsFragment() {
        // Required empty public constructor
    }
    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_locations, container, false);

        final ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(R.drawable.adamos_intro,R.string.adamos_name,R.string.adamos_description));
        locations.add(new Locations(R.drawable.bakalogatos_intro,R.string.bakalogatos_name,R.string.bakalogatos_description));
        locations.add(new Locations(R.drawable.akamatra_intro,R.string.akamatra_name,R.string.akamatra_description));
        locations.add(new Locations(R.drawable.en_larisi_intro,R.string.en_larisi_name,R.string.en_larisi_intro));
        locations.add(new Locations(R.drawable.just_winebar_intro,R.string.just_winebar_name,R.string.just_winebar_description));
        locations.add(new Locations(R.drawable.epicure5_intro,R.string.epicure5_name,R.string.epicure5_description));
        locations.add(new Locations(R.drawable.baricou_intro,R.string.baricou_name,R.string.baricou_description));
        locations.add(new Locations(R.drawable.lucullus_intro,R.string.lucullus_name,R.string.lucullus_description));

        LocationsListAdapter adapter = new LocationsListAdapter(getActivity(),locations);
        ListView listView =  rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                //Locations locations1 = locations.get(position);
                if(position == 0){
                    CoffeeFragment coffee = new CoffeeFragment();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.locations_layout, coffee);
                    transaction.commit();
                }
                else if(position == 1){
                    SightseeingsFragment sight = new SightseeingsFragment();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.locations_layout,sight);
                    transaction.commit();
                }
                //Intent listIntent = new Intent(getActivity(),MainActivity.class);
                //startActivity(listIntent);
            }
        });
        return rootView;
    }
}