package cityfalcon.extentLoger;

import cityfalcon.DriverFactory.DriverManager;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ExtentLogger {

    private static void extentReportPass() {
    }

    public static void pass(String message){

        ExtentManager.getReport().pass(message);
    }

    public static void fail(String message){
        ExtentManager.getReport().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(makePicture()).build());
    }
    public static void skip(String message){
        ExtentManager.getReport().skip(message);
    }
    public static void log(String message){
        ExtentManager.getReport().info(message);
    }



    public static String makePicture(){
        return  ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
