package cj.String;

public class CountNoOfDupli_01 {
    public static void main(String[] args) {
        String s="success cyber cyber success success";

        String[] str=s.split(" ");

        StringBuilder sb1=new StringBuilder();
        for (int i= 0;i<str.length; i++) {
            String s2=new String(sb1);
            int count=0;
            for (int j =i+1; j <str.length ; j++) {

                if(s2.contains(str[i])){
                    continue;
                }
                if (str[i].equals(str[j])) {
                    count++;
                    s2=str[i];
                 }
            }
                if (count>0) {
                    System.out.println(str[i] + " = " + count);
                    sb1.append(str[i]);
                }
        }
       /* System.out.println(flag?"The number of duplicate words in given string : "+count:"there is no duplicate" +
                " word in String");*/
    }
}
