package stepDefinitions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.bs.A;
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




}
