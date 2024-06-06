package cityfalcon.pages;

import cityfalcon.pages.features.*;
import cityfalcon.pages.filingsPages.CompanyFilingsPage;
import cityfalcon.pages.filingsPages.InsiderTransactionsPage;
import cityfalcon.pages.productsPages.ProductsMobileAppPage;
import cityfalcon.pages.productsPages.ProductsPage;
import cityfalcon.pages.productsPages.ProductsVoiceAssistantPage;
import cityfalcon.pages.productsPages.ProductsWebAppPage;
import cityfalcon.pages.segments.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideMenuGuestUser extends BasePage{

    public SideMenuGuestUser(WebDriver driver) {
        super(driver);
    }

    private final WebElement minimizeBtn = driver.findElement(By.xpath("//div[text()='Minimize']"));
    private final WebElement cityFalconChatBtn = driver.findElement(By.xpath("//div[text()='CityFALCON  Chat']"));
    private final WebElement personaliseContent = driver.findElement(By.xpath("//div[text()='Personalised Content']"));

    private final WebElement allContent = driver.findElement(By.xpath("//aside/article/section[3]"));
    private final WebElement searchBtn = driver.findElement(By.xpath("//section[4]/a[@href='/search']"));
    private final WebElement preferencesBtn = driver.findElement(By.xpath("//section[5]/a[@data-component='Item']"));
    private final WebElement productInfo = driver.findElement(By.xpath("//section[6]/a[@href='/']"));



       public  class PersonalisedContent extends BasePage {
        public PersonalisedContent(WebDriver driver){
            super(driver);
        }

        private final  WebElement personalisedContentWatchList = driver.findElement(By.xpath("//ul/li/a[@href='/watchlists']"));
        private final WebElement bookmarksPersonalisedContent = driver.findElement(By.xpath("//ul/li/a[@href='/bookmarks']"));

        public GuestUserWatchListPage  clickOnPersonlisedContentWatchListReturnGuestUserWatchListPage(){

          //  WebElement personalisedContentWatchList = driver.findElement(By.xpath("//ul/li/a[@href='/watchlists']"));
            clickOnWebElement(personalisedContentWatchList);
            return new GuestUserWatchListPage(driver);
        }
        public RegisterFrameGuestUser clickOnBookMarks(){
            clickOnWebElement(bookmarksPersonalisedContent);
            return new  RegisterFrameGuestUser(driver);
        }

    }
    public final class AllContent extends BasePage{
        public AllContent(WebDriver driver) {
            super(driver);
        }
     //   private WebElement personalisedContentWatchList = driver.findElement(By.xpath("//ul/li/a[@href='/watchlists']"));
        private final  WebElement topicsDirectory = driver.findElement(By.xpath("//ul/li/a[@href='/news/directory']"));
        private final WebElement newsAndResearch = driver.findElement(By.xpath("//ul/li/a[@href='/news']"));
        private final WebElement premiumPublications = driver.findElement(By.xpath("//ul/li/a[@href='/news/directory/premium-publications']"));
        private final WebElement topicsAndAssetsClasses = driver.findElement(By.xpath("//ul/li/a[@href='/news/directory/topic-class']"));
        private final WebElement sectors = driver.findElement(By.xpath("//ul/li/a[@href='/news/directory/dcsc-sectors']"));
        private final WebElement locations = driver.findElement(By.xpath("//ul/li/a[@href='/news/directory/locations']"));
        private final WebElement sentiment = driver.findElement(By.xpath("//ul/li/a[@href='/news/directory/locations']"));
        private final WebElement companyFilings = driver.findElement(By.xpath("//ul/li/a[@href='/directory/filings']"));
        private final WebElement investorRelations = driver.findElement(By.xpath("//ul/li/a[@href='/directory/investor-relations']"));
        private final WebElement insiderTransactions =   driver.findElement(By.xpath("//ul/li/a[@href='/directory/insider-transactions']"));
        private final  WebElement esg = driver.findElement(By.xpath("//ul/li/a[@href='/directory/esg']"));
        private final WebElement alternativeData = driver.findElement(By.xpath("//ul/li/a[@href='/directory/alternative-data']"));
        private final WebElement privateCompaniesIn = driver.findElement(By.xpath("//ul/li/a[@href='/directory/companies-insights/uk']"));
        public TopicsDirectoryPage clickOnTopicsDirectory(){
            clickOnWebElement(topicsDirectory);
            return new TopicsDirectoryPage(driver);
        }
        public NewsAndResearchPage clickOnNews(){

            clickOnWebElement(newsAndResearch);
            return new NewsAndResearchPage(driver);
        }
        public PremiumPublicationsPage clickOnPremiumPublications(){

            clickOnWebElement(premiumPublications);
            return new PremiumPublicationsPage(driver);
        }
        public TopicsAndAssetClasses clickOnTopicsAndAssetsClasses(){
            clickOnWebElement(topicsAndAssetsClasses);
            return new TopicsAndAssetClasses(driver);
        }
        public SectorsPage clickOnSectors(){
            clickOnWebElement(sectors);
            return new SectorsPage(driver);
        }
        public LocationsPage clickOnLocationsBtn(){
            clickOnWebElement(locations);
            return new LocationsPage(driver);
        }
        public SentimentAnalysis sentimentAnalysis(){
            clickOnWebElement(sentiment);
            return new SentimentAnalysis(driver);
        }
        public CompanyFilingsPage companyFilings(){
            clickOnWebElement(companyFilings);
            return new CompanyFilingsPage(driver);
        }
        public InvestorRelationsPage clickOnInvestorRelations(){
            clickOnWebElement(investorRelations);
            return new InvestorRelationsPage(driver);
        }
        public InsiderTransactionsPage clickOnInsiderTransactions(){
            clickOnWebElement(insiderTransactions);
            return new InsiderTransactionsPage(driver);
        }

        public EsgPage clickOnEsgBtn(){

            clickOnWebElement(esg);
            return new EsgPage(driver);
        }
        public AlternativeDataPage clickOnAlternativeData(){
            clickOnWebElement(alternativeData);
            return new AlternativeDataPage(driver);
        }
        public PrivateCompaniesInsights companiesInsights(){
            clickOnWebElement(privateCompaniesIn);
            return new PrivateCompaniesInsights(driver);
        }
    }

    public final class Preferences extends BasePage{

        public Preferences(WebDriver driver) {
            super(driver);
        }
        private final   WebElement accountPreferences = driver.findElement(By.xpath("//section[5]/ul/li/a[@href='/preferences/account']"));
        private final  WebElement subscription = driver.findElement(By.xpath("//section[5]/ul/li/a[@href='/preferences/subscription']"));
        private final WebElement  notifications = driver.findElement(By.xpath("//section[5]/ul/li/a[@href='/preferences/notifications']"));
        private final WebElement manageWatchLists = driver.findElement(By.xpath("//section[5]/ul/li/a[@href='/watchlists/manage']"));
        public RegisterFrameGuestUser clickOnAccountInfoGuestUser(){
            clickOnWebElement(accountPreferences);
            return new RegisterFrameGuestUser(driver);
        }
        public RegisterFrameGuestUser clickOnSideBarSubscriptionAsGuestUser(){
            clickOnWebElement(subscription);
            return new RegisterFrameGuestUser(driver);
        }
        public RegisterFrameGuestUser clickOnSideBarNotificationsAsGuestUser(){

            clickOnWebElement(notifications);
            return new RegisterFrameGuestUser(driver);
        }
        public ManageWatchListAsGuestUserPage clickOnSideBarManageWatchListsGuestUSer(){
        clickOnWebElement(manageWatchLists);
        return new ManageWatchListAsGuestUserPage(driver);
    }



    }
    public  class ProductInfo extends BasePage{
        public ProductInfo(WebDriver driver) {
            super(driver);
        }

        private final WebElement consumerProduct = driver.findElement(By.xpath("//section[6]/ul/li//div[text() = 'Consumer Products']"));
        private final WebElement consumerAudiences =  driver.findElement(By.xpath("//section[6]/ul/li//div[text() = 'Consumer Audiences']"));
        private final WebElement enterpriseSolutions = driver.findElement(By.xpath("//section[6]/ul/li//div[text() = 'Enterprise Solutions']"));
        private final WebElement enterpriseAudience = driver.findElement(By.xpath("//section[6]/ul/li//div[text() = 'Enterprise Audiences']"));
        private final WebElement allFeaturesContent = driver.findElement(By.xpath("//section[6]/ul/li//div[text() = 'All Features and Content']"));
        private final WebElement features = driver.findElement(By.xpath("//section[6]/ul/li//div[text() = 'Features']"));
        private final WebElement content = driver.findElement(By.xpath("//section[6]/ul/li//div[text() = 'Content']"));

        public ConsumerProduct clickOnConsumerProduct(){
            clickOnWebElement(consumerProduct);
            return new ConsumerProduct(driver);

        }
        public AllFeaturesPage clickOnAllFeaturesPage(){
            clickOnWebElement(allFeaturesContent);
            return new AllFeaturesPage(driver);
        }
        public final class ConsumerProduct extends BasePage{
            public ConsumerProduct(WebDriver driver) {
                super(driver);
            }

            private final WebElement allProducts = driver.findElement(By.xpath("//section[6]//ul/li/a[@href='/products']"));
            private final WebElement cityFalconAiBtn = driver.findElement(By.xpath("//section[6]//ul/li/a[@href='/products/webapp']"));
            private final WebElement iosAndAndroidApps = driver.findElement(By.xpath("//section[6]//ul/li/a[@href='https://www.cityfalcon.ai/products/mobileapp']"));
            private final WebElement cityFalconVoiceAssistent = driver.findElement(By.xpath("//section[6]//ul/li/a[@href='/products/voiceassistant']"));
            private final WebElement cityFalconBotComingSoon = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='CityFALCON Chat Bot']"));
            public ProductsPage clickOnAllProductsBtn(){
                clickOnWebElement(allProducts);
                return new ProductsPage(driver);
            }
            public ProductsWebAppPage clickOnCityFalconAiBtn(){
                clickOnWebElement(cityFalconAiBtn);
                return new ProductsWebAppPage(driver);
            }
            public ProductsMobileAppPage clickOnIosAndAndroidApps(){
                clickOnWebElement(iosAndAndroidApps);
                return new ProductsMobileAppPage(driver);
            }
            public ProductsVoiceAssistantPage clickOncityFalconVoiceAssistentBtn(){
                clickOnWebElement(cityFalconVoiceAssistent);
                return new ProductsVoiceAssistantPage(driver);
            }
            public void cityFalconBotComingSoon(){
                cityFalconBotComingSoon.isDisplayed();
            }

        }
        public  class ConsumerAudiences extends BasePage{

            public ConsumerAudiences(WebDriver driver) {
                super(driver);
            }
            private final WebElement retailInvestorBtn = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='Retail Investors']"));
            private final WebElement retailTraders = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='Retail Traders']"));
            private final WebElement dailyBusinessNewsReader = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='Daily Business News Reader']"));


            public RetailInvestorsPage clickOnRetailInvestorBtn(){
                clickOnWebElement(retailInvestorBtn);
                return new RetailInvestorsPage(driver);
            }

            public RetailTraders clickOnRetailTrader(){
                clickOnWebElement(retailTraders);
                return new RetailTraders(driver);
            }
            public DailyNewsReader clickOnDailyNewsReader(){
                clickOnWebElement(dailyBusinessNewsReader);
                return new DailyNewsReader(driver);
            }
        }
        public  class EnterpriseSolutions extends BasePage{

            public EnterpriseSolutions(WebDriver driver) {
                super(driver);
            }
            private final WebElement allSolutions = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='All Solutions']"));
            private final WebElement financialNewsAPi = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='Financial News API']"));
            private final WebElement financialEventsAndEntities =
                    driver.findElement(By.xpath("//section[6]//ul/li//div[text()='Financial Entity and Events Extraction with NLP']"));
            private final WebElement extractAndStructureInsights =
                    driver.findElement(By.xpath("//section[6]//ul/li//div[text()='Extract and Structure Insights from Your Own Content']"));

            public EnterpriseProductsPage clickOnAllSolutions(){
                clickOnWebElement(allSolutions);
                return new EnterpriseProductsPage(driver);
            }
            public FinancialNewsAndResearchApiPage clickOnFinancialNewsAPI(){
                clickOnWebElement(financialNewsAPi);
                return new FinancialNewsAndResearchApiPage(driver);
            }
            public FinancialEntitiesAndEventsExtractionPage clickOnFinancialEventsAndEntities(){
                clickOnWebElement(financialEventsAndEntities);
                return new FinancialEntitiesAndEventsExtractionPage(driver);
            }


        }
        public  class EnterpriseAudiences extends BasePage{

            public EnterpriseAudiences(WebDriver driver) {
                super(driver);
            }
            private final WebElement brokers = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/brokers']"));
            private final WebElement academia = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/academia']"));
            private final WebElement wealthManagers = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/wealth-managers-advisors']"));

            private final WebElement p2pCrowdFunding = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/private-equity']"));
            private final WebElement institutionalInvestors = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/institutional']"));

            private final WebElement consultancyAndLegalAccounting = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/consultancy-legal-accounting']"));
            private final WebElement centralBanksRegulatory = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/central-banks-regulatory']"));


            public SegmentsBrokersPage clickOnBrokersBtn(){
                clickOnWebElement(brokers);
                return new SegmentsBrokersPage(driver);
            }
            public SegmentsAcademia clickOnStudentsAndProfessors(){
                clickOnWebElement(academia);
                return new SegmentsAcademia(driver);
            }
            public SegmentsWealthManagement clickOnWealthManagementBtn(){
                clickOnWebElement(wealthManagers);
                return new SegmentsWealthManagement(driver);
            }
            public SegmentsPrivateEquity clickOnPrivateEquity(){
                clickOnWebElement(p2pCrowdFunding);
                return new SegmentsPrivateEquity(driver);
            }
            public SegmentsInstitutionalInvestors clickOnInstitutionalInvestors(){
                clickOnWebElement(institutionalInvestors);
                return new SegmentsInstitutionalInvestors(driver);
            }
            public SegmentsConsultencyAndLegalAccounting clickOnConsultancyAndLegalAccounting(){
                clickOnWebElement(consultancyAndLegalAccounting);
                return new SegmentsConsultencyAndLegalAccounting(driver);
            }
            public SegmentsCentralBanksPage clickOnCentralBanksRegulatory(){
                clickOnWebElement(centralBanksRegulatory);
                return new SegmentsCentralBanksPage(driver);
            }
        }
        public final class Features{
            private final WebElement cityFalconScore = driver.findElement(By.xpath("//section[6]//ul/li//div[text()='CityFALCON Score']"));
            private final WebElement watchLists = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/watchlists']"));
            private final WebElement similarity = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/similarity']"));

            private final WebElement newsAndCharts = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/news-on-charts']"));
            private final WebElement keyHeadLine = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/summarisation']"));
            private final WebElement sentiment = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/sentiment']"));
            private final WebElement contentTranslation = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/features/translation']"));

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


    }

//    public String clickOnWatchlists(){
//
//        clickOnWebElement(personalisedContentWatchList);
//        return driver.getCurrentUrl();
//    }


//    public SideMenuGuestUser clickOnPersonalisedContent(){
//        clickOnWebElement(personaliseContent);
//        return this;
//    }

//    public RegisterFrameGuestUser clickOnBookMarksAndReturnBookMarksPage(){
//        clickOnWebElement(personaliseContent);
//        WebElement bookmarksPersonalisedContent = driver.findElement(By.xpath("//ul/li/a[@href='/bookmarks']"));
//        clickOnWebElement(bookmarksPersonalisedContent);
//        return new  RegisterFrameGuestUser(driver);
//    }
    public AllContent clickOnAllContent(){
        clickOnWebElement(allContent);
        return new AllContent(driver);
    }
    public SearchPage clickSideBarSearchBtn(){

        clickOnWebElement(searchBtn);
        return new SearchPage(driver);
    }
    public Preferences clickOnPreferences(){
        clickOnWebElement(preferencesBtn);
        return this.new Preferences(driver);
    }





//    public String clickOnSubscriptionPlans(){
//        WebElement subscriptionBtn = driver.findElement(By.xpath("//ul/li/a[@href='/pricing']"));
//        clickOnWebElement(subscriptionBtn);
//        return driver.getCurrentUrl();
//    }
//    public String clickOnRealTimeApiPlans(){
//        WebElement realTimeApiBtn = driver.findElement(By.xpath("//ul/li/a[@href='/products/api/financial-news/pricing-api/commercial']"));
//        clickOnWebElement(realTimeApiBtn);
//        return driver.getCurrentUrl();
//    }
//    public String clickOnHistoricalDataBtn(){
//        WebElement historicalDataBtn = driver.findElement(By.xpath("//ul/li/a[@href='/products/api/financial-news/pricing-historical']"));
//        clickOnWebElement(historicalDataBtn);
//        return driver.getCurrentUrl();
//    }
//    public String clickOnMoreBtn(){
//        WebElement moreBtn = driver.findElement(By.xpath("//section[8]/a[@href='/']"));
//        clickOnWebElement(moreBtn);
//        return driver.getCurrentUrl();
//    }
//    public String clickOnMeetups(){
//        WebElement meetUps = driver.findElement(By.xpath("//section[8]//ul/li/a[@href='/meetup']"));
//        clickOnWebElement(meetUps);
//        return driver.getCurrentUrl();
//    }
//    public String clickOnBlogPage(){
//        WebElement blogPageBtn = driver.findElement(By.xpath("//section[8]//ul/li/a[@href='https://www.cityfalcon.ai/blog']"));
//        clickOnWebElement(blogPageBtn);
//        return driver.getCurrentUrl();
//    }
//    public String helpCenter(){
//        WebElement hc = driver.findElement(By.xpath("//section[8]//ul/li/a[@href=\"https://help.cityfalcon.com/hc/en-us\"]"));
//        clickOnWebElement(hc);
//        return  driver.getCurrentUrl();
//    }
//    public String clickOnVideoTutorial(){
//        WebElement videoTutorial = driver.findElement(By.xpath("//section[8]//ul/li/a[@href='/help-videos']"));
//        clickOnWebElement(videoTutorial);
//        return driver.getCurrentUrl();
//    }
//
//    public String clickOnInvestmentInterest(){
//        WebElement investmentInterestBtn = driver.findElement(By.xpath("//section[8]//ul/li/a[@href='/invest']"));
//        clickOnWebElement(investmentInterestBtn);
//        return driver.getCurrentUrl();
//    }

    public  PersonalisedContent clickOnPersonalised(){
        clickOnWebElement(personaliseContent);
        return  this.new PersonalisedContent(driver);
    }

    public ProductInfo clickOnProductInfo(){
        clickOnWebElement(productInfo);
        return new ProductInfo(driver);
    }







}
