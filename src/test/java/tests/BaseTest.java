package tests;

import cityfalcon.DriverFactory.Driver;
import cityfalcon.pages.homePage.HomePage;
import cityfalcon.utils.ReadDefaultProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

//@Listeners(listeners.Listener.class)
public class BaseTest {

    protected WebDriver driver;

    public HomePage hp ;


    @BeforeClass
    public void setUp(){



    }

    @BeforeTest

    public void setWebDriver(){
        driver = Driver.initDriver();
        hp = new HomePage(driver);
    }

    @AfterTest
    public void afterMethod(){
       Driver.removeWebDriver();
    }
}
