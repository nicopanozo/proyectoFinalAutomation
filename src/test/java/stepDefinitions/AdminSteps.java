package stepDefinitions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

import java.util.List;

public class AdminSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    HomePage homePage = new HomePage(DriverManager.getDriver().driver);
    AdminPage adminPage = new AdminPage(DriverManager.getDriver().driver);

    @And("I click the admin option in the menu")
    public void clickOnAdminBtn(){
        adminPage.clickOnAdminMenuBtn();
    }

    @And("I click the qualification button on the topbar")
    public void clickOnQualification(){
        adminPage.clickOnQualificationBtn();
    }

    @And("I click the skills button")
    public void clickSkillsBtn(){
        adminPage.clickOnSkillBtn();
    }

    @And("I click the add skill button")
    public void clickOnAddSkillBtn(){
        adminPage.clickOnAddSkillBtn();
    }

    @And("I fill the skill information fields with")
        public void fillSkillInformation(DataTable result) throws InterruptedException {
        Thread.sleep(2000);
        List<String> data = result.transpose().asList(String.class);
        adminPage.setSkillName(data.get(0));
        adminPage.setSkillDescription(data.get(1));
        Thread.sleep(2000);
    }


    @When("I click in save button")
    public void clickOnSaveBtn()
    {
        adminPage.clickOnSaveSkillBtn();
    }
    //  |NodeJS|Experiencia con NodeJS|
    @Then("A succesfully saved message is showed")
    public void verifySuccesfullySavedSkill(){
        Assert.assertTrue(adminPage.verifySuccesfullySaved());

    }



}
