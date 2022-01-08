package cj.practice;

public class Star7_1 {
    public static void main(String[] args) {
        int row = 5;
        int space = 1;
        int star = 1;
        for (int i = 1; i <= row * 2; i++) {
            if (i > row) {
                space--;
                star--;
            }
            for (int j = row; j > space; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (star * 2) - 1; j++) {
                System.out.print("*");
            }
            if (i < (row)) {
                space++;
                star++;
            }
            System.out.println();
        }
    }
}
