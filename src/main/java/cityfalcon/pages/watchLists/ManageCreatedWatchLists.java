package cityfalcon.pages.watchLists;

import cityfalcon.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ManageCreatedWatchLists extends BasePage {
    public ManageCreatedWatchLists(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Create New']")));
    }
    private WebElement createNewWatchList = driver.findElement(By.xpath("//span[text()='Create New']"));
    private WebElement nextBtn = driver.findElement(By.xpath("//div[contains(@class,'__control-panel___')]//button[text()='Next']"));
    private List<WebElement> watchLists = driver.findElements(By.xpath("//div[contains(@class,'__content__list___')]"));
    private List<WebElement> checkBoxes = driver.findElements(By.xpath(
             "//div[contains(@class,'__content__list___')]//div[contains(@class,'__manage-item__checkbox___')]"));
    private WebElement checkBox =  driver.findElement(By.xpath(
            "//div[contains(@class,'__filters-panel__item___')]//span[contains(@class,'__checkbox_box___')]"));

    public WatchListOnBoardingPreferences clickOnNextBtn(){
        scrollToView(nextBtn);
        clickOnWebElement(nextBtn);
        return new WatchListOnBoardingPreferences(driver);
    }




}
