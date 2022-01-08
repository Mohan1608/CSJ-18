package cj.OOPS.Encapsulation.encapsul.liquid;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class HackerRank {
     public static void main(String[] args) throws IOException {
         Scanner in = new Scanner(System.in);

// pass input show  below
//         2
//         0 2 10
//         5 3 5
         int t=in.nextInt();

         for(int i=0;i<t;i++){
             int sum=0;
                 int a = in.nextInt();
                 int b = in.nextInt();
                 int n = in.nextInt();
                 for (int j=0;j<n;j++){
                 sum = (int) (sum + (Math.pow(2, j) * b));
                 System.out.print(a + sum + " ");
             }
         }
         in.close();
     }
}