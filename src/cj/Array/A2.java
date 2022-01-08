package cj.Array;

import java.util.Scanner;

public class A2 {
    /*Take 10 integers input from user and store
     them in array and print them on screen*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size ");
        int size =sc.nextInt();
        int []a =new int[size];

        System.out.println("Enter "+ size+" array elements :");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
 /*      This is 1st method to print elements      */
        System.out.print("The array elements are :");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
/*        This 2nd method to print elements      */
        for (int element:a){
            System.out.println(element);
        }
    }
}
