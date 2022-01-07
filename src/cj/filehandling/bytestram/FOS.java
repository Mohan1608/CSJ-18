package cj.filehandling.bytestram;
import java.io.*;
public class FOS {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\Java Programms\\02CSJ18\\src\\filehandling\\bytestram\\bbc.txt");
        fos.write((char)100);
        fos.close();
    }
}
