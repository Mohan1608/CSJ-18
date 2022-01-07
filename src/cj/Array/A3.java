package cj.Array;

import java.util.Scanner;

public class A3 {
//    Print Array in reverse direction

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Taking user value for ARRAY elements
        System.out.println("Enter size of Array :");
        int size=sc.nextInt();
        int[] array=new int[size];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        //Now we are reversing the array
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }

    }
}
