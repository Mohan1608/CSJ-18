package cj.ifelseswitch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckAlphabetOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER CHARACTER");
        char ch =br.readLine().charAt(0);

        if((ch>=65)&&(ch<=90)){
            System.out.println("The Entered Alphabet is CHARACTER");
        }
        else if((ch>=97)&&(ch<=122)){
            System.out.println("The Entered Alphabet is CHARACTER");
        }
        else{
            System.out.println("The Entered Alphabet is NOT CHARACTER");
        }
    }
}
