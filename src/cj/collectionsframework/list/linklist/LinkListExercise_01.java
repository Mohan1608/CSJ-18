package cj.collectionsframework.list.linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkListExercise_01 {
    public static void main(String[] args) {
//Write a Java program to append the specified element to the end of a linked list

        LinkedList link=new LinkedList();

        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        link.add(6);
        link.add(null);
        link.add('a');
        link.add("mohan");

        ListIterator lt =link.listIterator();
        while (lt.hasNext()){
            System.out.println(lt.next());
        }

//Write a Java program to iterate through all elements in a linked list starting at the specified position.
        Iterator it= link.listIterator(2);
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

//Write a Java program to iterate a linked list in reverse order.
        Iterator p=link.listIterator(8);
        while (((ListIterator<?>) p).hasPrevious()) {
            System.out.println(((ListIterator<?>) p).previous());
        }

//Write a Java program to insert the specified element at the specified position in the linked list
        link.add(1,'d');
        System.out.println(link);

//Write a Java program to insert elements into the linked list at the first and last position
        link.addFirst("First");
        link.addLast("Last");
        System.out.println(link);

//Write a Java program to insert some elements at the specified position into a linked list
        List list1 =new LinkedList();
        list1.add('x');
        list1.add('y');

        link.addAll(1,list1);
        System.out.println(link);

        

    }
}
