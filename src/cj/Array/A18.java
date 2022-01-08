package cj.Array;

import java.util.Arrays;

public class A18 {
    public static void main(String[] args) {
        // Write a Java program to find the second-smallest element in an array
        int[] array={15,64,8,78,2,6,47,26,79,6};
        int max=0;
       // Arrays.sort(array);
        for (int a:array) {
            System.out.print(a+" ");
        }
        for (int a:array) {
            if (a > max) {
                max = a;
            }
        }
        int min=max;
        for (int a:array) {
            if (a < min) {
                min = a;
            }
        }
        int secondSmallest=max;
        for (int a:array) {
            if((a<secondSmallest)&&(a>min))
                secondSmallest=a;
        }
        System.out.println("\nThe second smallest number is :"+secondSmallest);
    }
}
