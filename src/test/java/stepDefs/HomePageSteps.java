package stepDefs;

import static com.codeborne.selenide.Selenide.open;

import desktop.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();

    @Given("I am an anonymous customer with clear cookies")
    public void anonymousCustomerWithClearCookies() {
        homePage.clearCookies();
    }

    @When("I open the {string}")
    public void openThePage(String page) {
        open(homePage.pageUrl(page));
    }

    @And("I search for {string}")
    public void Search(String bookName) {
        homePage.search(bookName);
    }

}
