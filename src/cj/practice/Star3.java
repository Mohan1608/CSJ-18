package cj.practice;

public class Star3 {
    public static void main(String[] args){
        int lines=5;
        for(int i=1;i<=lines;i++){
            for(int j=lines;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
