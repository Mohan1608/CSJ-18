package cj.Array;

import java.util.Scanner;

public class A9 {
/*
    Write a program to print print Matrix of user defined rows and
    columns and also accept values of rows and columns
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first step to accept the input for no rows and columns
        System.out.println("Enter number of rows");
        int rows    = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        //second step declare and initialise an array
        int[][] array=new int[rows][columns];

        //third step Accept values for rows and columns
        System.out.println("Enter the values :");
        for (int row=0;row<rows;row++){
            for(int column=0;column<columns;column++){
                array[row][column]=sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        //print the accepted values int matrix format
        for (int row=0;row<rows;row++){
            for (int column=0;column<columns;column++){
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }

    }
}
