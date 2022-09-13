package stepDefinitions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
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
        List<String> data = result.transpose().asList(String.class);
        adminPage.setSkillName(data.get(0));
        adminPage.setSkillDescription(data.get(1));
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
    @And("I click the remove skill button")
    public void clickOnRemoveSkillButton(){
        adminPage.clickOnDeleteSkillBtn();
    }

    @And("I click on yes delete")
    public void clickOnYesDelete(){
        adminPage.clickOnConfirmDeleteSkillBtn();
    }

    @Then("The element was removed")
    public void verifyDeleteSkillSuccess(){
        Assert.assertTrue(adminPage.verifySuccessSkillDeleted());
    }

    @And("I click the job button on the topbar")
    public void clickOnJobTopBar(){
        adminPage.clickOnJobTopBar();
    }

    @And("I click the job titles option")
    public void clickOnJobTitlesOption(){
        adminPage.clickOnJobTitlesOption();
    }

    @And("I click the add job title button")
    public void clickOnAddJobTitle(){
        adminPage.clickOnAddJobBtn();
    }

    @And("I fill the job information fields with")
    public void fillJobInformation(DataTable result) {
        List<String> data = result.transpose().asList(String.class);
        adminPage.setJobTitleName(data.get(0));
        adminPage.setJobTitleDescription(data.get(1));
        adminPage.setJobTitleNote(data.get(2));
    }
    @And("I click in save job button")
    public void clickOnSaveJobBtn(){
        adminPage.clickOnSaveJobBtn();
    }

    @Then("A succesfully saved job message is showed")
    public void verifySuccessJobSaved(){
        Assert.assertTrue(adminPage.verifySuccesfullJobSaved());
    }
    @And("I click the remove job button")
    public void clickOnRemoveJob(){
        adminPage.clickOnDeleteSkillBtn();
    }




}
