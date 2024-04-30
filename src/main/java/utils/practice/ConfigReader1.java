package utils.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader1 {
    /*we create this method to share this method among all the class and this method take our data
    as key and the path of the file that we need to be read.
     */
    public static String read1(String key, String path) throws IOException {

        FileInputStream fis = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }

    public static String read1(String key) throws IOException {
/*this method just read the address of a data that we passed here(CONFIG_FILE_PATH1).
we overloaded this method from above method to read another data if we have in config.file.
Note: if we do not want to write all this method as a overloading , we can create a method that
just reuse the above code.*/

        /*
        FileInputStream fis = new FileInputStream(Constants1.CONFIG_FILE_PATH1);
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
 */
        return read1(key,Constants1.CONFIG_FILE_PATH1);
    }
}
