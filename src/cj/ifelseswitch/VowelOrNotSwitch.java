package cj.ifelseswitch;
import java.util.Scanner;

public class VowelOrNotSwitch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Character\t :");
        char ch = sc.next().charAt(0);

        switch(ch){
            case 'a' :
                System.out.println("The Entered Character is Vowel\t :");
                break;
            case 'e' :
                System.out.println("The Entered Character is Vowel\t :");
                break;
            case 'i' :
                System.out.println("The Entered Character is Vowel\t :");
                break;
            case 'o' :
                System.out.println("The Entered Character is Vowel\t :");
                break;
            case 'u' :
                System.out.println("The Entered Character is Vowel\t :");
                break;
            case 'A':
                System.out.println("The Entered Character is Vowel\t :");
                break;
            case 'E':
                System.out.println("The Entered Character is Vowel\t :");
                break;
            case 'I':
                System.out.println("The Entered Character is Vowel\t :");
                break;
            case 'U' :
                System.out.println("The Entered Character is Vowel\t :");
                break;
            case 'O' :
                System.out.println("The Entered Character is Vowel\t :");
                break;

            default:
                System.out.println("The Entered Character is NOT Vowel\t :");
        }

    }
}
