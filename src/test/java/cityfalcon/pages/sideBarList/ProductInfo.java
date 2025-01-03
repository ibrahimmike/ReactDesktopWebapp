package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.features.AllFeaturesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductInfo extends BasePage {

        @FindBy(xpath = "//section[6]/ul/li//div[text() = 'Consumer Products']" )
        private  WebElement consumerProduct;
        @FindBy(xpath = "//section[6]/ul/li//div[text() = 'Consumer Audiences']")
        private WebElement consumerAudiences;
        @FindBy(xpath = "//section[6]/ul/li//div[text() = 'Enterprise Solutions']")
        private WebElement enterpriseSolutions;
        @FindBy(xpath = "//section[6]/ul/li//div[text() = 'Enterprise Audiences']")
        private WebElement enterpriseAudience;
        @FindBy(xpath = "//section[6]/ul/li//div[text() = 'All Features and Content']")
        private WebElement  allFeaturesContent;
        @FindBy(xpath = "//section[6]/ul/li//div[text() = 'Features']")
        private WebElement features;
        @FindBy(xpath = "//section[6]/ul/li//div[text() = 'Content']")
        private WebElement content;


    public ProductInfo(WebDriver driver) {
            super(driver);
        }






        public ConsumerProduct clickOnConsumerProduct(){
            clickOnWebElement(consumerProduct);
            return new ConsumerProduct(driver);

        }
        public AllFeaturesPage clickOnAllFeaturesPage(){
            clickOnWebElement(allFeaturesContent);
            return new AllFeaturesPage(driver);
        }
}
