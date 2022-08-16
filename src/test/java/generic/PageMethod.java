package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageMethod extends BrowserSpecification{

    public static WebElement findElement(By locator) {return driver.findElement(locator);}

    public static void findElementAndClick(By locator){
        driver.findElement(locator).click();
    }

    public static void setText(By locator, String text) {driver.findElement(locator).sendKeys(text);}

    public static String getText(By locator) {return driver.findElement(locator).getText();}

    public static boolean elementIsDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public static void sleepMethod(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void refreshPage() {driver.navigate().refresh();}
}
