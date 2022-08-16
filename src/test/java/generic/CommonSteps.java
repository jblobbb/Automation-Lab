package generic;

public class CommonSteps extends BrowserSpecification{

    public static void navigateToPage(String website) {
        getDriver();
        driver.navigate().to(website);
    }
}
