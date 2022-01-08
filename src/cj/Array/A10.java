package cj.Array;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        int[][] matrix1=acceptMatrix();
        System.out.println("the Entered matrix is:");
        printMatrix(matrix1);

        int[][] matrix2=acceptMatrix();
        System.out.println("the Entered matrix is:");
        printMatrix(matrix2);
        System.out.println();

        int[][] additionResult=addMatrices(matrix1,matrix2);
        if(additionResult !=null) {
            System.out.println("The addition of matrices is :");
            printMatrix(additionResult);
        }
    }
    static public  int[][] acceptMatrix(){
            Scanner sc  = new Scanner(System.in);

            System.out.println("Enter number of rows");
            int rows    = sc.nextInt();
            System.out.println("Enter number of columns");
            int columns = sc.nextInt();

            //second step declare and initialise an array
            int[][] matrix=new int[rows][columns];

            //third step Accept values for rows and columns
            System.out.println("Enter the values :");
            for (int row=0;row<rows;row++) {
                for (int column = 0; column < columns; column++) {
                    matrix[row][column] = sc.nextInt();
                }
            }
            return matrix;
        }
    public static void printMatrix(int[][] matrix){
        int rows=matrix.length;
        for (int rw=0;rw<rows;rw++){
            for (int cl=0;cl<matrix[rw].length;cl++){
                System.out.print(matrix[rw][cl]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(final int[][] matrix1,final int[][] matrix2) {
       int [][] result=null;
       if((matrix1.length==matrix2.length)&&(matrix1[0].length==matrix2[0].length)) {
            result = new int[matrix1.length][matrix1[0].length];

            for (int rw = 0; rw < matrix1.length; rw++) {
                int col = matrix1[rw].length;
                for (int cl = 0; cl < matrix1[0].length; cl++) {
                    result[rw][cl] = matrix1[rw][cl] + matrix2[rw][cl];
                }
            }

        }
        else {
            System.out.println("invalid input is provided for addition");
            System.out.println("Please enter matrices of same size");
        }
        return result;
    }
}
