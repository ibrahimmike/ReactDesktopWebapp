package cityfalcon.DriverFactory.browsers;


import cityfalcon.utils.ReadDefaultProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Safari {

    public static WebDriver createSafariDriver()  {

        if (ReadDefaultProperties.getPropertyValue("selenium.grid.enabled").equalsIgnoreCase("true")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName(Browser.SAFARI.browserName());
            String hubHost = ReadDefaultProperties.getPropertyValue("selenium.grid.hubHost");
            String urlFormat = ReadDefaultProperties.getPropertyValue("selenium.grid.urlFormat");
            String url = String.format(urlFormat, hubHost);
            try {
                return new RemoteWebDriver(new URL(url), cap);
            } catch (MalformedURLException e) {
                e.getMessage();
            }
        }
            WebDriverManager.safaridriver().setup();
          return new SafariDriver();
        }



}
