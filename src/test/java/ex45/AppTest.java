/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex45;
import java.io.*;
import java.nio.file.Files;
import java.util.*;

import ex45.App;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Checking if  file is correct.")
    public void checkoutput() {
        String acutal_result = "One should never use the word \"use\" in writing. Use \"use\" instead.For example, " +
                "\"She uses an IDE to write her Java programs\" instead of \"Sheuses an IDE to write her Java programs\".";
        String dir = System.getProperty("user.dir") + "/src/main/java/ex45/exercise45_input.txt";
        String outputfile = System.getProperty("user.dir") + "/src/test/java/ex45/test.txt";
        Assertions.assertEquals(acutal_result, App.outputString(App.sort(dir),outputfile));
    }

}
