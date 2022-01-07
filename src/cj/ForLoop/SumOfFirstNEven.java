package cj.ForLoop;
import java.util.Scanner;
public class SumOfFirstNEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the even no you want sum:");
        int n=sc.nextInt();
        int sum =0;
        int count=1;
        for(int i=1;count<=n;i++){

            if(i%2==0){
                sum +=i;
                count++;

            }
        }
        System.out.println(sum);

    }
}
