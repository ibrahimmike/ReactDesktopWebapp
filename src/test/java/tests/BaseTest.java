package tests;

import DriverFactory.Driver;
import cityfalcon.pages.HeaderPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ReadDefaultProperties;

public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void setWebDriver(){

        driver = Driver.initDriver();
        driver.get("https://www.cityfalcon.ai/");

        System.out.println(ReadDefaultProperties.getPropertyValue("browser"));

    }
    @Test
    public void test1(){
        HeaderPage hp = new HeaderPage(driver);
        hp.clickOnConsumerPHeader();

        System.out.println(ReadDefaultProperties.getPropertyValue("url"));
    }

    @Test
    public void checks(){
        HeaderPage hp = new HeaderPage(driver);
        hp.guestUserClickOnHeaderBgrList().clickOnAllContent();
    }
    @AfterTest
    public void afterTest(){
   //     Driver.removeWebDriver();
    }
}
