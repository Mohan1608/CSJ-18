package cj.Array;

import java.util.Arrays;
import java.util.Scanner;

public class A20 {
  /*  Write a Java program to find a given element whether present in
   the array by using linear search.*/
  public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      int[] array = {1, 54, 98, 63, 14, 78, 65, 14, 35, 5};
      System.out.println("The given array is :");
      for (int a:array) {
          System.out.print(+ a + " ");
      }
      System.out.println("\nEnter the no. to check that is present or not ;");
      int check = sc.nextInt();
      boolean flag=false;
      Arrays.sort(array);
      for (int a:array) {
          if (a==check){
             System.out.println("The number "+check+" is present in given array");
              break;
          }
          else{
              flag=true;
              break;
          }
      }
      System.out.println(flag==true?"The number is not present in given array":" ");
  }
}

