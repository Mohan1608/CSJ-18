package cj.String;



public class ReverseAString_07_01 {
    public static void main(String[] args) {
        String s="Cyber success is a good institute";
        String[] str=s.split(" ");
        int a=str.length;


            for (int j =str.length-1; j>=0 ; j--) {
                System.out.print(str[j]+" ");
            }

        }

   // }
}
