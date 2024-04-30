package class26;

import utils.ConfigReader;

import java.io.IOException;

public class E2 {

    public static void main(String[] args) throws IOException {
      String value =  ConfigReader.read("url","C:\\Users\\barka\\" +
              "IdeaProjects\\JavaBasic\\Files\\Config.properties");

        System.out.println(value);
    }
}
