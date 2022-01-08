package cj.COMPANY;

public class Solution {
    public static int romanToInt(String s) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        int j=0;
        int sum = 0;

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (i >= 1) {
                j= i - 1;
            }

                switch (ch[i]) {
                    case 'I': sum=sum+1;
                        break;

                    case 'V': sum+=5;
                        if(s.charAt(j)=='I') sum-=2;
                        break;

                    case 'X': sum+=10;
                        if(s.charAt(j)=='I') sum-=2;
                        break;

                    case 'L': sum+=50;
                        if(s.charAt(j)=='X') sum-=20;
                        break;

                    case 'C': sum+=100;
                        if(s.charAt(j)=='X') sum-=20;
                        break;

                    case 'D': sum+=500;
                        if(s.charAt(j)=='C') sum-=200;
                        break;

                    case 'M': sum+=1000;
                        if(s.charAt(j)=='C') sum-=200;
                        break;
                    }

            }


        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IIIIIV"));
    }
}
