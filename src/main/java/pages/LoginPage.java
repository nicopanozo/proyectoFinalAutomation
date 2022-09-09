package pages;

import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement usernameTextBox;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setUsernameTextBox(String username){
        usernameTextBox.sendKeys(username);
    }

    public void setPasswordTextBox(String password){
        passwordTextBox.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }


    public boolean verifyLoginButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        boolean verifyLoginButton = loginButton.isDisplayed();
        return verifyLoginButton;
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")
    WebElement orangeBanner;

    public boolean verifyLoginSuccessful(){
        boolean v = orangeBanner.isDisplayed();
        return v;
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")
    WebElement imgLogin;

    public boolean verifyLogOutSuccessful(){
        boolean v = imgLogin.isDisplayed();
        return v;
    }

}
