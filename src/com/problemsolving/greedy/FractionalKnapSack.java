package com.problemsolving.greedy;

import java.util.*;

public class FractionalKnapSack {
    public static double getMaxValue(double[] w, double[] v, double c) {
        int len = v.length;
        List<Item> itemlist = new ArrayList<>();
        for(int i = 0; i < len; i++){
            Item item = new Item(w[i],v[i],i);
            itemlist.add(item);
        }

        Collections.sort(itemlist, (it1, it2) -> (int)it2.cost - (int)it1.cost);

        double totalValue = 0;
        for(Item item: itemlist){
            double currWeight = item.w;
            double currValue = item.v;
            if(c - currWeight >= 0){
                totalValue += currValue;
                c = c - currWeight;
            }else{
                double fraction = ((double) c / (double) currWeight); // only a fraction of it can be obtained!
                totalValue += (currValue * fraction);
                c = (double)(c - (currWeight * fraction));
                break;
            }
        }
        return totalValue;
    }

    static class Item{
        double w,v,i;
        double cost;

        public Item(double w, double v, double i){
            this.w = w;
            this.v = v;
            this.i =  i;
            cost = v / w;
        }
    }

    public static void main(String[] args) {
        double[] weights = {2, 1, 6, 0.5, 0.25, 7};
        double[] values = {50, 70, 100, 50, 30, 99};
        int capacity = 10;
        System.out.println(getMaxValue(weights, values, capacity));
    }
}
