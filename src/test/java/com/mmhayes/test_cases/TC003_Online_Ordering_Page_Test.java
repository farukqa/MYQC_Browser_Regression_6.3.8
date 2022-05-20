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
try {
    home_page().clickOnOnlineOrdering();
    //checking if the Cafeteria option is present
    Assert.assertEquals(online_ordering_page().cafeButton(), "Cafeteria");
    prln("Tested Online Ordering Page Loading\n=======");
    Thread.sleep(1000);
    //returning to the home page
    online_ordering_page().clickHome();
    String expected = "Online Ordering";
    String actual = home_page().getTextOnlineOrderingButton();
    Assert.assertEquals(actual, expected);
    prln("Successfully returned to Homepage\n========");
}
catch(Exception e){
    returnsToHome();
}
    }
}


