package cj.OOPS.Inheritance.case2;

public class main {
    public static void main(String[] args) {

        Vehical v=new Vehical();
        v.a=1;
//      v.b=2;
        v.c=3;
        v.d=4;

        //STATIC MEMBERS
        v.e=5;
//      v.f=6;
        v.g=7;
        v.h=8;
        v.m1();

        TwoWheeler tw=new TwoWheeler();
        tw.a=1;
//      tw.b=2;
        tw.c=3;
        tw.d=4;

        //STATIC MEMBERS
        tw.e=5;
//      tw.f=6;
        tw.g=7;
        tw.h=8;
        tw.m1();

        Vehical vm=new TwoWheeler();
        vm.a=1;
//      vm.b=2;
        vm.c=3;
        vm.d=4;

        //STATIC MEMBERS
        vm.e=5;
//      vm.f=6;
        vm.g=7;
        vm.h=8;

        vm.m1();
    }
}
