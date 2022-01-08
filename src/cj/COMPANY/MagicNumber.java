package cj.COMPANY;

import cj.HackerRank.Solution;

import java.util.Arrays;
import java.util.Scanner;

public class MagicNumber {
    /*int sum = 0;

    public boolean recurse(int a) {
        int b = a;
        while (b > 9) {
            sum=0;
            while (b > 0) {
                int temp = b % 10;
                b = b / 10;
                sum = sum + temp * temp;
            }
            b = sum;
        }
        if (sum == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        for (int i = 1; i <100 ; i++) {

            System.out.print(((new MagicNumber().recurse(i) ? " "+i: "")));
        }

    }*/

        /*public static int[] twoSum(int[] nums, int target) {

            int[] res=new int[2];
            for(int i=0;i<nums.length;i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
                return res;
            }

            public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of array");
                int size=sc.nextInt();
                int[] nums=new int[size];
                for(int i=0;i<nums.length;i++){
                    nums[i]=sc.nextInt();
                }
                System.out.println("Enter the target");
                int target=sc.nextInt();
                System.out.println(Arrays.toString(twoSum(nums,target)));
            }
        }*/
        public boolean isPalindrome(int x) {
            int a=x;
            int sum=0;
            int temp=0;
            boolean flag=false;
            while(a>0){
                temp=a%10;
                a=a/10;
                sum=(sum*10)+temp;
            }
            if (sum==x){flag= true;}

            return flag;
        }

    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println(new MagicNumber().isPalindrome(s.nextInt()));
    }
}




