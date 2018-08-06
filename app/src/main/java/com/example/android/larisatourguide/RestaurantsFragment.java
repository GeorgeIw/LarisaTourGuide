package com.example.android.larisatourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
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

    public RestaurantsFragment() {
        // Required empty public constructor
    }
    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_locations, container, false);

        //create the ArrayList locations using the custom class Locations
        final ArrayList<Locations> locations = new ArrayList<Locations>();
        //add the components of the ArrayList
        locations.add(new Locations(R.drawable.adamos_intro,R.string.adamos_name,R.string.adamos_description));
        locations.add(new Locations(R.drawable.bakalogatos_intro,R.string.bakalogatos_name,R.string.bakalogatos_description));
        locations.add(new Locations(R.drawable.akamatra_intro,R.string.akamatra_name,R.string.akamatra_description));
        locations.add(new Locations(R.drawable.en_larisi_intro,R.string.en_larisi_name,R.string.en_larisi_intro));
        locations.add(new Locations(R.drawable.just_winebar_intro,R.string.just_winebar_name,R.string.just_winebar_description));
        locations.add(new Locations(R.drawable.epicure5_intro,R.string.epicure5_name,R.string.epicure5_description));
        locations.add(new Locations(R.drawable.baricou_intro,R.string.baricou_name,R.string.baricou_description));
        locations.add(new Locations(R.drawable.lucullus_intro,R.string.lucullus_name,R.string.lucullus_description));

        //create an instance of the adapter for use
        LocationsListAdapter adapter = new LocationsListAdapter(getActivity(),locations);

        //get the id of the ListView
        ListView listView =  rootView.findViewById(R.id.list);

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
                else if(position == 6){
                    Intent IntentLobster = new Intent(getActivity(),DetailsActivity.class);
                    IntentLobster.putExtra("LobsterFragment",6);
                    startActivity(IntentLobster);
                }
                else if(position == 7){
                    Intent IntentGarage = new Intent(getActivity(),DetailsActivity.class);
                    IntentGarage.putExtra("GarageFragment",7);
                    startActivity(IntentGarage);
                }
            }
        });
        return rootView;
    }
}