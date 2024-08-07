package tests;

import org.testng.annotations.Test;

public class GuestUserOnBoarding extends BaseTest{

    @Test(priority = 1)
    public void userClicksOnPersonaliseONTheGreetingsSection(){
        hp.clickOnPersonaliseBtn().chooseTopicsForWatchListChooseFiveTopicsAndClickNext().clickOnCreateWatchBtn().clickOnConfirmBtn().clickOnNextBtn().clickOnNextBtn();


    }
//    @Test(priority = 2)
//    public void userStartsCreatingWatchList(){
//
//    }
}
