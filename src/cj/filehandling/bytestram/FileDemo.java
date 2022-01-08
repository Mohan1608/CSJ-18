package cj.filehandling.bytestram;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

public class FileDemo { 

    public static void main(String[] args) throws IOException {
/** Here we are creating File class object that contains all the metadata of file. Here i copy the the path that i
 * want to craete a file in that location*/

        File file = new File("D:\\Java Programms\\02CSJ18\\src\\filehandling\\bytestram\\input.txt");

/** Here we are creating new file by using following syntax. It returns boolean which returns true or
 * false. we create new file while checking it is present or not(when i use it in )
 *  file is present it does not create new and return false*/

        //    file.createNewFile();
        System.out.println(file.createNewFile());

/**        Here i can also create a folder*/
        File directory = new File("D:\\Java Programms\\02CSJ18\\src\\filehandling\\bytestram\\ Input");
        directory.mkdir();

        System.out.println(directory.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.getParent());

        System.out.println(file.lastModified());
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
        System.out.println(sdf.format(file.lastModified()));
       // file.delete();


/**   the above all are File class method we cant read or write data into the file by using this methods*/
    }
}

