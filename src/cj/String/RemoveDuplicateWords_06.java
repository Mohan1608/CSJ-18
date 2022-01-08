package cj.String;

import java.util.stream.IntStream;

public class RemoveDuplicateWords_06 {
    public static void main(String[] args) {
        String s = "success success cyber cyber success is is good good";
        String[] str1 = s.split(" ");

        StringBuilder sb1 = new StringBuilder();


        for (int i = 0; i < str1.length; i++) {
            boolean flag= true;
            String s1 = new String(sb1);
       //     for (int j = i + 1; j < str1.length; j++) {

                if (s1.contains(str1[i])) {
                    flag=false;
                    continue;
                }
                //sb1.append(str1[i]);
                if (flag) {
                    sb1.append(str1[i]+" ");
                }

        }
        System.out.println(sb1);

    }

}
