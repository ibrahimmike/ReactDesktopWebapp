package cityfalcon.pages.locationsPage;

import cityfalcon.extentLoger.ExtentLogger;
import cityfalcon.pages.BasePage;
import cityfalcon.pages.homePage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class SentimentsLocationsPage extends BasePage {
    public SentimentsLocationsPage(WebDriver driver) {
        super(driver);
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='js-plotly-plot']//g[@class='geolayer']//g[@class='layer bg']"))));
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath()));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'__sentiment_levels_holder___')]")));
    }
   // private List<WebElement> newsCards = driver.findElements(By.xpath("//div[@data-component='StoryCard']"));

    public SentimentsLocationsPage newsAreVisible(){
        waitForTime();
        scrollUpToElement(driver.findElement(By.xpath("//div[contains(@class,'__filters-button-container___')]//button[@aria-label='refresh-button']")));
        List<WebElement> newsCards = driver.findElements(By.xpath("//div[@data-component='StoryCard']"));
        ArrayList<Boolean> visible = new  ArrayList<>();
        for (WebElement e : newsCards){
            if(e.isDisplayed()){
                visible.add(true);
            }else{
                visible.add(false);
            }
        }
        if (visible.contains(false)){
            ExtentLogger.fail("The news are not loaded on the sentiments locations page");
        }else{
            ExtentLogger.log("The news are showing on the sentiment locations page ");
        }
        return this;
    }
    public SentimentsLocationsPage sentimentsAnalysisCard(){
        WebElement sentimentCard = driver.findElement(By.xpath("//div[contains(@class,'__sentiment_analysis___')]"));
        return this;
    }
    public SentimentsLocationsPage changeTheSentimentFilterFromAllShouldShowUpgradeMessage(){
        waitForTime();
        scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__sentiment_stories___')]/div[contains(@class,'__sentiment_stories_title___')]")));
      //  WebElement veryHigh = driver.findElement(By.xpath("//div[@data-component='NavBar']//ul/li[2]"));

        clickOnWebElement(driver.findElement(By.xpath("//div[@data-component='NavBar']//ul/li[2]")));
      //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(@class,'__sentiment_upgrade___')]/a[@href='/pricing']"))));
        WebElement pricingLink = driver.findElement(By.xpath("//div[contains(@class,'__sentiment_upgrade___')]/a[@href='/pricing']"));
        waitForElementToBeVisible(pricingLink);
        if (pricingLink.isDisplayed()){
            ExtentLogger.log("The upgrade link is visible");
        }else{
            ExtentLogger.fail("The upgrade link is not visible on sentiments location page ");
        }
        return this;
    }
    public HomePage clickBackToHomePage(){
//        scrollUpToElement(driver.findElement(By.xpath("//div[contains(@class, '__logo___')]//a[@href='/']")));
//        waitForTime();
//
//       clickOnWebElement(driver.findElement(By.xpath("//div[contains(@class, '__logo___')]//a[@href='/']")));
        driver.navigate().back();
        driver.navigate().refresh();
        return new HomePage(driver);
    }
}
