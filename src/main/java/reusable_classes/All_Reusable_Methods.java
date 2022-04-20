package reusable_classes;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class All_Reusable_Methods {


    //getting a screenshot

    public static void getScreenshot(WebDriver driver, ExtentTest logger, String screenshotName) throws IOException, InterruptedException {
        String path = "C:\\Users\\fhasan\\Desktop\\Selenium Screenshots\\";
        String fileName = screenshotName + ".png";
        Thread.sleep(2000);
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //Now you can do whatever you need to do with, for example copy somewhere
        FileUtils.copyFile(sourceFile, new File(path + fileName));
        //String imgPath = directory + fileName;
        String image = logger.addScreenCapture(path + fileName);
        logger.log(LogStatus.FAIL, "screenshot added below", image);
    }//end of get screenshot method
/*
    //method to navigate using webdriver
    public static WebDriver navigate(WebDriver driver, String url) throws IOException {
        //log INFO command to navigate
        //logger.log(LogStatus.INFO, "Navigating to url " + url);

        //define the path of the chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fhasan\\Desktop\\driver\\chromedriver.exe");
        //quit all open chrome browsers
        //Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f /t");
        //setting up the chromeoptions
        ChromeOptions options = new ChromeOptions();
        //add the precondition arguments
        options.addArguments("start-maximized", "incognito");
        //define the chrome web driver
        driver = new ChromeDriver(options);
        //navigate to url
        driver.navigate().to(url);
        return driver;
    }//end of navigate
*/
//click on element using explicit wait
public static void click(WebDriver driver, WebElement locator, int indexNumber, ExtentTest loggers, String elementName) throws IOException, InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    try {
        System.out.println("Clicking on element " + elementName);
        loggers.log(LogStatus.INFO, "Clicking on element " + elementName);
        wait.until(ExpectedConditions.visibilityOfAllElements(locator)).get(indexNumber).click();
    } catch (Exception err) {
        System.out.println("Unable to click on element " + elementName + " --" + err);
        loggers.log(LogStatus.FAIL, "Unable to click on element " + elementName + " --" + err);
        getScreenshot(driver, loggers, elementName);
    }
}//end of click method

    //check if an element is present using explicit wait
    public static boolean elementPresent(WebDriver driver, WebElement locator, int indexNumber, ExtentTest loggers, String elementName) throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean b = false;
        try {
            System.out.println("Checking if " + elementName+ " is present");
            loggers.log(LogStatus.INFO, "Checking the presence of element " + elementName);
           b = wait.until(ExpectedConditions.visibilityOfAllElements(locator)).get(indexNumber).isDisplayed();
        } catch (Exception err) {
            System.out.println("The element is not displayed " + elementName + " --" + err);
            loggers.log(LogStatus.FAIL, "The element is not displayed " + elementName + " --" + err);
            getScreenshot(driver, loggers, elementName);
        }

        return b;
    }

    //entering info on element using explicit wait
    public static void userInput(WebDriver driver, WebElement locator, int indexNumber, String userValue, ExtentTest loggers, String elementName) throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            System.out.println("Entering value on element " + elementName);
            loggers.log(LogStatus.INFO, "Entering value on element " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElements((locator))).get(indexNumber);
            //clear any pre populated data on the text field
            element.clear();
            //enter a new value on the text field
            element.sendKeys(userValue);
        } catch (Exception err) {
            System.out.println("Unable to enter value on element " + elementName + " --" + err);
            loggers.log(LogStatus.FAIL, "Unable to enter value on element " + elementName + " --" + err);
            getScreenshot(driver, loggers, elementName);
        }
    }//end of sendKeys method

    public static String captureTextByIndex(WebDriver driver, WebElement locator, int index, ExtentTest loggers, String elementName) throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String text = null;
        try {
            System.out.println("Capturing text on element " + elementName);
            loggers.log(LogStatus.INFO, "Capturing text on element " + elementName);
            text = wait.until(ExpectedConditions.visibilityOfAllElements(locator)).get(index).getText();
        } catch (Exception err) {
            System.out.println("Unable to capture text on element " + elementName + " --" + err);
            loggers.log(LogStatus.FAIL, "Unable to capture text on element " + elementName + " --" + err);
            getScreenshot(driver, loggers, elementName);
        }
        return text;
    }//end of getText method

    public static void dropDownByText(WebDriver driver, String locator, String userValue, ExtentTest loggers, String elementName) throws IOException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = null;
        try {
            System.out.println("Selecting value " + userValue + " from element " + elementName);
            loggers.log(LogStatus.INFO, "Selecting value " + userValue + " from element " + elementName);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            Select dDown = new Select(element);
            dDown.selectByVisibleText(userValue);
        } catch (Exception err) {
            System.out.println("Unable to select value from element " + elementName + " --" + err);
            loggers.log(LogStatus.FAIL, "Unable to select value from element " + elementName + " --" + err);
            getScreenshot(driver, loggers, elementName);
        }
    }//end of Select by text method
    public static String getDateTime() {
        SimpleDateFormat sdfDateTime;
        String strDateTime;
        sdfDateTime = new SimpleDateFormat("MMddyyyy'_'HHmmss'_'SSS");
        Date now = new Date();
        strDateTime = sdfDateTime.format(now);
        return strDateTime;
    }

    public static String getDateforAll(int days,String formattingType) {
        DateFormat dateFormat = null;
        dateFormat.setLenient(true);
        SimpleDateFormat sdfDateTime;
        sdfDateTime = new SimpleDateFormat(formattingType);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, days);
        String date1 = dateFormat.format(calendar.getTime());
        return date1;
    }
    public static void prln(Object object){
        System.out.println(object);

    }
}

