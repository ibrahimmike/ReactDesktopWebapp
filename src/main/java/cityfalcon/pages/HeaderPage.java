package cityfalcon.pages;

import cityfalcon.pages.sideBarList.SideMenuGuestUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {


    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    private WebElement headermain = driver.findElement(By.id("main-header"));
    private WebElement logo = driver.findElement(By.xpath("/html//header[@id='main-header']//a[@href='/']/img[@alt='Logo']"));
    private WebElement bgrBtn = driver.findElement(By.id("menuToggleButton"));
    private WebElement signIn = headermain.findElement(By.xpath("//button[text()='Sign in / Register']"));
    private WebElement headerConsumer = headermain.findElement(By.xpath("//span[text()='Consumer']"));
    private WebElement headerEnterprise = headermain.findElement(By.xpath("//span[text()='Enterprise']"));
    private WebElement headerFeatureAndContent = headermain.findElement(By.xpath("//span[text()='Features and Content']"));

    private WebElement headerPricing = headermain.findElement(By.xpath("//span[text()='Pricing']"));




    public void clickOnConsumerPHeader(){
        clickOnWebElement(headerConsumer);
    }
    public SideMenuGuestUser guestUserClickOnHeaderBgrList(){
        clickOnWebElement(bgrBtn);
        return new SideMenuGuestUser(driver);
    }



}
