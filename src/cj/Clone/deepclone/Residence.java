package cj.Clone.deepclone;

public class Residence implements Cloneable{
    String Apartment;
    int flatno;

    public Residence(String Apartment,int flatno){
        this.Apartment=Apartment;
        this.flatno=flatno;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Residence{" +
                "Apartment='" + Apartment + '\'' +
                ", flatno=" + flatno +
                '}';
    }
}
