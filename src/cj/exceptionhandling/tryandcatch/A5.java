package cj.exceptionhandling.tryandcatch;

public class A5 {
    public static void main(String[] args) {
        System.out.println("1111");
        try {
            System.out.println("2222");
            int a=2/0;
        }
        catch (ArithmeticException e){
            try {
                System.out.println("3333");
                double d=2.5/0;
                System.out.println("java");
            }
            catch (NullPointerException ex){
                System.out.println("4444");
            }
            System.out.println("xxx");
        }
        System.out.println("5555");
    }
}
