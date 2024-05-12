package DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.ReadDefaultProperties;

import java.net.MalformedURLException;
import java.net.URL;

public class Chrome {

    public static WebDriver createChromeDriver()  {
        WebDriver driver = null;
        if (ReadDefaultProperties.getPropertyValue("runMode").equalsIgnoreCase("remote")){
            Capabilities cap = new ChromeOptions();
            String hubHost = ReadDefaultProperties.getPropertyValue("selenium.grid.hubHost");
            String urlFormat = ReadDefaultProperties.getPropertyValue("selenium.grid.urlFormat");
            String  url = String.format(urlFormat, hubHost);
            System.out.println(url);

            try{
                driver = new RemoteWebDriver(new URL(url),cap);

            }catch (MalformedURLException e){
                e.getMessage();
            }
        }else{
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--disable-notifications");
//            options.addArguments("--start-maximized");
//            options.addArguments("--disable-features=EnableEphemeralFlashPermission");
//            options.addArguments("--disable-infobars");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }
        return driver;

    }
}
