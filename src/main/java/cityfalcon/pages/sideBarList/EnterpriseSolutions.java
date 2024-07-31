package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.EnterpriseProductsPage;
import cityfalcon.pages.FinancialEntitiesAndEventsExtractionPage;
import cityfalcon.pages.FinancialNewsAndResearchApiPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterpriseSolutions extends BasePage {


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
