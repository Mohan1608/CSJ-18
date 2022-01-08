package cj.ForLoop;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for Digit Addition\t :");
        int a=sc.nextInt();
        int sum = 0;
        for(int i=1;i>0;i++){
            sum+=a%10;
            a=a/10;
        }
        System.out.println(sum);
    }
}
