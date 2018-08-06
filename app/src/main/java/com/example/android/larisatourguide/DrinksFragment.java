package com.example.android.larisatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinksFragment extends Fragment {

    public DrinksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_locations, container, false);

        //create the ArrayList fun using the custom class Entertainment
        final ArrayList<Entertainment> fun = new ArrayList<>();
        //add the components of the ArrayList
        fun.add(new Entertainment(R.string.animal_name,R.string.animal_address,R.string.animal_phone));
        fun.add(new Entertainment(R.string.hamam_name,R.string.hamam_address,R.string.hamam_phone));
        fun.add(new Entertainment(R.string.suite_name,R.string.suite_address,R.string.suite_phone));
        fun.add(new Entertainment(R.string.people_name,R.string.people_address,R.string.people_phone));
        fun.add(new Entertainment(R.string.monk_name,R.string.monk_address,R.string.monk_phone));
        fun.add(new Entertainment(R.string.dikastiko_name,R.string.dikastiko_address,R.string.dikastiko_phone));
        fun.add(new Entertainment(R.string.barley_name,R.string.barley_address,R.string.barley_phone));
        fun.add(new Entertainment(R.string.skyfall_name,R.string.skyfall_address,R.string.skyfal_phone));

        //create an instance of the adapter for use
        EntertainmentListAdapter adapter = new EntertainmentListAdapter(getActivity(),fun);

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