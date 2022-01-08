package cj.OOPS.Inheritance.classaaignment.third;

public class SalesPerson extends WageEmployee {
    String ename;
    int empno;
    int computeSalary(int sales,int commision){
        this.salary=15000;
        this.sales=sales;
        this.commision=commision;
        int total=sales*commision;
        salary=salary+total;
        return salary;
    }
    void display(SalesPerson s){
        System.out.println("Employee name :"+s.ename+" \nEmployee " +
                "Numnbre :"+s.empno);
    }

    public static void main(String[] args) {
        SalesPerson s1=new SalesPerson();
        s1.ename="shyam";
        s1.empno=101;
        s1.display(s1);
        WageEmployee w=new SalesPerson();
        System.out.println("Employee total salary with" +
                " incentive :"+w.computeSalary(15,150));
    }
}
