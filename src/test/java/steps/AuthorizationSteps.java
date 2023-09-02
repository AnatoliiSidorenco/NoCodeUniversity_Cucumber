package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;


public class AuthorizationSteps extends BaseSteps {




    @Then("^I am on Authorization page$")
    public void iAmOnAuthorizationPage() {
authorizationPage.forgotPasswordLinkElement.shouldBe(visible);
    }

    @When("^I fill input Email with data \"([^\"]*)\"$")
    public void iFillInputEmailWithData(String email)  {
        authorizationPage.emailInputSignInElement.setValue(email);
    }

    @And("^I fill input Password with data \"([^\"]*)\"$")
    public void iFillInputPasswordWithData(String password)  {
        authorizationPage.passwordInputSignInElement.setValue(password);
    }

    @When("^I push in form the button Sign In$")
    public void iPushFormTheButtonSignIn() {
authorizationPage.signInButtonSignInFormElement.shouldBe(visible).click();
    }

    @When("I click link Forgot password")
    public void iClickLinkForgotPassword() {
        authorizationPage.forgotPasswordLinkElement.shouldBe(visible).click();
    }

    @Then("Password field displays masked characters")
    public void passwordFieldDisplaysMaskedCharacters() {
        authorizationPage.passwordCheckMaskedSignInForm();
    }

    @And("I click on eye-crossed icon")
    public void iClickOnEyeCrossedIcon() {
        authorizationPage.eyeIconPasswordSignInForm.shouldBe(visible).click();
    }

    @Then("Password field displays not masked characters")
    public void passwordFieldDisplaysNotMaskedCharacters() {
        authorizationPage.passwordCheckNotMaskedSignInForm();
    }

    @Then("I check if ability to copy is disabled")
    public void iCheckIfAbilityToCopyIsDisabled() throws IOException, UnsupportedFlavorException {
        authorizationPage.isCopyingDisabledSignInForm("123456");
    }

    @Then("I check if ability to cut is disabled")
    public void iCheckIfAbilityToCutIsDisabled() throws IOException, UnsupportedFlavorException {
        authorizationPage.isCuttingDisabledSignInForm("123456");
    }

    @And("I push in form the button Sign Up")
    public void iPushInFormTheButtonSignUp() {
        authorizationPage.signUpButtonSignInFormElement.shouldBe(visible).click();
    }

    @Then("authorization failed and text {string} is displayed")
    public void authorizationFailedAndTextIsDisplayed(String expectedText) {
        authorizationPage.errorMessageSignInElement.shouldBe(visible).shouldHave(text(expectedText));
    }
}
