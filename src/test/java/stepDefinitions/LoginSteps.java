package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import utilities.DriverManager;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);

    @Given("")
    public void setUserName(){

    }
}
