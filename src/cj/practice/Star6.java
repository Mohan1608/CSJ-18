package cj.practice;

public class Star6 {
    public static void main(String[] args){
        int lines=5;
        for(int i=1;i<=lines;i++){
            int count=0;
            for(int j=1;j<i;j++){
                System.out.print(" ");
                count++;
            }
            for(int j=lines*2-(i+count);j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
