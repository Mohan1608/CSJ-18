package cj.wipro;

import java.util.Arrays;
import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        VideoStore vs = new VideoStore();
        Video v=new Video();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("MAIN MENU");
            System.out.println("===============================");
            System.out.println("1.Add Video");
            System.out.println("2.Checkout Video");
            System.out.println("3.Return Video");
            System.out.println("4.Receive Rating");
            System.out.println("5.List Inventory");
            System.out.println("6.Exit");
            System.out.println();
            System.out.println("Enter your choice");
            int choice = sc.nextInt();


            switch (choice) {
                case 1: {
                    System.out.println("enter video name:");
                    String s1 = sc.next();
                    vs.addVideo(s1);
                    break;
                }
                case 2: {
                    String s2 = sc.next();
                    vs.doCheckout(s2);
                    break;
                }
                case 5:{
                    vs.listInventory();
                    break;
                }
                case 6: {
                    flag = false;
                }
            }
        }
        for (Video v1 :vs.store) {
            System.out.println(v1);

        }
    }
}
