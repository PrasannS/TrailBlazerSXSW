package stringcheesedevs.android.apps.com.trailblazer.Models;

import android.util.Log;

import java.text.DecimalFormat;

public class City {
    String picURL;
    String description;
    String name;
    String tourCode;
    public double latitude;
    public double longitude;

    public City(String picURL, String description, String name, String tourCode, double latitude, double longitude) {
        this.picURL = picURL;
        this.description = description;
        this.name = name;
        this.tourCode = tourCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getpicURL() {
        return picURL;
    }

    public void setpicURL(String picURL) {
        this.picURL = picURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
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


}
