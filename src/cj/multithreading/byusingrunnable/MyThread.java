package cj.multithreading.byusingrunnable;

public class MyThread extends Thread{
    public void run() {
        Thread t=new Thread();
        /*try {
            t.sleep(11000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */setName("MT-01");//here i set/change my thread name. thread-0 is
                        // the default name.
        for(int i=1;i<10;i++){
            System.out.println(i+" My Thread "+Thread.currentThread().getName());
            /*by using Thread.currentThread().getName() i am calling/printing the
              thread name.*/


        }
    }
}
