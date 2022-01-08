package cj.String;

public class ReverseAString_07_02 {
    public static void main(String[] args) {
        String s = "Cyber success is a good institute";

        String[] str = s.split("");
        for (int i = 0; i < 1; i++) {
            for (int j = str.length-1; j >= 0; j--) {
                String temp = str[j];
            str[j] = str[i];
            str[i] = temp;
                System.out.print(str[i] + " ");
        }
    }

    }
}
