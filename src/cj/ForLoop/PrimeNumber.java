package cj.ForLoop;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The NUmber to check Wheather the number is prime or not :");
        int n =sc.nextInt();
        int count=0;
        for(int i=2;i<n/2;++i){
            if(n %i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The no is not prime");
        }
    }
}
