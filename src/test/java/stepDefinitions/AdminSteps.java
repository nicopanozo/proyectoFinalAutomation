package stepDefinitions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.And;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

public class AdminSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    HomePage homePage = new HomePage(DriverManager.getDriver().driver);
    AdminPage adminPage = new AdminPage(DriverManager.getDriver().driver);

    @And("I click the admin option in the menu")
    public void clickOnAdminBtn(){

    }

}
