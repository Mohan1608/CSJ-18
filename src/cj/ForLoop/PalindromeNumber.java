package cj.ForLoop;

public class PalindromeNumber {
    public static void main(String[] args){
        int number=125;
        int temp=number;
        int sum=0;
        int y=0;
        while(temp>0){
            y=temp%10;
            temp=temp/10;
            sum=sum*10+y;
        }
        System.out.println((sum==number)?"The no. is palindrome"
                :"The no. is not palindrome");
    }
}
