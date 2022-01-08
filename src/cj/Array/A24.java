package cj.Array;

public class A24 {
   /* Write a Java program to find all pairs of elements in an array whose sum is equal
   to a specified number. Pass the array values and sum value at the time of method calling.*/

    public static void main(String[] args) {

        findPair(new int[] {1,2,5,4,7,8,2}, 7);
        findPair(new int[] {5,8,7,9,3,1,4,6,},9);


    }
    public static void findPair(int[] array,int sum){
        System.out.println("the sum of element of pair are ");
        for (int i = 0; i <array.length; i++) {
            for (int j =i+1; j < array.length ; j++) {
                if (sum==array[i]+array[j]){
                    System.out.println(array[i]+" "+array[j]);
                }

            }

        }
    }
}