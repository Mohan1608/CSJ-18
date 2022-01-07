package cj.OOPS.abstraction;

public abstract class AbstractionDemo {
    abstract void m1();
    int a;
    static int b;
    // i can write/create constructor in abstract method
    AbstractionDemo(){
        a=10;
        b=20;
        int c=a+b;
        System.out.println("The addition result is \n:"+c+"     by the way i from con of abstract class");
    }
    // i can create block also in abstract class
    {
        System.out.println(" i am instance block of abstract class");
    }
    // i can create static/main method inside abstract class
    public static void main(String[] args) {
        System.out.println("i am from main method of abstract class");
    }


}
