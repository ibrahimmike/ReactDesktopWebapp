package DriverFactory;

import org.openqa.selenium.WebDriver;

public class Driver {

   private static WebDriver driver;
    public static WebDriver initDriver(){

       driver = AssignWebDriver.getWebDriver();
        DriverManager.getDriver().manage().window().maximize();
       return driver;

    }
    public static void removeWebDriver(){
        driver.quit();
        DriverManager.clearDrivers();
    }
}
