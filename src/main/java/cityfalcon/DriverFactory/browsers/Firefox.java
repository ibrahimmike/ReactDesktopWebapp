package cityfalcon.DriverFactory.browsers;

import cityfalcon.utils.ReadDefaultProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Firefox {
    public static WebDriver createFirefoxDriver()  {
       // WebDriver driver = null;
        if (ReadDefaultProperties.getPropertyValue("selenium.grid.enabled").equalsIgnoreCase("true")){

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName(Browser.FIREFOX.browserName());



            String hubHost = ReadDefaultProperties.getPropertyValue("selenium.grid.hubHost");
            String urlFormat = ReadDefaultProperties.getPropertyValue("selenium.grid.urlFormat");
            String  url = String.format(urlFormat, hubHost);
            System.out.println(url);

            try{
                return new RemoteWebDriver(new URL(url),cap);

            }catch (MalformedURLException e){
                e.getMessage();
            }
        }
            WebDriverManager.firefoxdriver().setup();
           return new FirefoxDriver();





    }
}
