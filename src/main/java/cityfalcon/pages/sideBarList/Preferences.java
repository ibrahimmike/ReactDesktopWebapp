package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.ManageWatchListAsGuestUserPage;
import cityfalcon.pages.RegisterFrameGuestUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Preferences extends BasePage {

        public Preferences(WebDriver driver) {
            super(driver);
        }
        private final WebElement accountPreferences = driver.findElement(By.xpath("//section[5]/ul/li/a[@href='/preferences/account']"));
        private final  WebElement subscription = driver.findElement(By.xpath("//section[5]/ul/li/a[@href='/preferences/subscription']"));
        private final WebElement  notifications = driver.findElement(By.xpath("//section[5]/ul/li/a[@href='/preferences/notifications']"));
        private final WebElement manageWatchLists = driver.findElement(By.xpath("//section[5]/ul/li/a[@href='/watchlists/manage']"));
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
