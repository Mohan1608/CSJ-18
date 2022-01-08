package cj.practice;

public class Star4 {
    public static void main(String[] args) {
        int lines = 5;
        int count = 0;
        //for loop of line
        for (int i = 0; i < lines; i++) {
            count++;
            //for loop of Space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //for loop of Star
            for (int k = i; k < lines; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
