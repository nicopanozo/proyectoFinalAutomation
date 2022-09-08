package pages;

import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(className = "bot_column")
    WebElement loginIcon;

    public boolean verifyLoginIcon(){
        boolean verifyLoginIcon = loginIcon.isDisplayed();
        return verifyLoginIcon;
    }


}
