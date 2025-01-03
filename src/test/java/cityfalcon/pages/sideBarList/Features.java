package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.features.FeaturesCfScore;
import cityfalcon.pages.features.FeaturesSimilarityPage;
import cityfalcon.pages.features.FeaturesWatchListPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Features extends BasePage {

    @FindBy(xpath = "//section[6]//ul/li//div[text()='CityFALCON Score']")
    private WebElement cityFalconScore;
    @FindBy(xpath = "//section[6]//ul/li//a[@href='/features/watchlists']")
    private WebElement watchLists;

    @FindBy(xpath = "//section[6]//ul/li//a[@href='/features/similarity']")
    private WebElement similarity;

    @FindBy(xpath = "//section[6]//ul/li//a[@href='/features/news-on-charts']")
    private WebElement newsAndCharts;

    @FindBy(xpath = "//section[6]//ul/li//a[@href='/features/summarisation']")
    private WebElement keyHeadLine;

    @FindBy(xpath = "//section[6]//ul/li//a[@href='/features/sentiment']")
    private WebElement sentiment;

    @FindBy(xpath = "//section[6]//ul/li//a[@href='/features/translation']")
    private WebElement contentTranslation;

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
