package cj.practice;

public class ClairyovantPrograms {
    /*public static void main(String[] args){
        String str ="cyber success is good institute";
        for(char i=65;i<=119;i++){
            int count=0;
            boolean flag=false;
            for (int j=0;j<str.length();j++){
                if(i==str.charAt(j)){
                    count++;
                    flag=true;
                }
            }
            System.out.print(flag?i+" "+count+"\n":"");
        }
    }*/

    /*public static void main(String[] args){
        int[] marks={50,100,46,58,98,75,21,35,75,61,78,49,59,58,66,15,63,25,62,8,33,21,8,9,3,2,6};
        int sum=0;
        int minus=0;
        for (int i = 0; i < marks.length ; i++) {
                if(marks[i]>=50){
                    sum=sum+1000;
                }
                else if(marks[i]<50){
                    minus=minus+500;
                }
        }
        System.out.println(sum-minus+"  "+sum+"    "+minus);
    }*/

    public static void main(String[] args) {
        int ammout=5400;
        int n1=2000;
        int n2=500;
        int n3=200;
        int n4=100;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
            b= ammout/2000;
            ammout=ammout-(b*2000);

            if(ammout!=0) {
                c = ammout / 500;
                ammout = ammout - (c * 500);
            }
            if(ammout!=0){
                 d = ammout / 200;
                ammout = ammout - (d * 200);
            }
            if(ammout!=0){
                 e = ammout / 100;
                ammout = ammout - (e * 100);
                System.out.println();
            }
        System.out.println("No. of 2000 notes is :"+b);
        System.out.println("No. of 500 notes is :"+c);
        System.out.println("No. of 200 notes is :"+d);
        System.out.println("No. of 100 notes is :"+e);
    }
}


