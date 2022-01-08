package cj.ifelseswitch;
import java.util.Scanner;

public class MonthSeasonBySwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month Name\t :");
        String s = sc.next();

        switch(s){
            case "january" :
                System.out.println("The Season is Winter");
                break;
            case "february" :
                System.out.println("The Season is Winter");
                break;
            case"march" :
                System.out.println("The Season is Summer");
                break;
            case"april" :
                System.out.println("The Season is Summer");
                break;
            case "may" :
                System.out.println("The Season is Summer");
                break;
            case "june" :
                System.out.println("The Season is Summer");
                break;
            case "july" :
                System.out.println("The Season is Rainy");
                break;
            case "august":
                System.out.println("The Season is Rainy");
                break;
            case "september":
                System.out.println("The Season is Rainy");
                break;
            case"octomber" :
                System.out.println("The Season is Rainy");
                break;
            case "november":
                System.out.println("The Season is Winter");
                break;
            case "december" :
                System.out.println("The Season is Winter");
                break;
            default :
                System.out.println("Enter Month Name in lowercase");
        }
    }

}
