package stepDefinition.react;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ApplicationInstance;

public class ReactSteps extends ApplicationInstance {
    @Given("^I am in the react page$")
    public void openReactPage() throws Throwable {
        react.goTo();
    }

    @When("^I scroll to the checkbox section$")
    public void scrollCheckboxSection() throws Throwable {
        react.getDataTablePage().scrollToCheckboxSection();
    }

    @Then("^I select the \"([^\"]*)\" option$")
    public void selectCheckboxOption(String option) throws Throwable {
        react.getDataTablePage().selectCheckboxOption(option);
    }

}
