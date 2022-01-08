package cj.ForLoop;

public class power {
    public static void main(String[] args){
        int base=4;
        int power=3;
        int sum=1;
        for(int i=power;i>0;i--){
            sum*=base;
        }
        System.out.println(sum);
    }
}
