package cj.collectionsframework.set.treeset.addhetrogeneousdata_comparethem;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Student s1=new Student(1, "Mohan");
        Student s3=new Student(2, "Rahul");
        Student s2=new Student(3, "Saurabh");

        TreeSet ts=new TreeSet();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        //System.out.println(ts.toString());      i can use

        /*Iterator it =ts.iterator();             i can also use this
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        System.out.println(ts);
    }
}
