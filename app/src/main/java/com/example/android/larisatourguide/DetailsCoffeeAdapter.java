package com.example.android.larisatourguide;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

public class DetailsCoffeeAdapter extends FragmentPagerAdapter {

    //context of the app
    private Context appContext;

    //create a new object DetailsCoffeeAdapter
    //create the constructor of the object
    public DetailsCoffeeAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        appContext = context;
    }

    //set the content of each tab at the TabLayout
    //the content is determined by the tab's position
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new LasRamblasFragment();
        }
        else if(position == 1){
            return new GossipFragment();
        }
        else if(position == 2){
            return new JaxxFragment();
        }
        else if(position == 3){
            return new KubrickFragment();
        }
        else if(position == 4){
            return new UndoFragment();
        }
        else if(position == 5){
            return new BollocksFragment();
        }
        else if(position == 6){
            return new LobsterFragment();
        }
        else{
            return new GarageFragment();
        }
    }

    //return the total number of pages
    @Override
    public int getCount() {
        return 8;
    }

    //set the title for each tab using it's position in the TabLayout
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return appContext.getString(R.string.las_ramblas_name);
        }
        else if(position == 1){
            return appContext.getString(R.string.gossip_name);
        }
        else if(position == 2){
            return appContext.getString(R.string.jaxx_name);
        }
        else if(position == 3){
            return appContext.getString(R.string.kubrick_name);
        }
        else if(position == 4){
            return appContext.getString(R.string.undo_name);
        }
        else if(position == 5){
            return appContext.getString(R.string.bollocks_name);
        }
        else if(position == 6){
            return appContext.getString(R.string.lobster_name);
        }
        else{
            return appContext.getString(R.string.garage_name);
        }
    }
}

