package cityfalcon.extentLoger;

import cityfalcon.DriverFactory.DriverManager;

public class ExtentLogger {

    private static void extentReportPass() {
    }

    public static void pass(String message){

        ExtentManager.getReport().pass(message);
    }

    public static void fail(String message){
        ExtentManager.getReport().fail(message);
    }
    public static void skip(String message){
        ExtentManager.getReport().skip(message);
    }
    public static void log(String message){
        ExtentManager.getReport().info(message);
    }
//    public static void reportFailureOfAStep(String message){
//        ExtentManager.getReport().log();
//    }


//    public static String makePicture(){
//        return  ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
//    }
}
