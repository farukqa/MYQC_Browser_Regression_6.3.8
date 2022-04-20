package com.mmhayes.test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import reusable_classes.Setup_Methods;
import java.io.IOException;
import static reusable_classes.MYQC_Base_Class.*;

public class TC005_PointDonation_Test extends Setup_Methods {

    @Test
    public static void pointDonationTest() throws IOException, InterruptedException {
        home_page().clickOnRewardsPage();
        int availablePoints = Integer.parseInt((reward_page().pointBalanceCheck()));
        //checking if the point balance is zero
        if (availablePoints == 1) {
            //returning to the home page
            reward_page().clickOnHome();
            // checking if home page has loaded
            Assert.assertEquals(home_page().getTextOnlineOrderingButton(), "Online Ordering");
        } else {

            reward_page().clickOnDonateButton();
            Thread.sleep(1000);
            point_donation_page().clickOnDropDown();
            Thread.sleep(1000);
            point_donation_page().charitySelection();
            point_donation_page().clickOnSubmission();
            point_donation_page().clickOnDonationConfirmation();
            Thread.sleep(1000);
            point_donation_page().clickOnSuccessMsg();
            //checking point balance after making a donation
            int afterDonationPoints = Integer.parseInt((reward_page().pointBalanceCheck()));

            Assert.assertEquals(afterDonationPoints, 0);
            //returning to the home page
            reward_page().clickOnHome();
            // checking if home page has loaded
            Assert.assertEquals(home_page().getTextOnlineOrderingButton(), "Online Ordering");
        }
    }
}

