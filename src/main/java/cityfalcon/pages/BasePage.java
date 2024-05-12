package cityfalcon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver = driver;
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private void waitForElementToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    protected void clickOnWebElement(WebElement element){
        waitForElementToBeVisible(element);
        element.click();
    }
    protected void typeOnWebElement(WebElement element, String text){
        waitForElementToBeVisible(element);
        element.sendKeys(text);
    }


}
