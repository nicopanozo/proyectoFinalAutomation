package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    WebDriver driver;

    public AdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

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

}
