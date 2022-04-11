package com.mmhayes.myqc_pages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reusable_classes.All_Reusable_Methods;

import java.io.IOException;

import reusable_classes.Setup_Methods;


public class MYQC_Pre_Login_Page extends Setup_Methods {

    ExtentTest logger;

    public MYQC_Pre_Login_Page(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"logoutMyQCLink\"]")
    public static WebElement preLoginButton;

    public MYQC_Pre_Login_Page clickOnMYQCLink() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, preLoginButton, 0, logger, "Pre-MYQC button");
        return new MYQC_Pre_Login_Page(driver);
    }


}

