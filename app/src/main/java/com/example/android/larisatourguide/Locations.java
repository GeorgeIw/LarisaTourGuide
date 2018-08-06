package com.example.android.larisatourguide;

public class Locations {

    //declaration of private variables for this class
    private int mLocationImage;
    private int mLocationName;
    private int mLocationDescription;

    //create the object of the class
    //create the constructor of the object with these arguments
    public Locations(int LocationImage, int LocationName, int LocationDescription) {
        mLocationImage = LocationImage;
        mLocationName = LocationName;
        mLocationDescription = LocationDescription;
    }

    //get the LocationImage
    public int getLocationImage() {
        return mLocationImage;
    }

    //get the LocationName
    public int getLocationName() {
        return mLocationName;
    }

    //get the LocationDescription
    public int getLocationDescription() {
        return mLocationDescription;
    }

}