package cj.multithreading;

public class B implements Runnable{
    @Override
    public void run() {
       // ClairyovantPrograms m=new ClairyovantPrograms();
        Thread t=new Thread();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        odd();
        System.out.println("I am from odd 1");
        System.out.println(" i am from odd 2");
    }

    void odd()  {

       // Thread t=new Thread(m4);

        for(int i=1;i<=20;i+=2){
            System.out.println(i+Thread.currentThread().getName());
        }
    }


}
