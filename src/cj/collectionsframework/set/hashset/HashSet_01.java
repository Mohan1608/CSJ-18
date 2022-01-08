package cj.collectionsframework.set.hashset;

import javafx.print.Collation;


import java.text.CollationElementIterator;
import java.util.*;

public class HashSet_01 {
    public static void main(String[] args) {
        HashSet hash =new HashSet();
        hash.add(15);
        hash.add(20);
        hash.add(25);
        hash.add(27);
        hash.add(27);

// we will not add null in hashset
//      hash.add(null);

        Set set =new HashSet();
        set.add(1);
        set.add(15);
        set.add(20);
        set.add(25);

//Write a Java program to compare two hash sets
        for (Object element:set){
            System.out.println(hash.contains(element));
        }
//For adding two set we have the following two way
        /*hash.addAll(set);
        System.out.println("This is normal"+hash);

        Set union =new HashSet(set);

        union.addAll(hash);
        System.out.println("This is union"+union);*/

//For finding intersection/common we have retainALl method
     /*   hash.retainAll(set);

        System.out.println(hash);*/


//If we want remove all element of other set
        /*hash.removeAll(set);
        System.out.println(hash);*/

// Iterate through all elements in a hash list.
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
//to get the number of elements in a hash set
        System.out.println(hash.size());

//to empty an hash set
       /* hash.clear();
*//*1.*//*    //System.out.println(hash);
*//*2.*//*     hash.removeAll(hash);
        System.out.println(hash);
*/
//to convert a hash set to an array
        Object[] c=hash.toArray();
        System.out.println(Arrays.toString(c)+" conted to array");

//to convert a hash set to a tree set
        Set tree_set =new TreeSet();
        tree_set.addAll(hash);
        System.out.println(tree_set+" treeset");



    }
}
