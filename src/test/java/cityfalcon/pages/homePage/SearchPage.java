package cityfalcon.pages.homePage;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.topicsAndAssetClassesPages.CommodityPage;
//import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
//import org.apache.commons.io.input.CharSequenceReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//div[text()='Basic Search']" )
    private WebElement basicSearchTab;

    @FindBy(xpath = "//div[text()='Advanced Search']")
    private WebElement advancedSearch;
    @FindBy(xpath = "//div[text()='CANCEL']")
    private WebElement cancelBtn;
    @FindBy(xpath = "//div//section[@data-component='SearchbarInput']//input[@placeholder='']")
    private WebElement searchBar;

    @FindBy(xpath = "//div[@class='menu-wrapper--inner']//div[@class='menu-item-wrapper ']" )
    private List<WebElement> menuItems;
    @FindBy(xpath = "//div[@role='tabpanel']//h3")
    private WebElement tabPanel;
    @FindBy(xpath = "//div[contains(@class, '__search_result_name__')]//span[contains(@class, 'module__name__')]" )
    private List<WebElement> listOfSearchResult;








    public SearchPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'__search_dropdown___')]")));
    }

    public SearchPage clickOnAdvancedSearch(){
        clickOnWebElement(advancedSearch);
        return this;
    }
    public HomePage clickOnCancelBtn(){
        clickOnWebElement(cancelBtn);
        return new HomePage(driver);
    }
    private boolean checkSearchResult(String searchPhrase){
        clickOnWebElement(searchBar);
        searchBar.sendKeys(searchPhrase);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-component='SearchBarKeywordsList']/h4")));
        WebElement key = driver.findElement(By.xpath("//div[@data-component='SearchBarKeywordsList']/h4"));

        waitForElementToBeVisible(key);
        WebElement searchKeyWordQuery = driver.findElement(By.xpath("//div[@data-component='SearchBarKeywordsList']/div/span"));
        System.out.println("Search result : " + key.getText());


       return searchKeyWordQuery.getText().contains(searchPhrase);

    }
    public SearchPage makeASearchAndCheckSearchResult(String search){
        if (checkSearchResult(search)){
          //  ExtentLogger.log("The search item has returned data that corresponds with the search");
        }else{
           // System.out.println("Test did not pass");
         //   ExtentLogger.fail("The search result did not return the searched subject");
        }
        return this;
    }
    public CommodityPage clickOnTheSearchBtn(){
        WebElement searchBtn = driver.findElement(By.xpath("//span[contains(text(), 'Search')]"));
        clickOnWebElement(searchBtn);
   //     ExtentLogger.log("Search button clicked");
        return new CommodityPage(driver);
    }
    public SearchPage clickONSearchTopics(int numberOfTopicsToBeClicked){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'__search_result_name___')]")));
        List<WebElement> topicsForSearch = driver.findElements(By.xpath("//div[contains(@class,'__search_result_name___')]"));
        for(int i= 0; i < numberOfTopicsToBeClicked; i++){
            topicsForSearch.get(i).click();

        }

        return this;
    }






}
