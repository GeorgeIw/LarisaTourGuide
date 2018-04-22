package com.example.android.larisatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;


public class LocationsCategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public LocationsCategoryAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new RestaurantsFragment();
        } else if(position == 1){
            return new SightseeingsFragment();
        } else if(position == 2){
            return new CoffeeFragment();
        } else {
            return new DrinksFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getString(R.string.category_restaurants);
        } else if(position == 1){
            return mContext.getString(R.string.category_sightseeings);
        } else if(position == 2){
            return mContext.getString(R.string.category_coffee);
        } else {
            return mContext.getString(R.string.category_drinks);
        }
    }
}
