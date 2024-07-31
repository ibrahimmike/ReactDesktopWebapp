package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.features.AllFeaturesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductInfo extends BasePage {

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
}
