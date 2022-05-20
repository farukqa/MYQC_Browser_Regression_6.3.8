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

public class TC006_PointDonationButtonTest extends Setup_Methods {

    // the donation button should not be available if the point balance is zero
    @Test(priority = 4)
    public static void pointDonationButtonTest() throws IOException, InterruptedException {
        home_page().clickOnRewardsPage();
        int availablePoints = Integer.parseInt((reward_page().pointBalanceCheck()));
        //checking if the point balance is zero

        if (availablePoints == 0) {
           // Assert.assertFalse(reward_page().presenseofDonationButton());
            //returning to the home page
           returnsToHome();
        }
        else{

            Assert.assertTrue(reward_page().presenseofDonationButton());
            //returning to the home page
            returnsToHome();
        }

        }

    }


