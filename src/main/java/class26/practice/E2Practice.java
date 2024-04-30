package class26.practice;

import utils.practice.ConfigReader1;

import java.io.IOException;

public class E2Practice {
    public static void main(String[] args) throws IOException {
       String value1 = ConfigReader1.read1("url", "C:\\Users\\barka" +
                "\\IdeaProjects\\JavaBasic\\File1\\Config.Properties1");
        System.out.println(value1);


    }
}
