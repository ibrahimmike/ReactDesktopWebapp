package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.DailyNewsReadersPages.DailyNewsReader;
import cityfalcon.pages.retailPages.RetailInvestorsPage;
import cityfalcon.pages.retailPages.RetailTraders;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsumerAudiences extends BasePage {
    public ConsumerAudiences(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//section[6]//ul/li//div[text()='Retail Investors']")
    private WebElement retailInvestorBtn;


    @FindBy(xpath = "//section[6]//ul/li//div[text()='Retail Traders']" )
    private WebElement retailTraders;


    @FindBy(xpath = "//section[6]//ul/li//div[text()='Daily Business News Reader']")
    private WebElement dailyBusinessNewsReader;



    public RetailInvestorsPage clickOnRetailInvestorBtn(){
        clickOnWebElement(retailInvestorBtn);
        return new RetailInvestorsPage(driver);
    }

    public RetailTraders clickOnRetailTrader(){
        clickOnWebElement(retailTraders);
        return new RetailTraders(driver);
    }
    public DailyNewsReader clickOnDailyNewsReader(){
        clickOnWebElement(dailyBusinessNewsReader);
        return new DailyNewsReader(driver);
    }
}
