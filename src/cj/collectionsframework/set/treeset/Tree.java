package cj.collectionsframework.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        Set ts =new TreeSet();

        ts.add(10);
        ts.add(10);
        ts.add(9);
        ts.add(8);
        ts.add(7);
        ts.add(5);
        ts.add(1);
        ts.add(1);//for adding data in treeset we required unique data
//        ts.add(null);  we cannt add null in tree set but we can add it in linkedhashset
//        ts.add("String"); we cant add heterogeneous data directly in tree set

        System.out.println((ts));
    }
}

