package cj.ifelseswitch;
import java.util.Scanner;
class PositiveOrNegativeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        if (a<0){
            System.out.println("The Entered No is : NEGATIVE");
        }
        else{
            System.out.println("The Entered No is : POSITIVE");
        }
    }
}
