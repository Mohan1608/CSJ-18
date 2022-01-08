package cj.constructor;

public class MyConstructor2 {
    int empid;
    String name;
    int age;
    MyConstructor2(int empid,String name,int age){
        this.empid=empid;
        this.name=name;
        this.age=age;
        System.out.println(empid+" "+name+" "+age);
    }
}
class main{
    public static void main(String[] args) {
        MyConstructor2 m=new MyConstructor2(5566,null,-20);
        System.out.println(m.empid+" "+m.name+" "+m.age);
    }
}
