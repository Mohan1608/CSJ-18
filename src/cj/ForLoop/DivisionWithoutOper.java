package cj.ForLoop;

public class DivisionWithoutOper {
    public static void main(String[] args){
    int a=14;
    int b=5;
    int sub = a;
    int count=0;
    for(int i=1;i<=a;i++){
        sub=sub-b;
        if(sub>=0){
            count++;
        }

        }
        System.out.println(count);
    }

}
