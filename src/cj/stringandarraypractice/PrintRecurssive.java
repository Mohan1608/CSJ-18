package cj.stringandarraypractice;public class PrintRecurssive {
    /*     static int count=0;
     public static void main(String[] args) {
         String[] str={"nhh"};
        if (count < 8) {
            count++;
            System.out.println("fff");
            main(str);
        }
    }*/

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}

