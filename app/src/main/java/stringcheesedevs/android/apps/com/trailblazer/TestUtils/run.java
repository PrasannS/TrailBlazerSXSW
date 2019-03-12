package stringcheesedevs.android.apps.com.trailblazer.TestUtils;

import android.util.Log;

import java.util.ArrayList;
import java.util.LinkedList;

import stringcheesedevs.android.apps.com.trailblazer.Models.Artist;
import stringcheesedevs.android.apps.com.trailblazer.Models.City;
import stringcheesedevs.android.apps.com.trailblazer.Models.Tour;
import stringcheesedevs.android.apps.com.trailblazer.Utils.TourUtils;

public class run {
    public static void main(String[] args)
    {
        Tour t = new Tour("","","");
        ArrayList<City> list = genRandCities(12);
        LinkedList<Integer> ls = TourUtils.genTSP(list);
        System.out.print(ls.toString());
    }
    public static ArrayList<City> genRandCities(int numCities)
    {
        ArrayList<City> list = new ArrayList<City>();
        for (int i = 0; i < numCities; i++)
            list.add(new City("", "", "", "", Math.random() * 200 - 100, Math.random() * 200 - 100));
        return list;
    }
    public static ArrayList<Artist> genRandArtists(int numArtists)
    {
        ArrayList<Artist> list = new ArrayList<Artist>();
        for (int i = 0; i < numArtists; i++) {
            String s = "";
            for (int j = 0; j < (int) (Math.random() * 10); i++)
                s += (char) (Math.random() * 26) + 97;
            String a = "";
            for (int j = 0; j < (int) (Math.random() * 50); i++)
                a += (char) (Math.random() * 26) + 97;
            list.add(new Artist(s, a, Long.valueOf((int) (Math.random() * 12351))));
        }
        return list;
    }
    public static ArrayList<Tour> genRandTours(int numTours)
    {
        ArrayList<Tour> list = new ArrayList<Tour>();
        for (int i = 0; i < numTours; i++) {
            String s = "";
            for (int j = 0; j < (int) (Math.random() * 10); i++)
                s += (char) (Math.random() * 26) + 97;
            String a = "";
            for (int j = 0; j < (int) (Math.random() * 50); i++)
                a += (char) (Math.random() * 26) + 97;
            String b = "";
            for (int j = 0; j < (int) (Math.random() * 50); i++)
                b += (char) (Math.random() * 26) + 97;
            list.add(new Tour(s,a,b));
        }
        return list;
    }
}
