package reusable_classes;

import com.mmhayes.myqc_pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//extends Setup Methods
public class MYQC_Base_Class extends Setup_Methods {

    public MYQC_Base_Class(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public static MYQC_1_Pre_Login_Page pre_login_page() {
        MYQC_1_Pre_Login_Page pre_Login_Page = new MYQC_1_Pre_Login_Page(driver);
        return pre_Login_Page;
    }

    public static MYQC_2_Login_Page login_page() {
        MYQC_2_Login_Page login_page = new MYQC_2_Login_Page(driver);
        return login_page;
    }

    public static MYQC_3_Home_Page home_page() {
        MYQC_3_Home_Page home_page = new MYQC_3_Home_Page(driver);
        return home_page;
    }

    public static MYQC_4_Online_Ordering_Page online_ordering_page() {
        MYQC_4_Online_Ordering_Page online_ordering_page = new MYQC_4_Online_Ordering_Page(driver);
        return online_ordering_page;
    }

    public static MYQC_4_1_Cafeteria_Page cafeteria_page() {
        MYQC_4_1_Cafeteria_Page cafeteria_page = new MYQC_4_1_Cafeteria_Page(driver);
        return cafeteria_page;
    }

    public static MYQC_5_Rewards_Page reward_page() {
        MYQC_5_Rewards_Page rewards_page = new MYQC_5_Rewards_Page(driver);
        return rewards_page;
    }

    public static MYQC_5_1_Point_Donation_Page point_donation_page() {
        MYQC_5_1_Point_Donation_Page point_donation_page = new MYQC_5_1_Point_Donation_Page(driver);
        return point_donation_page;
    }

    public static MYQC_6_Current_Balance_Page currentBalancePage() {
        MYQC_6_Current_Balance_Page currentBalancePage = new MYQC_6_Current_Balance_Page(driver);
        return currentBalancePage;
    }

}

