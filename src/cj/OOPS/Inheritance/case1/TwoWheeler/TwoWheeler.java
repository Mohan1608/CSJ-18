package cj.OOPS.Inheritance.case1.TwoWheeler;

import cj.OOPS.Inheritance.case1.Vehical.Vehical;

public class TwoWheeler extends Vehical{

     public void m1(String s){
        System.out.println("i am from child");
    }
    public static void main(String[] args) {



        TwoWheeler vm = new TwoWheeler();
       // vm.id;
        vm.rollnumber=7;
        vm.silver=2;
       // vm.gold;
       // vm.copper=9;
        vm.m1("good morning");

        Vehical vr=new Vehical();
        // vm.id;
        //   vr.rollnumber=7;
           vr.silver=2;
        // vr.gold;
        //   vr.copper=9;

      vr.m1("good morning");

      Vehical v=new TwoWheeler();
      v.m1("good mornig");


    }

}
