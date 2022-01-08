package cj.ifelseswitch;

public class MaxOfThreeNumbers {
    public static void main(String[] args){
        int a = 45;
        int b = 42;
        int c = 14;
        if((a>b)&&(a>c)){
            System.out.println("The maximum number is"+a);
        }
        else if((b>a)&&(b>c)){
            System.out.println("The maximum no is"+b);
        }
        else{
            System.out.println("The Maximum number is"+c);
        }
    }
}
