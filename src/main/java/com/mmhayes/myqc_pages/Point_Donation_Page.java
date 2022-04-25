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

public class Point_Donation_Page extends Setup_Methods {

    ExtentTest logger;

    public Point_Donation_Page(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"pageview\"]/div[2]/div/div[3]/div[2]/b")
    public static WebElement dropdownButton;


    @FindBy(how = How.XPATH, using = "//*[@id=\"pageview\"]/div[2]/div/div[3]/div[3]/div/ul/li[2]/div")
    public static WebElement charitySelection;


    @FindBy(how = How.XPATH, using = "//*[@id=\"pageview\"]/div[2]/div/div[3]/div[3]/div/ul/li[2]/div")
    public static WebElement donationField;

    //*[@id="donation_donate-btn"]
    @FindBy(how = How.XPATH, using = "//*[@id=\"donation_donate-btn\"]")
    public static WebElement donationSubmissionButton;
    //*[@id="general-popup_btn-2"]
    //*[@id="donation_donate-btn"]
    @FindBy(how = How.XPATH, using = "//*[@id=\"general-popup_btn-2\"]")
    public static WebElement donationConfirmation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"donation_donate-btn\"]")
    public static WebElement donationCloseButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"general-popup_btn-1\"]")
    public static WebElement successMsg;


    public Point_Donation_Page clickOnDropDown() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, dropdownButton, 0, logger, "Charity Dropdown");
        return new Point_Donation_Page(driver);
    }

    public Point_Donation_Page charitySelection() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, charitySelection, 0, logger, "First Charity");
        return new Point_Donation_Page(driver);
    }

    public Point_Donation_Page clickOnSubmission() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, donationSubmissionButton, 0, logger, "Donation Submission Button");
        return new Point_Donation_Page(driver);
    }

    public Point_Donation_Page closeDonation() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, donationCloseButton, 0, logger, "Close Donation Page");
        return new Point_Donation_Page(driver);
    }

    public Point_Donation_Page clickOnDonationConfirmation() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, donationConfirmation, 0, logger, "Donation Confirmation");
        return new Point_Donation_Page(driver);
    }

    public Point_Donation_Page clickOnSuccessMsg() throws IOException, InterruptedException {
        All_Reusable_Methods.click(driver, successMsg, 0, logger, "Success Msg Confirmation");
        return new Point_Donation_Page(driver);
    }


}

