package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

public class HomeSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    HomePage homePage = new HomePage(DriverManager.getDriver().driver);
    //Logout
    @And("I click the profile button")
    public void clickOnProfileBtn(){
        homePage.clickOnProfile();
    }

    @And("I click the logout button")
    public void clickOnLogoutBtn(){
        homePage.clickOnLogoutButton();
    }

    @Then("The login Img is displayed")
    public void verifyLogOut(){
        Assert.assertTrue(loginPage.verifyLogOutSuccessful());
    }

    // Delete Records

    @And("I click the delete record button")
    public void clickOnDelete(){
        homePage.clickOnDeleteButton();
    }

    /*
    @Then("The id isnt there anymore")
    public void idIsntThereAnymore(){
        String a = homePage.getTextIdRecord();
        Assert.assertTrue(a == "0046");
    }

     */
    @Then("The id {string} is displayed")
    public void verifyIdEmployees(String id){
        Assert.assertTrue(homePage.verifyIds(id));
    }


}
