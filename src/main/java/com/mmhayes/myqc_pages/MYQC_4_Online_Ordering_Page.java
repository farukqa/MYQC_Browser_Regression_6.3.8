package com.mmhayes.myqc_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reusable_classes.All_Reusable_Methods;
import reusable_classes.Setup_Methods;

import java.io.IOException;

public class MYQC_4_Online_Ordering_Page extends Setup_Methods {

    public MYQC_4_Online_Ordering_Page(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }

    // Store Selection button
    @FindBy(how = How.XPATH, using = "//*[@id=\"stores-available\"]/li[1]/div[1]/h2")
    public static WebElement cafe;
    //restricted cafe store selection
    //*[@id="stores-available"]/li[5]/div[2]/img
    @FindBy(how =How.XPATH,using="//*[@id=\"stores-available\"]/li[5]/div[2]/img")
    public static WebElement cafeRestricted;

    @FindBy(how = How.XPATH, using = "//*[@id=\"order-header\"]/a[1]")
    public static WebElement home;

    //clicking the Cafeteria button
    public MYQC_4_Online_Ordering_Page clickOnCafe() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, cafe, 0, logger, "Cafeteria");
        return new MYQC_4_Online_Ordering_Page(driver);
    }
    //clicking the restricted cafeteria button
    public MYQC_4_Online_Ordering_Page clickOnRestrictedCafe() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, cafeRestricted, 0, logger, "Restricted Cafeteria");
        return new MYQC_4_Online_Ordering_Page(driver);
    }

    //checking the text of the Cafeteria button
    public String cafeButton() throws IOException, InterruptedException {
        return All_Reusable_Methods.captureTextByIndex(driver, cafe, 0, logger, "Cafeteria");

    }

    //clicking the home button
    public MYQC_4_Online_Ordering_Page clickHome() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, home, 0, logger, "home button");
        return new MYQC_4_Online_Ordering_Page(driver);
    }


}

