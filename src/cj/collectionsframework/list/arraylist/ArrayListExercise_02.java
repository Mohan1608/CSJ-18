package cj.collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise_02 {
    public static void main(String[] args) {
//Write a Java program to copy one array list into another.
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();

        list1.add("aa");
        list1.add("aa");
        list1.add("aa");
        list1.add("aa");

        list2.add("bb");
        list2.add("bb");
        list2.add("bb");
        list2.add("bb");
        System.out.println("list1 :"+list1);
        System.out.println("list2 :"+list2);
        Collections.copy(list1,list2);
        System.out.println("coping list2 into list1 \nAfter that:" );
        System.out.println("list1 :"+list1+"\nlist2 :"+list2);
    }
}
