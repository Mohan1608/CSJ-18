package cj.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class A22 {
/*    Write a Java program to find a given element whether present in
 the array by using binary search.*/

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] array={4,6,76,24,54,68,16,16,64,46};
        System.out.println("The given array is");
        for (int a:array) {
            System.out.print(a+" ");
        }
        System.out.println("\nEnter the element to check wheather the present or not ");
        int element=sc.nextInt();

        Arrays.sort(array);
        int min=0;
        int max=array.length-1;
        int mid=(min+max)/2;
        boolean flag=false;

        while(min<=max){

            if (element<array[mid]){
                max=mid-1;
                mid=((max+min)/2);
            }
            else if(element>array[mid]){
                min=mid+1;
                mid=((max+min)/2);
               // mid=min+((max-min)/2);
            }
            else if(element==array[mid]){
                System.out.println("The element is found");
                flag= true;
                break;
            }
        }
        System.out.println(flag==true?"\nthe element "+element+" is found in given array":"the" +
                " element "+element+" is not found in given array ");
    }
}
