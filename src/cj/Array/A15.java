package cj.Array;

import java.util.Arrays;
public class A15 {
  /*  Write a java program to insert an element(specific position)
   into an array*/

   public static void main(String[] args) {
       int[] array={1,2,3,5,6,7,8,9};
       int position=3;
       int element=4;

       for (int i=0;i< array.length+1;i++){
           if (i==position){
               array[i+1]=array[i];
               array[i]=element;

           }
       }
       for (int e:array) {
           System.out.print(e+" ");
       }
   }
}



