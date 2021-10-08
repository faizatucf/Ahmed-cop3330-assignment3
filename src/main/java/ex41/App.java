/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex41;
import java.io.*;
import java.util.*;

public class App {
    static void output(String out){
        System.out.println(out);
    }

    static void outputString(ArrayList<String> result){
        for (int i = 0; i < result.size(); i++) {
            output(result.get(i));
        }
    }

    static ArrayList<String> sort(String filenamein,String filenameout)
    {
        ArrayList<String> result = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filenamein));
            String str;
            while ((str = in.readLine()) != null) {
                result.add(str);
            }
        } catch (IOException e) {output("Error with reading file");}
        if(result.isEmpty()) {
            output("Error with file");
            System.exit(-1);
        }
        else
        {
            Collections.sort(result);
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter(filenameout));
                for(int i = 0; i < result.size(); i++) {
                    bw.write(String.valueOf(result.get(i)));
                    bw.newLine();
                }
                bw.close();
            }catch (IOException e) {output("Error with writing file");}
        }
        return result;
    }

    public static void main(String [] args){
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));
        String dir = System.getProperty("user.dir") + "/src/main/java/ex41/exercise41_input.txt";
        String dirout = System.getProperty("user.dir") + "/src/main/java/ex41/exercise41_out.txt";
        outputString(sort(dir, dirout));
    }
}