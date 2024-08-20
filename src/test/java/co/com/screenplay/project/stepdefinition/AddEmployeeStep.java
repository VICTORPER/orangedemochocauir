package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;

//import static co.com.screenplay.project.ui.CategoryUI.SELECT_JOB_TITLE;
import static co.com.screenplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AddEmployeeStep {

    private static EnvironmentVariables environmentVariables;
    private String first_name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("I select the {string} option")
    public void iSelectTheOption(String string) {
        theActorCalled(ACTOR).attemptsTo(
                AddEmployee.button());
    }

    @When("fill out the first page of the form")
    public void fillOutTheFirstPageOfTheForm() {
        theActorCalled(ACTOR).attemptsTo(
                FirstForm.firstForm()
        );

   }

    @When("I select the {string} Button")
    public void iSelectTheButton(String string) {
        theActorCalled(ACTOR).attemptsTo(
                ButtonAdd.button());
    }
    @When("Fill out the second page of the form")
    public void fillOutTheSecondPageOfTheForm() {
        first_name = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(FIRST_NAME);
        theActorCalled(ACTOR).attemptsTo(
                SecondForm.formnewadmin(first_name)
        );

    }
    @Then("the new employee will be added")
    public void theNewEmployeeWillBeAdded() {
        // Write code here that turns the phrase above into concrete actions
    }


}
