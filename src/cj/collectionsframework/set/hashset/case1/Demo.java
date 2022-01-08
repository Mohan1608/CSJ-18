package cj.collectionsframework.set.hashset.case1;

import java.util.HashSet;
import java.util.Set;

public class Demo {
/* what is the problem with case1?
-in this we are create 4 object,so all 4 object are created here we add duplicate data means id amd name of two
objects are same in hash but duplicate data will not be added in hashset then how it will be added? the answer is
here jvm compare data on the basis of reference of each object.
-We create 4 object so the reference of each object is store in each variable in d1,d2,d3,d4.
-When we add primitive value that time autoboxing is implemented means primitive value is converted into there
wrapper class object, and wrapper class override equals method so there data is compared not references of object are
compared.if wrapper class not override equal() method that time jvm compare on the basis of reference.

- Now we see in case 2 to after overriding equal method what happened.And always remember that equals method is
 tightly binded with hashcode() method. means when you override equal() method that time automatically hashcode()
 method is also override.
 */
    
    public static void main(String[] args) {
        Employee d1=new Employee(101,"Mohan");
        Employee d2=new Employee(101,"Mohan");
        Employee d3=new Employee(103,"Ramesh");
        Employee d4=new Employee(104,"Suresh");

        Set hs=new HashSet();
        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d2);
        hs.add(d4);

        System.out.println(hs);
    }
}
