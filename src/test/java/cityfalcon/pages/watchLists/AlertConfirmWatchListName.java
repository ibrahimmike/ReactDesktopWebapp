package cityfalcon.pages.watchLists;

import cityfalcon.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertConfirmWatchListName extends BasePage {
    public AlertConfirmWatchListName(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'modal-dialog-centered')]")));
    }
    private WebElement modelTitle = driver.findElement(By.xpath("//div[contains(@class,'modal-dialog-centered')]//p"));

    private WebElement watchListInputName = driver.findElement(By.xpath("//div[contains(@class,'modal-dialog-centered')]//form//input[@type='text']"));

    private WebElement watchListAlertBackBtn = driver.findElement(By.xpath("//div[contains(@class,'modal-dialog-centered')]//form//button[@type='button']"));

    private WebElement watchListAlertConfirmBtn = driver.findElement(By.xpath("//div[contains(@class,'modal-dialog-centered')]//form//button[@type='submit']"));


    public ManageCreatedWatchLists clickOnConfirmBtn(){

        clickOnWebElement(watchListAlertConfirmBtn);
        waitForTime();

        return new ManageCreatedWatchLists(driver);
    }


}
