package cityfalcon.pages.sideBarList;

import cityfalcon.pages.*;
import cityfalcon.pages.AlternativeDataPages.AlternativeDataPage;
import cityfalcon.pages.investorRelationsPages.InvestorRelationsPage;
import cityfalcon.pages.sectorsPages.SectorsPage;
import cityfalcon.pages.topicsAndDirectoryPages.TopicsDirectoryPage;
import cityfalcon.pages.esgPages.EsgPage;
import cityfalcon.pages.filingsPages.CompanyFilingsPage;
import cityfalcon.pages.filingsPages.InsiderTransactionsPage;
import cityfalcon.pages.locationsPages.LocationsPage;
import cityfalcon.pages.segments.SentimentAnalysis;
import cityfalcon.pages.topicsAndAssetClassesPages.TopicsAndAssetsClassesMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllContent extends BasePage {

      @FindBy(xpath = "//ul/li/a[@href='/news/directory']")
      private WebElement topicsDirectory;
      @FindBy(xpath = "//ul/li/a[@href='/news']")
      private WebElement newsAndResearch;
      @FindBy(xpath = "//ul/li/a[@href='/news/directory/premium-publications']")
      private WebElement premiumPublications;

      @FindBy(xpath = "//ul/li/a[@href='/news/directory/topic-class']")
      private  WebElement topicsAndAssetsClasses;
      @FindBy(xpath = "//ul/li/a[@href='/news/directory/dcsc-sectors']")
      private WebElement sectors;
      @FindBy(xpath = "//ul/li/a[@href='/news/directory/locations']")
      private WebElement locations;
      @FindBy(xpath = "//ul/li/a[@href='/news/directory/locations']")
      private WebElement sentiment;
      @FindBy(xpath = "//ul/li/a[@href='/directory/filings']")
      private WebElement companyFilings;
      @FindBy(xpath = "//ul/li/a[@href='/directory/investor-relations']")
      private WebElement investorRelations;
      @FindBy(xpath = "//ul/li/a[@href='/directory/insider-transactions']")
      private WebElement insiderTransactions;
      @FindBy(xpath = "//ul/li/a[@href='/directory/esg']")
      private WebElement esg;
      @FindBy(xpath = "//ul/li/a[@href='/directory/alternative-data']")
      private WebElement alternativeData;
      @FindBy(xpath = "//ul/li/a[@href='/directory/companies-insights/uk']")
      private WebElement privateCompaniesIn;





    public AllContent(WebDriver driver) {
            super(driver);
        }





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
