package cj.collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CkeckCollectionMethod_01  {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList d = new ArrayList();
        d.add(2);
        d.add(2);
        d.add(2);

        Collection c = new ArrayList();

//	It is used to insert an element in this collection.
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
//for adding a created collection as an element in new collection thrn we used
        al.addAll(d);

//It returns the total number of elements in the collection.
        System.out.println(al.size());

/*It is used to delete an element from the collection.
        There are two versions of remove() method:
       1. ArrayList remove(Object) that takes an Object to remove, and
       2. ArrayList remove(int) that takes an index to remove.*/

      /*1. */  al.remove(new Integer(2));// removes the first occurrence of 2
               al.remove(Integer.valueOf(2));// also removes the first occurrence of 2
               al.remove((Integer) 2); // also removes the first occurrence of 2

      /*2.  */al.remove(2);//this removes element present at index 2

//it is used to delete all the elements of the specified collection from the invoking collection.
        al.removeAll(d);

//it is used to delete all the elements of the collection that satisfy the specified predicate.
        System.out.println(al);
//it is used to delete all the elements of the collection that satisfy the specified predicate.
//there are two ways to use predicate 1. by implementing predicate interface and 2. by lambada
//(predicate means condition ex.-integer%2==0  means all the values which is multiple of 2 are removed)
/*1.*/  al.removeIf(new PredicateImpl());


/*2.*/  al.removeIf((Integer)->(Integer==6));
        System.out.println(al);
    }
}
class PredicateImpl implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        return integer==5;
    }
}
