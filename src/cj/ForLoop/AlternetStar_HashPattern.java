package cj.ForLoop;

import java.util.Scanner;

public class AlternetStar_HashPattern {           //if input number is 5 then
                                                  //        *####
    public static void main(String[] args) {      //        ###**
        Scanner sc = new Scanner(System.in);      //        ***##
        System.out.println("Enter line no.");     //        ###**
        int line = sc.nextInt();                  //        *####
        int hc=1;
        int jc=line-1;
        if(line%2==0){
            line=line+1;
        }
        for (int i = 0; i < line; i++) {
            if((i>(line)/2)) {
                hc--;
                jc++;
            }
                if (i % 2 ==0) {
                    for (int j = 1; j <= hc; j++) {
                        System.out.print("*");
                    }
                    for (int k =1; k<=jc; k++) {
                        System.out.print("#");
                    }
                }
                else {
                    for (int j = 1; j <= jc; j++) {
                        System.out.print("#");
                    }
                    for (int k = 1; k<=hc; k++) {
                        System.out.print("*");
                    }
                }
            System.out.println();
                if(i<(line)/2){
                    hc++;
                    jc--;
                }
        }
    }
}
