import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SideBarTests extends BaseTest{

    @Test
    public void allItemsAreDisplayed(){
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
    }

    @Test
    public void sideBarRolled(){
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
        sideBar.clickOnSwitchSideBar();
        sideBar.checkSideBarRolled();


    }

}
