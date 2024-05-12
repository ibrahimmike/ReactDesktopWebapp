package cityfalcon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideMenuGuestUser extends BasePage{

    public SideMenuGuestUser(WebDriver driver) {
        super(driver);
    }

    private WebElement minimizeBtn = driver.findElement(By.xpath("//div[text()='Minimize']"));
    private WebElement cityFalconChatBtn = driver.findElement(By.xpath("//div[text()='CityFALCON  Chat']"));
    private WebElement personaliseContent = driver.findElement(By.xpath("//div[text()='Personalised Content']"));

    private WebElement allContent = driver.findElement(By.xpath("//aside/article/section[3]"));



    public GuestUserWatchListPage  clickOnPersonlisedContentWatchListReturnGuestUserWatchListPage(){
        clickOnWebElement(personaliseContent);
         WebElement personalisedContentWatchList = driver.findElement(By.xpath("//ul/li/a[@href='/watchlists']"));
         clickOnWebElement(personalisedContentWatchList);
         return new GuestUserWatchListPage(driver);

    }

    public RegisterFrameGuestUser clickOnBookMarksAndReturnBookMarksPage(){
        clickOnWebElement(personaliseContent);
        WebElement bookmarksPersonalisedContent = driver.findElement(By.xpath("//ul/li/a[@href='/bookmarks']"));
        clickOnWebElement(bookmarksPersonalisedContent);
        return new  RegisterFrameGuestUser(driver);
    }
    public SideMenuGuestUser clickOnAllContent(){
        clickOnWebElement(allContent);

        return this;
    }






}
