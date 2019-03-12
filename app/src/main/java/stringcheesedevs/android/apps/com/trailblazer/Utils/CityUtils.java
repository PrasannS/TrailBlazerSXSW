package stringcheesedevs.android.apps.com.trailblazer.Utils;

import java.text.DecimalFormat;

import stringcheesedevs.android.apps.com.trailblazer.Models.City;

public class CityUtils {
    public static double getDistanceKm(double sLat, double oLat, double sLong, double oLong) {
        int Radius=6371;//radius of earth in Km
        double lat1 = sLat;
        double lat2 = oLat;
        double lon1 = sLong;
        double lon2 = oLong;
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
