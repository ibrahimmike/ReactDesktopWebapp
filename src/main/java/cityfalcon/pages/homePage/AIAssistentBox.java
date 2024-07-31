package cityfalcon.pages.homePage;

import cityfalcon.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AIAssistentBox extends BasePage {
    public AIAssistentBox(WebDriver driver) {
        super(driver);
    }

    private final WebElement aiAssistantBox = driver.findElement(By.
            xpath("//div/div[@class='widget__wrapper cookies home-page']"));

    private final WebElement closeBox = aiAssistantBox.findElement(By.xpath("//svg[@class='styles-module__banner__times-icon___tYRmB']"));





}
