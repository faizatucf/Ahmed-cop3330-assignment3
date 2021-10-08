/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex46;

import java.io.*;
import java.util.*;

public class App {
    static void output(String out){
        System.out.print(out);
    }

    static Map<String, Integer> makeuniquearray(ArrayList<String> result)
    {

        Set<String> s = new HashSet<String>();
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        for (int i = 0; i < result.size(); i++) {
            String[] strarr = (result.get(i)).split(" ");
            for(int j = 0; j<strarr.length; j++)
                s.add(strarr[j]); //using hashsets because no duplicates.
        }
        //System.out.println(s);
        Iterator<String> it = s.iterator();
        while(it.hasNext())
            myMap.put(it.next(),0); //making hashmap of unique words

        for (int i = 0; i < result.size(); i++) {
            String[] strarr = (result.get(i)).split(" ");
            for(int j = 0; j<strarr.length; j++)

                if(s.add(strarr[j])==false)     //comparing hashsets to hashmap and updating Values... counting...
                {
                    for (Map.Entry<String, Integer> pair : myMap.entrySet()) {
                        if(pair.getKey().equals(strarr[j]))
                        {
                               pair.setValue(pair.getValue() + 1);
                        }
                    }
                }
        }
       return myMap;
    }

    static ArrayList<String> outputString(Map<String, Integer> myMap){

        List<String> unique_strings = new ArrayList<>(myMap.keySet());
        Collections.sort(unique_strings);
        List<Integer> unique_count = new ArrayList<>(myMap.values());
        Collections.sort(unique_count);

        ArrayList<String> repeating = new ArrayList<String>();
        for (int i = unique_strings.size()-1; i >= 0 ; i--) {
            String str = unique_strings.get(i)+":";
            for(int j=0; j<unique_count.get(i); j++)
                str = str.concat("*");
            repeating.add(str);
            output(str);
            output("\n");
        }
        return repeating;
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
        String dir = System.getProperty("user.dir") + "/src/main/java/ex46/exercise46_input.txt";
        outputString(makeuniquearray(sort(dir)));
    }
}