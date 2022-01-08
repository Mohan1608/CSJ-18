package cj.OOPS.Inheritance.classaaignment.second;

public class Employee {
    int hrs;
    int rate;
    Employee(int hrs, int rate){
        this.hrs=hrs;
        this.rate=rate;

    }
    int computesalary(int hrs,int rate){
        int salary=hrs*rate;
        return salary;
    }
}
