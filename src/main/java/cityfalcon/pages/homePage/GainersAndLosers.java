package cityfalcon.pages.homePage;

import cityfalcon.extentLoger.ExtentLogger;
import cityfalcon.extentLoger.ExtentReport;
import cityfalcon.pages.BasePage;
import com.aventstack.extentreports.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GainersAndLosers extends BasePage {

//    private List<WebElement> filtersBtns = driver.findElements(By.xpath("//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]" +
//            "//ancestor::div[contains(@class,'__section-wrapper-container___')]//div[@class='menu-wrapper']//button"));

    public GainersAndLosers(WebDriver driver) {
        super(driver);
        scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]")));
    }

    public GainersAndLosers titlesAreVisible(){
        WebElement gainersAndLosersTitle = driver.findElement(By.xpath("//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]"));
       // WebElement aiPromoCloseBtn = driver.findElement(By.xpath("//div[contains(@class,'promobar ')]//div[contains(@class,'__banner___')]//div[contains(@class,'__banner__header___')]/*[local-name()=\"svg\"]"));

      //  aiPromoCloseBtn.click();
        AiPromoBox promoBox = new AiPromoBox(driver);
        promoBox.clickOnCloseAiPromoBox();

        if(gainersAndLosersTitle.isDisplayed()){
            ExtentLogger.pass("The title is visible for the gainers and losers section");
        }else {
            ExtentLogger.fail("The title IS NOT visible for the gainers and losers section");
        }

        List<WebElement> periodsList = driver.findElements(By.xpath("//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]//ancestor::div[contains(@class,'__section-wrapper-header___')]//ul//li"));

        if(periodsList.get(1).isDisplayed()){
            ExtentLogger.pass("The periods list is visible");
        }else{
            ExtentLogger.fail("The periods list is not visible");
        }

        return this;
    }
    public GainersAndLosers stocksAndCryptosFunctionalities(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]" +
                "//ancestor::div[contains(@class,'__section-wrapper-container___')]//div[@class='menu-wrapper']//button")));
//        scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]" +
//                "//ancestor::div[contains(@class,'__section-wrapper-header___')]")));
        scrollUpToElement(driver.findElement(By.xpath("//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]//ancestor::div[contains(@class,'__section-wrapper-header___')]//ancestor::section[contains(@class,'__section-wrapper___')]")));
        waitForTime();
        List<WebElement> filtersBtns = driver.findElements(By.xpath("//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]" +
                "//ancestor::div[contains(@class,'__section-wrapper-container___')]//div[@class='menu-wrapper']//button"));


        try {

            Map<String, WebElement> buttons = new HashMap<>();
            for (WebElement e : filtersBtns) {
                buttons.put(e.getText(), e);
            }
            waitForTime();


            clickOnWebElement(buttons.get("Crypto"));
            waitForTime();
            clickOnWebElement(buttons.get("Nano Cap"));
            waitForTime();
            ExtentLogger.log("The user was able to click on crypto and to click on Mega Cap");
        }catch(Exception e){
            ExtentLogger.fail("The filters for the stocks and cap sizes did not update" + e.getMessage());

          //  throw new RuntimeException("The elements are not visible : "+ );
        }


        return this;
    }
}
