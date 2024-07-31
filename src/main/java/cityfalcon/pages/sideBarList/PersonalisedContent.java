package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.GuestUserWatchListPage;
import cityfalcon.pages.RegisterFrameGuestUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalisedContent extends BasePage{


        public PersonalisedContent(WebDriver driver){
            super(driver);
        }

        private final WebElement personalisedContentWatchList = driver.findElement(By.xpath("//ul/li/a[@href='/watchlists']"));
        private final WebElement bookmarksPersonalisedContent = driver.findElement(By.xpath("//ul/li/a[@href='/bookmarks']"));

        public GuestUserWatchListPage clickOnPersonlisedContentWatchListReturnGuestUserWatchListPage(){

            //  WebElement personalisedContentWatchList = driver.findElement(By.xpath("//ul/li/a[@href='/watchlists']"));
            clickOnWebElement(personalisedContentWatchList);
            return new GuestUserWatchListPage(driver);
        }
        public RegisterFrameGuestUser clickOnBookMarks(){
            clickOnWebElement(bookmarksPersonalisedContent);
            return new  RegisterFrameGuestUser(driver);
        }


}
