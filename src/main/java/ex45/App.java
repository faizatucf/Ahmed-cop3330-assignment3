/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex45;
import java.io.*;
import java.util.*;

public class App {
    static void output(String out){
        System.out.println(out);
    }

    static String outputString(ArrayList<String> result, String filenameout){
        String finalstr = "";
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).replace("utilize", "use"));
            finalstr = finalstr + result.get(i).replace("utilize", "use");
        }
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(filenameout));
            for(int i = 0; i < result.size(); i++) {
                bw.write(String.valueOf(result.get(i).replace("utilize", "use")));
                bw.newLine();
            }
            bw.close();
        }catch (IOException e) {output("Error with writing file");}
        return finalstr;
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
        String dir = System.getProperty("user.dir") + "/src/main/java/ex45/exercise45_input.txt";
        Scanner sc = new Scanner(System.in);
        output("Enter the name for output file");
        String outfile = System.getProperty("user.dir") + "/src/main/java/ex45/"+sc.nextLine();
        outputString(sort(dir),outfile);
    }
}