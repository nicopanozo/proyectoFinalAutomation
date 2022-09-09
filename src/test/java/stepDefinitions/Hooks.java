package stepDefinitions;

import io.cucumber.java.AfterAll;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;
import io.cucumber.java.After;

public class Hooks {

    @After("@logoutdone")
    public void afterScenario() {
        HomePage homePage = new HomePage(DriverManager.getDriver().driver);
        homePage.clickOnProfile();
        homePage.clickOnLogoutButton();

    }
    @AfterAll
    public static void afterAllScenario() {
        DriverManager.getDriver().driver.close();
    }
}