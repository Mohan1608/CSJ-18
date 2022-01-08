package cj.exceptionhandling.tryandcatch;

public class A4 {
    public static void main(String[] args) {
        System.out.println("111");
        try{
            System.out.println("222");
            int a=10/0;
        }
        catch (ArithmeticException e){
            try{
                System.out.println("333");
                int ab=10/0;

            }
            catch (NullPointerException ex){
                System.out.println("444");

            }

        }
        System.out.println("555");
    }
}
