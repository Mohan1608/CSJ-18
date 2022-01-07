package cj.Clone.deepclone;

public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Residence rs=new Residence("kakade city",702);
        Person p=new Person("Mohan",101,rs);
        Person p2=(Person)p.clone();

        p2.rs.flatno=102;

        System.out.println(p);
        System.out.println(p2);
    }

}
