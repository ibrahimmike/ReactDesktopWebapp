package cityfalcon.pages.homePage;

import cityfalcon.extentLoger.ExtentLogger;
import cityfalcon.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheInvestorRelationsFilters extends BasePage {

   private WebElement mainInvestorRelationsContainer  = driver.findElement(By.xpath("//div[contains(@class,'__company-data-wrapper___')]//div[text()='Investor Relations']//parent::div[contains(@class, '__section-wrapper-header-left___')]//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]"));


    public TheInvestorRelationsFilters(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOf(mainInvestorRelationsContainer));
    }
    //div[contains(@class,'__company-data-wrapper___')]//div[text()='Investor Relations']//parent::div[contains(@class, '__section-wrapper-header-left___')]//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]//div[contains(@class,'__items-scroll-bar___')]//div[@class='menu-item-wrapper ']
    public HomePage clickOnTheEarningsAndCheckIfTheCategoriesAreChanging(){
        //div[contains(@class,'__company-data-wrapper___')]//div[text()='Investor Relations']//parent::div[contains(@class, '__section-wrapper-header-left___')]//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]//div[contains(@class,'__items-scroll-bar___')]//parent::div[contains(@class,'__company-data-section___')]//parent::div[contains(@class,'__section-wrapper-content___')]//parent::div[contains(@class,'__section-wrapper-container___')]//div[text()='Investor Relations']
//mainInvestorRelationsContainer.findElement(By.xpath("//parent::div[contains(@class,'__company-data-section___')]//parent::div[contains(@class,'__section-wrapper-content___')]//parent::div[contains(@class,'__section-wrapper-container___')]"))
        scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__discovery-videos-slider-wrapper___')]")));
        waitForTime();


       List<WebElement> items = mainInvestorRelationsContainer.findElements(By.xpath("//div[contains(@class,'__items-scroll-bar___')]//div[@class='menu-item-wrapper ']"));
        Map<String, WebElement> clickableItems = new HashMap<>();
        for (WebElement e : items){
            clickableItems.put(e.getText(),e);

        }
        clickableItems.get("Earnings").click();
        waitForTime();
        List<WebElement> types = mainInvestorRelationsContainer.findElements(By.xpath("//div[contains(@class,'__company-data-wrapper___')]//div[text()='Investor Relations']//parent::div[contains(@class, '__section-wrapper-header-left___')]//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]//div[contains(@class,'__row_type__')]"));

        List<Boolean> bouls = new ArrayList<>();
         for(WebElement t : types){
             if(t.getText().equalsIgnoreCase("Earnings")){
                 bouls.add(true);
             }else{
                 bouls.add(false);
             }

         }
        System.out.println("The investor relations filter type " + bouls);
         if (!bouls.contains(false)){
             ExtentLogger.log("When clicking on Earnings type, the types in the showing container are updating accordingly");
         }else {
             ExtentLogger.fail("When clicking on type Earnings the types inside the container does not update ");
         };
        return new HomePage(driver);

     }

}
