package tests;

import cityfalcon.pages.HeaderPage;
import cityfalcon.pages.homePage.HomePage;
import org.apache.hc.core5.http.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuestUserHomePageSideBarTest extends BaseTest{


    @Test //(priority = 1)
    public void checkTheSearchIsWorking(){
        HomePage hp = new HomePage(driver);

        hp.clickOnSearch().makeASearchAndCheckSearchResult("Oil");
    }
    @Test //(priority = 2)

    public void chooseLocationOnTheHomePageFilter(){

        HomePage hp = new HomePage(driver);
        hp.clickOnLocationFilters().chooseAContinentAndGetRegions("Europe").clickOnBackFromTheSubLists().chooseLocation("Antarctica").clickOnLanguage();

    }
    @Test //(priority = 3)
    public void clickOnCompactView(){
        HomePage hp = new HomePage(driver);
        hp.clickOnGeoFiltersCompactView();
    }
//    @Test(priority = 4)
//    public




}
