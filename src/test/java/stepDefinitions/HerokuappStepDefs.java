package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pageModels.HerokuappPage;

public class HerokuappStepDefs {

    @Given("user is on Herokuapp website")
    public void userIsOnHerokuappWebsite(){
        HerokuappPage.openHerokuappPage();
    }

    @Given("user selects {string} exercise")
    public void userSelectsExercise(String exercise) {
        HerokuappPage.selectExercise(exercise);
    }

    @When("user ticks checkbox one and unticks checkbox two")
    public void userTicksCheckboxOneAndUnticksCheckboxTwo() {
        HerokuappPage.tickCheckBoxOne();
        HerokuappPage.untickCheckBoxTwo();
    }

    @Then("user confirms the correct checkbox is ticked")
    public void userConfirmsTheCorrectCheckboxIsTicked() {
        WebElement result = HerokuappPage.checkBoxIsTicked();
        String attribute = result.getAttribute("checked");
        boolean bool = Boolean.parseBoolean(attribute);
        Assert.assertTrue(bool);
    }

    @When("user clicks on Add Element and user confirms the Delete button appears")
    public void userClicksOnAddElementAndUserConfirmsTheDeleteButtonAppears() {
        HerokuappPage.clickAddElement();
        boolean result = HerokuappPage.isDeleteButtonDisplayed();
        Assert.assertTrue(result);
    }

    @Then("user clicks on Delete button and user confirms that Delete button is removed")
    public void userClicksOnDeleteButtonAndUserConfirmsThatDeleteButtonIsRemoved() {
        HerokuappPage.clickDeleteButton();
        boolean result = HerokuappPage.isDeleteButtonDisplayed();
        Assert.assertFalse(result);
    }

    @When("user selects option {int}")
    public void userSelectsOption(int index) {
        HerokuappPage.selectOption(index);
    }

    @Then("user verifies option {int} is selected")
    public void userVerifiesOptionIsSelected(int index) {
        HerokuappPage.checkOptionSelected(index);
    }
}
