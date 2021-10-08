/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex42;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if array list is correct.")
    public void checkinput() {
        String dir = System.getProperty("user.dir") + "/src/main/java/ex42/exercise42_input.txt";
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ling,Mai,55900");
        names.add("Johnson,Jim,56500");
        names.add("Jones,Aaron,46000");
        names.add("Jones,Chris,34500");
        names.add("Swift,Geoffrey,14200");
        names.add("Xiong,Fong,65000");
        names.add("Zarnecki,Sabrina,51500");
        Assertions.assertEquals(names, App.sort(dir));
    }
}