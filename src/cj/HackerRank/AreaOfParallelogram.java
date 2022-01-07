package cj.HackerRank;

import java.util.Scanner;

public class AreaOfParallelogram {
    static int H;
    static int B;
    static boolean flag;
    static{
        Scanner sc=new Scanner(System.in);
        H=sc.nextInt();
        B=sc.nextInt();
        if((H>0)&&(B>0)) {
            flag=true;
        }
        else {
            System.out.println("java.lang.Exception: Breadth and " +
                    "height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
