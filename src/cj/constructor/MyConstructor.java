package cj.constructor;

public class MyConstructor {
    /*there are 3 types of constructor
    1.default constructor
    2.zero parameterised and
    3.parameterised

     */
    MyConstructor(){
        this(10);
        System.out.println("this is 0 parameterise constructor");
    }
    MyConstructor(int x){
        System.out.println("i am from 1 parameterise constructor");
    }
    MyConstructor(int x,int y){
        this();
        System.out.println(" i am from parameterise 2 parameterise constructor "+x);

    }
    public static void main(String[] args) {
        MyConstructor m=new MyConstructor(10,20);
    }
     /* you uderstood what happenend here?
     yes,we call only one constructor(2 parameterise),but all 3 are executing because
     i write down the execution flow of this progrom are as follow:
     1.Jvm enter in class and find class level variacles,then static block if not find
      jvm go to main method.
     2.after finding main method jvm enters in that method,in main method we create the
      object of current class and passing arguments(here by passing 2 arguments
      indirectly we call only 2 parameterise constructor),now jvm goes to 2 prameterise
      constructor.
     3.now jvm not goes to sop statement befor that we write this() so jvm goes to zero
      parameterise constructor.
     4.after reaching in zero parameterise we write this(10) means here we calling 1
       parameterise consteuctor by passing argument for 1 parameterise constructor.
     5.now jvm goes in 1 parameterise constructor and goes on sop statement, and
      printing
      the statement.
     6.after that jvm return in zero parameterise constructor and now goes to sop
      statement and printing this.
     7.after that jvm goes return in 2 parameterise constructor and goes on sop
      statement and printing this statement.
     8.now jvm return in main method and goes beneath of object creation statement,
      jvm does not find here anything so it exit from method after exit from class and
      process end

     */

}
