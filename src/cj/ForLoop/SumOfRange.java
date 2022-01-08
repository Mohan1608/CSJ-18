package cj.ForLoop;
import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter FNO");
        int a=sc.nextInt();
        System.out.println("Enter SNO");
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
