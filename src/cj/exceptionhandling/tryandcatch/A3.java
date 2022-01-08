package cj.exceptionhandling.tryandcatch;

public class A3 {
        int x = 30, y = 0;
        void divide() {
            System.out.println("I am in method");
            try {
                System.out.println("I am in try block");
                int z = x / y;
                System.out.println("Result of z: " + z);
            }
            catch(NullPointerException np){
                System.out.println("I am in catch block");
            }
        }
        public static void main(String[] args) {
            A3 t = new A3();
            t.divide();
        }
/*in this program the Exception class written in Catch braces is
 not related to coming Exception from try block so, programme will be terminated
 abnormally. That measns it is as same as no try catch block is there. */
}
