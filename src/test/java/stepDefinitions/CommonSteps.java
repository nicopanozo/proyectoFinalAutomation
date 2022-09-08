package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.DriverManager;
import io.cucumber.java.en.Given;

public class CommonSteps {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    @Given("Im in orange web page")
    public void goToOrangePage(){
        DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        DriverManager.getDriver().driver.manage().window().maximize();
        Assert.assertTrue(loginPage.verifyLoginButton());

    }

}