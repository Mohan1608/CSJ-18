package cj.Array;

public class A7 {
/*
    Write a program to find the maximum element in a java array

*/
    public static void main(String[] args) {
        int[] a={45,-76,-6,-84,-735,-37,-75,-775,-541};
        int max=0;
        for (int e:a){
            if(e>max){
                max=e;
            }
        }
        System.out.println(max);
    }
}
