package com.example.android.larisatourguide;

public class Entertainment {

    //declaration of private variables
    private int mPhoneNumber;
    private int mAddress;
    private int mLocationName;

    //create the constructor for this class
    public Entertainment(int LocationName, int Address, int PhoneNumber ){
        mLocationName = LocationName;
        mAddress = Address;
        mPhoneNumber = PhoneNumber;
    }

    //get the LocationName
    public int getLocationName(){return mLocationName;}

    //get the Address
    public int getAddress(){return mAddress;}

    //get the PhoneNumber
    public int getPhoneNumber(){return mPhoneNumber;}
}
