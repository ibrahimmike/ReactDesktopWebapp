package cityfalcon.pages.watchLists;

import cityfalcon.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Arrays;
import java.util.List;

public class WatchListPage extends BasePage {
    private final String newsXpath = "//div[@data-component='StoryCard']";
    private final String watchListTopicsXpath = "//div[@data-component='WatchlistTopicsList']//ul/li";
    public WatchListPage(WebDriver driver) {
        super(driver);

//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@data-component='WatchlistTopicsList']//ul/li")));
      //  wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@data-component='StoryCard']"),2));
//        pageLoaded =  new WebDriverWait(driver, Duration.ofSeconds(60)).until(
//                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));


    }


    public boolean watchListIsCreated(){
        waitForTime();
        if (theNewsSectionIsLoaded() && watchListTopicsAreVisible()){
            return true;
        }
        return false;

    }
    private boolean theNewsSectionIsLoaded(){
        boolean check;
        try{
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@data-component='StoryCard']"),3));
            check = true;
        }catch(TimeoutException e){
            check = false;
            throw new RuntimeException("The news section is not loading");

        }
        return check;
    }
    private boolean watchListTopicsAreVisible(){
        boolean check;
        try{
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(watchListTopicsXpath), 4));
            check = true;
        }catch (TimeoutException e){
            check = false;
            throw new RuntimeException("The topics section of the watch list is not showing");
        }

        return check;

    }
}
