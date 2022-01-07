package cj.Array;

import java.util.Arrays;
import java.util.Scanner;

public class A21 {
  /*  Write a Java program to remove a specific element from
  an array using only one for loop.*/

    public static void main(String[] args) {
        int[] array={1,4,64,6,48,24,15,81,64};

        System.out.println("The given array is :");
        for (int a:array) {
            System.out.print(a + " ");
        }
        //Arrays.sort(array);
        System.out.println("enter the number you have to remove");
        Scanner sc=new Scanner(System.in);
        int removeele= sc.nextInt();

        for (int i = 0; i < array.length-1; i++) {
            if (removeele==array[i]){
                int temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
          array[array.length-1]=0;
        for (int a:array) {
            System.out.print(a+" ");
        }
    }
}

