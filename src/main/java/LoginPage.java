package main.java;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement usernameField =  $(byName("username"));
    private SelenideElement passwordField =  $(byCssSelector("[name='password']"));
    private SelenideElement loginButton =   $(byAttribute("type","submit"));
    private SelenideElement topLogo = $(byAttribute("alt", "company-branding"));

    private SelenideElement credSection = $(byClassName("orangehrm-demo-credentials"));


    private SelenideElement forgotYourPassword = $(byClassName("orangehrm-login-forgot-header"));
    public void enterUsername(String usernameValue){
        usernameField.shouldBe(visible, Duration.ofSeconds(10));
        usernameField.setValue(usernameValue);
    }

    public void enterPassword(String passwordValue){
        passwordField.setValue(passwordValue);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void logoIsDisplayed(){
        topLogo.shouldBe(visible);
    }
    public void logoImageIsCorrect(){
        //topLogo.shouldHave(attribute("src", "https://opensource-demo.orangehrmlive.com/web/images/ohrm_branding.png?1672659722816"));
        topLogo.shouldHave(attributeMatching("src", ".*branding.png.*"));
    }


    public void credSectionIsDisplayed(){
        credSection.shouldBe(visible);
    }

    public void followTheForgotPasswordLink(){
        forgotYourPassword.click();
    }





}
