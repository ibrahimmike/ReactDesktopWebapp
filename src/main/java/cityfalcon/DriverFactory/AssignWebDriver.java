package cityfalcon.DriverFactory;

import cityfalcon.DriverFactory.browsers.Chrome;
import cityfalcon.DriverFactory.browsers.Edge;
import cityfalcon.DriverFactory.browsers.Firefox;
import cityfalcon.DriverFactory.browsers.Safari;
import cityfalcon.utils.ReadDefaultProperties;
import org.openqa.selenium.WebDriver;


public class AssignWebDriver {

    public static WebDriver getWebDriver(){

        if (ReadDefaultProperties.getPropertyValue("browser").equalsIgnoreCase("chrome")){
            DriverManager.setDrivers(Chrome.createChromeDriver());
        } else if (ReadDefaultProperties.getPropertyValue("browser").equalsIgnoreCase("edge")) {
            DriverManager.setDrivers(Edge.createEdgeDriver());

        } else if (ReadDefaultProperties.getPropertyValue("browser").equalsIgnoreCase("firefox")) {
            DriverManager.setDrivers(Firefox.createFirefoxDriver());
        } else if (ReadDefaultProperties.getPropertyValue("browser").equalsIgnoreCase("safari")){
            DriverManager.setDrivers(Safari.createSafariDriver());
        }


        return DriverManager.getDriver();
    }


}
