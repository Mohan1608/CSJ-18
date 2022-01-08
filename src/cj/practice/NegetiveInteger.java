package cj.practice;

import java.util.Scanner;

public class NegetiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(checkCondition(a,b,c));
    }
   static boolean checkCondition(int a,int b,int c){
        int aa=0;
        int bb=0;
        int cc=0;
        if(((a<0)&&(b>0)&&(c>0))||((a>0)&&(b<0)&&(c>0))||((a>0)&&(b>0)&&(c<0))){
            return true;
        }
       else {
           return false;
       }
    }
}
