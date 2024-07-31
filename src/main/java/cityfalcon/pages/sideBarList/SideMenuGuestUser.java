package cityfalcon.pages.sideBarList;

import cityfalcon.pages.*;
import cityfalcon.pages.features.*;
import cityfalcon.pages.filingsPages.CompanyFilingsPage;
import cityfalcon.pages.filingsPages.InsiderTransactionsPage;
import cityfalcon.pages.homePage.SearchPage;
import cityfalcon.pages.productsPages.ProductsMobileAppPage;
import cityfalcon.pages.productsPages.ProductsPage;
import cityfalcon.pages.productsPages.ProductsVoiceAssistantPage;
import cityfalcon.pages.productsPages.ProductsWebAppPage;
import cityfalcon.pages.segments.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideMenuGuestUser extends BasePage {

    public SideMenuGuestUser(WebDriver driver) {
        super(driver);
    }

    private final WebElement minimizeBtn = driver.findElement(By.xpath("//div[text()='Minimize']"));
    private final WebElement cityFalconChatBtn = driver.findElement(By.xpath("//div[text()='CityFALCON  Chat']"));
    private final WebElement personaliseContent = driver.findElement(By.xpath("//div[text()='Personalised Content']"));

    private final WebElement allContent = driver.findElement(By.xpath("//aside/article/section[3]"));
    private final WebElement searchBtn = driver.findElement(By.xpath("//section[4]/a[@href='/search']"));
    private final WebElement preferencesBtn = driver.findElement(By.xpath("//section[5]/a[@data-component='Item']"));
    private final WebElement productInfo = driver.findElement(By.xpath("//section[6]/a[@href='/']"));

    public AllContent clickOnAllContent(){
        clickOnWebElement(allContent);
        return new AllContent(driver);
    }
    public SearchPage clickSideBarSearchBtn(){

        clickOnWebElement(searchBtn);
        return new SearchPage(driver);
    }
    public Preferences clickOnPreferences(){
        clickOnWebElement(preferencesBtn);
        return new Preferences(driver);
    }

    public  PersonalisedContent clickOnPersonalised(){
        clickOnWebElement(personaliseContent);
        return  new PersonalisedContent(driver);
    }

    public ProductInfo clickOnProductInfo(){
        clickOnWebElement(productInfo);
        return new ProductInfo(driver);
    }







}
