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

public class Rewards_Page extends Setup_Methods {

    ExtentTest logger;

    public Rewards_Page(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"rewards-programs-list\"]/div/div[1]/div[2]")
    public static WebElement donateButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"page-header\"]/a")
    public static WebElement homePage;
    @FindBy(how = How.XPATH, using = "//*[@id=\"rewards-programs-list\"]/div/div[1]/div[1]/span[1]")
    public static WebElement pointBalance;

    public String pointBalanceCheck() throws IOException, InterruptedException {
       return  All_Reusable_Methods.captureTextByIndex(driver, pointBalance, 0, logger, "Point Balance");
    }


    public Rewards_Page clickOnDonateButton() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, donateButton, 0, logger, "Donation Button");
        return new Rewards_Page(driver);
    }

    public Rewards_Page clickOnHome() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, homePage, 0, logger, "Home Button");
        return new Rewards_Page(driver);
    }
}

