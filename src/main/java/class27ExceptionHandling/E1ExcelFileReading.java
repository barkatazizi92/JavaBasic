package class27ExceptionHandling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E1ExcelFileReading {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\barka\\IdeaProjects\\JavaBasic\\Files\\Batch19TestData.xlsx";

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook xss = new XSSFWorkbook(fis);
        Sheet sheet = xss.getSheet("Sheet1");
        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Map<String, String> rowMap = new LinkedHashMap<>();
            Row row = sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                String key = headerRow.getCell(j).toString();
                String value = row.getCell(j).toString();
                rowMap.put(key, value);
            }
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }
}
