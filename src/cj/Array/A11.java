package cj.Array;

public class A11 {
    public static void main(String[] args) {
//        Write a Java program to sort a array using bubble sort
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int r : array) {
            System.out.print(r + " ");
        }
    }
}


/*
import java.lang.reflect.Array;
import java.util.Arrays;

public class A11 {
    // Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        int[] intArray = {189, 27, 122, 175, 11, 7, 586, 21};
        System.out.println("Given Integer array is:- " + Arrays.toString(intArray));
        String[] stringArray = {"Saurabh", "Pratik", "Mohan", "Harshal", "Shubham", "Jitesh"};
        System.out.println("Given String array is:- " + Arrays.toString(stringArray));

        //Now, we will sort the given arrays:-
        System.out.println("Sorting arrays:");
        Arrays.sort(intArray);
        Arrays.sort(stringArray);
        System.out.println("Sorted Integer array is:- " + Arrays.toString(intArray));
        System.out.println("Sorted String array is:- " + Arrays.toString(stringArray));
    }
}
*/

