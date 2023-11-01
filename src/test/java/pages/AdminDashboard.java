package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {

    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Kacmaz Ramazan")
    public WebElement affilitedrk;

    @FindBy(linkText = "eyyup Yilmaz")
    public WebElement affilitedUser2rk;

    @FindBy(xpath = "(//span[@class='aside-menu-title'])[9]")
    public WebElement  affilitedUserrk;

    @FindBy(xpath = "(//span[@class='badge bg-success me-2'])[1]")
    public WebElement amount;

    @FindBy(xpath = "(//span[@class='badge bg-secondary me-2'])[1]")
    public WebElement date;


}
