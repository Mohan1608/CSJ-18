package cj.exceptionhandling.tryandcatch;

public class A2 {
    public static void main(String[] args) {
        try {
            for(int i=1;i<=5;i++){
                System.out.print(i+" ");
            }
            int a=10/0;
        }
        catch (ArithmeticException e){

        }
        System.out.println("\nout of try-catch block");
    }
}
