package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    public SelenideElement welcomeSectionTextElement = $x("(//div//p)[1]");
}
