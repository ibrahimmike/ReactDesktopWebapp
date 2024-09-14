package cityfalcon.pages.homePage;

import cityfalcon.extentLoger.ExtentLogger;
import cityfalcon.extentLoger.ExtentReport;
import cityfalcon.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GainersAndLosers extends BasePage {

//    private List<WebElement> filtersBtns = driver.findElements(By.xpath("//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]" +
//            "//ancestor::div[contains(@class,'__section-wrapper-container___')]//div[@class='menu-wrapper']//button"));
    @FindBy(xpath = "//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]")
    WebElement gainersAndLosersTitle;
    @FindBy(xpath = "//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]//ancestor::div[contains(@class,'__section-wrapper-header___')]//ul//li")
    List<WebElement> periodsList;
    @FindBy(xpath="//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]//ancestor::div[contains(@class,'__section-wrapper-container___')]//div[@class='menu-wrapper']//button")
    private List<WebElement> gainersAndLosersFiltersBtn;
    @FindBy(xpath = "//div[contains(@class,'__section-wrapper-header-title___')and(text()='GAINERS AND LOSERS')]//ancestor::div[contains(@class,'__section-wrapper-header___')]")
    private WebElement scrollingToElement;
    @FindBy(xpath = "//div[text()='Gainers']")
    private WebElement gainersSectionTitle;
    @FindBy(xpath = "//div[contains(@class, 'module__name___')]//a")
    private List<WebElement> gainersAndLosersAssetList;
    //[text()='Bitcoin']


    public GainersAndLosers(WebDriver driver) {
        super(driver);
        scrollToView(gainersAndLosersTitle);
    }

    public GainersAndLosers titlesAreVisible(){

        AiPromoBox promoBox = new AiPromoBox(driver);
        promoBox.clickOnCloseAiPromoBox();

        if(gainersAndLosersTitle.isDisplayed()){
            ExtentLogger.pass("The title is visible for the gainers and losers section");
        }else {
            ExtentLogger.fail("The title IS NOT visible for the gainers and losers section");
        }

     //   List<WebElement> periodsList = driver.findElements(By.xpath());

        if(periodsList.get(1).isDisplayed()){
            ExtentLogger.pass("The periods list is visible");
        }else{
            ExtentLogger.fail("The periods list is not visible");
        }

        return this;
    }
    public GainersAndLosers stocksAndCryptosFunctionalities(){
        wait.until(ExpectedConditions.visibilityOfAllElements(gainersSectionTitle));
        scrollUpToElement(gainersSectionTitle);
        waitForTime();
        scrollActions(gainersSectionTitle,-120);



        return this;
    }

    public GainersAndLosers clickOnButton(String button ){
        stocksAndCryptosFunctionalities();

        Map<String, WebElement> buttons = new HashMap<>();
        for (WebElement e : gainersAndLosersFiltersBtn) {
            buttons.put(e.getText(), e);
        }
        clickOnWebElement(buttons.get(button));


        return new GainersAndLosers(driver);

    }
    public boolean verifyThatElementAssetListsHasUpdatedTo(String assetValue){
        boolean check = false;
        Map<String, WebElement> assetList = new HashMap<>();
        for(WebElement e : gainersAndLosersAssetList){
            assetList.put(e.getText(), e);

        }
        System.out.println("Values of the assets list : " + assetList.keySet());
        if (assetList.containsKey(assetValue)){
            ExtentLogger.log("The asset lists values are updated");
            check = true;
        }else{
            ExtentLogger.fail("The asset lists values are not updated");
            check = false;
        }



        return check;
    }


}
