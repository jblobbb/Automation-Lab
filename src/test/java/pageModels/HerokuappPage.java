package pageModels;

import generic.PageMethod;

import static generic.CommonSteps.navigateToPage;

public class HerokuappPage extends PageMethod {

    public static void openHerokuappPage() {
        navigateToPage("https://the-internet.herokuapp.com/");
    }
}
