package cj.Array;

public class A19 {
    public static void main(String[] args) {
/*
        Write a program to check the equality of two arrays
*/


        int[] array1 ={1,2,3,4,5,6,7};
        int[] array2 ={1,2,3,5,6,7};
        int count=0;
        if(array1.length==array2.length){
                for (int j = 0; j < array2.length ; j++) {
                   if( (array1[j]==array2[j])) {
                       count++;
                   }
                }
        }
        System.out.println(count==array1.length?"The Given array is equals":"The Given array is not equals");
    }
}
