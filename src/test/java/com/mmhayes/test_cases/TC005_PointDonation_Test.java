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

public class TC005_PointDonation_Test extends Setup_Methods {

    @Test(priority = 3)
    public static void pointDonationTest() throws IOException, InterruptedException {
        home_page().clickOnRewardsPage();
        int availablePoints = Integer.parseInt((reward_page().pointBalanceCheck()));
        //checking if the point balance is zero
        if (availablePoints == 0) {

            Assert.assertFalse(reward_page().presenseofDonationButton());
            //returning to the home page
            reward_page().clickOnHome();
            // checking if home page has loaded
            Assert.assertEquals(home_page().getTextOnlineOrderingButton(), "Online Ordering");
        }

        else {

            reward_page().clickOnDonateButton();
            Thread.sleep(1000);
            point_donation_page().clickOnDropDown();
            Thread.sleep(1000);
            point_donation_page().charitySelection();
            point_donation_page().clickOnSubmission();
            point_donation_page().clickOnDonationConfirmation();
            Thread.sleep(1000);
            point_donation_page().clickOnSuccessMsg();
            //checking point balance after making a donation
            int afterDonationPoints = Integer.parseInt((reward_page().pointBalanceCheck()));
            Assert.assertEquals(afterDonationPoints, 0);
            //returning to the home page
            reward_page().clickOnHome();
            // checking if home page has loaded
            Assert.assertEquals(home_page().getTextOnlineOrderingButton(), "Online Ordering");
        }
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
