package stepDefinitions;

import utilities.DriverManager;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void afterScenario() {
        DriverManager.getDriver().driver.close();
    }
}