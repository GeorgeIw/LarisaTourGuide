package com.example.android.larisatourguide;

public class Locations {

    private int mLocationImage;
    private int mLocationName;
    private int mLocationDescription;

    public Locations(int LocationImage, int LocationName, int LocationDescription) {
        mLocationImage = LocationImage;
        mLocationName = LocationName;
        mLocationDescription = LocationDescription;
    }

    public int getLocationImage() {
        return mLocationImage;
    }

    public int getLocationName() {
        return mLocationName;
    }

    public int getLocationDescription() {
        return mLocationDescription;
    }
}