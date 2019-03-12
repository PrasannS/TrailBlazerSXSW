package stringcheesedevs.android.apps.com.trailblazer.Models;

import android.util.Log;

import java.text.DecimalFormat;

public class City {
    String picURL;
    String description;
    String name;
    String tourCode;
    double latitude;
    double longitude;

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

    public static double getDistanceKm(City s, City o) {
        int Radius=6371;//radius of earth in Km
        double lat1 = s.latitude;
        double lat2 = o.latitude;
        double lon1 = s.longitude;
        double lon2 = o.longitude;
        double dLat = Math.toRadians(lat2-lat1);
        double dLon = Math.toRadians(lon2-lon1);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
        Math.sin(dLon/2) * Math.sin(dLon/2);
        double c = 2 * Math.asin(Math.sqrt(a));
        double valueResult= Radius*c;
        double km=valueResult/1;
        DecimalFormat newFormat = new DecimalFormat("####");
        int kmInDec =  Integer.valueOf(newFormat.format(km));
        double meter=valueResult%1000;
        int  meterInDec= Integer.valueOf(newFormat.format(meter));
        //Log.i("Radius Value",""+valueResult+"   KM  "+kmInDec+" Meter   "+meterInDec);

        return Radius * c;
    }
}
