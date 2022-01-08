package cj.practice;

public class NumberPaterrnDesc {
    public static void main(String[] args) {
        int line =5;
        for (int i = 1; i <=line ; i++) {
            for (int j = line; j >line-i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
