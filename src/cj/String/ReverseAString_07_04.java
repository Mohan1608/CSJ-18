package cj.String;

public class ReverseAString_07_04 {
    public static void main(String[] args) {
        String s="i am student of cyber success";
        String str="";
        char[] ch1=s.toCharArray();
        StringBuilder b =new StringBuilder();

        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            str=ch + str;

        }
        for (int i =s.length()-1; i >=0; i--) {
            b.append(ch1[i]);
        }
        System.out.println(str);
        System.out.println(b);
    }

}
