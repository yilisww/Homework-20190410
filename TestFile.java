package HW4_arrays_files;

import java.io.*;
import java.lang.*;
import java.util.*;

public class TestFile {

    public static void main(String[] args) throws FileNotFoundException {

        //create a file, remember: you could not create the same file twice
        // final Formatter newfile;

        // try {
          // newfile = new Formatter("newfile.txt");
           // System.out.println("You succeed to create a file!");

       //  } catch (Exception e) {
            System.out.println("Failed");
       // }

        // check the file directory

        File newfile = new File ("C:\\Users\\li_yi\\SEL-Homework");

        if (newfile.exists())
            System.out.println(newfile.getName()+"exists!");
        else
            System.out.println(newfile.getName()+"not exists");

        // read a file

        Scanner readfile;

        readfile = new Scanner (new File("C:\\Users\\li_yi\\SEL-Homework\\newfile.txt")); // default path you can use "newfile.txt"

        while (readfile.hasNext()) {
            String a = readfile.next();

            System.out.println(a);
        }

        readfile.close();

        // write to a file

        Formatter writefile;

        writefile = new Formatter("newfile.txt");

        writefile.format("a");

        writefile.close();


    }

}



