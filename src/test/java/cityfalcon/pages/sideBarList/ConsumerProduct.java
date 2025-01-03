package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.productsPages.ProductsMobileAppPage;
import cityfalcon.pages.productsPages.ProductsPage;
import cityfalcon.pages.productsPages.ProductsVoiceAssistantPage;
import cityfalcon.pages.productsPages.ProductsWebAppPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsumerProduct extends BasePage {

        public ConsumerProduct(WebDriver driver) {
            super(driver);
        }

        @FindBy(xpath = "//section[6]//ul/li/a[@href='/products']")
        private WebElement allProducts;

        @FindBy(xpath = "//section[6]//ul/li/a[@href='/products/webapp']" )
        private WebElement cityFalconAiBtn;

        @FindBy(xpath = "//section[6]//ul/li/a[@href='https://www.cityfalcon.ai/products/mobileapp']")
        private WebElement iosAndAndroidApps;
        @FindBy(xpath = "//section[6]//ul/li/a[@href='/products/voiceassistant']")
        private WebElement cityFalconVoiceAssistent;
        @FindBy(xpath = "//section[6]//ul/li//div[text()='CityFALCON Chat Bot']")
        private WebElement cityFalconBotComingSoon;


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
