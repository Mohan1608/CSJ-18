package cj.OOPS.Inheritance.case1.Inheret;

import cj.OOPS.Inheritance.case1.TwoWheeler.TwoWheeler;
import cj.OOPS.Inheritance.case1.Vehical.Vehical;

public class Main{

    public static void main(String[] args){


        //if i want to access public variable from Parent/Super class of
        // child/sub class(here we try to access vehical variable from TwoWheeler
        // object) we have to make Object of child class.
        //NOTE: here i didnt Access default or private or Protected or Static type
        // i can Access only public type.
        TwoWheeler tw=new TwoWheeler();
        //tw.id=4;
    //    tw.rollnumber=5;
        //tw.gold;
          tw.silver=1;
       // tw.copper=4;
        tw.m1("good morning");


        Vehical v=new Vehical();
    //    v.id=4;
    //    v.rollnumber=5;
    //    v.gold;
          v.silver=1;
      //  v.copper=8;
          v.m1("good morning");


        //This is Parent class referance and child class object
        Vehical vw=new TwoWheeler();
    //    vw.id=4;
   //     vw.rollnumber=5;
    //    vw.gold;
          vw.silver=1;
  //      vw.copper=9;
          vw.m1("good morning");


//          Main m=new Main();
    //      m.id=4;
//          m.rollnumber=5;
    //      m.gold;
//          m.silver=1;

    }
}
