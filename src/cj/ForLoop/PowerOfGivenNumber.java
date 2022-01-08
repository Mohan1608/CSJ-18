package cj.ForLoop;
import java.util.Scanner;
public class PowerOfGivenNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base :");
        int base=sc.nextInt();
        System.out.println("Enter power :");
        int power=sc.nextInt();
        int ans=1;
        for(int i=1;i<=power;i++){
            ans=ans*base;
        }
        System.out.println("Enter"+ans);
    }
}
