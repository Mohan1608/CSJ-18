package cj.OOPS.Inheritance.classaaignment.second;

import java.util.Scanner;

public class WageEmployee extends Employee{
    String name;



    WageEmployee(int hrs,int rate, String name){
        super(hrs, rate);
        this.name=name;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many hours of working");
        int hrs=sc.nextInt();
        System.out.println("enter working rate");
        int rate=sc.nextInt();
        System.out.println("Enter the name of Employee");
        String name=sc.next();

        WageEmployee wr=new WageEmployee(hrs,rate,name);
        System.out.println("Name of the Employee:- " + wr.name);
        System.out.println("Salary of the Employee:- Rs. " + wr.computesalary(hrs,rate));
    }






}
