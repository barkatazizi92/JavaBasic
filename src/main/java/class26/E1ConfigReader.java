package class26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        // get the location of the file
        String path = "C:\\Users\\barka\\IdeaProjects\\JavaBasic\\Files\\Config.properties";

        // Navigate to the file or bring the file into the Ram
        FileInputStream fis = new FileInputStream(path);

        // A class which knows the file works
        Properties properties = new Properties();
        properties.load(fis);


    }
}
