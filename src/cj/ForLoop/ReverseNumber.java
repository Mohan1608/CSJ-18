package cj.ForLoop;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int newnumber=number;
        int reverse=1;
        System.out.println("The reverse pf you number is\t :");
        while(newnumber>0){
            reverse=newnumber%10;
            newnumber=newnumber/10;

            System.out.print(reverse);
        }

    }
}
