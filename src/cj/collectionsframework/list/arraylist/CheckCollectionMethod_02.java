package cj.collectionsframework.list.arraylist;

import java.util.ArrayList;

public class CheckCollectionMethod_02 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

//It is used to search an element(contains method)
//containAll method is used to search the It is used to search an element.
        System.out.println(list.contains(6));

//converts collection into array
        Object[] d= list.toArray();
        for (Object e:d) {
            System.out.print(e+" ");
        }
//write a program to print the hash code number of the collection.
        System.out.println(list.hashCode());

    }
}
