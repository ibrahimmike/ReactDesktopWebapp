package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.watchLists.GuestUserWatchListPage;
import cityfalcon.pages.RegisterFrameGuestUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalisedContent extends BasePage{
      @FindBy(xpath = "//ul/li/a[@href='/watchlists']")
      private  WebElement personalisedContentWatchList ;
      @FindBy(xpath = "//ul/li/a[@href='/bookmarks']")
      private WebElement bookmarksPersonalisedContent;


    public PersonalisedContent(WebDriver driver){
            super(driver);
        }




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
