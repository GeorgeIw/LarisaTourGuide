package com.example.android.larisatourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.larisatourguide.Entertainment;
import com.example.android.larisatourguide.R;

import java.util.ArrayList;

public class EntertainmentListAdapter extends ArrayAdapter<Entertainment>{

    //create the new EntertainmentListAdapter object
    //set the constructor of the new object
    public EntertainmentListAdapter(Context context, ArrayList<Entertainment> fun){
        super(context, 0 ,fun);
    }

    //takes the views for use and set's their variables
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //check if an existing view is reused, otherwise inflate the view
        View EntertainmentView = convertView;
        if(EntertainmentView == null){
            EntertainmentView = LayoutInflater.from(getContext()).inflate(R.layout.entertainment_layout,parent,false);
        }

        //get the Entertainment object located at this position of the list
        Entertainment CurrentEntertainment = getItem(position);

        //get the TextView with id.location_ent_name
        TextView CoffeePlaceName = EntertainmentView.findViewById(R.id.location_ent_name);

        //get the LocationName from the currentEntertainment object
        //set the text at the TextView coffeePlaceName
        CoffeePlaceName.setText(CurrentEntertainment.getLocationName());

        //get the TextView with id.location_ent_address
        TextView CoffeePlaceAddress = EntertainmentView.findViewById(R.id.location_ent_address);

        //get the Address from the currentEntertainment object
        //set the text at the TextView CoffeePlaceAddress
        CoffeePlaceAddress.setText(CurrentEntertainment.getAddress());

        //get the TextView with id.location_ent_number
        TextView CoffeePlacePhone = EntertainmentView.findViewById(R.id.location_ent_number);

        //get the PhoneNumber from the CurrentEntertainment object
        //set the text at the TextView CoffeePlacePhone
        CoffeePlacePhone.setText(CurrentEntertainment.getPhoneNumber());

        return EntertainmentView;
    }
}
