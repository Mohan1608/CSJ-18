package secondround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class StringAnagram {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("listen");
        list.add("pot");
        list.add("silent");
        list.add("alas");
        list.add("top");

        for (int i = 0; i < list.size(); i++) {
            char[] ch = list.get(i).toCharArray();
            Arrays.sort(ch);
            for (int j = i + 1; j < list.size(); j++) {
                char[] ch1 = list.get(j).toCharArray();
                Arrays.sort(ch1);
                if (Arrays.equals(ch1,ch)) {
                    System.out.println(list.get(i)+","+list.get(j));
                }
            }
        }
    }
}

