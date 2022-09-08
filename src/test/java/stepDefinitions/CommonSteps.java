package stepDefinitions;

import utilities.DriverManager;
import io.cucumber.java.en.Given;

public class CommonSteps {
    @Given("Im in orange web page")
    public void goToOrangePage(){
        DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        DriverManager.getDriver().driver.manage().window().maximize();

    }

}