package com.example.android.quakereport;


/**
 * An {@link Earthquake} object contains information related to a single earthquake.
 */
public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private String mDate;

    /** Time of the earthquake, in milliseconds */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    //private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds when
     *  the earthquake happened
     */
    public Earthquake(double magnitude, String location, String date, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mTimeInMilliseconds = timeInMilliseconds;
       // mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the date of the earthquake.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */

}