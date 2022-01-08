package cj.practice;

import java.util.*;

class Appointment implements Comparable<Appointment>{
    String hn;
    String doctor;
    int date;

    @Override
    public String toString() {

       return hn+ "\t\t\t\t" + doctor + "\t\t\t\t" + date+"\n";
        /*return "Appointment{" +
                "Hospital Name='" + hn + '\'' +
                ", Doctor Name='" + doctor + '\'' +
                ", Appointment Date=" + date +
                "}\n";*/
    }

    public Appointment(){}
    public Appointment(String hn, String doctor, int date) {
        this.hn = hn;
        this.doctor = doctor;
        this.date = date;
    }


   /* public boolean equals(Appointment o) {
        if (this.doctor.equals(o.doctor)) {
            if ((this.date - o.date) == 0) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(hn, doctor, date);
    }
*/
    @Override
    public int compareTo(Appointment o) {
        if(doctor.equals(o.doctor)) return date-o.date;
        else return 1;
    }
}

