package cj.Array;

public class A16 {
    /*Write a java program to find the duplicate values of an array of
    an integer value*/

    public static void main(String[] args) {
        int[] array={1,1,2,3,66,66,77,99,88,96};
        boolean flag=true;
        for (int i=0;i< array.length;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    flag = false;
                    System.out.println("the duplicate element is :"+array[i]);
                }
            }
        }
        if(flag){
            System.out.println("Duplicate element not found");
        }
    }
}
