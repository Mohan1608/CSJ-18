package cj.ForLoop;

public class PerfectNumber {
    public static void main(String[] args){
        int a=28;
        int ans=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                ans+=i;
            }
        }
        if (ans==a){
            System.out.println("the number is perfect");
        }
        else{
            System.out.println("the number is not perfect");
        }
    }
}
