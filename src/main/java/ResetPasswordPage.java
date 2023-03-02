package main.java;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
public class ResetPasswordPage {
    private SelenideElement resetPasswordButton = $(byCssSelector("[type='submit']"));

    public void resetPasswordButtonIsDisplayed(){
        resetPasswordButton.shouldBe(visible);
    }

    public void urlIsCorrect(){
        WebDriverRunner.getWebDriver().getCurrentUrl();
    }

}
