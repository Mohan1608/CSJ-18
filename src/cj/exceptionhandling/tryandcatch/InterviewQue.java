package cj.exceptionhandling.tryandcatch;

public class InterviewQue {
    //which block is executed if try block and

    public static void m1(){
        try {
            int a=10;
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println(1);
        }
        finally {
            System.out.println(2);
        }
    }
    public static void main(String[] args) {
        m1();
    }
}
