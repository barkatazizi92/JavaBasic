package utils.practice;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExcelReader {

    public static final List<Map<String, String>> read(String path, String sheetName) {
        List<Map<String, String>> excelData = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path);
             XSSFWorkbook xss = new XSSFWorkbook(fis)) {
            Sheet sheet = xss.getSheet(sheetName);

            Row headerRow = sheet.getRow(0);

            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                Map<String, String> rowMap = new LinkedHashMap<>();
                Row row = sheet.getRow(i);
                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    String key = headerRow.getCell(j).toString();
                    String value = row.getCell(j).toString();
                    rowMap.put(key, value);
                }
                excelData.add(rowMap);
            }
        } catch (IOException er) {
            er.printStackTrace();
        }

        return excelData;
    }

    public static final List<Map<String, String>> read(String sheetName) {

        return read(Constants.EXCEL_FILE_PATH, sheetName);
    }

    public static final List<Map<String, String>> read() {

        return read(Constants.CONFIG_FILE_PATH, "Sheet1");
    }
}

