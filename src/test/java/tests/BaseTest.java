package tests;

import cityfalcon.DriverFactory.Driver;
import cityfalcon.pages.homePage.HomePage;
import listeners.Listener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners({Listener.class})
public class BaseTest {

    WebDriver driver;

    public HomePage hp ;
    @BeforeSuite
    public void beforeSuite(){

    }

    @BeforeTest
//    @Parameters({"browser"})
    public void setWebDriver(){
       // ReadDefaultProperties.initializeProperties();


       driver = Driver.initDriver();
      // context.setAttribute("driver", this.driver);

        hp = new HomePage(driver);

     //   System.out.println(ReadDefaultProperties.getPropertyValue("browser"));

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
