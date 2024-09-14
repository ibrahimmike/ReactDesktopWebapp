package cityfalcon.pages.watchLists;

import cityfalcon.extentLoger.ExtentLogger;
import cityfalcon.pages.BasePage;
import cityfalcon.pages.homePage.SearchPage;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class CreateWatchListPage extends BasePage {

   // private WebElement searchBarOnCreateWatchList = driver.findElement(By.xpath("//div[contains(@class,'__input_content___')]"));

    public CreateWatchListPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'__input_content___')]")));
    }
    public SearchPage clickOnSearchBox(){
        WebElement searchBarOnCreateWatchList = driver.findElement(By.xpath("//div[contains(@class,'__input_content___')]"));
       clickOnWebElement(searchBarOnCreateWatchList);

        return new SearchPage(driver);
    }
    public CreateWatchListPage chooseTopicsForWatchListChooseFiveTopicsAndClickNext(){
        clickOnSearchBox().clickONSearchTopics(5);
        waitForTime();
        TopicsInTheSearch topicsInTheSearch = new TopicsInTheSearch(driver);
        boolean topicsAreShowing = topicsInTheSearch.TopicsAreBeingAddedToTheSearchBar();

        if(topicsAreShowing){
            ExtentLogger.pass("The topics Are showing on the search bar when the user has added them to the watch list ");
        }else{
            ExtentLogger.fail("The topics are not showing on the search bar when they are added from the search list");
        }
        return this;

    }
    public AlertConfirmWatchListName clickOnCreateWatchBtn(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[text()='Create Watchlist']")));
        clickOnWebElement(driver.findElement(By.xpath("//span[text()='Create Watchlist']")));
        return new AlertConfirmWatchListName(driver);
    }


    private class TopicsInTheSearch extends CreateWatchListPage{

        public TopicsInTheSearch(WebDriver driver) {
            super(driver);
            try {
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'__multiple_topics_item___')]")));
            }catch(Exception e){
                ExtentLogger.fail("The topics failed to load");

            }
        }
        public Boolean TopicsAreBeingAddedToTheSearchBar(){
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'__multiple_topics_item___')]")));
            List<WebElement> addedTopic =  new ArrayList<>( driver.findElements(By.xpath("//div[contains(@class,'__multiple_topics_item___')]")));
            List<Boolean> checkingVisuals = new ArrayList<>();
            for (WebElement element: addedTopic){
               if (element.isDisplayed()){
                   checkingVisuals.add(true);

                }else {
                   checkingVisuals.add(false);
               }
            }
            System.out.println("The topics are showing " + checkingVisuals);

            return !checkingVisuals.contains(false);
        }


    }



}
