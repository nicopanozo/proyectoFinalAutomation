package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.http.WebSocket;
import java.time.Duration;

public class AdminPage {
    WebDriver driver;

    public AdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
    WebElement saveButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    WebElement adminMenuBtn;

    public void clickOnAdminMenuBtn(){
        adminMenuBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")
    WebElement qualificationsBtn;

    public void clickOnQualificationBtn(){
        qualificationsBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")
    WebElement skillBtn;
    public void clickOnSkillBtn(){
        skillBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    WebElement addSkillBtn;


    public void clickOnAddSkillBtn(){
        addSkillBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    WebElement skillNameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
    WebElement skillDescriptionField;

    public void setSkillName(String skillName){
        skillNameField.sendKeys(skillName);
    }

    public void setSkillDescription(String skillDescription){
        skillDescriptionField.sendKeys(skillDescription);
    }
    public void clickOnSaveSkillBtn(){
        saveButton.click();
    }

    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div")
    WebElement successfulSaveMsg;

    public boolean verifySuccesfullySaved(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(successfulSaveMsg));
        boolean verifyS = successfulSaveMsg.isDisplayed();
        return verifyS;

    }






}
