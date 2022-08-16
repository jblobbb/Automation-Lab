package pageModels;

import generic.PageMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static generic.CommonSteps.navigateToPage;

public class HerokuappPage extends PageMethod {

    private static final By CHECKBOX_ONE = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)");
    private static final By CHECKBOX_TWO = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)");
    private static final By BUTTON_ADD_ELEMENT = By.cssSelector("#content > div > button");
    private static final By BUTTON_DELETE = By.cssSelector("#elements > button");


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

    public static void clickAddElement() {
        findElementAndClick(BUTTON_ADD_ELEMENT);
    }

    public static boolean isDeleteButtonDisplayed() {
        return elementIsDisplayed(BUTTON_DELETE);
    }

    public static void clickDeleteButton() {
        findElementAndClick(BUTTON_DELETE);
    }
}
