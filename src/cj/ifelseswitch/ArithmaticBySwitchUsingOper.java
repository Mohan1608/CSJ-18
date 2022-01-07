package cj.ifelseswitch;
import java.util.Scanner;

public class ArithmaticBySwitchUsingOper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FNO\t :");
        int a = sc.nextInt();
        System.out.print("Enter Arithmatic operator\t :");
        String s = sc.next();
        System.out.print("Enter SNO\t :");
        int b = sc.nextInt();

        switch(s){
            case "+" :
                System.out.println("The Addition Result is :"+(a+b));
                break;
            case "-" :
                System.out.println("The Addition Result is :"+(a-b));
                break;
            case "*" :
                System.out.println("The Addition Result is :"+(a*b));
                break;
            case "/" :
                System.out.println("The Addition Result is :"+(a/b));
                break;
            case "%" :
                System.out.println("The Addition Result is :"+(a%b));
                break;
            default :
                System.out.println("Please Enter Any of + - * / % them");
                break;
        }
    }
}
