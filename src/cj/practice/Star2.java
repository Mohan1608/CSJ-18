package cj.practice;

public class Star2 {
    public static void main(String[] args){
        int line =5;
        int count = 0;

        for(int i=1;i<=line;i++){
            //Space for loop
            for(int j=line;j>i;j--) {
                System.out.print(" ");
            }
            //star for loop
            for(int k=1;k<=i;k++){
                System.out.print("*");
                }

            System.out.println();
        }
    }
}
