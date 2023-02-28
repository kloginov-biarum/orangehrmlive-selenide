import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement usernameField =  $(byName("username"));
    private SelenideElement passwordField =  $(byCssSelector("[name='password']"));
    private SelenideElement loginButton =   $(byAttribute("type","submit"));


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





}
