/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

package ex44;
import java.io.*;
import java.util.*;
import com.google.gson.*;
//import org.json.*;

public class App {
    static void output(String out){
        System.out.println(out);
    }

    static boolean Read_Json(String product, String cdir)
    {
        Gson gson = new Gson();
        int flag = 0;
        try (Reader reader = new FileReader(cdir)) {
            JsonElement jsonElement = gson.fromJson(reader, JsonElement.class);
            JsonObject pageName = jsonElement.getAsJsonObject();
            JsonArray arr = pageName.get("products").getAsJsonArray();
            //System.out.println(arr);
            for (int i = 0; i < arr.size(); i++) {
                String names = arr.get(i).getAsJsonObject().get("name").getAsString();
                if(names.equals(product))
                {
                    output("Name: "+arr.get(i).getAsJsonObject().get("name").getAsString());
                    output("Price: "+arr.get(i).getAsJsonObject().get("price").getAsString());
                    output("Quantity: "+arr.get(i).getAsJsonObject().get("quantity").getAsString());
                    flag = 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(flag == 1)
            return true;
        else
            return false;
    }

    public static void main(String [] args) throws IOException {
        String currentdir = System.getProperty("user.dir") + "/src/main/java/ex44/exercise44_input.json";
        Scanner sc = new Scanner(System.in);
        String product;
        output("What is the product name? ");
        product = sc.nextLine();
        while(!Read_Json(product,currentdir))
        {
            output("Sorry, that product was not found in our inventory.");
            output("What is the product name? ");
            product = sc.nextLine();
        }
    }
}