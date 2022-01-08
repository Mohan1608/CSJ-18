package cj.ForLoop;

public class EvenNumberWithRange {
    public static void main(String[] args){
        System.out.println("The Even no. between 1 " +
                "to 100 are");
        int a =100;
        for(int i=2 ;i<a ;i++) {
            System.out.print(i % 2==0? i + " " :" ");


        }
    }
}
