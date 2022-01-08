package cj.collectionsframework.list.linklist.singlylinklist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkList list=new LinkList();
/*        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtMid(45,2);*/

        Scanner sc=new Scanner(System.in);
        boolean flag=true;

        while(flag) {
            System.out.println();
            System.out.println("1. insert at first position");
            System.out.println("2. insert at  last position");
            System.out.println("3. insert at  mid position");
            System.out.println("4. delete at  first position");
            System.out.println("5. delete at  last position");
            System.out.println("6. delete at  mid position");
            System.out.println("7. View List");
            System.out.println("8. check wheather the list empty or not");
            System.out.println("9. Exit");


            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice){
                case 1:
                list.insertAtFirst(sc.nextInt());
                break;
                case 2:
                    list.insertAtLast(sc.nextInt());
                    break;
                case 3:
                    System.out.println("enter position");
                    int pos= sc.nextInt();
                    System.out.println("enter value");
                    int val= sc.nextInt();
                    list.insertAtMid(val,pos);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.println("enter position");
                    int pos1= sc.nextInt();
                    list.deleteMid(pos1);
                case 7:
                list.displayList();
                break;
                case 8:
                    list.isEmpty();
                    break;

                case 9:
                    flag=false;
                default:
                    System.out.println("Please enter valid choice");
            }
        }


    }
}
