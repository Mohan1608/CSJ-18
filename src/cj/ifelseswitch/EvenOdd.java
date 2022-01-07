package cj.ifelseswitch;
import java.util.Scanner;

public class EvenOdd {
     static void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");

        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("The given Number is : EVEN");
        }
        else{
            System.out.println("The given no is : ODD");
        }
        m1();
    }
    public static void main(String[] args){
        m1();
    }
}
