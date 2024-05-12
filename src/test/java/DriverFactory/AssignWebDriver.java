package DriverFactory;

import utils.ReadDefaultProperties;
import org.openqa.selenium.WebDriver;


public class AssignWebDriver {

    public static WebDriver getWebDriver(){


        if (ReadDefaultProperties.getPropertyValue("browser").equalsIgnoreCase("chrome")){
            DriverManager.setDrivers(Chrome.createChromeDriver());
        }






       return DriverManager.getDriver();
    }


}
