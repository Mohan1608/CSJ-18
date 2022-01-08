package cj.practice;

public class Star9 {
    public static void main(String[] args){
        int lines=5;
        for(int i=1;i<=lines;i++){
            for(int j=lines-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=lines-1;i>0;i--){
            for(int j=lines-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
