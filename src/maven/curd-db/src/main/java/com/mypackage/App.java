package com.mypackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.utility.loglib.Log;

/**
 * Hello world!
*/
public class App {

    void configLoader() throws IOException{
        Properties prop = new Properties();
        String file = "log.properties";
        InputStream in = getClass().getClassLoader().getResourceAsStream(file);
        if (in == null) {
            Log.info("File missing");
        } else {
            prop.load(in);
            Log.info(prop.toString());
        }
    }

    public static void main( String[] args ) {
        Log.init();
        Log.info("Hello World!");
        App app = new App();
        try {
            app.configLoader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
