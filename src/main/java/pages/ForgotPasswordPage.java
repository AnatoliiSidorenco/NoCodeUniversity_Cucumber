package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {
    public SelenideElement recoverPasswordButtonElement = $(byCssSelector("[type='button']"));
}
