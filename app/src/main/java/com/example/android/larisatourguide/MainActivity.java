package com.example.android.larisatourguide;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity{

    //declaration of the images variables
    private int[] TabIcons = {R.drawable.food_icon,
            R.drawable.location_sightseeings,
            R.drawable.circle_coffee_icon,
            R.drawable.drinks_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sets the viewpager View
        ViewPager viewPager = findViewById(R.id.viewpager);

        //creates the instance of LocationsCategoryAdapter
        LocationsCategoryAdapter adapter = new LocationsCategoryAdapter(this,getSupportFragmentManager());

        //sets the new instance of the adapter to the viewpager
        viewPager.setAdapter(adapter);

        //gets the id of tablayout and connects it with viewpager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        //sets the images at each one of the tabs
        tabLayout.getTabAt(0).setIcon(TabIcons[0]);
        tabLayout.getTabAt(1).setIcon(TabIcons[1]);
        tabLayout.getTabAt(2).setIcon(TabIcons[2]);
        tabLayout.getTabAt(3).setIcon(TabIcons[3]);
    }
    }

