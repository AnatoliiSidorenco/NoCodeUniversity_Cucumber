package steps;

import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.visible;

public class StartSteps extends BaseSteps{
    @When("^I push in header the button Sign In$")
    public void iPushInHeaderTheButtonSignIn() {
        startPage.headerSignInElement.shouldBe(visible).click();
    }
}
