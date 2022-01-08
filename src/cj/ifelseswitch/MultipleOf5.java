package cj.ifelseswitch;
import java.util.Scanner;

public class MultipleOf5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int a = sc.nextInt();

        if (a%5==0){
            System.out.println("The Entered Number is Multiple of 5");
        }
        else{
            System.out.println("The Entered Number is not Multiple of 5");
        }
    }
}
