package tests;

import cityfalcon.pages.HeaderPage;
import org.apache.hc.core5.http.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuestUserHomePageSideBarTest extends BaseTest{
    @Test
    public void sideBarNewsBtn(){
        HeaderPage hp = new HeaderPage(driver);
       // String url =  hp.guestUserClickOnHeaderBgrList();
        //Assert.assertEquals(url, "https://www.cityfalcon.ai/news", "The news Url doesn't redirect to the news page");
    }
    @Test
    public void sideBarWatchListBtn(){
        HeaderPage hp = new HeaderPage(driver);
         hp.guestUserClickOnHeaderBgrList().clickOnAllContent().companiesInsights();
       // System.out.println(url);
    }
    @Test
    public void testing(){
        HeaderPage hp = new HeaderPage(driver);
        hp.guestUserClickOnHeaderBgrList().clickOnPersonalised().clickOnPersonlisedContentWatchListReturnGuestUserWatchListPage();
    }
    @Test
    public void testing2(){
        HeaderPage hp = new HeaderPage(driver);
        hp.guestUserClickOnHeaderBgrList().clickOnPersonalised().clickOnBookMarks();
    }
    @Test
    public void testing3(){
        HeaderPage hp = new HeaderPage(driver);
        hp.guestUserClickOnHeaderBgrList().clickOnProductInfo();
    }


}
