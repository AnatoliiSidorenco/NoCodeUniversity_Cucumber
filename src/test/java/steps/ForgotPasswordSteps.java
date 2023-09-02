package steps;

import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.visible;

public class ForgotPasswordSteps extends BaseSteps{
    @Then("I am on the Forgot password page")
    public void iAmOnTheForgotPasswordPage() {
        forgotPasswordPage.recoverPasswordButtonElement.shouldBe(visible);
    }
}
