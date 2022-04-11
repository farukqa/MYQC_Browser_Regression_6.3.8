package com.mmhayes.test_cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import reusable_classes.Setup_Methods;

import java.io.IOException;

import static reusable_classes.MYQC_Base_Class.cafeteria_page;
import static reusable_classes.MYQC_Base_Class.online_ordering_page;
import static reusable_classes.MYQC_Base_Class.home_page;

public class TC004_Cafeteria_Page_Test extends Setup_Methods {

    @Test
    public static void cafeteria_Page_Test() throws IOException, InterruptedException {
        home_page().clickOnOnlineOrdering();
        Thread.sleep(2000);
        online_ordering_page().clickOnCafe();
        Assert.assertEquals(cafeteria_page().quickpicks(),"My Quick Picks");
        prln("Tested Cafeteria Page Loading\n=======");
        //returning to the home page
        cafeteria_page().backButtonClick();







    }

}

