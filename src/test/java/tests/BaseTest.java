package tests;

import cityfalcon.DriverFactory.Driver;
import cityfalcon.pages.homePage.HomePage;
import cityfalcon.utils.ReadDefaultProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(listeners.Listener.class)
public class BaseTest {

    protected WebDriver driver;

    public HomePage hp ;
//    @BeforeSuite
//    public void beforeSuite(){
//
//
//
//    }

    @BeforeClass
    public void setUp(){

        System.out.println(ReadDefaultProperties.getPropertyValue("browser"));


    }

    @BeforeTest
//    @Parameters({"browser"})
    public void setWebDriver(){
        driver = Driver.initDriver();

       // ReadDefaultProperties.initializeProperties();


        hp = new HomePage(driver);



    }
//    @Test
//    public void test1(){
//        HeaderPage hp = new HeaderPage(driver);
//        hp.clickOnConsumerPHeader();
//
//        System.out.println(ReadDefaultProperties.getPropertyValue("url"));
//    }
//
//    @Test
//    public void checks(){
//        HeaderPage hp = new HeaderPage(driver);
//        hp.guestUserClickOnHeaderBgrList().clickOnAllContent();
//    }
//    @AfterTest
//    public void afterTest(){
//        driver.close();
//        Driver.removeWebDriver();
//    }
    @AfterTest
    public void afterMethod(){
       Driver.removeWebDriver();
    }
}
