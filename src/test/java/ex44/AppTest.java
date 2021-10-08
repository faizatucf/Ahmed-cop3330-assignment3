/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex44;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if product is not present.")
    public void checkproduct() {
        String currentdir = System.getProperty("user.dir") + "/src/main/java/ex44/exercise44_input.json";
        Assertions.assertEquals(false, App.Read_Json("Ipad",currentdir));
    }

    @Test
    @DisplayName("Checking if product is present.")
    public void checkproductpresent() {
        String currentdir = System.getProperty("user.dir") + "/src/main/java/ex44/exercise44_input.json";
        Assertions.assertEquals(true, App.Read_Json("Thing",currentdir));
    }
}
