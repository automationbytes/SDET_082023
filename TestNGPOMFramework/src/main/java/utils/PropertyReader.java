package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static String readProperties(String key){
        Properties properties = new Properties();
        String value = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/ApplicationConfig.properties");
            properties.load(fileInputStream);
            value = properties.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return value;
    }
}
