package cityfalcon.pages.homePage;

import cityfalcon.pages.BasePage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsChartSectionPage extends BasePage {
    @FindBy(xpath ="//div[contains(@class, '__section-wrapper-header-title___')and text()='News On Charts']")
    private WebElement newsChartsTitle;
    @FindBy(xpath = "//div[contains(@class, '__section-wrapper-header-title___')and text()='News On Charts']/ancestor::section//div[contains(@class,'__news-on-charts-tickers___')]//div[@class='menu-item-wrapper ']")
    private List<WebElement> newsChartsKeys;


    public NewsChartSectionPage(WebDriver driver) {
        super(driver);
        scrollToView(newsChartsTitle);
    }
    public NewsChartSectionPage chooseAsset(){

        Map<String,WebElement> assetsOnTheNewsAndCharts = new HashMap<>();
        for (WebElement e: newsChartsKeys){
            assetsOnTheNewsAndCharts.put(e.getText(), e);

        }
        System.out.println("The assets on the news and charts section " + assetsOnTheNewsAndCharts.keySet());


        return new NewsChartSectionPage(driver);
    }
    ///html//body[@id='body']/div[@class='cf-main-wrapper']/div[2]/div[2]/div[1]/div[@class='Card__content']/div[@class='Card__content--details']
    ////path[@class='y2grid crisp']




}
