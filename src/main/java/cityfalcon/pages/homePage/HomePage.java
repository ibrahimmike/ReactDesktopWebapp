package cityfalcon.pages.homePage;

import cityfalcon.extentLoger.ExtentLogger;
import cityfalcon.pages.BasePage;
import cityfalcon.pages.locationsPage.SentimentsLocationsPage;
import cityfalcon.pages.watchLists.CreateWatchListPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePage extends BasePage {

//    private final WebElement homePage =  driver.findElement(By.xpath("//div[contains(@class,'__home-page__')]"));


    @FindBy(xpath = "//div[@data-component='GreetingSection']")
    private  WebElement greetingsSection;

    @FindBy(xpath = "//div/div/a[@href='/learn-more']")
    private WebElement learnMore;

    @FindBy(xpath = "//div[@data-component='GreetingSection']//div/a[text()='Personalise']")
    private WebElement personaliseBtn;
    @FindBy(xpath = "//div[@data-component='GreetingSection']//div/section[@data-component='SearchbarInput']")
    private WebElement searchBar;
    @FindBy(xpath = "//div/a[@href='/news/directory/cryptocurrencies/bitcoin-btc/news']")
    private WebElement greetingsSectionBitcoinBtn;
    @FindBy(xpath = "//div/a[@href='/news/directory/stocks/apple-inc-aapl/news']")
    private WebElement greetingsSectionAppleStockBtn;
    @FindBy(xpath = "//div/a[@href='/news/directory/commodities/oil/news']")
    private WebElement greetingsSectionOilBtn;
    @FindBy(xpath = "//div/a[@href='/news/directory/dcsc-sectors/level1/technology/news']" )
    private WebElement greetingsTechnologySectionBtn;
    @FindBy(xpath = "//div/a[@href='/news/directory/locations/country/united-states-of-america/news']")
    private WebElement locationsAmerica;




    //trusted section
    @FindBy(xpath = "//div/h2[text()='Trusted By']" )
    private WebElement trustedByTitleSection;

    @FindBy(xpath = "//div/p[text()='Financial institutions, financial companies, and 300k+ users']")
    private WebElement trustedByParagraphText;


    //logos
    @FindBy(xpath = "//div/img[@alt='etoro']")
    private WebElement etoroLogo;
    @FindBy(xpath = "//div/img[@alt='bnp']")
    private WebElement bnpLogo;
    @FindBy(xpath = "//div/img[@alt='iex']")
    private WebElement iexLogo;
    @FindBy(xpath = "//div/img[@alt='plum']")
    private WebElement plumLogo;
    @FindBy( xpath = "//div/img[@alt='stonex']")
    private WebElement stoneXLogo;
    @FindBy(xpath = "//div/img[@alt='obrain']")
    private WebElement obrainLogo;
    @FindBy(xpath = "//div/img[@alt='seedrs']")
    private WebElement seedersLogo;
    @FindBy(xpath ="//div/div[@class='main_carousel_slider']")
    private WebElement firstSlider;

    @FindBy (xpath = "//div[@data-index='1']//a[text()='Learn More']")
    private WebElement firstSliderMoreBtn;

    //slider section

    @FindBy(xpath = "//div[contains(@class, '__tiles_slider___')]")
    private WebElement slider;
    @FindBy(xpath = "//div[contains(@class, '__carousel_tabs_item___')]")
    private List<WebElement> carouselTabs;
    @FindBy(xpath = "//div[contains(@class, '__tiles_slider_item_title___')]")
    private List<WebElement> carouselTitles;
    @FindBy(xpath = "//div[@class='main_carousel_slider']//div[@class='slick-list']")
    private WebElement mainSliderSection;


    // Top news Wrapper


    @FindBy(xpath = "//div[contains(@class, 'top-news-wrapper')]")
    private WebElement topNewsWrapper;

    @FindBy(xpath  = "//div[contains(@class, 'top-news-wrapper')]//div[contains(@class, 'news-card__')]")
    private List<WebElement> topNewsStories;
    @FindBy(xpath = "//div[@data-component='Tooltip']//div[contains(@class,'tooltip-icon-wrapper')]")
    private WebElement topNewsWrapperTooltip;

    @FindBy(xpath = "//div[contains(@class, 'top-news-wrapper')]//parent::div[contains(@class, 'top-news-wrapper')]//div/a[text()='See More']")
    private WebElement topNewsSeeMoreBtn;

    //General Filers section
    @FindBy(xpath ="//div[contains(@class,'__home-page__')]//div[contains(@class, '__general-filters-section___')]")
    private WebElement generalFiltersSection;

    @FindBy(xpath = "//div[contains(@class,'__home-page__')]//div[contains(@class,'__general-filters-section___')]//div/input[contains(@aria-label, 'simple')]")
    private WebElement simpleLayoutBtn;
    @FindBy(xpath = "//div[contains(@class,'__home-page__')]//div[contains(@class,'__general-filters-section___')]//div/input[contains(@aria-label, 'advanced')]")
    private WebElement advancedLayout;
    @FindBy(xpath = "//div[contains(@class,'__home-page__')]//div[contains(@class,'__simplified-layout-filters-desktop__')]//div/label[contains(@for, 'compact')]")
    private WebElement compactView;
    @FindBy(xpath = " //div[contains(@class,'__top-news-stories___')]")
    private WebElement topNewsContainer;
    @FindBy(xpath = "//div[contains(@class, 'top-news-wrapper')]//parent::div[contains(@class, 'top-news-wrapper')]//following::div[contains(@class, 'general-filters-section')]//div[contains(@class,'filters-wrapper')]//div[contains(@class,'location-filter')]")
    private WebElement locationFilter;




    public HomePage(WebDriver driver) {
        super(driver);
        //driver.findElement(By.xpath("//div[@data-component='GreetingSection']")));
        wait.until(ExpectedConditions.visibilityOf(greetingsSection));
    }
    public LocationSearchOnHomePage clickOnLocationFilters(){

            scrollToView(topNewsContainer);

           clickOnWebElement(locationFilter);
            return new LocationSearchOnHomePage(driver);

    }
    public SearchPage clickOnSearch(){
        clickOnWebElement(searchBar);
       // ExtentLogger.log("Search is open");
        return new SearchPage(driver);
    }
    public boolean baseAndGuestUserUpgradeNotice(){
        List<WebElement> upgradeToGold = driver.findElements(By.xpath("//div[contains(@class, '__summarisation-premium__')]"));
        return upgradeToGold.get(0).isDisplayed() && upgradeToGold.get(1).isDisplayed();
    }
    public HomePage clickOnGeoFiltersSimpleLayout(){
        clickOnWebElement(simpleLayoutBtn);

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
        scrollToView(topNewsSeeMoreBtn);
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

        scrollToView(mainSliderSection);


        Map<String, WebElement> carouselBtnsAndSlideTitle = new HashMap<>();
        for (WebElement e : carouselTabs){
            carouselBtnsAndSlideTitle.put(e.getText(), e);
        }
        carouselBtnsAndSlideTitle.get("Sentiment").click();

        String slideTitle = carouselTitles.get(1).getText();
        if (slideTitle.equalsIgnoreCase("Insight into the mood of the market")){
          //  ExtentLogger.log("The carousel btn tabs are working correctly");
        }else{
           // ExtentLogger.fail("The carousel btn sentiment tab is not returning the correct slide this is showing instead of sentiments " + slideTitle  );

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









    




















}
