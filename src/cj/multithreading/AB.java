package cj.multithreading;

public class AB {
   public static void main(String[] args) throws Exception{

       System.out.println(Thread.currentThread());

        A a= new A();
        B b= new B();
        AB ab=new AB();
        Thread t1= new Thread(a);
        Thread t2= new Thread(b);
        t2.start();
     //   t1.join(5000);
        t1.start();



    }
}
