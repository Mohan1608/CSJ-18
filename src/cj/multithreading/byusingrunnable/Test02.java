package cj.multithreading.byusingrunnable;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt=new MyThread();
        Thread t=new Thread(mt);
        mt.start();
    //    t.join(10000);
        for (int i=1;i<10;i++) {
            System.out.println(" main");

        }
    }
}
