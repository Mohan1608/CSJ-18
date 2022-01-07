package cj.OOPS.abstraction.interfacecheck;

public interface Interface1 {
    int a=12;
//    int a; it is invalid because interface allows only
//    public static final variables. The variable is final thats why
//    we don't do declaration, final means we do not change assign
//    value, so at the time of declaration we have to assign it.

    public static final int b=20;
//    by default it take public static final we no need to write

    public static void main(String[] args) {
        System.out.println("i am from interface 1");
    }
}
