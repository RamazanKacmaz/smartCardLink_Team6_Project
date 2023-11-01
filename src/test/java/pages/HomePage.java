package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Header/Features Link
    @FindBy(xpath = "//a[text()='Features']")
    public WebElement FeaturesTextLink;

    //Homepage SignIn Button
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@class='btn btn-orange ']")
    public WebElement getStartedbuttonu;

    @FindBy(xpath = "//img[@class='img-fluid logo-fix-size']")
    public WebElement smartCardLink;

    @FindBy(xpath = "//button[@class='slick-prev slick-arrow']")
    public WebElement solButton;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement sagButton;

    @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[12]")
    public WebElement silverChooseplan;

    @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[11]")
    public WebElement standardChooseplan;

    @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[10]")
    public WebElement gulsahChooseplan;
    @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[9]")
    public WebElement VipChooseplan;

    @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[14]")
    public WebElement unlimitedChooseplan;
    @FindBy(xpath = "(//*[@class='btn btn-primary rounded-pill mx-auto  '])[13]")
    public WebElement GoldChooseplan;


    @FindBy(xpath = "//*[text()='info@smartcardlink.com']")
    public WebElement bodyMail;

    @FindBy(xpath = "//*[text()='+1 987-654-3210']")
    public WebElement bodyTel;


    @FindBy(xpath = "//input[@placeholder='Enter Your Name*']")
    public WebElement bodyName;

    @FindBy(xpath = "//input[@id='submit']")
    public WebElement sendMessage;

    @FindBy(xpath = "//div[text()='Message send successfully.']")
    public WebElement messageSendsuccess;

    @FindBy(xpath = "//input[@placeholder='Enter Your Email*']")
    public WebElement enterEmail;

    @FindBy(xpath = "//input[@placeholder='Subject*']")
    public WebElement subject;


    @FindBy(xpath = "//input[@placeholder='Enter Your Email']")
    public WebElement entermail;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement subsricibe;

    @FindBy(xpath = "//div[@class='toast-message']")
    public  WebElement  Successfully;

    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signIn;




}
