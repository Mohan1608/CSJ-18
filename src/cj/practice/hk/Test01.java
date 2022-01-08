package cj.practice.hk;

public class Test01 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.empId=101;
        e1.empName="HK";
        e1.salary=10000;
        e1.empDept="CJ";
        Company c1=new Company();
        c1.display(e1);
        c1.anusal(e1);
        c1.incresal(e1,25);
    }
}
