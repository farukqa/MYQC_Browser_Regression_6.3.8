package com.mmhayes.myqc_pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reusable_classes.All_Reusable_Methods;
import reusable_classes.Setup_Methods;

import java.io.IOException;

public class MYQC_4_3_AddOrderPage   extends Setup_Methods {

    public MYQC_4_3_AddOrderPage (WebDriver driver){
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;

    }

    //Back button icon
    //*[@id="keypad-header"]/a[1]

    @FindBy(how = How.XPATH, using = "//*[@id=\"product-detail-page\"]/div[1]")
    public static WebElement closePage;


    public MYQC_4_3_AddOrderPage clickOnClose() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver,closePage,0,logger,"Close Button");
        return new MYQC_4_3_AddOrderPage(driver);
    }

}


