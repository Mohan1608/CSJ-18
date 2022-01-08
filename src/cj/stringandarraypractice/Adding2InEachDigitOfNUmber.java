package cj.stringandarraypractice;

public class Adding2InEachDigitOfNUmber {
    public static void main(String[] args) {
        int a=4597;
        int digit=0;
        int sum=0;
        while(a>0){
            int b=a%10;
            int c=a/10;
            a=c;
            b=b+2;
            if(b>9){
                b=b%10;
                digit=digit*10+(b);
            }
            else {
                digit = digit * 10 +b;
            }
        }
        while (digit>0){
            int digi=digit%10;
            int f=digit/10;
            digit=f;
             sum=sum*10+digi;
        }
        System.out.println(sum);
    }

}
