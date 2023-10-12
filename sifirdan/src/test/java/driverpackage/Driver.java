package driverpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver ;
    public static WebDriver getDriver(){
        return getdriver();
    }
    public static WebDriver getdriver(){
        if (driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        return driver;
    }
    public static void Quitdriver (){
        driver.quit();

    }



}
