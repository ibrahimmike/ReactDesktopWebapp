package tests;

import cityfalcon.pages.homePage.HomePage;
import org.testng.annotations.Test;

public class GuestUserCheckingContent extends BaseTest{
    @Test (priority = 1)
    public void guestUserHomePageSearchBarSearch(){

        hp.clickOnSearch().makeASearchAndCheckSearchResult("Oil").clickOnTheSearchBtn().clickOnTheHeaderCFLogoAndReturnToHomePage();


    }
    @Test (priority = 2)
    public void guestUserClickingOnTheHomePageSlider(){
        hp.userClicksOnDifferentOptionsOnTheSlideShow();
    }
//    @Test(priority = 3 )
//    public void geoLocationsFilterOnHomPage(){
//        hp.clickOnLocationFilters().chooseAContinentAndGetRegions("Europe").clickOnBackFromTheSubLists().chooseLocation("Antarctica").clickOnLanguage();
//    }
//    @Test(priority = 4)
//    public void guestUserLocationsSentimentAnalysis(){
//        hp.clickOnSentimentsMap().changeTheSentimentFilterFromAllShouldShowUpgradeMessage().clickBackToHomePage();
//
//    }
//    //"ependsOnMethods = "guestUserLocationsSentimentAnalysis"
//    @Test(priority = 5)
//    public void guestUserContinuesToCheckTheHomPageInvestorRelations(){
//      hp.checkTheInvestorRelationsBoxIsVisible().clickOnTheEarningsAndCheckIfTheCategoriesAreChanging().checkTheESGCategoriesSearchIsWorking().checkFiltersOfTheEsgContainers();
//    }
//    @Test(priority = 6)
//    public void gainersAndLosersTest(){
//        hp.gainersAndLosersSection().titlesAreVisible().stocksAndCryptosFunctionalities();
//    }
//


}
