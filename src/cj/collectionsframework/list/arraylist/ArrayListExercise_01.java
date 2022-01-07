package cj.collectionsframework.list.arraylist;

import java.util.*;

public class ArrayListExercise_01 {
    public static void main(String[] args) {
//Write a Java program to create a new array list, add some colors (string) and print out the collection
        List<String> list =new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("yellow");
        list.add("pink");
        list.add("black");

//Write a Java program to iterate through all elements in a array list.
        Iterator iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//Write a Java program to insert an element into the array list at the first position
        list.add(0,"White");
        System.out.println(list);

//Write a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println(list.get(6));

//Write a Java program to update specific array element by given element.
        list.set(1,"grey");
        System.out.println(list);

//Write a Java program to remove the third element from a array list.
        list.remove(3);
        System.out.println(list);

//Write a Java program to search an element in a array list
        System.out.println(list.contains("grey"));

//Write a Java program to sort a given array list
// NOTE : here white is not sorted because we added it using index number,so its not changes its index
//        and one more thing you have remember while sorting that java is case sensitive so capital
//        letters comes first
        Collections.sort(list);
        System.out.println("After sorting :"+list);

//Write a Java program to reverse elements in a array list
        Collections.reverse(list);
        System.out.println("After reverse orde"+list);

//Write a Java program to shuffle elements in a array list
        Collections.shuffle(list);
        System.out.println("After shuffling"+list);

//Write a Java program to extract a portion of a array list
       List sub_list=list.subList(2,5);
        System.out.println("sub list :"+sub_list);

//Write a Java program to compare two array lists
        for (Object e:list) {
            System.out.println(sub_list.contains(e)?"yes":"no");
        }

//Write a Java program of swap two elements in an array list
        Collections.swap(list,2,0);
        Iterator ite=list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }

//Write a Java program to join two array lists
        List join=new ArrayList();
        join.addAll(list);
        join.addAll(sub_list);

        System.out.println(join);

        Iterator js= join.iterator();
        while (js.hasNext()){
            System.out.print( js.next()+" ");
        }

//Write a Java program to clone an array list to another array list
        ArrayList<String> clone =(ArrayList<String>) ((ArrayList<String>) join).clone();
        System.out.println(clone);

//Write a Java program to empty an array list
        join.clear();
        System.out.println(join);

//Write a Java program to test an array list is empty or not
        System.out.println(join.isEmpty());
        System.out.println(list.isEmpty());
    }
}
