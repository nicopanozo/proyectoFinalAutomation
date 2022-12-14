package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")
    WebElement profileButton;

    public void clickOnProfile(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(profileButton));
        profileButton.click();
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
    WebElement logoutButton;

    public void clickOnLogoutButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div[1]/div/div/div[1]/div[2]/div/div/button[1]")
    WebElement deleteRecordBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div[1]/div/div/div[1]/div[1]/div/div/div[2]")
    WebElement idRecordText;

    /*
    public String getTextIdRecord(){
        String textoIdRecord = idRecordText.getText();
        return textoIdRecord;
    }
    String a = getTextIdRecord();
    */
    public void clickOnDeleteButton(){

    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    WebElement titleRecord;

    public boolean verifyIds(String id){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(titleRecord));
        WebElement employeeId = driver.findElement(By.xpath("//div[contains(text(),'"+id+"')]"));
        return employeeId.isDisplayed();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]")
    WebElement configurationTopBarBtn;

    public void clickOnConfigTopBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(titleRecordTermination));
        configurationTopBarBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[5]/a")
    WebElement terminationReasonsBtn;

    public void clickOnTerminationRBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(titleRecordTermination));
        terminationReasonsBtn.click();
    }


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/span")
    WebElement titleRecordTermination;

    public boolean verifyTerminationNames(String terminationName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(titleRecordTermination));
        WebElement terminationN = driver.findElement(By.xpath("//div[contains(text(),'"+terminationName+"')]"));
        return terminationN.isDisplayed();
    }


}
