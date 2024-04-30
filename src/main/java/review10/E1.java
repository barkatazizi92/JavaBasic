package review10;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir")+"\\Files\\Config.properties";
        // we write this line of code to avoid the exception and also close the connection.
        try(FileInputStream fis = new FileInputStream(path);) {

            Properties properties = new Properties();
            properties.load(fis);

            System.out.println(properties.getProperty("url"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
