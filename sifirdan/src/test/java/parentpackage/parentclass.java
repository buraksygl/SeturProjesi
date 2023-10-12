package parentpackage;

import driverpackage.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static locatorspackage.Locators.*;
import java.time.Duration;

public class parentclass {
    protected WebDriver driver ;
    protected WebDriverWait wait;
    public parentclass(){
        this.driver = Driver.getdriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");

    }
    public void clickTo (By locater){
        wait.until(ExpectedConditions.elementToBeClickable(locater));
    }
    public void goToUrl (){
        driver.get(url);


    }
    public void checkUrl (){
        if (url.equals(expectedURL)) {
            System.out.println("Başarılı: URL belirtilen URL ile eşleşiyor.");
        } else {
            System.out.println("Başarısız: URL belirtilen URL ile eşleşmiyor.");
        }
        Assert.assertEquals(expectedURL,url);
    }
    public void checkOtelTab (){
        WebElement otelTab = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div[1]/div/div"));
        if (otelTab.isDisplayed()){
            System.out.println("Otel tabı varsayılan olarak görüntüleniyor.");
        }
        else {
            System.out.println("Otel tabı varsayılan olarak görüntülenmiyor.");
            driver.quit();
            return;
        }
    }
}
