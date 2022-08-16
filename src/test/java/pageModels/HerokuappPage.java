package pageModels;

import generic.PageMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static generic.CommonSteps.navigateToPage;

public class HerokuappPage extends PageMethod {

    private static final By CHECKBOX_ONE = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)");
    private static final By CHECKBOX_TWO = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)");


    public static void openHerokuappPage() {
        navigateToPage("https://the-internet.herokuapp.com/");
    }

    public static void selectExercise(String exercise) {
        By link = By.xpath("//ul/li/a[contains(text(), '" + exercise + "')]");
        findElementAndClick(link);
    }

    public static void tickCheckBoxOne() {
        findElementAndClick(CHECKBOX_ONE);
    }

    public static void untickCheckBoxTwo() {
        findElementAndClick(CHECKBOX_TWO);
    }

    public static WebElement checkBoxIsTicked() {
        return findElement(CHECKBOX_ONE);
    }
}
