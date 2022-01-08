package cj.collectionsframework.list.arraylist.arraylist_with_custom_object;

import java.util.Comparator;

public class Employee_Compare /*implements Comparator<Employee>*/ {

/**
    This is use when you have to compare on the basis of only one one filed*/
    /*@Override
    public int compare(Employee emp1, Employee emp2) {
           return emp1.id- emp2.id;
    }*/
    /**  the below logic we can also use in Employee class. we are write here because here we suppose to consider
     * that we did not have permission for modify Employee class so we can write here.
     *
     */
    Comparator<Employee> compare_name= new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
        }
    };

    Comparator<Employee> compare_id= new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.id-o2.id;
        }
    };

}

