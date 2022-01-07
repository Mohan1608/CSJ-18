package cj.ifelseswitch;
import java.util.Scanner;

class VowelOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The character :");
        char ch = sc.next().charAt(0);

        if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U')){
            System.out.println("The Entered Charcter is : VOWEL");
        }
        else{
            System.out.println("The Entered character is : NOT VOWEL");
        }
    }

}
