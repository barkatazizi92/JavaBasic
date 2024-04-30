package class27ExceptionHandling;

import utils.Constants;
import utils.practice.ExcelReader;

import java.util.List;
import java.util.Map;

public class E8Exceptions {
    public static void main(String[] args) {
       List<Map<String,String>> data2 = ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet1");
        System.out.println(data2.get(2));

    }
}
