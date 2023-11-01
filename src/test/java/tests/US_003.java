package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_003 extends TestBaseRapor {


    @Test
    public void TC_01() {

        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("SmartCardlink Testi", " Home page sayfasında Get Started  " +
                " fonksiyonun görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        ReusableMethods.bekle(2);

        Assert.assertTrue(homePage.getStartedbuttonu.isDisplayed());
        extentTest.pass("Home page sayfasindaki Get Started buttonu göründügünü test eder. ");

        ReusableMethods.bekle(2);
        homePage.getStartedbuttonu.click();
        extentTest.info("Kulllanici Get Started buttonu tiklar");

        Assert.assertTrue(homePage.smartCardLink.isDisplayed());
        extentTest.pass("Kullanici SmartCardLinkinin aktif oldugunu test eder.");
        ReusableMethods.bekle(2);

        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);

        Driver.closeDriver();
    }

    @Test
    public void TC_02() {
        HomePage homePage = new HomePage();


        extentTest = extentReports.createTest("smartcardlink testi", " Home page sayfasında 'Choose a plan that's right for you' " +
                "bölümündeki fonksiyonların görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(homePage.solButton.isDisplayed());
        extentTest.pass("Sol Click Button görüldügü test edilir");


        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.bekle(2);
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.solButton);
        ReusableMethods.bekle(2);
        jse.executeScript("arguments[0].click();", homePage.solButton);
        ReusableMethods.bekle(2);
        extentTest.info("sol button tiklanir");
        ReusableMethods.bekle(5);

        Assert.assertTrue(homePage.sagButton.isDisplayed());
        extentTest.pass("sag Button görüldügü test edilir");
        homePage.sagButton.click();
        extentTest.info("sag button tiklanir");
        ReusableMethods.bekle(3);

        Assert.assertTrue(homePage.silverChooseplan.isEnabled());
        extentTest.pass("silver choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.gulsahChooseplan.isEnabled());
        extentTest.pass("gulsah choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.VipChooseplan.isEnabled());
        extentTest.pass("vip choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.unlimitedChooseplan.isEnabled());
        extentTest.pass("unlimited choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.GoldChooseplan.isEnabled());
        extentTest.pass("gold choose plan erisilebilir oldugu test edilir ");


        Assert.assertTrue(homePage.standardChooseplan.isEnabled());
        extentTest.pass("standard choose plan erisilebilir oldugu test edilir ");
        ReusableMethods.bekle(5);

      while (!homePage.standardChooseplan.isDisplayed()){
          homePage.solButton.click();
          if (homePage.standardChooseplan.isDisplayed()) {
              Assert.assertTrue(homePage.standardChooseplan.isDisplayed());
              ReusableMethods.bekle(5);
          }
      }
      extentTest.info("Standard Choose Plan  secilir.");
        ReusableMethods.bekle(3);
        homePage.standardChooseplan.click();
        extentTest.info("Standard Choose Plan click yapilir");

        Assert.assertTrue(homePage.smartCardLink.isDisplayed());
        extentTest.pass("tandard Choose Plan tiklandiginda SmartCardLink sayfasina gidildigi dogrulanir.");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Home Page geri dönülür.");

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

    @Test
    public void TC_03() {

        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("SmartCardlink testi", " Home page sayfasında 'Contact Us' " +
                "bölümündeki fonksiyonun görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        actions.sendKeys(Keys.END).perform();

        homePage.bodyName.sendKeys("Ramazan");
        homePage.enterEmail.sendKeys("ramokacmaz6@gmail.com");
        homePage.subject.sendKeys("Shop");
        homePage.sendMessage.sendKeys("Shop end...");

        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);
        homePage.sendMessage.click();
        ReusableMethods.bekle(3);
        extentTest.info("Send Message fonksiyonuna mesajlar gonderilip tiklanir.");
        Assert.assertTrue(homePage.messageSendsuccess.isDisplayed());
        extentTest.info("send message buttonun aktif oldugu test edilir.");
        Assert.assertTrue(homePage.sendMessage.isDisplayed());
        extentTest.pass("send message button görülebilir oldugu test edilir");
        ReusableMethods.bekle(3);

        Driver.closeDriver();
    }

    @Test
    public void TC_04() {

        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("smartcardlink testi", " Home page sayfasında 'Subscribe here' " +
                "bölümündeki fonksiyonların görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        actions.sendKeys(Keys.END).perform();

        Faker faker = new Faker();

        homePage.entermail.sendKeys(faker.internet().emailAddress());
        extentTest.info("Kullanici email girer");
        ReusableMethods.bekle(3);
        homePage.subsricibe.click();
        extentTest.info("Kullanici Subscribe button click");

        Assert.assertTrue(homePage.Successfully.isDisplayed());
        extentTest.pass("Subscribe button aktif");


        ReusableMethods.bekle(3);
        Driver.closeDriver();


    }

    @Test
    public void TC_05() {
        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("smartcardlink testi", " Home page sayfasında mail ve tel  " +
                "bölümündeki fonksiyonların görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(3);

        Assert.assertTrue(homePage.bodyMail.isDisplayed());
        extentTest.info("mail görülebilir oldugu test edilir");

        Assert.assertTrue(homePage.bodyTel.isDisplayed());
        extentTest.pass("Tel numarasinin görülebilir oldugu test edilir");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);


        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.bodyTel);
        jse.executeScript("arguments[0].click();", homePage.bodyTel);
        extentTest.info("Tel numarasina click yapilir.");


        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

    @Test
    public void TC_06(){
        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("smartcardlink testi", " Home page sayfasında Stories From Our Customers " +
                "bölümündeki fonksiyonların görünür ve aktif olduğu " +
                "görüntülenebilmeli ve  doğrulalabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        extentTest.info("Kullanici qa.smartcardlink sitesine gider ");
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(3);



    }
}
