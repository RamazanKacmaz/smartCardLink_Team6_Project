package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_014 extends TestBaseRapor {

    //  Kayıtlı kullanıcı olarak giriş yaptıktan sonra şifre ve
    //  dil değişikliği yapabildiğimi ve kullanıcı çıkışı yapabildiğimi doğrulayabilmeliyim

    @Test
    public void test02() {

        HomePage homePage = new HomePage();
        UserDashboard userDashboard = new UserDashboard();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Sifre ve Dil degisikligi", "Kayıtlı kullanıcı olarak giriş yapabilmeli sonra şifre ve \n" +
                "dil değişikliği yapilabildigini ve kullanıcı çıkışı yapabildiğimi doğrulayabilinmelidir. ");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        ReusableMethods.bekle(3);

        homePage.signIn.click();
        extentTest.info("Kullanici Sing In buttonuna click yapar");

        userDashboard.createanAccount.click();
        extentTest.info("User  Create an Account  click ");
        ReusableMethods.bekle(3);

        actions.click(userDashboard.firstName)
                .sendKeys(ConfigReader.getProperty("FirstName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("LastName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("Email"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("Password"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("ConfirmPassword"))
                .perform();

        extentTest.info("Kullanici creat accont icin bilgileri girer");
        ReusableMethods.bekle(5);

        userDashboard.checkbox.click();
        extentTest.info("kullanici singin agre click");

        userDashboard.submit.click();
        extentTest.info("User submit click");
        ReusableMethods.bekle(5);

        actions.click(userDashboard.singInmail)
                .sendKeys(ConfigReader.getProperty("Email"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("Password"))
                .perform();
        extentTest.info("user Sing In");

        userDashboard.checkbox.click();
        extentTest.info("user remeber me click");

        userDashboard.submit.click();
        extentTest.info("User Login Click");

        userDashboard.logindropdown.click();
        extentTest.info("login dtpbdown clcik");

        userDashboard.changePassword.click();
        extentTest.info("user click change passwort");
        ReusableMethods.bekle(5);

        actions.click(userDashboard.currentPasswort)
                .sendKeys(ConfigReader.getProperty("Password"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("NewPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("NewPassword"))
                .perform();
        extentTest.info("user passwordChange input ");

        ReusableMethods.bekle(10);
        extentTest.info("user input new passwort");

        userDashboard.passwordChangeBtn.click();
        extentTest.info("user click passwordChangeBtn");

        Assert.assertTrue(userDashboard.passwordChangeSuccesfully.isDisplayed());
        extentTest.pass("passwordChangeSuccesfully aktif ");

        ReusableMethods.bekle(10);
        userDashboard.logindropdown.click();
        extentTest.info("login dtpbdown click");

        userDashboard.changeLanguage.click();
        extentTest.info("Click changeLanguage ");
        ReusableMethods.bekle(10);
        Select select = new Select(userDashboard.changeLanguageSelect);
        select.selectByVisibleText("German");
        extentTest.info("Click changeLanguageSelect");

        ReusableMethods.bekle(10);
        userDashboard.languageChangeBtn.click();
        extentTest.info("Click languageChangeBtn");

        ReusableMethods.bekle(10);

        userDashboard.logindropdown.click();
        extentTest.info("login dtpbdown click");
        ReusableMethods.bekle(10);
        userDashboard.changeLanguage.click();
        extentTest.info("Click changeLanguage ");
        ReusableMethods.bekle(10);
        String expected = "German";
        String actual = select.getFirstSelectedOption().getText();

        Assert.assertEquals(actual,expected);

        ReusableMethods.bekle(10);

        Driver.closeDriver();

    }
}
