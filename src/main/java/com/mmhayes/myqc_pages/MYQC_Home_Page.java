package com.mmhayes.myqc_pages;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reusable_classes.All_Reusable_Methods;
import reusable_classes.Setup_Methods;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class MYQC_Home_Page extends Setup_Methods {

    public MYQC_Home_Page(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }


    // logout button
    @FindBy(how = How.XPATH, using = "//*[@id='nav-logout']")
    public static WebElement logout;

    // online ordering button
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-order\"]")
    public static WebElement online_Ordering;

    // reward button
    @FindBy(how =How.XPATH,using ="//*[@id=\"nav-rewards\"]")
    public static WebElement reward_Page_Button;

    //clicking the Online Ordering button
    public MYQC_Home_Page clickOnOnlineOrdering() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver,online_Ordering,0,logger,"Online Ordering");
        return new MYQC_Home_Page(driver);
    }
    //capturing text of the Online Ordering Button
   public String getTextOnlineOrderingButton() throws IOException, InterruptedException {
      return All_Reusable_Methods.captureTextByIndex(driver,online_Ordering,0,logger,"Online Ordering Button");

  }
    //clicking the Reward page button
    public MYQC_Home_Page clickOnRewardsPage() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver,reward_Page_Button,0,logger,"Reward Page");
        return new MYQC_Home_Page(driver);
    }


}


