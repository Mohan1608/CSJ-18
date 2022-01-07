package cj.Array;

public class A8 {
/*
    Write a program to check wheather the given array is sorted
    or not
*/

    public static void main(String[] args) {
        int[] a = {1, 2, 6, 7, 8,10,11};
        boolean flag = true;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i+1]) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }
    }
}
