package stringcheesedevs.android.apps.com.trailblazer.Models;

import java.util.LinkedList;
import java.util.Objects;

public class storeTSP {
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
