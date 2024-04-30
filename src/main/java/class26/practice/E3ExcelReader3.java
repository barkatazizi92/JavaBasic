package class26.practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;


public class E3ExcelReader3 {
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\barka\\IdeaProjects\\JavaBasic\\File1\\Batch19TestData.1.xlsx";

       FileInputStream fis1 = new FileInputStream(path);

        // we use this class to read Excel file. for every file there is separate class.
        XSSFWorkbook excel1 = new XSSFWorkbook(fis1);
        // next step: we create a variable to store the location of the excel sheet that we want to read.

        Sheet sheet1 = excel1.getSheet("Sheet2");
        for ( int i = 0; i <sheet1.getPhysicalNumberOfRows(); i++){
            Row row = sheet1.getRow(1);
            for(int j = 0; j< row.getPhysicalNumberOfCells(); j++){
               Cell cell = row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }
}
