package cj.Array;


import java.util.Scanner;

class A23{
    public static void main(String[] args) {
    /*    Write a Java program to find all pairs of elements in
     an array whose sum is equal to a specified number.*/

        Scanner sc = new Scanner(System.in);
        int[] array = {1, 5, 7,2,86, 52, 45, 73, 4, 6, 3};
        System.out.println("write the sum of element you want from a pair of given array");
        int sum = sc.nextInt();
        boolean flag = false;
        int count=0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length - 1; j++) {

                if (sum == array[i]+array[j]) {
                    flag = true;
                    System.out.print(array[i]+" "+array[j] +" ");

                }
            }

        }

        System.out.print(flag==true?" are the elements of sum":"The sum is not possible in given" +
                " array elements");
    }
}