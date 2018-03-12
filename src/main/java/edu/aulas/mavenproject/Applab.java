
package edu.aulas.mavenproject;

import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class Applab {
    public static void main(String[] args) throws MalformedURLException, IOException {
        System.out.println("Hello. Este um aplicativo java para ler JSON.");
        System.out.println(lerJSON("http://time.jsontest.com/"));
    }

    public static String lerJSON(String url) throws MalformedURLException, IOException {
        Gson gson = new Gson();
        URL url2 = new URL(url);
        Reader br = new InputStreamReader(url2.openStream());
        JsonReader readerURL = new JsonReader(br);
        JsonObject jsObj = gson.fromJson(readerURL, JsonObject.class);
        return jsObj.toString();
    }
}
