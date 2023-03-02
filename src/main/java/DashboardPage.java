
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private SelenideElement sideBar = $(byCssSelector("[role='navigation']"));

    public void dashboardPageIsOpen(){
        sideBar.shouldBe(visible, Duration.ofSeconds(10));
    }

}
