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

public class ESGContainerFilters extends BasePage {


    public ESGContainerFilters(WebDriver driver) {
        super(driver);
      //  wait.until(ExpectedConditions.visibilityOf(esgContainer));


    }
    public HomePage checkFiltersOfTheEsgContainers(){
        WebElement esgContainer = driver.findElement(By.xpath("//div[contains(@class,'__company-data-wrapper___')]//div[text()='Company ESG Reports']//parent::div[contains(@class, '__section-wrapper-header-left___')]//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]"));
        scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__discovery-videos-slider-wrapper___')]")));
        waitForTime();
        List<WebElement> items = esgContainer.findElements(By.xpath("//div[contains(@class,'__items-scroll-bar___')]//div[@class='menu-item-wrapper ']"));
        Map<String, WebElement> clickableItems = new HashMap<>();
        for (WebElement e : items){
            clickableItems.put(e.getText(),e);

        }
        clickableItems.get("Diversity").click();

        waitForTime();
        List<WebElement> types = esgContainer.findElements(By.xpath("//div[contains(@class,'__company-data-wrapper___')]//div[text()='Company ESG Reports']//parent::div[contains(@class, '__section-wrapper-header-left___')]//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]//div[contains(@class,'__row_type__')]"));

        List<Boolean> bouls = new ArrayList<>();
        for(WebElement t : types){
            if(t.getText().equalsIgnoreCase("Diversity")){
                bouls.add(true);
            }else{
                bouls.add(false);
            }

        }
        System.out.println("ESG types : " + bouls);
        if (!bouls.contains(false)){
            ExtentLogger.log("When clicking on Diversity type, the types in the cards of the ESG files container are  updating accordingly");
        }else {
            ExtentLogger.fail("When clicking on type Diversity the types inside the cards of the ESG container does not update ");
        };
        return new HomePage(driver);

    }

}
