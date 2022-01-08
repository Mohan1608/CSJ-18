package cj.ForLoop;

public class RangeOfPerfectNumber {
    public static void main(String[] args){

        for(int i=1;i<=1000;i++) {

            for(int j=1,sum=0;j<i;j++) {
                if (i % j == 0) {
                    sum += j;
                }
                if(sum==i){
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}
