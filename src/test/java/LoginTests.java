

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.Test;
import org.junit.experimental.categories.Category;



import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginTests extends BaseTest{

    public void successLogin(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        dashboardPage.dashboardPageIsOpen();
    }


    @Test
    public void elementsAreVisible(){
        loginPage.logoIsDisplayed();
        loginPage.logoImageIsCorrect();
        loginPage.credSectionIsDisplayed();
    }

    @Test
    public void forgotYourPasswordLink(){
        loginPage.followTheForgotPasswordLink();
        resetPasswordPage.resetPasswordButtonIsDisplayed();
        resetPasswordPage.urlIsCorrect();
    }


}
