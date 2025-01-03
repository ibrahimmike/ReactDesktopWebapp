package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.ManageWatchListAsGuestUserPage;
import cityfalcon.pages.RegisterFrameGuestUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Preferences extends BasePage {

       @FindBy(xpath = "//section[5]/ul/li/a[@href='/preferences/account']")
       private  WebElement accountPreferences;
       @FindBy(xpath = "//section[5]/ul/li/a[@href='/preferences/subscription']")
       private WebElement subscription;
       @FindBy(xpath = "//section[5]/ul/li/a[@href='/preferences/notifications']")
       private WebElement notifications;
       @FindBy(xpath = "//section[5]/ul/li/a[@href='/watchlists/manage']")
       private WebElement manageWatchLists;

        public Preferences(WebDriver driver) {
            super(driver);
        }




        public RegisterFrameGuestUser clickOnAccountInfoGuestUser(){
            clickOnWebElement(accountPreferences);
            return new RegisterFrameGuestUser(driver);
        }
        public RegisterFrameGuestUser clickOnSideBarSubscriptionAsGuestUser(){
            clickOnWebElement(subscription);
            return new RegisterFrameGuestUser(driver);
        }
        public RegisterFrameGuestUser clickOnSideBarNotificationsAsGuestUser(){

            clickOnWebElement(notifications);
            return new RegisterFrameGuestUser(driver);
        }
        public ManageWatchListAsGuestUserPage clickOnSideBarManageWatchListsGuestUSer(){
            clickOnWebElement(manageWatchLists);
            return new ManageWatchListAsGuestUserPage(driver);
        }




}
