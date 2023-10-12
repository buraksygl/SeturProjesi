package parentpackage;

import driverpackage.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static locatorspackage.Locators.*;

public class Testclass extends parentclass {






     @BeforeTest
     public void beforetest(){
          goToUrl();

     }
     @Test
     public void loginTest (){
          checkUrl();
          checkOtelTab();
          clickTo(otelButton);
     }
     @AfterTest
     public void QuitTest () {
          Driver.Quitdriver();
     }

}
