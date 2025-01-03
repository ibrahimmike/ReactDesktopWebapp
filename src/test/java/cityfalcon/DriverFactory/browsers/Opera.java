package cityfalcon.DriverFactory.browsers;

import cityfalcon.utils.ReadDefaultProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Opera {
    public static WebDriver createOperaDriver()  {

        if (ReadDefaultProperties.getPropertyValue("selenium.grid.enabled").equalsIgnoreCase("true")) {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName(Browser.OPERA.browserName());


            String hubHost = ReadDefaultProperties.getPropertyValue("selenium.grid.hubHost");
            String urlFormat = ReadDefaultProperties.getPropertyValue("selenium.grid.urlFormat");
            String url = String.format(urlFormat, hubHost);
            System.out.println(url);

            try {
                return new RemoteWebDriver(new URL(url), cap);

            } catch (MalformedURLException e) {
                e.getMessage();
            }
        }

            WebDriverManager.operadriver().setup();
            return new OperaDriverManager().getWebDriver();

        }



    }

