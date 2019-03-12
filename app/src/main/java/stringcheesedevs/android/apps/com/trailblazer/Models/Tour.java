package stringcheesedevs.android.apps.com.trailblazer.Models;

import android.support.v4.app.INotificationSideChannel;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tour {
    String code;
    String name;
    String website;
    storeTSP empty;
    public Tour(String code, String name, String website) {
        this.code = code;
        this.name = name;
        this.website = website;
        empty = new storeTSP(0, new LinkedList<Integer>());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public LinkedList<Integer> genTSP(ArrayList<City> allCities)
    {
        storeTSP[][] memo = new storeTSP[allCities.size()][1 << (allCities.size() + 1)];
        for (int i = 0; i < memo.length; i++)
            for (int j = 0; j < memo[i].length; j++)
                memo[i][j] = empty;
        double[][] dist = new double[allCities.size()][allCities.size()];
        for (int i = 0; i < dist.length; i++) {
            for (int j = i + 1; j < dist[i].length; j++) {
                double btwn = City.getDistanceKm(allCities.get(i), allCities.get(j));
                dist[i][j] = btwn;
                dist[j][i] = btwn;
            }
        }
        storeTSP best = stepTSP(0, 1, memo, allCities.size(), dist);
        return best.nodeOrder;
    }
    public storeTSP stepTSP(int pos, int bitmask, storeTSP[][] memo, int numCities, double[][] dist)
    {
        if (bitmask == (1 << numCities) - 1)
            return empty;
        if (!memo[pos][bitmask].equals(empty))
            return memo[pos][bitmask];
        storeTSP me = new storeTSP(999999, new LinkedList<Integer>());
        for (int i = 0; i < numCities; i++) {
            if (i != pos && (bitmask & (1 << i)) == 0) {
                storeTSP ret = stepTSP(i, (bitmask | (1 << i)), memo, numCities, dist);
                if (ret.equals(empty))
                {
                    ret.setDist(0);
                    ret.setOrder(new LinkedList<Integer>());
                    ret.addNode(i);
                }
                if (ret.dist + dist[pos][i] < me.dist) {
                    me.setDist(ret.dist + dist[pos][i]);
                    me.setOrder(ret.nodeOrder);
                }
            }
        }
        me.addNode(pos);
        return me;
    }
}
