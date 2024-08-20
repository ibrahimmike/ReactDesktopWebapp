package cityfalcon.pages.homePage;

import cityfalcon.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AiPromoBox extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'promobar ')]//div[contains(@class,'__banner___')]//div[contains(@class,'__banner__header___')]/*[local-name()='svg']")
    private WebElement closeAiPromoBoxCloseBtn;

    //private WebElement closeAiPromoBoxCloseBtn = driver.findElement(By.xpath(""));
    public AiPromoBox(WebDriver driver) {
        super(driver);
    }
    public void clickOnCloseAiPromoBox(){
        closeAiPromoBoxCloseBtn.click();
    }

}
