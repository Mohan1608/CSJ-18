package cj.practice;

public class Star5 {
    public static void main(String[] args){
        int lines=5;

        for(int i=1;i<=lines;i++) {
            for (int j = lines - i; j > 0; j--) {
                System.out.print(" ");
            }
                for (int k = 1; k <= (i * 2) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}
