package class26.practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E5ExcelReader5 {

    public static void main(String[] args) throws IOException {
        //first step location of the file
        String path= "C:\\Users\\barka\\IdeaProjects\\JavaBasic\\Files\\Batch19TestData.xlsx";

        // step two, navigate to the file
        FileInputStream fis = new FileInputStream(path);

        // step 3: this is the class that read the excel sheet.
        XSSFWorkbook exel = new XSSFWorkbook(fis);
        Sheet sheet =exel.getSheet("Sheet1");


        Row headRow = sheet.getRow(0);
        // why both are string here?
        List<Map<String,String>> excalData = new ArrayList<>();
        for(int i =1; i< sheet.getPhysicalNumberOfRows(); i++){
            Row row=sheet.getRow(i);
            Map<String,String> rowMap = new LinkedHashMap<>();

            for(int j =0; j<row.getPhysicalNumberOfCells(); j++){
                Cell cell=row.getCell(j);
                String key = headRow.getCell(j).toString();
               String value = row.getCell(j).toString();
               rowMap.put(key,value);

            }
            excalData.add(rowMap);

        }
        System.out.println(excalData);
    }
}
