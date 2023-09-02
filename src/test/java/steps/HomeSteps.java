package steps;

import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;

public class HomeSteps extends BaseSteps{

    @Then("I am on the Home page {string}")
    public void iAmOnTheHomePage(String expectedText) {
        homePage.welcomeSectionTextElement.shouldHave(text(expectedText));
    }
}
