package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class GuestUserOnBoarding extends BaseTest{

    @Test(priority = 1)
    public void userClicksOnPersonaliseONTheGreetingsSection(){
     boolean guestUserCreatedWatchList =   hp.clickOnPersonaliseBtn().chooseTopicsForWatchListChooseFiveTopicsAndClickNext().clickOnCreateWatchBtn().clickOnConfirmBtn().clickOnNextBtn().
                clickOnNextBtn().clickOnSkipAndMoveToWatchListPage().watchListIsCreated();
        Assert.assertFalse(guestUserCreatedWatchList);


    }
    @Test(priority = 2)
    public void guestUserCantCreateMoreThanFiveTopicsWatchList(){

    }
    @Test(priority =3)
    public void guestUserCanCreateThreeWatchLists(){

    }
    @Test(priority = 4)
    public void guestUserCantCreateMoreThanThreeWatchLists(){

    }
//    @Test(priority = 2)
//    public void userStartsCreatingWatchList(){
//
//    }
}
