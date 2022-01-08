package cj.ifelseswitch;
import java.util.Scanner;

class VoterEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the AGE of voter");
        int a = sc.nextInt();

        if(a<19){
            System.out.println("The voter is ELIGIBLE");
        }
        else{
            System.out.println("The voter is NOT ELIGIBLE");
        }
    }
}
