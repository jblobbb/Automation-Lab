package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSpecification {
    
    private void setProperties() {
     System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
    }

    public static WebDriver getDriver() {
        setProperties()
        return new ChromeDriver();;
    }
}
