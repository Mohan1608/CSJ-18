package cj.multithreading.byusingrunnable;

public class Test {
    public static void main(String[] args) {
        C c=new C();
        Thread t= new Thread(c);
        t.start();
    }
}
