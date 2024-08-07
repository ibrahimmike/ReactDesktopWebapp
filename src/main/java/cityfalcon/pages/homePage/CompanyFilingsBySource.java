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

public class CompanyFilingsBySource extends BasePage {
    private WebElement filingsBySourceContainer = driver.findElement(By.xpath("//div[contains(@class,'__company-data-wrapper___')]//" +
            "div[text()='Company Filings by Sources']//parent::div[contains(@class, '__section-wrapper-header-left___')]" +
            "//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]"));

    public CompanyFilingsBySource(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOf(filingsBySourceContainer));
    }
    public HomePage checkFiltersOfTheEsgContainers(){
        scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__discovery-videos-slider-wrapper___')]")));
        waitForTime();
        List<WebElement> items = filingsBySourceContainer.findElements(By.xpath("//div[contains(@class,'__items-scroll-bar___')]//div[@class='menu-item-wrapper ']"));
        Map<String, WebElement> clickableItems = new HashMap<>();
        for (WebElement e : items){
            clickableItems.put(e.getText(),e);

        }
        clickableItems.get("Companies House, GB").click();
        waitForTime();
        List<WebElement> types = filingsBySourceContainer.findElements(By.xpath("//div[contains(@class,'__row_type__')]"));

        List<Boolean> bouls = new ArrayList<>();
        for(WebElement t : types){
            if(t.getText().equalsIgnoreCase("Companies House, GB")){
                bouls.add(true);
            }else{
                bouls.add(false);
            }

        }
        if (!bouls.contains(false)){
            ExtentLogger.log("When clicking on Earnings type, the types in the showing container are updating accordingly");
        }else {
            ExtentLogger.fail("When clicking on type Earnings the types inside the container does not update ");
        };
        return new HomePage(driver);

    }





}
