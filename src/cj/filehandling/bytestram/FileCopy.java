package cj.filehandling.bytestram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\Java Programms\\02CSJ18\\src\\filehandling\\bytestram\\input.txt");
        FileOutputStream fos=new FileOutputStream("D:\\Java Programms\\02CSJ18\\src\\filehandling\\bytestram\\bbc.txt");

        int data=fis.read();
        while (data!=-1){
            fos.write((char)data);
           data=fis.read();
        }
        fos.close();
        fis.close();

    }

}
