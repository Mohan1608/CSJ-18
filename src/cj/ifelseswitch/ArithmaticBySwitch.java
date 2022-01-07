package cj.ifelseswitch;
import java.util.Scanner;

public class ArithmaticBySwitch  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fno\t :");
        int a = sc.nextInt();
        System.out.print("Enter Sno\t :");
        int b = sc.nextInt();
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 for Modulo");
        int c = sc.nextInt();

        switch(c){
            case 1:
                System.out.println("The Addition Result is\t :"+(a+b));
            break;
            case 2:
                System.out.println("The Subtraction Result is\t :"+(a-b));
                break;
            case 3:
                System.out.println("The Multiplication Result is\t :"+(a*b));
                break;
            case 4:
                System.out.println("The Division Result is\t :"+(a/b));
                break;
            case 5:
                System.out.println("The Modulo Result is\t :"+(a%b));
                break;
            default:
                System.out.println("Please Enter number between 1 to 5");
        }
    }
}
