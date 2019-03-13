package stringcheesedevs.android.apps.com.trailblazer.Utils;

import stringcheesedevs.android.apps.com.trailblazer.Models.City;

import java.util.List;
import stringcheesedevs.android.apps.com.trailblazer.Utils.CityUtils.*;

public class AIUtils {

    public static double getMeanDistance(List<City> cities, City cur){
        int sum=0;
        for(City c:cities){
            sum+=CityUtils.getDistanceKm(c.getLatitude(),cur.getLatitude(),c.getLongitude(),cur.getLongitude());
        }
        return (double)sum/(double)cities.size();
    }



}
