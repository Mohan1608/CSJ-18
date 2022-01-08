package cj.collectionsframework.list.arraylist.arraylist_with_custom_object;


import com.sun.istack.internal.NotNull;

public class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(@NotNull Employee o) {
        return name.compareTo(o.name);
    }

    /*@Override
    public int compareTo( Employee o) {
        return  id - o.id;
    }*/

    public String toString() {
        return id + " " + name;
    }//own toString

    /*@Override
    public String toString() {
        return "Employee{" +                        //this is ide based
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }*/
}
