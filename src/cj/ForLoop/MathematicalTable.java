package cj.ForLoop;
import java.util.Scanner;
public class MathematicalTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int product;
        for(int i=1;i<=10;i++){
            product =a*i;
            System.out.println(product);
        }

    }
}
