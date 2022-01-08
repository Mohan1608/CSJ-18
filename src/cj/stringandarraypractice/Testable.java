package cj.stringandarraypractice;

public interface Testable {

    void m2();

   default int m1(){
        return 1;
    }
    static void m3(){
        System.out.println();
    }
}
