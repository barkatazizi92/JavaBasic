package review10;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReaderNotComplete {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
            XSSFWorkbook excelFile = new XSSFWorkbook(fis);
           Sheet sheet = excelFile.getSheet("Sheet1");
            List<Map<String,String>> data = new ArrayList<>();
           Row headerRow = sheet.getRow(0);
           for (int i = 0; i> sheet.getPhysicalNumberOfRows(); i++){
              Row row = sheet.getRow(i);
              Map<String,String> rowMap = new LinkedHashMap<>();
              for (int j = 0; j>row.getPhysicalNumberOfCells(); j++){
                String key =  headerRow.getCell(i).toString();
               String value = row.getCell(j).toString();
                  rowMap.put(key,value);
              }
              data.add(rowMap);
           }
            System.out.println(data);

        }catch (IOException i){
            System.out.println("Backup code");
        }

    }
}
