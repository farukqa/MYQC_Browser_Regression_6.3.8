package com.mmhayes.test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import reusable_classes.Setup_Methods;

import java.io.IOException;

import static reusable_classes.MYQC_Base_Class.pre_login_page;
import static reusable_classes.MYQC_Base_Class.login_page;

// extends Setup_Methods


public class TC001_MYQC_Pre_Login_Test extends Setup_Methods {

    @Test
    //TC001- Testing the title of the MYQC Login page
    public static void pre_Login_Test() throws IOException, InterruptedException {
        driver.get("https://mmhcustfour.mmhcloud.com/myqc/#main");
        pre_login_page().clickOnMYQCLink();
       String actual = login_page().getPageTitle();
       String expected = "Login";
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(login_page().presenseOfForgotPassLink(),true);

    }
}

