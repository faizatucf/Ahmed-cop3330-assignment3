/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex46;
import java.io.*;
import java.nio.file.Files;
import java.util.*;

import ex46.App;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if  file is correct.")
    public void checkoutput() {
        ArrayList<String> acutal_result = new ArrayList<String>();
        acutal_result.add("snake:*******");
        acutal_result.add("mushroom:**");
        acutal_result.add("badger:*");
        String dir = System.getProperty("user.dir") + "/src/main/java/ex46/exercise46_input.txt";
        Assertions.assertEquals(acutal_result, App.outputString(App.makeuniquearray(App.sort(dir))));
    }

}
