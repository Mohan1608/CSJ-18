package cj.stringandarraypractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Shopping {
  /* You are going shopping and you have prepared a grocery list. Information about products is organized in an  array
     of strings. The format of each item is <product> <price per unit> <amount to buy. Any kind of separators can be
     used.The price per unit and the amount to buy are integers.You need to calculate the total price per product and
     the overall amount that you are planning to spend. Return the result as string without white spaces in the given
     format:<price per product 1>+<price per product 2>+<price per product N>=<total planned expenses>
     If the format of an item is wrong, just skip it and move to the next item. Don't forget to think through any corner
     cases.
     Examples:
     Input: [apples 5 1,oranges 6 1]
     Output: 5+6=11
     Input: [bread-1 1, milk - 2 1] Output: 1+2=3
     Input [butter M N,milk 1 1] Output: 1=1
     Input [cucumber  2 10] Output: 20=20 */

    static Scanner sc = new Scanner(System.in);
    static List<String> grocerylist = new ArrayList<>();
    static String price;
    static String quantity;
    static int totalprice = 0;

    public static void main(String[] args) {
        int choice;
        boolean flag = true;
        while (flag) {
            System.out.println("1. aad product in list");
            System.out.println("2. calculate list");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2: {
                    printList();
                    flag = false;
                    break;
                }
            }
        }
    }
    public static void addProduct() {
        System.out.println("Add product");
        String product = sc.next();
        System.out.println("Enter price per unit");
        price = sc.next();
        System.out.println("Enter no of quantity");
        quantity = sc.next();
        String total = product.concat(" " + price).concat(" " + quantity);
        grocerylist.add(total);
        calcuteGroceryList();
    }

    public static void calcuteGroceryList() {
        try {
            int price1 = Integer.parseInt(price);
            int quantity1 = Integer.parseInt(quantity);
            totalprice = totalprice+(price1 * quantity1);
        }
        catch (Exception e) {
        }
    }
    public static void printList(){
        System.out.println(grocerylist);
        if(totalprice!=0) {
            System.out.println(totalprice);
        }
    }
}
