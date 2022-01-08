package cj.collectionsframework.list.linklist.doublylinklist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DoblyList dlist=new DoblyList();
       /* dlist.insertFirst(15);
        dlist.insertFirst(20);
        dlist.insertLast(30);
        dlist.insertLast(50);
        dlist.insertLast(60);
        dlist.displayList();
        System.out.println();
        dlist.insertMid(14,4);
        dlist.deleteMid(3);
        dlist.displayList();*/

        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while (flag){
            System.out.println();
        System.out.println("1.insert no at first position");
        System.out.println("2.insert no at last position");
        System.out.println("3.insert no at position");
        System.out.println("4.delete no at first position");
        System.out.println("5.delete no at last position");
        System.out.println("6.delete no at position");
        System.out.println("7. View List");
        System.out.println("8.Exit");
        System.out.println("Enter your choice");
        int choice= sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("enter value");
                    dlist.insertFirst(sc.nextInt());
                break;
                case 2:
                    System.out.println("enter value");
                    dlist.insertLast(sc.nextInt());
                break;
                case 3:
                    System.out.println("Enter position");
                    int pos=sc.nextInt();
                    System.out.println("Enter value");
                    int val=sc.nextInt();
                    dlist.insertMid(val,pos);
                    break;
                case 4:
                    dlist.deleteFirst();
                    break;
                case 5:
                    dlist.deleteLast();
                    break;
                case 6:
                    System.out.println("Enter position");
                    int pos1=sc.nextInt();
                    dlist.deleteMid(pos1);
                    break;
                case 7:
                    dlist.displayList();
                    break;
                case 8:
                    flag=false;
                    break;
                default:
                    System.out.println("please enter valid number");
            }
        }
    }
}
