package testNG_Tests.parametrisedTests;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class DataProviderWithExcelSheet {
    Logger logger = Logger.getLogger(DataProviderWithExcelSheet.class);

    @DataProvider(name = "Authentication")
    public Object[][] dataProvider()
    {
        Object[][] object = ExcelUtils.getData();
        return object;
    }

    @Test(dataProvider = "Authentication")
    public void login(String username, String password)
    {

        System.out.println(username+":"+password);
        logger.info("Login Successful");
    }
}

class ExcelUtils{
    static Object[][] object ;
    public static Object[][] getData()
    {

        String excelFilePath = "src/test/resources/DataProviderTestData.xls";
        try {

            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = sheet.iterator();
            int noOfRows, noOfCols;

            noOfRows = sheet.getPhysicalNumberOfRows();
            System.out.print("Noof row:"+noOfRows);
            object = new Object[noOfRows][2];
            for (int l =0;l<noOfRows;l++)
            {
                Row nextRow = sheet.getRow(l);
                noOfCols = nextRow.getPhysicalNumberOfCells();
                for (int k=0;k<noOfCols;k++)
                {

                Cell cell = nextRow.getCell(k);


                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:
                            object[l][k] = cell.getStringCellValue();
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:
                            object[l][k] = cell.getBooleanCellValue();
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            object[l][k] = cell.getNumericCellValue();
                            break;
                    }
                }

            }
        }
        catch (FileNotFoundException e)
        {

        }
        catch (IOException e)
        {

        }
        return object;
    }
}
