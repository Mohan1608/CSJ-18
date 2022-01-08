package cj.practice;

public class NumberPatterrn2 {
    public static void main(String[] args) {
        int line=5;
        int count=0;
        int sum= 0;
        for (int i = 1; i <=line ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+sum+" ");
            }
            System.out.println();
                count++;
                sum=sum+count;
        }
    }
}
