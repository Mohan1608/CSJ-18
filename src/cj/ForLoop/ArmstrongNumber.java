package cj.ForLoop;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int temp;
        int sum=0;
        while(b>0){
            temp=b%10;
            b=b/10;
            sum=sum+temp*temp*temp;
        }
        System.out.println((sum==a)?"ano. is armstrong":"it is not arm storng");
    }
}
