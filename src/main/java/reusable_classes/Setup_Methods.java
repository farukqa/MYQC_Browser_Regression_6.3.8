package reusable_classes;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class Setup_Methods extends All_Reusable_Methods {
    public static WebDriver driver = null;
    public static ExtentReports report = null;
    public static ExtentTest logger = null;


    @BeforeSuite()
    public static void openBrowser() throws IOException {
        //path to your report
        report = new ExtentReports("C:\\Users\\fhasan\\eclipse-workspace\\MYQC_Browser_Regression\\src\\test\\Reports\\" + getDateTime() + ".html", true);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fhasan\\Desktop\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "incognito");
        driver = new ChromeDriver(options);


    }//end of before suite

    @BeforeMethod
    public static void before(Method methodName) {
        logger = report.startTest(methodName.getName() + "--");
        logger.log(LogStatus.INFO, "Automation Test Scenario Started....");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }//end of the before method

    @AfterMethod
    public static void endTest() {
        report.endTest(logger);
        logger.log(LogStatus.INFO, "Automation Test Scenario ended....");
    }//end of after method

    @AfterSuite
    public void closeBrowser() {
        report.flush();
        report.close();
        driver.quit();
    }//end of after suite


}

