package cj.collectionsframework.set.hashset.case2;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
/*consider in case2 what we achieve?
-here while adding custom objects in hashset,we have to restrict duplicate object in hashset will not be added.
-This achieve by overriding equals() method and hashcode() method.
-if we did not override equal method and just call equal method from object class that time object class
 equals method compares reference of two object not checked internal data.
-by overriding equals method we write logic what to compare and what not.
-if we compare 2 parameters that time equal method check both 2,if and only is these two field are common
 that time only object not added.if 2 of 1 is only match that time object will be added.

 -in below program i add 4 objects,among that 2 object having same name and id so jvm assume that is
 duplicate and didnt add them.
-Among that 4 object 1 object has only one field that is common so jvm didnt assume that is duplicate
 because we write logic inside equals method to compare 2 fields, if write logic for one field that time
 one one field will be compare.
 */
    public static void main(String[] args) {

            Employee d1=new Employee(101,"Mohan");
            Employee d2=new Employee(101,"Ram");
            Employee d3=new Employee(101,"Mohan");
            Employee d4=new Employee(104,"Suresh");

            Set hs=new HashSet();
            hs.add(d1);
            hs.add(d2);
            hs.add(d3);
            hs.add(d4);

            System.out.println(hs);
    }
}
