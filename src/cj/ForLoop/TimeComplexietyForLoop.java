package cj.ForLoop;
import java.lang.Object;

public class TimeComplexietyForLoop {
    public static void main(String[] args) {
        int n = 128 ;
        for (int i = 0; i < n; ) {
            System.out.print(i + " ");
            n = n/2 ;
        }
    }
}
