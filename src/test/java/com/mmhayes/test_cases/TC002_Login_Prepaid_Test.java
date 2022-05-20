package com.mmhayes.test_cases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import reusable_classes.Setup_Methods;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import static reusable_classes.MYQC_Base_Class.home_page;
import static reusable_classes.MYQC_Base_Class.login_page;


public class TC002_Login_Prepaid_Test extends Setup_Methods {


    @Test(priority = 1)
    // TC002- Testing Logging in to MYQC
    public static void login_Test() throws IOException, InterruptedException {

        //Create an object of the File class to open xlsx file
        File file = new File("C:\\Users\\fhasan\\Desktop\\idPass.xlsx");
        // Create an object of FileInputStream class to read Excel file
        FileInputStream inputStream = new FileInputStream(file);
        //Create a workbook instance that refers to .xlsx file
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        for (int i = 1; i < 2; i++) {
            //Create a row object to retrieve row at index 1
            XSSFRow row1 = sheet.getRow(i);
            //Create a cell object to retreive cell at index 1
            XSSFCell cell = row1.getCell(0);
            XSSFCell cell1 = row1.getCell(1);
            //Get the id and pass in variables
            String username = cell.getStringCellValue();
            String password = cell1.getStringCellValue();
            login_page().clickOnUsername();
            login_page().sendUsername(username);
            login_page().clickOnpassword();
            login_page().sendPassword(password);
            login_page().clickOnLogin();
            String expected = "Online Ordering";
            String actual = home_page().getTextOnlineOrderingButton();
            Assert.assertEquals(actual, expected);
            prln("Homepage load is complete to start testing\n=======");
            Thread.sleep(2000);

            //https://www.toolsqa.com/selenium-webdriver/excel-in-selenium/
        }
    }
}



