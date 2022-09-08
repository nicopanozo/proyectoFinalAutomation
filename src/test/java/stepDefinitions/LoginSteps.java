package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.DriverManager;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);

    @Given("I set the username with {string}")
    public void setUserName(String userName){
        loginPage.setUsernameTextBox(userName);
    }
    @And("I set the password with {string}")
    public void setPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @When("I click the log in button")
    public void clickLogInBtn(){
        loginPage.clickLoginButton();
    }

    @Then("The pim page is displayed")
    public void verifyLoginSuccess(){
        Assert.assertTrue(loginPage.verifyLoginSuccessful());
    }

}
