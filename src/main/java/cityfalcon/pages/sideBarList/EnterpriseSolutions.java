package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.enterpriseProductsPages.EnterpriseProductsPage;
import cityfalcon.pages.financialEntitiesAndEvents.FinancialEntitiesAndEventsExtractionPage;
import cityfalcon.pages.FinancialNewsAndResearchApiPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterpriseSolutions extends BasePage {

        @FindBy( xpath = "//section[6]//ul/li//div[text()='All Solutions']")
        private WebElement allSolutions;
        @FindBy(xpath = "//section[6]//ul/li//div[text()='Financial News API']")
        private WebElement financialNewsAPi;
        @FindBy(xpath = "//section[6]//ul/li//div[text()='Financial Entity and Events Extraction with NLP']")
        private WebElement financialEventsAndEntities;
        @FindBy(xpath = "//section[6]//ul/li//div[text()='Extract and Structure Insights from Your Own Content']")
        private WebElement extractAndStructureInsights;


        public EnterpriseSolutions(WebDriver driver) {
            super(driver);
        }


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
