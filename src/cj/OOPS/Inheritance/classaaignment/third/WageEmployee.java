package cj.OOPS.Inheritance.classaaignment.third;

public class WageEmployee {
    int sales;
    int commision;
    int salary;

    int computeSalary(int sales,int commision){
         int total=sales*commision;
         salary=salary+total;
         return salary;
    }

}
