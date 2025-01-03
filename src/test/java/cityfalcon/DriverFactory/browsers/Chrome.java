package cityfalcon.DriverFactory.browsers;

import cityfalcon.utils.ReadDefaultProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;

public class Chrome {

    public static WebDriver createChromeDriver() {


        if (ReadDefaultProperties.getPropertyValue("selenium.grid.enabled").equalsIgnoreCase("true")) {
            try {

            Capabilities cap = new ChromeOptions();
            String hubHost = ReadDefaultProperties.getPropertyValue("selenium.grid.hubHost");
            String urlFormat = ReadDefaultProperties.getPropertyValue("selenium.grid.urlFormat");
            String url = String.format(urlFormat, hubHost);


                return new RemoteWebDriver(new URL(url), cap);

            } catch (MalformedURLException e) {
                e.getMessage();
                throw new RuntimeException("The url is not created ");
            }
        } else {
            ChromeOptions options = new ChromeOptions();

            //options.addArguments("--disable-notifications");
            options.addArguments("--start-maximized");

            options.addArguments("--disable-infobars");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            options.addArguments("--disable-extensions");



            WebDriverManager.chromedriver().clearDriverCache().setup();
            WebDriverManager.chromedriver().clearResolutionCache().setup();

            return  new ChromeDriver(options);
        }

    }
}
