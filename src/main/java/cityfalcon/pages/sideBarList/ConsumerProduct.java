package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.productsPages.ProductsMobileAppPage;
import cityfalcon.pages.productsPages.ProductsPage;
import cityfalcon.pages.productsPages.ProductsVoiceAssistantPage;
import cityfalcon.pages.productsPages.ProductsWebAppPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConsumerProduct extends BasePage {

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
