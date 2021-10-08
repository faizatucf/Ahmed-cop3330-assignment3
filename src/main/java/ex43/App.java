/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex43;
import java.io.*;
import java.util.*;

public class App {
    static void output(String out){
        System.out.println(out);
    }

    static String Create_folder(String name, String cdir)
    {
        new File(cdir);
        File file;
        cdir = cdir + name;
        file = new File(cdir);
        if (file.mkdirs()) {
            output("Created "+cdir);
        } else {
            output("Failed to create directory!");
        }
        return cdir;
    }

    static String html(String name, String author, String cdir) throws IOException {
        cdir = cdir + "/index.html";
        String meta = String.format("<meta name=\"author\" content=\"%s\">", author);
        File f = new File(cdir);
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html><head>"+meta+"</head><title>"+name+"</title></html>");
        bw.close();
        output("Created "+cdir);
        return cdir;
    }

    static String Create_js(String cdir)
    {
        new File(cdir);
        File file;
        cdir = cdir + "/js/";
        file = new File(cdir);
        if (file.mkdirs()) {
            output("Created "+cdir);
        } else {
            output("Failed to create directory!");
        }
        return cdir;
    }

    static String Create_css(String cdir)
    {
        new File(cdir);
        File file;
        cdir = cdir + "/css/";
        file = new File(cdir);
        if (file.mkdirs()) {
            output("Created "+cdir);
        } else {
            output("Failed to create directory!");
        }
        return cdir;
    }

    static void website_gen(String name, String author, int js, int css, String cdir) throws IOException {
        cdir = cdir + "website/";
        cdir = Create_folder(name, cdir);
        html(name,author,cdir);
        if(js == 1)
            Create_js(cdir);
        if(css == 1)
        Create_css(cdir);
    }

    public static void main(String [] args) throws IOException {
        String currentdir = System.getProperty("user.dir") + "/src/main/java/ex43/";
        Scanner sc = new Scanner(System.in);
        String name, author,tmp;
        int js=0, css=0;
        output("Site name: ");
        name = sc.nextLine();
        output("Author: ");
        author = sc.nextLine();
        output("Do you want a folder for JavaScript? (y/n)");
        tmp = sc.nextLine();
        if(tmp.equals("y"))
            js = 1;
        output("Do you want a folder for CSS? (y/n)");
        tmp = sc.nextLine();
        if(tmp.equals("y"))
            css = 1;
        website_gen(name, author, js, css, currentdir);
    }
}