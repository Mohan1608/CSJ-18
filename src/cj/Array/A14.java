package cj.Array;

public class A14 {
/*    Write a java program to copy an array by iterating the array*/

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};

        int[] array1=new int[array.length];

        for (int i=0;i< array.length;i++){
            array1[i]=array[i];
        }
        for (int e:array1) {
            System.out.print(e+" ");
        }
    }
}
