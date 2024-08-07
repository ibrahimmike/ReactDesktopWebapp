package cityfalcon.pages.watchLists;

import cityfalcon.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WatchListOnBoardingPreferences extends BasePage {
    public WatchListOnBoardingPreferences(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'__item-pref__title___')]")));
    }
   // private WebElement nextBtn = driver.findElement(By.xpath("//div[contains(@class,'__control-panel___')]//button[text()='Next']"));

    public WatchListPage clickOnNextBtn(){
        WebElement nextBtn = driver.findElement(By.xpath("//div[contains(@class,'__control-panel___')]//button[text()='Next']"));
        clickOnWebElement(nextBtn);
        return new WatchListPage(driver);
    }

}
