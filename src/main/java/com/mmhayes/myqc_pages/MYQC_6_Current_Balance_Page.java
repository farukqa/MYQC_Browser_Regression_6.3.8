package com.mmhayes.myqc_pages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reusable_classes.All_Reusable_Methods;
import reusable_classes.Setup_Methods;

import java.io.IOException;

public class MYQC_6_Current_Balance_Page extends Setup_Methods{
    ExtentTest logger;

    public MYQC_6_Current_Balance_Page(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = Setup_Methods.logger;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"balance-donate-btn\"]")
    public static WebElement donateButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"page-header\"]/a")
    public static WebElement homePage;
    //*[@id="globalBalanceContainer"]/div[1]
    @FindBy(how = How.XPATH, using = "//*[@id=\"globalBalanceContainer\"]/div[1]")
    public static WebElement currentBalance;


    public MYQC_6_Current_Balance_Page clickOnHome() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, homePage, 0, logger, "Home Button");
        return new MYQC_6_Current_Balance_Page(driver);
    }
    public String balanceCheck() throws IOException, InterruptedException {
        return All_Reusable_Methods.captureTextByIndex(driver, currentBalance, 0, logger, "current Balance");

    }

    public boolean presenseOfDonation() throws IOException, InterruptedException {
      return  All_Reusable_Methods.elementPresent(driver,donateButton,0,logger,"Donate Button");

    }


}