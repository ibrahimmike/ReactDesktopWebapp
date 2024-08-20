package cityfalcon.pages.watchLists;

import cityfalcon.pages.BasePage;
import net.bytebuddy.description.type.TypeDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class WatchListPage extends BasePage {
    private final String newsXpath = "//div[@data-component='StoryCard']";
    private final String watchListTopicsXpath = "//div[@data-component='WatchlistTopicsList']//ul/li";
    public WatchListPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@data-component='StoryCard']")));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@data-component='WatchlistTopicsList']//ul/li")));
      //  wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@data-component='StoryCard']"),2));
//        pageLoaded =  new WebDriverWait(driver, Duration.ofSeconds(60)).until(
//                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@data-component='StoryCard']"),3));

    }


    public boolean watchListIsCreated(){
        waitForTime();
        waitForTime();
        List<WebElement> news = driver.findElements(By.xpath(newsXpath));
        List<WebElement> watchListTopics = driver.findElements(By.xpath(watchListTopicsXpath));



        if (news.get(1).isDisplayed() && watchListTopics.get(3).isDisplayed()){
            return true;

        }

        return false;

    }
}
