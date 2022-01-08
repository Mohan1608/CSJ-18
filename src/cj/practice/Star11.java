package cj.practice;

public class Star11 {
    public static void main(String[] args){
        int lines=5;
        for (int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=lines;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
