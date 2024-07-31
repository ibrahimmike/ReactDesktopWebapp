package tests;

import cityfalcon.pages.homePage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuestUserCheckingContent extends BaseTest{
    @Test (priority = 1)
    public void guestUserHomePageSearchBarSearch(){
        HomePage hp = new HomePage(driver);
        hp.clickOnSearch().makeASearchAndCheckSearchResult("Oil").clickOnTheSearchBtn();
        Assert.assertTrue(true);
    }
}
