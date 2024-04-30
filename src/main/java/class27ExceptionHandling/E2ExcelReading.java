package class27ExceptionHandling;

import utils.Constants;
import utils.practice.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E2ExcelReading {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> data = ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet1");
        System.out.println(data.get(1));
    }
}
