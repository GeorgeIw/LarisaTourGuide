package com.example.android.larisatourguide;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //set the upButton which is registered in manifest
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //get the id of the viewpager
        ViewPager viewPager = findViewById(R.id.viewpager);

        //create an instance of DetailsCoffeeAdapter
        DetailsCoffeeAdapter DcAdapter = new DetailsCoffeeAdapter(this,getSupportFragmentManager());

        //set the adapter to the viewpager
        viewPager.setAdapter(DcAdapter);

        //get the id of the TabLayout
        TabLayout tabLayout = findViewById(R.id.tabs);

        //connect the TabLayout with the viewPager
        tabLayout.setupWithViewPager(viewPager);

        //set the page of the ViewPager for each item clicked from the parent Activity (MainActivity)
        //when the conditions are met and the unique identifier of each clickable list item from the parent activity
        //is called, display the appropriate page at viewpager
        if(getIntent().hasExtra("LasRamblasFragment")){

            //set the the opening page of the ViewPager to the selected position (0)
            viewPager.setCurrentItem(0);
        }
        else if(getIntent().hasExtra("GossipFragment")){
            viewPager.setCurrentItem(1);
        }
        else if(getIntent().hasExtra("JaxxFragment")){
            viewPager.setCurrentItem(2);
        }
        else if(getIntent().hasExtra("KubrickFragment")){
            viewPager.setCurrentItem(3);
        }
        else if(getIntent().hasExtra("UndoFragment")){
            viewPager.setCurrentItem(4);
        }
        else if(getIntent().hasExtra("BollocksFragment")){
            viewPager.setCurrentItem(5);
        }
        else if(getIntent().hasExtra("LobsterFragment")){
            viewPager.setCurrentItem(6);
        }
        else if(getIntent().hasExtra("GarageFragment")){
            viewPager.setCurrentItem(7);
        }
        else {
            viewPager.setCurrentItem(0);
        }

    }
}
