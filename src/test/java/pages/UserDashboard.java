package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {

    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Create an Account")
    public WebElement createanAccount;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement singInmail;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ps-2 pe-0']")
    public WebElement logindropdown;

    @FindBy(xpath = "//a[@id='changePassword']")
    public WebElement changePassword;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement currentPasswort;

    @FindBy(xpath = "//button[@id='passwordChangeBtn']")
    public WebElement passwordChangeBtn;

    @FindBy(xpath = "//div[@id='changePasswordModal']")
    public WebElement passwordChangeSuccesfully;

    @FindBy(xpath = "//a[@id='changeLanguage']")
    public WebElement changeLanguage;

    @FindBy(xpath = "//select[@class='form-control form-select select2-hidden-accessible']")
    public WebElement changeLanguageSelect;

    @FindBy(xpath = "//button[@id='languageChangeBtn']")
    public WebElement languageChangeBtn;


}
