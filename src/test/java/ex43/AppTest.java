/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex43;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if directories is correct.")
    public void checkfoldertest() {
        String name="awesomeco";
        String currentdir = System.getProperty("user.dir") + "/src/main/java/ex43/website/";
        String folderdir = System.getProperty("user.dir") + "/src/main/java/ex43/website/awesomeco";
        Assertions.assertEquals(folderdir, App.Create_folder(name,currentdir));
    }
    @Test
    @DisplayName("Checking if index is created.")
    public void checkindex() throws IOException {
        String name="awesomeco",author = "Max Power";
        String folderdir = System.getProperty("user.dir") + "/src/main/java/ex43/website/awesomeco";
        String indexdir = System.getProperty("user.dir") + "/src/main/java/ex43/website/awesomeco/index.html";
        Assertions.assertEquals(indexdir, App.html(name,author,folderdir));
    }
    @Test
    @DisplayName("Checking if js is created.")
    public void checkjs() {
        String folderdir = System.getProperty("user.dir") + "/src/main/java/ex43/website/awesomeco";
        String jsdir = System.getProperty("user.dir") + "/src/main/java/ex43/website/awesomeco/js/";
        Assertions.assertEquals(jsdir, App.Create_js(folderdir));
    }
    @Test
    @DisplayName("Checking if css is created.")
    public void checkfolder() {
        String folderdir = System.getProperty("user.dir") + "/src/main/java/ex43/website/awesomeco";
        String cssdir = System.getProperty("user.dir") + "/src/main/java/ex43/website/awesomeco/css/";
        Assertions.assertEquals(cssdir, App.Create_css(folderdir));
    }
}
