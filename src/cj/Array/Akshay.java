package cj.Array;

import java.util.*;
import java.util.stream.Collectors;

public class Akshay {
/**  You have an array of length N which have some to digit numbers i it.each number is occuring only once. YOu have to
 *   find out count of those numbers which have their reverse number present.
 **/
    public static void main(String[] args) {
        int[] arr={21,43,54,23,67,90,84,34,45,55,76,26,48};
        ArrayList<Integer> list=(ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());

        int count =0;
        for (int i = 0; i <list.size() ; i++) {
            int rev = arr[i] % 10;
            int d = arr[i]/ 10;
            int reverse = (rev*10) + d;
            if (list.contains(reverse)) count++;
            list.remove(list.get(i));

        }
        System.out.println("The given Array is :"+Arrays.toString(arr));
        System.out.println("The Numbers which have their reverse present :"+count);
    }
}

