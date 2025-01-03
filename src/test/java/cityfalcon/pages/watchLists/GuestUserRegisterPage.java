package cityfalcon.pages.watchLists;

import cityfalcon.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GuestUserRegisterPage extends BasePage {
    public GuestUserRegisterPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'__control-panel__')]//button[text()='Register']")));
    }

    public WatchListPage clickOnSkipAndMoveToWatchListPage(){
        clickOnWebElement(driver.findElement(By.xpath("//div[contains(@class,'__control-panel__')]//a[text()='Skip']")));
        return new WatchListPage(driver);

    }
}
