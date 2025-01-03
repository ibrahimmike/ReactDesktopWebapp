package cityfalcon.pages.headerPage;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.sideBarList.SideMenuGuestUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {


    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "main-header")
    private WebElement headermain;


    @FindBy(xpath = "/html//header[@id='main-header']//a[@href='/']/img[@alt='Logo']" )
    private WebElement logo;

    @FindBy(id = "menuToggleButton")
    private WebElement bgrBtn;


    @FindBy(xpath = "//button[text()='Sign in / Register']")
    private WebElement singIn;


    @FindBy(xpath = "//header[@id='main-header']//span[text()='Consumer']")
    private WebElement headerConsumer;


    @FindBy(xpath = "//header[@id='main-header']//span[text()='Enterprise']")
    private WebElement headerEnterprise;


    @FindBy(xpath = "//header[@id='main-header']//span[text()='Features and Content']")
    private WebElement headerFeatureAndContent;


    @FindBy(xpath = "//header[@id='main-header']//span[text()='Pricing']")
    private WebElement headerPricing;







    public SideMenuGuestUser guestUserClickOnHeaderBgrList(){
        clickOnWebElement(bgrBtn);
        return new SideMenuGuestUser(driver);
    }
    public void clickOnConsumerPHeader(){
        clickOnWebElement(headerConsumer);
    }



}
