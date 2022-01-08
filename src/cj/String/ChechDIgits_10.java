package cj.String;

public class ChechDIgits_10 {
    public static void main(String[] args) {
        String s = "123456789";
        String[] str = s.split("");

       int count=0;
       char[] c=s.toCharArray();
        for (int i = 0; i < str.length; i++) {

            if((c[i] >'0')&&(c[i]<'9')) {
                count++;
            }
        }
        System.out.println((count== str.length-1)?"The string is content only digit":"THe" +
                " string dosent content only digit");
    }
}
