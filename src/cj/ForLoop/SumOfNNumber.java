package cj.ForLoop;
import java.util.Scanner;
public class SumOfNNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number\t :");
        int a = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=a;i++){
            sum +=i;
        }
        System.out.print("The Sum of "+ a +" is\t :"+sum);
    }
}
