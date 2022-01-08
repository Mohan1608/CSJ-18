package cj.practice.hk;

class Company{
    void display(Employee e){
        System.out.println(e.empId+" "+e.empName+" "+e.salary+" "+e.empDept);
    }
    void anusal(Employee e){
       double anusal=12*e.salary;
        System.out.println(anusal);
    }
    void incresal(Employee e,int per){
        double incresal=e.salary+(e.salary*per/100);
        System.out.println(incresal);
    }


}



