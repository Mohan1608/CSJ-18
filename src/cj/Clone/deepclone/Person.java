package cj.Clone.deepclone;

public class Person implements Cloneable{
    String name;
    int id;
    Residence rs;

    public Person(String name,int id,Residence rs){
        this.name=name;
        this.id=id;
        this.rs=rs;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p    =(Person) super.clone();
        Residence rs=(Residence)this.rs.clone();
        p.rs=rs;
        return p;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", rs=" + rs +
                '}';
    }
}
