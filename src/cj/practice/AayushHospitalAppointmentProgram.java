package cj.practice;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AayushHospitalAppointmentProgram {
    /*public static void main(String[] args) {
        int a=123456;
        boolean even = EvenOdd.m1(a);
        if (even) {
            System.out.println("is even");
        }
        else {
            System.out.println("is odd");

        }*/

    /*public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. how many times you played befor: ");
        int a=sc.nextInt();

        if(a>=10){
            System.out.println("out");
            }
        else{
            System.out.println();
        }*/

    public static void main(String[] args) {
        boolean flag = true;
        Set<Appointment> set = new TreeSet<>();
        while (flag) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1.Book an Appointment ");
            System.out.println("2.Show All Booked Appointment Details");
            System.out.println("3.Exit");
            int button = sc.nextInt();
            String[] hospitals = {"LifePoint", "Phoenix", "Sahyadri", "Ruby"};
            String[] doctors = {"Kulkarni", "Naresh", "Rahul", "Nitin"};


            switch (button) {
                case 1: {

                    System.out.println("id\t\tHospital Name\t\t id\t\t Doctors NAme");
                    System.out.println("1\t\t Lifepoint \t\t\t1\t\tKulkarni");
                    System.out.println("2\t\t Phoenixt \t\t\t2\t\tNaresh");
                    System.out.println("3\t\t Sahyadri \t\t\t3\t\tRahul");
                    System.out.println("4\t\t Ruby\t\t\t\t4\t\tNitin");

                    System.out.println("Enter hospital name");
                    String hn = sc.next();

                    System.out.println("Enter Doctr name");
                    String doctor = sc.next();
                    System.out.println("Enter date");
                    int date = sc.nextInt();
                    Appointment a1 = new Appointment(hn, doctor, date);
                    if (((hn.equalsIgnoreCase("Sahyadri")) || (hn.equalsIgnoreCase(
                            "LifePoint")) || (hn.equalsIgnoreCase(
                            "Phoenix")) || (hn.equalsIgnoreCase("Ruby"))) && ((doctor.equalsIgnoreCase("Kulkarni")) || (doctor.equalsIgnoreCase("Naresh")) || (doctor.equalsIgnoreCase("Rahul")) ||
                            (doctor.equalsIgnoreCase("Nitin")))) {

                        a1 = new Appointment(hn, doctor, date);
                    } else System.out.println("Enter valid details.");
                    boolean addi = set.add(a1);
                    if (addi == false) {
                        System.out.println("Appointment not available");
                    } else {
                        System.out.println("Appointment is saved");
                    }


                    //System.out.println(list);
                    break;
                }
                case 2: {
                    System.out.println("Hospital Name\t\tDoctor Name\t\tAppointment date");
                    for (Appointment a : set) {
                        System.out.println(a);
                    }
                    // System.out.println(set);
                    break;
                }
                case 3:
                    flag = false;

                default: {
                    System.out.println("Wrong input!");
                    System.out.println("Enter valid details");
                }
            }
        }
    }
}
