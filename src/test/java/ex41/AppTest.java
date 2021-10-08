/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex41;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if array list is correct.")
    public void checkarr() {
        String dir = System.getProperty("user.dir") + "/src/main/java/ex41/exercise41_input.txt";
        String dirout = System.getProperty("user.dir") + "/src/test/java/ex41/exercise41test_out.txt";

        ArrayList<String> names = new ArrayList<String>();
        names.add("Johnson, Jim");
        names.add("Jones, Aaron");
        names.add("Jones, Chris");
        names.add("Ling, Mai");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");
        names.add("Zarnecki, Sabrina");

        Assertions.assertEquals(names, App.sort(dir, dirout));
    }
}