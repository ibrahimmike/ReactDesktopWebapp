package cityfalcon.DriverFactory.browsers;

import cityfalcon.utils.ReadDefaultProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;

public class Chrome {

    public static WebDriver createChromeDriver() {
//        System.out.println("Chrome driver has started The driver has started");
//          System.out.println( "Hello I am runmode = "   +ReadDefaultProperties.getPropertyValue("runMode"));

        if (ReadDefaultProperties.getPropertyValue("selenium.grid.enabled").equalsIgnoreCase("true")) {
            try {
            System.out.println("The boolean was true");
            Capabilities cap = new ChromeOptions();
            String hubHost = ReadDefaultProperties.getPropertyValue("selenium.grid.hubHost");
            String urlFormat = ReadDefaultProperties.getPropertyValue("selenium.grid.urlFormat");
            String url = String.format(urlFormat, hubHost);
            System.out.println("this is the url of the hubhoost" + url);


                return new RemoteWebDriver(new URL(url), cap);

            } catch (MalformedURLException e) {
                e.getMessage();
                throw new RuntimeException("The url is not created ");
            }
        } else {
            ChromeOptions options = new ChromeOptions();
//            options.setBinary("/opt/google/chrome/chrome");
              options.setBinary("/usr/bin/google-chrome");
            options.addArguments("--disable-notifications");
            options.addArguments("--start-maximized");
          //  options.addArguments("--disable-features=EnableEphemeralFlashPermission");
            options.addArguments("--disable-infobars");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            //disable-dev-shm-usage
            options.addArguments("--disable-extensions");
          //  options.addArguments("--headless");
          //  options.addArguments("--disable-gpu");

            System.out.println("I am inside the local WebDriver options ");

            WebDriverManager.chromedriver().clearDriverCache().setup();
            WebDriverManager.chromedriver().clearResolutionCache().setup();

            return  new ChromeDriver(options);
        }

    }
}
