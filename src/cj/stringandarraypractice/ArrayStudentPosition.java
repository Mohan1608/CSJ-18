package cj.stringandarraypractice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayStudentPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] row={1,3,7,9};
        int targetStudent=sc.nextInt();

        for (int i = 0; i < row.length ; i++) {
            if (row[i]==targetStudent){
                System.out.println(i);
                break;
            }
            if(targetStudent==row[i]+2||targetStudent==row[i]+1){
                System.out.println(i+1);
                break;
            }
            if(targetStudent==row[i]-2||targetStudent==row[i]-1){
                System.out.println(i-1);
                break;
            }
        }
    }
}
