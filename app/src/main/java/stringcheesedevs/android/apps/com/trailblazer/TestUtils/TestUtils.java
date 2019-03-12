package stringcheesedevs.android.apps.com.trailblazer.TestUtils;


import android.util.Log;

import java.util.ArrayList;
import java.util.LinkedList;

import stringcheesedevs.android.apps.com.trailblazer.Models.City;
import stringcheesedevs.android.apps.com.trailblazer.Models.Tour;

public class TestUtils {
    public static void main(String[] args)
    {
        Tour t = new Tour("","","");
        City austin = new City("", "", "", "", 30.2672, -97.7431);
        City chicago = new City("", "", "", "", 41.87811, -87.62979);
        City indianapolis = new City("", "", "", "", 39.7684, -86.15806);
        City nashville = new City("", "", "", "", 36.16266, -86.7816);
        ArrayList<City> list = new ArrayList<City>();
        list.add(austin); list.add(chicago); list.add(indianapolis); list.add(nashville);
        LinkedList<Integer> ls = t.genTSP(list);
        Log.d("tsp", ls.toString());
    }
}
