package DriverFactory;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    public static void setDrivers(WebDriver driver){
        drivers.set(driver);
    }
    public static WebDriver getDriver(){
        return drivers.get();
    }
    public static void clearDrivers(){
        drivers.remove();
    }
}
