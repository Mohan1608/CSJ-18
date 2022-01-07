package cj.Array;

public class A13 {
   /* Write a java program to remove a specific element from array*/
   public static void main(String[] args) {
       int[] array={4,6,87,8,35,78,95,74};

       int key=35;

       for(int i=0;i< array.length;i++){
           if(key==array[i]){
               for (int j=i+1;j< array.length;j++){
                   int temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;
                   break;
               }
           }
       }
       array[array.length-1]=0;
       for (int e:array) {
           System.out.print(e+" ");
       }
   }
}
