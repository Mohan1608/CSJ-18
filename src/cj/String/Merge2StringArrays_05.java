package cj.String;

import java.util.Arrays;

public class Merge2StringArrays_05 {
    public static void main(String[] args) {
        String s1="cyber success";
        String s2="is a good institute";

        //converting above string to Arrays
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");

        String[] merge=new String[str1.length+str2.length];

        for (int i =0, j=0; i < merge.length ; i++) {
            if(i< str1.length) {
                merge[i] = str1[i];
            }
            else{
                merge[i]=str2[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(merge));

    }



}
