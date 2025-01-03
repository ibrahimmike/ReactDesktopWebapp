package cityfalcon.DriverFactory;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class Driver {


    public static WebDriver initDriver(){
       if (Objects.isNull(DriverManager.getDriver())){
            try {

                DriverManager.setDrivers(AssignWebDriver.getWebDriver());

            }catch(Exception e){
                throw new RuntimeException("The driver could not be invoked" + e.getMessage());
            }
        }

        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get("https://www.cityfalcon.ai/");
       return DriverManager.getDriver();

    }
    public static void removeWebDriver(){
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.clearDrivers();

        } else {
            throw new RuntimeException("The driver was not set to be unloaded");
        }
    }
    }

