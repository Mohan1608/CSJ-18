package cj.exceptionhandling.tryandcatch;

public class Arithmatic {
    public static void main(String[] args) {

            try {
                for (int i=1;i<=5;i++) {
                    System.out.println(i);

                    int a = 10;
                    int b = 0;
                    int c = a / b;
                    System.out.println(c);
                }
            }
            catch (ArithmeticException e){

            }
    }
}
