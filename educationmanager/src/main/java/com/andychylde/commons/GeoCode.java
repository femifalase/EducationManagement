package com.andychylde.commons;

/**
 * Created by FEMI on 2017-04-05.
 *
 * @author Femi Falase
 * @version 0.0.1
 */
public class GeoCode {

    private double latitude, longitude;

    public GeoCode() {
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return
                "latitude: " + this.latitude + ", longitude: " + this.longitude;
    }
}
