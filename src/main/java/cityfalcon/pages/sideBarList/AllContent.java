package cityfalcon.pages.sideBarList;

import cityfalcon.pages.*;
import cityfalcon.pages.filingsPages.CompanyFilingsPage;
import cityfalcon.pages.filingsPages.InsiderTransactionsPage;
import cityfalcon.pages.segments.SentimentAnalysis;
import cityfalcon.pages.topicsAndAssetClassesPages.TopicsAndAssetsClassesMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllContent extends BasePage {
        public AllContent(WebDriver driver) {
            super(driver);
        }
        //   private WebElement personalisedContentWatchList = driver.findElement(By.xpath("//ul/li/a[@href='/watchlists']"));
        private final WebElement topicsDirectory = driver.findElement(By.xpath("//ul/li/a[@href='/news/directory']"));
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
        public TopicsAndAssetsClassesMainPage clickOnTopicsAndAssetsClasses(){
            clickOnWebElement(topicsAndAssetsClasses);
            return new TopicsAndAssetsClassesMainPage(driver);
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
