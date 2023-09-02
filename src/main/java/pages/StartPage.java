package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StartPage {
    public SelenideElement headerSignInElement = $x("(//a[@data-element='button'])[1]");
}
