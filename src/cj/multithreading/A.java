package cj.multithreading;


public class A implements Runnable {
    @Override
    public void run() {
       // B m=new B();

        even();
        System.out.println("i am from even 1");
        System.out.println("i am from even 2");
    }

    public void even()  {
        A m3=new A();
      //  Thread t=new Thread(m3);

    for(int i=2;i<=20;i+=2){
        System.out.println(i+Thread.currentThread().getName());
    }
}


    public static void main(String[] args) {

    }


}
