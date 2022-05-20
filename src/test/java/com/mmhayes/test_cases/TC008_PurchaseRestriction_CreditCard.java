package com.mmhayes.test_cases;

import org.testng.annotations.Test;
import reusable_classes.Setup_Methods;

import java.io.IOException;

import static reusable_classes.MYQC_Base_Class.*;

public class TC008_PurchaseRestriction_CreditCard extends Setup_Methods {
    // this is a test to see if a restricted product can be purchased with a credit card
    @Test(priority = 6)
    public static void restrictedProductWithCreditCardPurchase() throws IOException, InterruptedException {
        Thread.sleep(1000);
        home_page().clickOnOnlineOrdering();
        Thread.sleep(3000);
        online_ordering_page().clickOnRestrictedCafe();
        Thread.sleep(1000);
        //adding restricted build a burger to transaction
        restrictedCafePage().addRestrictedBuildBurger();
        Thread.sleep(1000);
        //closing the add to order page
        addOrderPage().clickOnClose();
        // clicking the back page
        restrictedCafePage().clickOnBackButton();
        // returning to the home page
        returnsToHome();




    }
}

