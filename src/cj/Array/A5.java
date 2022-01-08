package cj.Array;

public class A5 {
    public static void main(String[] args) {
/*
        Write a java program to find out wheather a given integer
        is present in an array or not.
*/

        int[] a={45,25,66,89,45,88,50,12};
        int ab=25;
        boolean flag=false;
        for (int element:a) {
            if (ab == element) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("The value is present in Array");
        } else {
            System.out.println("The value is not present in Array");
        }
    }
}
