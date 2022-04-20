package reusable_classes;

import com.mmhayes.myqc_pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//extends Setup Methods
public class MYQC_Base_Class extends Setup_Methods {

    public MYQC_Base_Class (WebDriver driver) {
       super();
        PageFactory.initElements(driver, this);
    }

    public static MYQC_1_Pre_Login_Page pre_login_page(){
        MYQC_1_Pre_Login_Page pre_login_page = new MYQC_1_Pre_Login_Page(driver);
        return pre_login_page;
    }
    public static MYQC_Login_Page login_page(){
        MYQC_Login_Page login_page = new MYQC_Login_Page(driver);
        return login_page;
    }
    public static MYQC_Home_Page home_page(){
        MYQC_Home_Page home_page = new MYQC_Home_Page(driver);
        return home_page;
    }

    public static MYQC_Online_Ordering_Page online_ordering_page(){
        MYQC_Online_Ordering_Page online_ordering_page = new MYQC_Online_Ordering_Page(driver);
        return online_ordering_page;
    }

    public static MYQC_Cafeteria_Page cafeteria_page(){
        MYQC_Cafeteria_Page cafeteria_page = new MYQC_Cafeteria_Page(driver);
        return cafeteria_page;
    }

    public static Rewards_Page reward_page(){
        Rewards_Page rewards_page = new Rewards_Page(driver);
        return rewards_page;
    }
    public static Point_Donation_Page point_donation_page(){
        Point_Donation_Page point_donation_page = new Point_Donation_Page(driver);
        return point_donation_page;
    }

}

