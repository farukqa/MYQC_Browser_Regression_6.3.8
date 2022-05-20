package com.mmhayes.myqc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reusable_classes.All_Reusable_Methods;
import reusable_classes.Setup_Methods;

import java.io.IOException;

public class MYQC_4_2_Restricted_Cafe_Page extends Setup_Methods {

    public MYQC_4_2_Restricted_Cafe_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;

    }

    //Back button icon
    //*[@id="keypad-header"]/a[1]

    @FindBy(how = How.XPATH, using = " //*[@id=\"keypad-header\"]/a[1]")
    public static WebElement backButton;

    //restricted product- build a burger
    //*[@id="11"]
    //*[@id="keypad-11"]/ul/li[21]/div[2]/div[1]/div[1]/span
    @FindBy(how = How.XPATH, using = "//*[@id=\"keypad-11\"]/ul/li[21]/div[2]/div[1]/div[1]/span")
    public static WebElement restrictedBuildBurger;

    //*[@id="11"]
    //clicking the back button
    public MYQC_4_2_Restricted_Cafe_Page clickOnBackButton() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver,backButton,0,logger,"Back Button");
        return new MYQC_4_2_Restricted_Cafe_Page(driver);
    }
    //adding the restricted product to the transaction
    public MYQC_4_2_Restricted_Cafe_Page addRestrictedBuildBurger() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver,restrictedBuildBurger,0,logger,"Restricted Build-A-Burger");
        return new MYQC_4_2_Restricted_Cafe_Page(driver);
    }
}

