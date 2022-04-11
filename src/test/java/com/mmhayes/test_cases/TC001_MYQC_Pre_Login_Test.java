package com.mmhayes.test_cases;

import com.mmhayes.myqc_pages.MYQC_Pre_Login_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import reusable_classes.Setup_Methods;

import java.io.IOException;

import static reusable_classes.MYQC_Base_Class.pre_login_page;

public class TC001_MYQC_Pre_Login_Test extends Setup_Methods {

    @Test
    public static void pre_Login_Test() throws IOException, InterruptedException {
        driver.get("https://mmhcustfour.mmhcloud.com/myqc/#main");
        Thread.sleep(2000);
        pre_login_page().clickOnMYQCLink();
        Thread.sleep(3000);
        //xpath for the tittle of the page
        WebElement pageTitle = driver.findElement(By.xpath("//h1[contains(text(),'Login')]"));
        String title = pageTitle.getText();
        //System.out.println("Title is: "+ title);
        Assert.assertEquals(title, "Login");


    }
}

