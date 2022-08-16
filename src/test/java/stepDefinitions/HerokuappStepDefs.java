package stepDefinitions;

import io.cucumber.java.en.Given;
import pageModels.HerokuappPage;

public class HerokuappStepDefs {

    @Given("user is on Herokuapp website")
    public void userIsOnHerokuappWebsite(){
        HerokuappPage.openHerokuappPage();
    }
}
