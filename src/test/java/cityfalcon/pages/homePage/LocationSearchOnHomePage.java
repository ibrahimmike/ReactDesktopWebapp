package cityfalcon.pages.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LocationSearchOnHomePage extends HomePage{

    @FindBy(xpath = "//div[@class='location-filter-sub-header']")
    private WebElement locationFilterHeader;


    @FindBy(xpath = "//div[contains(@class, '__language-filter-wrapper__')]//button[@id='source-dropdown-button']")
    private WebElement languageBtn;
    @FindBy(xpath = "//div[contains(@class, '__location-filter-item__')]//span")
    private List<WebElement> firstLayerList;



    public LocationSearchOnHomePage(WebDriver driver) {
        super(driver);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class, '__location-filter-item___')]")));

    }

    private void clickOnChoice(String choice){
      //   List<WebElement> firstLayerList = driver.findElements(By.xpath("//div[contains(@class, '__location-filter-item__')]//span"));
         for (WebElement e : firstLayerList){
            if (e.getText().equalsIgnoreCase(choice)){
                e.click();
            }
        }
    }
    private void clickOnTheChevronOfTheChoice(String choice) {
        List<WebElement> innerLists = driver.findElements(By.
                xpath("//div[contains(@class, '__location-filter-item__')]//div[contains(@class, '__item-right__')]"));

        for (WebElement e : innerLists) {
            try {

               WebElement element = e.findElement(By.xpath("preceding-sibling::div//span"));

                if (element.getText().equalsIgnoreCase(choice)) {
                    e.click();
                }
            } catch (Exception exception) {
               exception.getMessage();
            }
        }
    }
        //preceding-sibling::div/span


    public LocationSearchOnHomePage chooseLocation(String location){
        clickOnChoice(location);
        return this;

    }
    public LocationSearchOnHomePage chooseAContinentAndGetRegions(String location){

        clickOnTheChevronOfTheChoice(location);
        return this;
    };
    public LocationSearchOnHomePage clickOnBackFromTheSubLists(){
        WebElement backBtn = driver.findElement(By.xpath("//div[contains(@class, 'module__back__')]"));
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
        clickOnWebElement(backBtn);
        return this;
    }
    public HomePage clickOnLanguage(){
        clickOnWebElement(languageBtn);
        WebElement listWrapper = driver.findElement(By.xpath("//div[contains(@class, '__language-filter-wrapper__')]"));
        WebElement searchBox = listWrapper.findElement(By.xpath("//div[contains(@class, '__input-container__')]//input[@type='text']"));

        wait.until(ExpectedConditions.visibilityOf(searchBox));
        typeOnWebElement(searchBox,"ger");
        return new HomePage(driver);
    }








}
