package com.mmhayes.test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import reusable_classes.Setup_Methods;

import java.io.IOException;

import static reusable_classes.All_Reusable_Methods.prln;
import static reusable_classes.MYQC_Base_Class.home_page;
import static reusable_classes.MYQC_Base_Class.online_ordering_page;


public class TC003_Online_Ordering_Page_Test extends Setup_Methods {

    @Test
    //TC003- Testing if Online Ordering page loads correctly
    public static void online_Ordering_Page_Test() throws IOException, InterruptedException {
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


    }
}

