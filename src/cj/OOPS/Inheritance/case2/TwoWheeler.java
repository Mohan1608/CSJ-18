package cj.OOPS.Inheritance.case2;

public class TwoWheeler extends Vehical{
    public static void main(String[] args) {

      Vehical v=new Vehical();
        v.a=1;     //default
//      v.b=2;     //Private
        v.c=3;     //Protected
        v.d=4;     //Public
        v.e=5;     //Static

        TwoWheeler tw=new TwoWheeler();
        tw.a=4;        //default
//      tw.b=7;        //Private
        tw.c=8;        //Protected
        tw.d=9;        //Public
        tw.e=10;       //Static


        Vehical vm=new TwoWheeler();
        vm.a=11;
//      vm.b=12;
        vm.c=13;
        vm.d=14;
        vm.e=15;

    }
}
