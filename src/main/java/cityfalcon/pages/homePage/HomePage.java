package cityfalcon.pages.homePage;

import cityfalcon.extentLoger.ExtentLogger;
import cityfalcon.pages.BasePage;
import cityfalcon.pages.locationsPage.SentimentsLocationsPage;
import cityfalcon.pages.watchLists.CreateWatchListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePage extends BasePage {

//    private final WebElement homePage =  driver.findElement(By.xpath("//div[contains(@class,'__home-page__')]"));




    private  WebElement greetingsSection = driver.findElement(By.xpath("//div[@data-component='GreetingSection']"));
    private final WebElement learnMore = driver.findElement(By.xpath("//div/div/a[@href='/learn-more']"));
    private  WebElement personaliseBtn = driver.findElement(By.xpath("//div[@data-component='GreetingSection']//div/a[text()='Personalise']"));
    private final WebElement searchBar = driver.findElement(By.xpath("//div[@data-component='GreetingSection']//div/section[@data-component='SearchbarInput']"));
    private final WebElement bitcoinBtn = greetingsSection.findElement(By.xpath("//div/a[@href='/news/directory/cryptocurrencies/bitcoin-btc/news']"));
    private final WebElement appleStockBtn = greetingsSection.findElement(By.xpath("//div/a[@href='/news/directory/stocks/apple-inc-aapl/news']"));
    private final WebElement oilCommodityBtn = greetingsSection.findElement(By.xpath("//div/a[@href='/news/directory/commodities/oil/news']"));
    private final WebElement technologySectorBtn = greetingsSection.findElement(By.xpath("//div/a[@href='/news/directory/dcsc-sectors/level1/technology/news']"));
    private final WebElement locationAmerica = greetingsSection.findElement(By.xpath("//div/a[@href='/news/directory/locations/country/united-states-of-america/news']"));
    private final WebElement trustedByHeaderText = driver.findElement(By.xpath("//div/h2[text()='Trusted By']"));
    private final WebElement trustedByParagraphText = driver.findElement(By.xpath("//div/p[text()='Financial institutions, financial companies, and 300k+ users']"));
    private final WebElement etoroLogo = driver.findElement(By.xpath("//div/img[@alt='etoro']"));
    private final WebElement bnpLogo = driver.findElement(By.xpath("//div/img[@alt='bnp']"));
    private final WebElement iexLogo = driver.findElement(By.xpath("//div/img[@alt='iex']"));
  //  private final WebElement sharesLogo = driver.findElement(By.xpath("//div/img[@alt='shares']"));
    private final WebElement plumLogo = driver.findElement(By.xpath("//div/img[@alt='plum']"));
    private final WebElement stoneXLogo = driver.findElement(By.xpath("//div/img[@alt='stonex']"));
  //  private final WebElement fundRootsLogo = driver.findElement(By.xpath("//div/img[@alt='fundroots']"));
    private final WebElement obrainLogo = driver.findElement(By.xpath("//div/img[@alt='obrain']"));
    private final WebElement seedersLogo = driver.findElement(By.xpath("//div/img[@alt='seedrs']"));


    public HomePage(WebDriver driver) {
        super(driver);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@data-component='GreetingSection']"))));
    }


    /*
    Slider
     */


    private final WebElement firstSlider = driver.findElement(By.xpath("//div/div[@class='main_carousel_slider']"));


    private final WebElement firstSlideLearnMoreBtn = firstSlider.findElement(By.xpath("//div[@data-index='1']//a[text()='Learn More']"));



    /*
       Top news wrapper
     */
    private final WebElement topNewsWrapper = driver.findElement(By.xpath("//div[contains(@class, 'top-news-wrapper')]"));
    private final WebElement topNewsWrapperContainer = topNewsWrapper.findElement(By.xpath("//parent::div[contains(@class, 'top-news-wrapper')]"));

    private final List<WebElement> newsWrapperStories = topNewsWrapper.findElements(By.xpath("//div[contains(@class, 'news-card__')]"));
    private final WebElement toolTip = topNewsWrapper.findElement(By.xpath("//div[@data-component='Tooltip']//div[contains(@class,'tooltip-icon-wrapper')]"));
    private final WebElement seeMore = topNewsWrapper.findElement(By.xpath("//div/a[text()='See More']"));

    /*
    General filters settings
     */
    private final  WebElement generalSettings = driver.findElement(By.xpath("//div[contains(@class,'__home-page__')]//div[contains(@class, '__general-filters-section___')]"));


  private  WebElement simpleLayout = driver.findElement(By.xpath("//div[contains(@class,'__home-page__')]//div[contains(@class,'__general-filters-section___')]//div/input[contains(@aria-label, 'simple')]"));
  private  WebElement advancedLayout = driver.findElement(By.xpath("//div[contains(@class,'__home-page__')]//div[contains(@class,'__general-filters-section___')]//div/input[contains(@aria-label, 'advanced')]"));

  private  WebElement compactView = generalSettings.findElement(By.xpath("//div[contains(@class,'__home-page__')]//div[contains(@class,'__simplified-layout-filters-desktop__')]//div/label[contains(@for, 'compact')]" ));


    private final WebElement generalFiltersContainer = topNewsWrapperContainer.
            findElement(By.xpath("//following::div[contains(@class, 'general-filters-section')]"));

   // private WebElement locationFilter = driver.findElement(By.xpath("//div[contains(@class, 'top-news-wrapper')]//parent::div[contains(@class, 'top-news-wrapper')]//following::div[contains(@class, 'general-filters-section')]//div[contains(@class,'filters-wrapper')]//div[contains(@class,'location-filter')]"));

    private final WebElement title2 = driver.findElement(By.xpath("//div/span[text()='General filters and settings'][1]"));

//    @FindBy(xpath = "//div[text()='General filters and settings']")
//    private WebElement title;







    public LocationSearchOnHomePage clickOnLocationFilters(){
         //WebElement title = topNewsWrapper.findElement(By.xpath("//div[text()='Top Stories Globally']"));
//        driver.navigate().refresh();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='General filters and settings']")));
     //    WebElement title = driver.findElement(By.xpath("//div[text()='General filters and settings']"));
        //div[contains(@class,'__home-page__')]//div[contains(@class,'__general-filters-section___')]
        ////div[contains(@class,'__home-page__')]//div[contains(@class,'__general-filters-section___')]//span[text()='General filters and settings']
        //div[text()='News by Location']

            scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__top-news-stories___')]")));

            WebElement locationFilter = driver.findElement(By.xpath("//div[contains(@class, 'top-news-wrapper')]//parent::div[contains(@class, 'top-news-wrapper')]//following::div[contains(@class, 'general-filters-section')]//div[contains(@class,'filters-wrapper')]//div[contains(@class,'location-filter')]"));

           clickOnWebElement(locationFilter);
            return new LocationSearchOnHomePage(driver);

    }
    public SearchPage clickOnSearch(){
        clickOnWebElement(searchBar);
        ExtentLogger.log("Search is open");
        return new SearchPage(driver);
    }
    public boolean baseAndGuestUserUpgradeNotice(){
        List<WebElement> upgradeToGold = driver.findElements(By.xpath("//div[contains(@class, '__summarisation-premium__')]"));
        return upgradeToGold.get(0).isDisplayed() && upgradeToGold.get(1).isDisplayed();
    }
    public HomePage clickOnGeoFiltersSimpleLayout(){
        clickOnWebElement(simpleLayout);

        return this;
    }
    public HomePage clickOnGeoFiltersAdvancedLayout(){
        clickOnWebElement(advancedLayout);
        List<WebElement> topBtns =driver.findElements(By.xpath("//div[contains(@class, '_news-by-location-section-content_')]//button[text()='Top']"));
        if (topBtns.get(0).isDisplayed() && topBtns.get(1).isDisplayed()){
            System.out.println("The top buttons are visible ");
        }
        return this;
    }
    public HomePage clickOnGeoFiltersCompactView(){
        scrollToView(seeMore);
        clickOnWebElement(compactView);
        WebElement globalTitle = driver.findElement(By.xpath("//div//h5[text()='Global']"));
        scrollToView(globalTitle);
        waitForTime();

        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@data-component='StoryCard']")));
        List<WebElement> elements = driver.findElements(By.xpath("//div[@data-component='StoryCard']"));
        System.out.println(elements.size());

        for (WebElement element : elements){
            System.out.println( "Story card classes : " + element.getAttribute("class"));
        }
        return this;
    }
    public HomePage userClicksOnDifferentOptionsOnTheSlideShow(){
        //div[contains(@class, '__tiles_slider_item_container___')]
        //div[contains(@class, '__carousel_tabs___')]
        //div[contains(@class, '__top-news-wrapper___')]
        scrollToView(driver.findElement(By.xpath("//div[contains(@class, '__tiles_slider_item_container___')]")));
         List<WebElement> carouselTabs = driver.findElements(By.xpath("//div[contains(@class, '__carousel_tabs_item___')]"));
         List<WebElement> carouselTitle = driver.findElements(By.xpath("//div[contains(@class, '__tiles_slider_item_title___')]"));

        Map<String, WebElement> carouselBtnsAndSlideTitle = new HashMap<>();
        for (WebElement e : carouselTabs){
            carouselBtnsAndSlideTitle.put(e.getText(), e);
        }

        carouselBtnsAndSlideTitle.get("Sentiment").click();
      //  clickOnWebElement(carouselBtnsAndSlideTitle.get("Sentiment"));
       // waitForTime();

        String slideTitle = carouselTitle.get(1).getText();
        if (slideTitle.equalsIgnoreCase("Insight into the mood of the market")){
            ExtentLogger.log("The carousel btn tabs are working correctly");
        }else{
            ExtentLogger.fail("The carousel btn sentiment tab is not returning the correct slide this is showing instead of sentiments " + slideTitle  );
        }




        return this;
    }

    public SentimentsLocationsPage clickOnSentimentsMap(){
        waitForTime();
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, '__sentiment_world_chart___')]//div[contains(@class,'plot-container')]")));
        //"//div[contains(@class, '__sentiment_world_chart___')]//div[@class='js-plotly-plot']"
        //div[contains(@class,'plot-container')]\//div[@class='js-plotly-plot']
        scrollToView(driver.findElement(By.xpath("//div[contains(@class, '__sentiment_world_chart___')]")));
      //  clickOnWebElement(driver.findElement(By.xpath("//div[contains(@class, '__sentiment_world_chart___')]//div[@class='js-plotly-plot']")));
        driver.findElement(By.xpath("//div[contains(@class, '__sentiment_world_chart___')]")).click();
        return new SentimentsLocationsPage(driver);
    }

    public TheInvestorRelationsFilters checkTheInvestorRelationsBoxIsVisible(){
        //div[contains(@class,'__company-data-section-cover___')]//a[@href='/directory/investor-relations']
        //div[contains(@class,'__company-data-section-cover___')]//a[@href='/directory/investor-relations']
      //  scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__company-data-section-cover___')]//a[@href='/directory/investor-relations']")));
        scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__company-data-wrapper___')]//div[text()='Investor Relations']//parent::div[contains(@class, '__section-wrapper-header-left___')]//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]//div[text()='Investor Relations']")));
        WebElement investorRelationsTitle = driver.findElement(
                By.xpath("//div[contains(@class,'__company-data-wrapper___')]//div[text()='Investor Relations']"));
        WebElement esgTitle = driver.findElement(By.xpath("//div[contains(@class,'__company-data-wrapper___')]//div[text()='Company ESG Reports']"));
        if (investorRelationsTitle.isDisplayed()&& esgTitle.isDisplayed()){
            ExtentLogger.log("The titles for both ESG and Investor relations are visible");
        }else{
            ExtentLogger.fail("The titles for the ESG and the Investor Relations are not visible");
        }
        waitForTime();
        return new TheInvestorRelationsFilters(driver);
    }
    public ESGContainerFilters checkTheESGCategoriesSearchIsWorking(){
        scrollToView(driver.findElement(By.xpath("//div[contains(@class,'__company-data-wrapper___')]//div[text()='Investor Relations']//parent::div[contains(@class, '__section-wrapper-header-left___')]//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]//div[text()='Investor Relations']")));
        waitForTime();
        return new ESGContainerFilters(driver);
    }
    public GainersAndLosers gainersAndLosersSection(){

        return new GainersAndLosers(driver);
    }
    public CreateWatchListPage clickOnPersonaliseBtn(){

        clickOnWebElement(personaliseBtn);
        waitForTime();

        return new CreateWatchListPage(driver);
    }

    //div[contains(@class,'__company-data-wrapper___')]//div[text()='Investor Relations']//parent::div[contains(@class, '__section-wrapper-header-left___')]//parent::div[contains(@class,'__section-wrapper-header___')]//parent::div[contains(@class,'__section-wrapper-container___')]








    




















}
