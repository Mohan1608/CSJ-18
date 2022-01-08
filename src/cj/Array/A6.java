package cj.Array;
import java.util.Scanner;

public class A6 {
/*
    Calculate the average marks from an Array containing marks of
     all Student in Physics using for each loop
*/


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Student :");
        int size =sc.nextInt();
        int[] physics=new int[size];
        System.out.println("Enter marks of "+size+" Students :");
        for(int i=0;i<physics.length;i++){
            physics[i]=sc.nextInt();
        }
        int sum=0;
        for(int element:physics){
            sum+=element;
        }
        System.out.println("The average of physics marks of " +size+
                " students is : "+sum/size);
    }
}
