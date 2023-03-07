

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static org.junit.Assert.assertTrue;

public class ResetPasswordPage {
    private SelenideElement resetPasswordButton = $(byCssSelector("[type='submit']"));

    public void resetPasswordButtonIsDisplayed(){
        resetPasswordButton.shouldBe(visible);
    }

    public void urlIsCorrect(){
       String currentURL =  WebDriverRunner.getWebDriver().getCurrentUrl();
       assertTrue("Incorrect URL, Current URL was: " + currentURL,currentURL.contains("requestPasswordResetCode"));


    }

}
