package cityfalcon.pages.homePage;

import cityfalcon.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AiPromoBox extends BasePage {

    private WebElement closeAiPromoBoxCloseBtn = driver.findElement(By.xpath("//div[contains(@class,'promobar ')]//div[contains(@class,'__banner___')]//div[contains(@class,'__banner__header___')]/*[local-name()='svg']"));
    public AiPromoBox(WebDriver driver) {
        super(driver);
    }
    public void clickOnCloseAiPromoBox(){
        closeAiPromoBoxCloseBtn.click();
    }

}
