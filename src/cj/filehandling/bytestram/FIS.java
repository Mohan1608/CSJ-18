package cj.filehandling.bytestram;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\Java Programms\\02CSJ18\\src\\filehandling\\bytestram\\input" +
                ".txt");

        int data=fis.read();
        int data1= fis.read();
        int data2= fis.read();
        int data3= fis.read();
        int data4= fis.read();
        int data5= fis.read();
        long start= System.currentTimeMillis();

        while (data!= -1){
            System.out.print((char)data);
            data=fis.read();
        }

        long end= System.currentTimeMillis();
        System.out.println((char)data);
        System.out.println((char)data1);
        System.out.println((char)data2);
        System.out.println((char)data3);
        System.out.println((char)data4);
        System.out.println((char)data5);
        fis.close();
        System.out.println("Time taken  :"+ (double)(end-start)/1000);

    }

}
