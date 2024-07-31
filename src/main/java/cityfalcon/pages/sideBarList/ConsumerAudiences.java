package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.DailyNewsReader;
import cityfalcon.pages.retailPages.RetailInvestorsPage;
import cityfalcon.pages.retailPages.RetailTraders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConsumerAudiences extends BasePage {
    public ConsumerAudiences(WebDriver driver) {
        super(driver);
    }
    private final WebElement retailInvestorBtn = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='Retail Investors']"));
    private final WebElement retailTraders = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='Retail Traders']"));
    private final WebElement dailyBusinessNewsReader = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='Daily Business News Reader']"));


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
