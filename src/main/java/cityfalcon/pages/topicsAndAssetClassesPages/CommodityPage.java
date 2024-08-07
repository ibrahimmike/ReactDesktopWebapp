package cityfalcon.pages.topicsAndAssetClassesPages;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.homePage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommodityPage extends BasePage {



    public CommodityPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='details-header__info--container']")));
    }


    public HomePage clickOnTheHeaderCFLogoAndReturnToHomePage(){
        //WebElement headerCfLogo = driver.findElement(By.xpath("//header//a[@href='/']"));
        clickOnWebElement(driver.findElement(By.xpath("//header//a[@href='/']")));
        //waitForTime();
        return new HomePage(driver);
    }
}
