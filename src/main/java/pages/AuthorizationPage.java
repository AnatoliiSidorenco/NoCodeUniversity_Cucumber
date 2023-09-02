package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static com.codeborne.selenide.Condition.attributeMatching;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.Assert.assertTrue;

public class AuthorizationPage {


    public SelenideElement emailInputSignInElement = $(byId("sw-form-capture-email-input"));
    public SelenideElement passwordInputSignInElement = $(byId("sw-form-password-input"));
    public SelenideElement eyeIconPasswordSignInForm = $x("(//i)[1]");
    public SelenideElement forgotPasswordLinkElement = $(byCssSelector("a[href='/forgot-password']"));
    public SelenideElement signInButtonSignInFormElement = $(byId("sw-sign-in-submit-btn"));
    public SelenideElement signUpButtonSignInFormElement = $(byId("sw-go-to-sign-up-btn"));
    public SelenideElement errorMessageSignInElement = $(byCssSelector("[class='error-message login-error d-block']"));

    public void passwordCheckMaskedSignInForm() {
        passwordInputSignInElement.shouldHave(attributeMatching("type", ".*password.*"));
    }

    public void passwordCheckNotMaskedSignInForm() {
        passwordInputSignInElement.shouldHave(attributeMatching("type", ".*text.*"));
    }

    public void isCopyingDisabledSignInForm(String password) throws IOException, UnsupportedFlavorException {

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(""), null);

        passwordInputSignInElement.setValue(password);
        passwordInputSignInElement.setValue(Keys.chord(Keys.CONTROL, "c"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
        String copiedText = (String) contents.getTransferData(DataFlavor.stringFlavor);
        assertTrue(copiedText == null || copiedText.isEmpty());
    }

    public void isCuttingDisabledSignInForm(String password) throws IOException, UnsupportedFlavorException {

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(""), null);
        passwordInputSignInElement.setValue(password);
        passwordInputSignInElement.setValue(Keys.CONTROL + "x");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
        String carvedText = (String) contents.getTransferData(DataFlavor.stringFlavor);

        assertTrue(carvedText == null || carvedText.isEmpty());
    }
}
