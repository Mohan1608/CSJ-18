package cj.ForLoop;

import java.util.Scanner;

public class PickUniqueNoFrom1to1000 {
    /*  Print the number having differance in consecutive digit is 1 or -1, the  number is minimum
     2 digit and take limit from user for maximum.Also count the how many numbers present between
     the range   */
    static int count;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the max number upto you have to check ");
        int max=sc.nextInt();
        for (int i = 1; i <= max; i++) {
            check(i);
        }
        System.out.println();
        System.out.println("The number of digit is :\t"+count);
    }
    public static void check(int value) {
        int val=value;
        int a=val;
        int b;
        boolean flag=false;
        while(a!=0) {
            b = val % 10;
            a = val / 10;
            int c = a % 10;
            val = a;
            if ((a != 0)) {
                if (Math.abs(c-b)==1) { //(Math.abs(c-b)==1) it is equal to((c-b==1) || (c-b==-1))
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.print(value+" ");
            count++;
        }
    }






//This is for rigid nature only upto 1000
      /*  int a = val / 10;
        int aa = val % 10;
        int b = a / 10;
        int bb = a % 10;
        int c = b / 10;
        int cc = b % 10;*/

       /* if (val < 99) {
            if (((aa - bb == 1) || (aa - bb == -1))) {
                count++;
                System.out.print(val + " ");
            }
        } else {
            if (((aa - bb == 1)||(aa - bb == -1)) && ((bb - cc == 1)||(bb - cc == -1))) {
                count++;
                System.out.print(val + " ");
            }*/
          /*this wrong because it didnt check in case of 101,656,..... because if the differance between
          1st and 2nd is +ve 1 and 2nd and 3rd have -1
            else if ((aa - bb == -1) && (bb - cc == -1)) {
                count++;
                System.out.print(val + " ");
            }*/
        /*}
    }
*/

}
