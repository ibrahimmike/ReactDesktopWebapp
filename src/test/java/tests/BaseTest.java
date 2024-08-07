package tests;

import cityfalcon.DriverFactory.Driver;
import cityfalcon.pages.HeaderPage;
import cityfalcon.pages.homePage.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import cityfalcon.utils.ReadDefaultProperties;

public class BaseTest {

    WebDriver driver;

    public HomePage hp ;

    @BeforeClass
    public void setWebDriver(){

       driver = Driver.initDriver();

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
//    @AfterClass
//    public void afterMethod(){
//       Driver.removeWebDriver();
//    }
}
