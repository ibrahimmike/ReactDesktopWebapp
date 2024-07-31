package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.features.FeaturesCfScore;
import cityfalcon.pages.features.FeaturesSimilarityPage;
import cityfalcon.pages.features.FeaturesWatchListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Features extends BasePage {
    private final WebElement cityFalconScore = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='CityFALCON Score']"));
    private final WebElement watchLists = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/watchlists']"));
    private final WebElement similarity = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/similarity']"));

    private final WebElement newsAndCharts = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/news-on-charts']"));
    private final WebElement keyHeadLine = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/summarisation']"));
    private final WebElement sentiment = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/sentiment']"));
    private final WebElement contentTranslation = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/translation']"));

    public Features(WebDriver driver) {
        super(driver);
    }

    public FeaturesCfScore clickONcfScoreFeatures(){
        clickOnWebElement(cityFalconScore);
        return new FeaturesCfScore(driver);
    }
    public FeaturesWatchListPage clickOnWatchListsFeatures(){
        clickOnWebElement(watchLists);
        return new FeaturesWatchListPage(driver);
    }
    public FeaturesSimilarityPage clickOnSimilarityFeatures(){
        clickOnWebElement(similarity);
        return new FeaturesSimilarityPage(driver);
    }

}
