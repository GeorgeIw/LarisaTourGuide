package com.example.android.larisatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        //inflate the layout of the fragment
        View rootView = inflater.inflate(R.layout.list_locations, container, false);

        //create the ArrayList locations using the custom class Locations
        final ArrayList<Locations> locations = new ArrayList<>();
        //add the components of the ArrayList
        locations.add(new Locations(R.drawable.ancient_theater, R.string.ancient_theater_name, R.string.ancient_theater_description));
        locations.add(new Locations(R.drawable.b_ancient_theater, R.string.b_ancient_theater_name, R.string.b_ancient_theater_description));
        locations.add(new Locations(R.drawable.diachronic_museum, R.string.diachronic_museum_name, R.string.diachronic_museum_description));
        locations.add(new Locations(R.drawable.pinios_river, R.string.pinios_river_name, R.string.pinios_river_description));
        locations.add(new Locations(R.drawable.municipal_art_gallery, R.string.municipal_art_gallery_name, R.string.municipal_art_gallery_description));
        locations.add(new Locations(R.drawable.folklore_museum, R.string.folklore_museum_name, R.string.folklore_museum_description));

        //create an instance of the adapter for use
        LocationsListAdapter adapter = new LocationsListAdapter(getActivity(), locations);

        //get the id of the ListView
        ListView listView = rootView.findViewById(R.id.list);

        //set the adapter to the listView
        listView.setAdapter(adapter);

        //make the ListItems clickable
        //set where ListItem redirect by clicking it
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {

                if(position == 0){

                    //create intent IntentLasRamblas to open the DetailsActivity.class
                    Intent IntentLasRamblas = new Intent(getActivity(),DetailsActivity.class);

                    //pass an identifier value to IntentLasRamblas so that we can call at DetailsActivity
                    IntentLasRamblas.putExtra("LasRamblasFragment",0);

                    //apply the IntentLasRamblas
                    startActivity(IntentLasRamblas);
                }
                else if(position == 1) {
                    Intent IntentGossip = new Intent(getActivity(),DetailsActivity.class);
                    IntentGossip.putExtra("GossipFragment",1);
                    startActivity(IntentGossip);
                }
                else if(position == 2){
                    Intent IntentJaxx = new Intent(getActivity(),DetailsActivity.class);
                    IntentJaxx.putExtra("JaxxFragment",2);
                    startActivity(IntentJaxx);
                }
                else if(position == 3){
                    Intent IntentKubrick = new Intent(getActivity(),DetailsActivity.class);
                    IntentKubrick.putExtra("KubrickFragment",3);
                    startActivity(IntentKubrick);
                }
                else if(position == 4){
                    Intent IntentUndo = new Intent(getActivity(),DetailsActivity.class);
                    IntentUndo.putExtra("UndoFragment",4);
                    startActivity(IntentUndo);
                }
                else if(position == 5){
                    Intent IntentBollocks = new Intent(getActivity(),DetailsActivity.class);
                    IntentBollocks.putExtra("BollocksFragment",5);
                    startActivity(IntentBollocks);
                }
            }
        });

        return rootView;
    }
}