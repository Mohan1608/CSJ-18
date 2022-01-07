import java.util.Scanner;

//class Test {

//        Scanner sc = new Scanner(System.in);
//        int y=0;
//        for(;y<10;++y){
//            System.out.println(y+" ");


    //   System.out.println(w+" "+x+" "+y+" "+z+" ");
    //  int i =5;
    //int j =(i*2)-2;
    //System.out.println(j);
    // int a =8%10;
    //   System.out.println(j);
    //System.out.println("Enter the no.");
    //int a = sc.nextInt();
        /*if ((a%2==0)&&(a!=2)){
            System.out.println("the no is not prime");
        }
        else if((a%3==0)&&(a!=3)){
            System.out.println("the no is not prime");
        }
        else if(a%4==0){
            System.out.println("the no is not prime");
        }
        else if((a%5==0)&&(a!=5)){
            System.out.println("the no is not prime");
        }
        else if(a%6==0){
            System.out.println("the no is not prime");
        }
        else if((a%7==0)&&(a!=7)){
            System.out.println("the no is not prime");
        }
        else if(a%8==0){
            System.out.println("the no is not prime");
        }
        else if(a%9==0){
            System.out.println("the no is not prime");
        }
        else if(a%10==0){
            System.out.println("the no is not prime");
        }
         else{
else {
        if (((aa - bb == 1) || (aa - bb == -1)) && ((bb - cc == 1) || (bb - cc == -1))) {
        count++;
        System.out.print(val + " ");
        }
   System.out.println("The no is prime");
         }
    }*/
//}


public class Test {
    public static void main(String[] args) {
        Test tp = new Test();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of cases: ");
        int tc = sc.nextInt();
        for(int i=1; i<=tc; i++){
            System.out.println("Enter the cost price for test case np. " + i + ": ");
            int cp = sc.nextInt();
            System.out.println("CP: " + cp);
            System.out.println(tp.salePrice(cp) + " " + (tp.salePrice(cp) - cp));
        }
    }

    public int salePrice(int cp){
        int sp = 0;
        for(int i = cp+1; ; i++){
            if(isPallindrome(i)){
                sp = i;
                break;
            }
        }
        return sp;
    }

    public boolean isPallindrome(int a){
        int original = a;
        int digit = 0;
        int reverse = 0;

        while(a>0){
            digit = a%10;
            reverse = (reverse * 10) + digit;
            a = a/10;
        }
        return (original == reverse) ? true : false;
    }
}

