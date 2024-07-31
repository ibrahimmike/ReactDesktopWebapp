package cityfalcon.DriverFactory;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class Driver {

  // private static WebDriver driver;
    public static WebDriver initDriver(){
        if (Objects.isNull(DriverManager.getDriver())){
            try {
           //     AssignWebDriver.getWebDriver();
                DriverManager.setDrivers(AssignWebDriver.getWebDriver());

                //return DriverManager.getDriver();
               // DriverManager.getDriver().get(ReadPropertyFiles.getPropertyValue("url"));
              //  driver = DriverManager.getDriver();
            }catch(Exception e){
                throw new RuntimeException("The driver could not be invoked");
            }
        }

        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get("https://www.cityfalcon.ai/");
       return DriverManager.getDriver();

    }
    public static void removeWebDriver(){
//        driver.quit();
//        DriverManager.clearDrivers();
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.clearDrivers();

        } else {
            throw new RuntimeException("The driver was not set to be unloaded");
        }
    }
    }

