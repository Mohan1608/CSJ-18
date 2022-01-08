package cj.ForLoop;

import java.util.Scanner;

/*Little shino loves math.Today teacher gave her two integers.shino is now wondering how many integers can divide both numbers.she is busy with her Assignment.Help her to solve the problem. */
public class Shino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no.");
        int a = sc.nextInt();
        System.out.println("enter 2nd no.");
        int b = sc.nextInt();
        int e = Math.min(a, b);
        int count = 0;
        for (int i = 1; i < e; i++) {
            if ((a % i + b % i == 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

