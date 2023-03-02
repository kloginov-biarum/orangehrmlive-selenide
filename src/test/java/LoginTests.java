

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.Test;


import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginTests {
    @Test
    public void successLogin(){

        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.dashboardPageIsOpen();
    }

    @Test
    public void elementsAreVisible(){
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.logoIsDisplayed();
        loginPage.logoImageIsCorrect();
        loginPage.credSectionIsDisplayed();
    }

    @Test
    public void forgotYourPasswordLink(){
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.followTheForgotPasswordLink();
        ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
        resetPasswordPage.resetPasswordButtonIsDisplayed();
    }


}
