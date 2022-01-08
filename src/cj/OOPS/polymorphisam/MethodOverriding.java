package cj.OOPS.polymorphisam;

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new B();
        // a.printName();  error coz by using upcasting we can only
        //only call overridden method of child class
        //and A class method is private so we can not call it
        //outside the class
    }
    
}
class A{    
    private void printName(){
        System.out.println("A name");
    }
}
class B extends A{
    public void printName(){
        System.out.println("B name");
    }
}
