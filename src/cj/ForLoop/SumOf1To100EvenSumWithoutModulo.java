package cj.ForLoop;

public class SumOf1To100EvenSumWithoutModulo {
    public static void main(String[] args){
        int a=1;
        int b=100;
        int sum=0;
        for(int i=0;i<=b;i+=2){
                sum+=i;
        }
        System.out.println(sum);
    }
}
