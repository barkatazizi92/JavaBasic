package class26.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader {
    public static void main(String[] args) throws IOException {
        // first step to get the location of the file, from where the java should get the data and read.
        // it got this address from my configuration file where is stored the data.
        String path= "C:\\Users\\barka\\IdeaProjects\\JavaBasic\\File1\\Config.Properties1";

        // 2 step we should navigate to the location where our file is existed.
        FileInputStream fis = new FileInputStream(path);

        // 3 step A class which know how to read a file and how the file works.
        Properties properties = new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));


    }
}
