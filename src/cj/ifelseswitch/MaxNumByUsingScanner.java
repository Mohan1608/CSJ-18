package cj.ifelseswitch;
import java.util.Scanner;
public class MaxNumByUsingScanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter FNO");
        int a =sc.nextInt();
        System.out.println("Enter SNO");
        int b = sc.nextInt();
        System.out.println("Enter TNO");
        int c = sc.nextInt();

        if((a>b)&&(a>c)){
            System.out.println("The maximum Number is :"+a);
        }
        else if((b>a)&&(b>c)){
            System.out.println("The maximum Number is :"+b);
        }
        else{
            System.out.println("The maximum Number is :"+c);
        }
    }
}
