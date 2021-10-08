/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex42;
import java.io.*;
import java.util.*;

public class App {
    static void output(String out){
        System.out.println(out);
    }

    static void outputString(ArrayList<String> result){
        String format = "%1$-10s%2$-10s%3$-10s\n";
        output(String.format(format, "Last", "First", "Salary"));
        for (int i = 0; i < result.size(); i++) {
            String[] strarr = (result.get(i)).split(",");
            output(String.format(format,strarr[0] ,strarr[1] ,strarr[2]));
        }
    }

    static ArrayList<String> sort(String filename)
    {
        ArrayList<String> result = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String str;
            while ((str = in.readLine()) != null) {
                result.add(str);
            }
        } catch (IOException e) {output("Error with reading file");}
        if(result.isEmpty()) {
            output("Error with file");
            System.exit(-1);
        }
        return result;
    }

    public static void main(String [] args){
        String dir = System.getProperty("user.dir") + "/src/main/java/ex42/exercise42_input.txt";
        outputString(sort(dir));
    }
}