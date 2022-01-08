package cj.OOPS.Inheritance.case3.twowheeler;

import cj.OOPS.Inheritance.case3.vehical.Vehical;

public class TwoWheeler extends Vehical {
    public static void main(String[] args) {
        Vehical v=new Vehical();
//        v.a=1;
//        v.b=2;
//        v.c=3;
          v.d=4;
//        v.e=5;

        TwoWheeler tw=new TwoWheeler();
//      tw.a=1;
//      tw.b=2;
        tw.c=3;
        tw.d=4;
//      tw.e=5;

        Vehical vm=new TwoWheeler();
//      vm.a=1;
//      vm.b=2;
//      vm.c=3;
        vm.d=4;
//      vm.e=5;
    }
}
