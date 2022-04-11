package com.mmhayes.test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import reusable_classes.Setup_Methods;

import java.io.IOException;

import static reusable_classes.MYQC_Base_Class.home_page;
import static reusable_classes.MYQC_Base_Class.online_ordering_page;


public class TC003_Online_Ordering_Page_Test extends Setup_Methods {

    @Test
    public static void online_Ordering_Page_Test() throws IOException, InterruptedException {
        home_page().clickOnOnlineOrdering();
        Assert.assertEquals(online_ordering_page().cafeButton(),"Cafeteria");
        prln("Tested Online Ordering Page Loading\n=======");
        //returning to the home page
        online_ordering_page().clickHome();
        Thread.sleep(2000);













    }
}

