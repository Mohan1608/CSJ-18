package cj.Clone.shallowclone;

//   here we are implemanting clonable interface because we have to clone that class
public class Student implements Cloneable  {
    String name;
    int rolno;
    String course;
    Address ad;

    public  Student(String name, int rolno, String course,Address ad) {
        this.name=name;
        this.rolno = rolno;
        this.course = course;
        this.ad=ad;

    }
//  it is compulsary to override clonable method in that class which we have have to clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return Student.super.clone();
//      in above line we are use Student.super because if we use Student here then super refers to Object class
    }

//   to string method is overside to print constructor values by using object referance
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rolno=" + rolno +
                ", course='" + course + '\'' +
                ",Adress='" +ad+'\'' +
                '}';
    }
}



