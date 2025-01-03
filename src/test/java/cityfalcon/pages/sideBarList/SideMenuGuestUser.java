package cityfalcon.pages.sideBarList;

import cityfalcon.pages.*;
import cityfalcon.pages.homePage.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideMenuGuestUser extends BasePage {

    public SideMenuGuestUser(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath =  "//div[text()='Minimize']")
    private WebElement minimizeBtn;
    @FindBy(xpath = "//div[text()='CityFALCON  Chat']")
    private WebElement cityFalconChatBtn;


    @FindBy(xpath = "//div[text()='Personalised Content']")
    private WebElement personaliseContent;
    @FindBy(xpath = "//aside/article/section[3]")
    private WebElement allContent;

    @FindBy(xpath = "//section[4]/a[@href='/search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//section[5]/a[@data-component='Item']")
    private WebElement  preferencesBtn;

    @FindBy(xpath = "//section[6]/a[@href='/']")
    private WebElement productInfo;



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
