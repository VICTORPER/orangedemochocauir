package co.com.screenplay.project.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenWebStepDefinition {
    @When("he enters the web browser")
    public void heEntersTheWebBrowser() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("he will see the page title {string}")
    public void heWillSeeThePageTitle(String textValidation) {
        // Write code here that turns the phrase above into concrete actions
    }

}
