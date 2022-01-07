package cj.filehandling.bytestram;

import java.io.*;

public class CreateWriteRead {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Java Programms\\02CSJ18\\src\\filehandling\\bytestram\\cbc.txt");
        file.createNewFile();

        String str="My name is Mohan";
        char[] ch=str.toCharArray();

        FileWriter fos =new FileWriter(file);
        FileReader fis = new FileReader(file);
        for (int i = 0; i <str.length() ; i++) {
            fos.write(ch[i]);
        }
        fos.close();
        int data=fis.read();
        while (data!= -1){
            System.out.print((char)data);
            data=fis.read();
        }
        fis.close();

    }
}
