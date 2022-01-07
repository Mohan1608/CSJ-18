package cj.collectionsframework.list.arraylist.arraylist_with_custom_object;

import java.util.*;

public class CustomObjects {
    public static void main(String[] args) {
        Employee emp1=new Employee(1, "mohan");
        Employee emp2=new Employee(4, "sachin");
        Employee emp3=new Employee(3, "saurabh");
        Employee emp4=new Employee(1, "yash");
        Employee emp5=new Employee(2, "mohan");

        List<Employee> ls= new ArrayList<>();

        ls.add(emp1);
        ls.add(emp2);
        ls.add(emp3);
        ls.add(emp4);
        ls.add(emp5);

       /* ListIterator it= ls.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
/**
*      FOR SORTING CUSTOM OBJECTS WE HAVE 2 OPTIONS
           ClairyovantPrograms. Comparator interface
           B. Comparable interface

        But, what is the need of Comparators compare() method if we have already Comparable's compareTo()?
        ANS= since comparable is implemented by same class whose objects we have to sort, so its binds you with
             that sorting logic means in short i have to say that we can override comparetTo() method only one time
             means we are binded that we sort only one field.
             but, in case of you have to sort on multiple field then what should i do? that that we go with
             Comparators compare() method it gives us facility to compare on multiple field.(do not confuse that
             multiple field means we did not compare multiple filed at a time, it means we have choice that we which
             one is choose by one click.)

        here we are write a separate class(Employee_Compare) for only implement Comparator interface,because suppose we
        did not have permission to change or modify Employee class that time we cant implement comparable or comparator
        there so java people use this technique that implement comparator interface in separate class and write logic
        there for comparison like on which basis you have to compare. After create class create that class object and
        pass in sort method as shown in below.
*/
//  ClairyovantPrograms i).  Employee_Compare com =new Employee_Compare();

        /**instead of creating object i can directly write by
           following way*/

//         Collections.sort(ls,new Employee_Compare());

/**  ClairyovantPrograms ii).  i can also write by using lambda expression shown in below: (when we use lambda expression that time we no
         need to create a separate class implement Comparator interface)*/
//         Comparator<Employee> em1=(ep1,ep2)->ep1.id-ep2.id;
//         Collections.sort(ls,em1);

/**  ClairyovantPrograms iii).  lambda expression use directly in sort method (for use this lambda expression in sort method we to specify
              our arraylist as a employee type by using Generics if we did not provide that it shows compile time error
              see line no 13, there i am provide Employee type Generic)
*/
//        Collections.sort(ls, (ep1,ep2) -> ep1.id - ep2.id);

/**          OR  (for String comparison we have used to compareTO() method which is override in String class*/

//        Collections.sort(ls,(ep1,ep2)->ep1.name.compareTo(ep2.name)); // this method is not from comparable
//        method

/**  ClairyovantPrograms iv).   COMPARISON ON MULTIPLE FIELD
 *            By using below technique we can do sorting on multiple field. In advanced we can use Switch case here
 *            for choosing on which field we have to compare,like by pressing 1. for sorting on the basis of id and
 *            press 2.for sorting on the basis of name.
  */
        Employee_Compare ec=new Employee_Compare();
        Collections.sort(ls,ec.compare_id);
        ls.forEach(System.out::println);
        System.out.println();

        Collections.sort(ls,ec.compare_name);
        ls.forEach(System.out::println);

        System.out.println();

/**   B i).   the below code is use when we are override comparable in Employee class so that time we have no need to
              write object pass object in sort method like comparator.
              NOTE: by using comparable we can not compare on multiple field and we can not sort if we did not have
                    permission to modify Employee class
 */
        Collections.sort(ls);
        ls.forEach(System.out::println);
    }
}

