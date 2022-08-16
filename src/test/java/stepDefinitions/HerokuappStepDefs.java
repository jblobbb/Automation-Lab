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
}
