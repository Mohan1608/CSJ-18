package cj.stringandarraypractice;

import java.util.HashMap;

public class PairOfGIvenSumInArray {
    /*    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 8, 7, 5, 6, 9, 12, 3};
            int sum = 40;
            sumPair(arr, sum);
        }

        public static void sumPair(int[] a, int su) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] + a[j] == su) {
                        count++;
                        System.out.println(a[i] + " ," + a[j]);
                    }
                }
            }
            if (count == 0) {
                System.out.println("no pair find in given array");
            }
        }
    }*/
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 9, 8, 2, 3, 1, 4, 6, 7};
        int sum = 15;
        findPair(arr,sum);
    }
    public static void findPair(int[] a,int sum){
        HashMap<Integer,Integer> hm=new HashMap();
        for (int i = 0; i < a.length ; i++) {
            if(hm.containsKey(sum-a[i])){
                System.out.println(a[hm.get(sum-a[i])]+","+a[i]);
            }
            else {
                hm.put(a[i],i);
            }
        }
        System.out.println(hm);
    }
}

