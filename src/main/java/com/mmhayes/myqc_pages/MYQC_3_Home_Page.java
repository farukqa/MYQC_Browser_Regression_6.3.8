package com.mmhayes.myqc_pages;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reusable_classes.All_Reusable_Methods;
import reusable_classes.Setup_Methods;

import java.io.IOException;
import java.util.List;


public class MYQC_3_Home_Page extends Setup_Methods {

    public MYQC_3_Home_Page(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }


    // logout button
    @FindBy(how = How.XPATH, using = "//*[@id='nav-logout']")
    public static WebElement logout;

    // online ordering button
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-order\"]")
    public static WebElement online_Ordering;

    // reward button
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-rewards\"]")
    public static WebElement reward_Page_Button;
    // current balance button
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-balances\"]")
    public static WebElement currentPageButton;
  //  static int i= 0;
   //@FindBy(how = How.XPATH, using = "//*[@id=\"nav-balances\"]/li")
  // public static List<WebElement> linksOnHomePage = driver.findElements(By.xpath("//*[@id=\\\"nav-balances\\\"]/li"));


    //checking texts on each of the links
   // public MYQC_3_Home_Page getTextOfLinks(){
      //  All_Reusable_Methods.captureTextByIndex(driver,linksOnHomePage,0,logger,"Each Link text")
    //    return new MYQC_3_Home_Page(driver);
  //  }



    //clicking the Online Ordering button
    public MYQC_3_Home_Page clickOnOnlineOrdering() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, online_Ordering, 0, logger, "Online Ordering");
        return new MYQC_3_Home_Page(driver);
    }

    //capturing text of the Online Ordering Button
    public String getTextOnlineOrderingButton() throws IOException, InterruptedException {
        return All_Reusable_Methods.captureTextByIndex(driver, online_Ordering, 0, logger, "Online Ordering Button");

    }

    //clicking the Reward page button
    public MYQC_3_Home_Page clickOnRewardsPage() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, reward_Page_Button, 0, logger, "Reward Page");
        return new MYQC_3_Home_Page(driver);
    }

    //clicking the Current Balance page button
    public MYQC_3_Home_Page clickOnCurrentBalancePage() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, currentPageButton, 0, logger, "Current Balance Page");
        return new MYQC_3_Home_Page(driver);
    }

    //clicking on each of the links from the homepage
   // public MYQC_3_Home_Page clickonEachLink() throws IOException, InterruptedException {
     //   for (i = 0; i < 12; i++) {
       //     All_Reusable_Methods.click(driver, linksOnHomePage.get(i), 0, logger, "Clicking each link");
       //     returnsToHome();

     //   }
      //  return new MYQC_3_Home_Page(driver);
 //   }


}


