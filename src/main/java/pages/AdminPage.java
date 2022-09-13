package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.net.http.WebSocket;
import java.time.Duration;

public class AdminPage {
    WebDriver driver;

    public AdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[4]/div/button[1]")
    WebElement deleteSkillBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")
    WebElement yesDeleteBtn;
    //Eliminar en PIM page o home page
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[9]/div/button[1]")
    WebElement deleteRecordBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[9]/div/button[1]")
    WebElement cofirmDeleteRecordBtn;




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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(qualificationsBtn));
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        skillNameField.sendKeys(skillName);
    }

    public void setSkillDescription(String skillDescription){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
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

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    WebElement jobTopBarBtn;

    public void clickOnJobTopBar(){
        jobTopBarBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]")
    WebElement jobTitlesOption;

    public void clickOnJobTitlesOption(){
        jobTitlesOption.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    WebElement addJobBtn;

    public void clickOnAddJobBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addJobBtn));
        addJobBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    WebElement jobNameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
    WebElement jobDescField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")
    WebElement jobNoteField;
    public void setJobTitleName(String jobTitleName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveJobBtn));
        jobNameField.sendKeys(jobTitleName);
    }
    public void setJobTitleDescription(String jobTitleDescription){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveJobBtn));
        jobDescField.sendKeys(jobTitleDescription);
    }
    public void setJobTitleNote(String jobTitleNote){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveJobBtn));
        jobNoteField.sendKeys(jobTitleNote);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")
    WebElement saveJobBtn;

    public void clickOnSaveJobBtn(){
        saveJobBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div")
    WebElement successJobMessage;

    public boolean verifySuccesfullJobSaved(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(successJobMessage));
        boolean verifyS = successJobMessage.isDisplayed();
        return verifyS;
    }


    public void clickOnDeleteSkillBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(deleteSkillBtn));
        deleteSkillBtn.click();
    }

    public void clickOnConfirmDeleteSkillBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(yesDeleteBtn));
        yesDeleteBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]")
    WebElement deleteSkillSuccess;
    public boolean verifySuccessSkillDeleted(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(deleteSkillSuccess));
        boolean verifyS = deleteSkillSuccess.isDisplayed();
        return verifyS;
    }

}
