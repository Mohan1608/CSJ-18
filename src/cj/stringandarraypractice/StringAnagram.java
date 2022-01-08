package cj.stringandarraypractice;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String sq1="pot is my";
        String sq2="top is my";
        isAnagram("keep","pee");
    }

    public static void isAnagram(String str1,String str2){
        String s1= str1.replaceAll("\\s","");
        String s2= str2.replaceAll("\\s","");

        boolean status=true;
        if(s1.length()==s2.length()) {
            char[] ch1 = s1.toLowerCase().toCharArray();
            char[] ch2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            status=Arrays.equals(ch1,ch2);
        }
        else {
            status=false;
        }
        System.out.println(status?str1+" and "+str2+" are anagrams":s1+" and "+s2+" are not anagrams");
    }
}
