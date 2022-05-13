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
import static reusable_classes.MYQC_Base_Class.*;

public class TC003_Online_Ordering_Page_Test extends Setup_Methods {

    @Test(priority = 2)
    //TC003- Testing if Online Ordering page loads correctly

    public static void online_Ordering_Page_Test() throws InterruptedException, IOException {

        //going to the online ordering page from the home page

        home_page().clickOnOnlineOrdering();
        //checking if the Cafeteria option is present
        Assert.assertEquals(online_ordering_page().cafeButton(), "Cafeteria");
        prln("Tested Online Ordering Page Loading\n=======");
        //returning to the home page
        Thread.sleep(2000);
        online_ordering_page().clickHome();
        // checking if home page has loaded
        Assert.assertEquals(home_page().getTextOnlineOrderingButton(), "Online Ordering");
        driver.navigate().refresh();
        pre_login_page().clickOnMYQCLink();
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


        }
    }
}

