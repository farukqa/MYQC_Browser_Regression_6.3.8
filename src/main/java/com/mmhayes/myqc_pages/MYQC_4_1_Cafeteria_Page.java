package com.mmhayes.myqc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reusable_classes.All_Reusable_Methods;
import reusable_classes.Setup_Methods;

import java.io.IOException;

public class MYQC_4_1_Cafeteria_Page extends Setup_Methods {
    public MYQC_4_1_Cafeteria_Page(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        logger = super.logger;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"myQuickPicks\"]/div/div[1]/div[1]")
    public static WebElement quickpicks;
    @FindBy(how = How.XPATH, using = "//*[@id=\"keypad-header\"]/a[1]/img")
    public static WebElement backButton;


    //checking the text of the Cafeteria button
    public String quickpicks() throws IOException, InterruptedException {
        return All_Reusable_Methods.captureTextByIndex(driver, quickpicks, 0, logger, "Cafeteria");

    }

    //clicking the backbutton
    public MYQC_4_1_Cafeteria_Page backButtonClick() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, backButton, 0, logger, "back button");
        return new MYQC_4_1_Cafeteria_Page(driver);
    }
}

