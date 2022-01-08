package cj.Array;

public class A17 {
   /* Write a java program to find the second largest element in
    an Array*/

    public static void main(String[] args) {
        int[] array={1,5,9,778,5,4,69,4,9,48,4,6,47,54,54,4,7};
        int max=0;
        for (int i=0;i< array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        int secondmax=0;
        for (int e:array) {
            if((e>secondmax)&&(e<max)){
                secondmax=e;
           }
        }
        System.out.print(secondmax);
    }
}
