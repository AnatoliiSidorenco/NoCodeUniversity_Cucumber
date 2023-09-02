package steps;

import pages.AuthorizationPage;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.StartPage;

public class BaseSteps {

  static  public String BASE_URL="https://jere237.softr.app/";

public StartPage startPage = new StartPage();
public AuthorizationPage authorizationPage = new AuthorizationPage();
public HomePage homePage = new HomePage();
public ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

}
