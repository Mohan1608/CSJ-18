package cj.ifelseswitch;
import java.util.Scanner;
public class BillAmount {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount Single item\t :");
        double a = sc.nextDouble();
            System.out.println("Enter Quantity");
            int b = sc.nextInt();
        if(a<5000) {
            System.out.println("The Amount of Bill\t         :" + a*b);
            System.out.println("The Number of quantity\t :"     +b);
            System.out.println("10% Discount value\t         :" + (b*(a * 10 / 100)));
            System.out.println("The Total bill After 10% off\t :" + ((a - a * 10 / 100))*b);
        }
        else if ((a>=5000)&&(a<10000)){
            System.out.println("The Amount of bill\t         :" + a*b);
            System.out.println("The Number of quantity\t :"     +b);
            System.out.println("15% Discount value\t         :" + (b*(a * 15 / 100)));
            System.out.println("The Total bill After 15% off\t :" + (b*(a - a * 15 / 100)));
        }
        else if((a>=10000)&&(a<20000)){
            System.out.println("The Amount of bill\t         :" + a*b);
            System.out.println("The Number of quantity\t :"     +b);
            System.out.println("20% Discount value\t         :" + (b*(a * 20 / 100)));
            System.out.println("The Total bill After 20% off\t :" + (b*(a - a * 20 / 100)));
        }
        else if(a>=20000)  {
            System.out.println("The Amount of bill\t         :" + a*b);
            System.out.println("The Number of quantity\t\t :"     +b);
            System.out.println("50% Discount value\t         :" + (b*(a * 50 / 100)));
            System.out.println("The Total bill After 50% off :" + (a - a * 50 / 100)*b);
        }

    }

}
