package cityfalcon.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;



    public BasePage(WebDriver driver){
        this.driver = driver;
//       pageLoaded = new WebDriverWait(driver, Duration.ofSeconds(60)).until(
//                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));


        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
        PageFactory.initElements(factory,this);
        PageFactory.initElements(factory,this);



      //  actions = new Actions(driver);

         wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    }
    protected void waitForElementToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    protected void clickOnWebElement(WebElement element){
        waitForElementToBeVisible(element);

        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    protected void typeOnWebElement(WebElement element, String text){
        waitForElementToBeVisible(element);
        element.click();
        element.sendKeys(text);
    }
    protected void scrollToView(WebElement element)  {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
//        Actions actions1 = new Actions(driver);
//        actions1.scrollToElement(element).perform();
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            e.getMessage();
        }

//        Actions actions = new Actions(driver);
//        actions.scrollToElement(element).perform();

    }
    protected void waitForTime(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.getMessage();
        }
    }


    protected void scrollDownToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.keyDown(element,Keys.DOWN);
    }
    protected void scrollUpToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.keyUp(element, Keys.UP);

    }
    protected void scrollActions(WebElement element, int amount){
        Actions actions = new Actions(driver);

        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(element),0, amount);
        actions.perform();
    }
    protected void hoverOver(WebElement element,int width, int height){
        Actions actions = new Actions(driver);


    }



}
