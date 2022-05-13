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

//extends Setup_Methods
public class MYQC_2_Login_Page extends Setup_Methods {

    ExtentTest logger;


    public MYQC_2_Login_Page(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = Setup_Methods.logger;
    }

    // this is for page title
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Login')]")
    public static WebElement pageTitle;

    //WebElement pageTitle = driver.findElement(By.xpath("//h1[contains(text(),'Login')]"));

    // this is for the username field
    @FindBy(how = How.ID, using = "loginName")
    public static WebElement userName;


    //this is for the password field
    @FindBy(how = How.ID, using = "loginPassword")
    public static WebElement password;

    // this is for the Login button
    @FindBy(how = How.ID, using = "loginButton")
    public static WebElement login;

    //this is for forget password link
    @FindBy(how = How.XPATH, using = "//*[@id=\"forgotPasswordLink\"]")
    public static WebElement forgotPass;

    // reading the page title
    public String getPageTitle() throws IOException, InterruptedException {
        return All_Reusable_Methods.captureTextByIndex(driver, pageTitle, 0, logger, "Page Title");
    }

    // checking the presence of the Forgot Password link
    public boolean presenseOfForgotPassLink() throws IOException, InterruptedException {
        return All_Reusable_Methods.elementPresent(driver, forgotPass, 0, logger, " Forgot Password");

    }

    // clicking the username field
    public MYQC_2_Login_Page clickOnUsername() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, userName, 0, logger, "username");
        return new MYQC_2_Login_Page(driver);
    }

    //send username
    public MYQC_2_Login_Page sendUsername(String username) throws IOException, InterruptedException {
        All_Reusable_Methods.userInput(driver, userName, 0, username, logger, "username");
        return new MYQC_2_Login_Page(driver);
    }

    // clicking the password field
    public MYQC_2_Login_Page clickOnpassword() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, userName, 0, logger, "password");
        return new MYQC_2_Login_Page(driver);
    }

    // send password
    public MYQC_2_Login_Page sendPassword(String pass) throws IOException, InterruptedException {
        All_Reusable_Methods.userInput(driver, password, 0, pass, logger, "password");
        return new MYQC_2_Login_Page(driver);
    }

    // clicking the login button
    public MYQC_2_Login_Page clickOnLogin() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, login, 0, logger, "login button");
        return new MYQC_2_Login_Page(driver);
    }


}


