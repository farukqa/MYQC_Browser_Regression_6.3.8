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
import static reusable_classes.MYQC_Base_Class.login_page;

public class TC007_DollarDonationButtonTest extends Setup_Methods {

    @Test(priority = 5)
    public static void dollarDonationButtonTest() throws IOException, InterruptedException {
        home_page().clickOnCurrentBalancePage();
        double availableBalance = Double.parseDouble((currentBalancePage().balanceCheck()));
        prln("Balance Available $"+availableBalance);
        if(availableBalance>=1) {
            Assert.assertTrue(currentBalancePage().presenseOfDonation());
            returnsToHome();
        }
        else{
            Assert.assertFalse(currentBalancePage().presenseOfDonation());
            returnsToHome();
        }





    }
}

