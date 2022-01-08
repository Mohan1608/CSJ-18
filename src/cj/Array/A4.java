package cj.Array;

public class A4 {
    public static void main(String[] args) {
//        Create an array of 5 floats and calculate their sum

        float[] array= {1.5f,2.6f,3.5f,4.4f,5.5f};
        float sum=0;

        //logis for Adding Array elements
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println("The value of sum is :"+sum);

        //Second method or for each loop
        float[] array1= {1.5f,2.6f,3.5f,4.4f,5.5f};
        float sum1=0;
        for(float element:array1){
            sum1+=element;
        }
        System.out.println(" the value of sum1 is "+sum1);
    }
}
