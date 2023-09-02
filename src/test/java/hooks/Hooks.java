package hooks;


import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
   @Before
    public void setUp() {
      //  Configuration.browser = "firefox";
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\EducationProg\\SeleniumChromeDriver116\\chromedriver.exe");
        open("https://jere237.softr.app/");
       WebDriverRunner.getWebDriver().manage().window().maximize();
       // clearBrowserCookies();
    }

   @After
    public void tearDown(){
        closeWebDriver();
    }
}
