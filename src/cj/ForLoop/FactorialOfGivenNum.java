package cj.ForLoop;
import java.util.Scanner;

public class FactorialOfGivenNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int fact=1;
        for(int i=a;i>0;i--){
            fact*=i;
        }
        System.out.println(fact);
    }
}
