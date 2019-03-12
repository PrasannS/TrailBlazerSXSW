package stringcheesedevs.android.apps.com.trailblazer.Utils;

import java.util.ArrayList;
import java.util.LinkedList;

import stringcheesedevs.android.apps.com.trailblazer.Models.City;

public class TourUtils {
    public static storeTSP empty = new storeTSP(0, new LinkedList<Integer>());
    public static LinkedList<Integer> genTSP(ArrayList<City> allCities)
    {
        storeTSP[][] memo = new storeTSP[allCities.size()][1 << (allCities.size() + 1)];
        for (int i = 0; i < memo.length; i++)
            for (int j = 0; j < memo[i].length; j++)
                memo[i][j] = empty;
        double[][] dist = new double[allCities.size()][allCities.size()];
        for (int i = 0; i < dist.length; i++) {
            for (int j = i + 1; j < dist[i].length; j++) {
                double btwn = CityUtils.getDistanceKm(allCities.get(i).getLatitude(), allCities.get(j).getLatitude(), allCities.get(i).getLongitude(), allCities.get(j).getLongitude());
                dist[i][j] = btwn;
                dist[j][i] = btwn;
            }
        }
        storeTSP best = stepTSP(0, 1, memo, allCities.size(), dist);
        return best.nodeOrder;
    }
    public static storeTSP stepTSP(int pos, int bitmask, storeTSP[][] memo, int numCities, double[][] dist)
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

class storeTSP {
    double dist;
    LinkedList<Integer> nodeOrder;

    public storeTSP(double dist, LinkedList<Integer> nodeOrder) {
        this.dist = dist;
        this.nodeOrder = new LinkedList<>();
        for (int i = 0; i < nodeOrder.size(); i++)
            this.nodeOrder.add(nodeOrder.get(i));
    }
    public void addNode(int i)
    {
        nodeOrder.addFirst(i);
    }
    public void setDist(double d)
    {
        dist = d;
    }
    public void setOrder(LinkedList<Integer> order)
    {
        nodeOrder.clear();
        for (int i = 0; i < order.size(); i++)
            nodeOrder.add(order.get(i));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        storeTSP storeTSP = (storeTSP) o;
        return Double.compare(storeTSP.dist, dist) == 0 &&
                nodeOrder.equals(storeTSP.nodeOrder);
    }

    @Override
    public int hashCode() {
        return (int) (dist * 13 + nodeOrder.hashCode());
    }
}
