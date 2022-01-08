package cj.Array;

public class A12{
//  Write a program to find the index of an Array element

    public static void main(String[] args) {
        int[] array={22,24,85,47,96,98,35,34};
        int key =96;

        for(int i=0;i<array.length;i++){
            if (key==array[i]){
                System.out.println(i);
            }
        }

    }
}
