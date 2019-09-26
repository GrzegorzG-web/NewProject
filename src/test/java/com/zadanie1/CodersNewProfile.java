package com.zadanie1;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CodersNewProfile {
    WebDriver driver;

        @Given("^an open browser with https://men-men-s-(\\d+)\\.codersguru\\.pl/$")
        public void anOpenBrowserWithHttpsMenMenSCodersguruPl(int arg0) {
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://men-men-s-01.codersguru.pl");
        }
        @When("^user clicks \"([^\"]*)\"$")
        public void userClicks(String arg0) throws Throwable {

            driver.findElement(By.xpath("/html/body/section[3]/div/form/input[2]")).click();

        }
        @And("^user enter E-mail \"([^\"]*)\"$")
        public void userEnterEMail(String arg0) throws Throwable {
            WebElement EMailElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_email\"]"));
            EMailElement.clear();
            EMailElement.sendKeys(arg0);
        }
        @And("^user enter Imię \"([^\"]*)\"$")
        public void userEnterImię(String arg0) throws Throwable {
            WebElement imięElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_name\"]"));
            imięElement.clear();
            imięElement.sendKeys(arg0);

        }
        @And("^user enter Nazwisko \"([^\"]*)\"$")
        public void userEnterNazwisko(String arg0) throws Throwable {
            WebElement NazwiskoElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_lastname\"]"));
            NazwiskoElement.clear();
            NazwiskoElement.sendKeys(arg0);

            //WebElement NazwiskoElement = driver.findElement(By.name("Nazwisko"));
            //NazwiskoElement.clear();
            //NazwiskoElement.sendKeys(arg0);

        }
        @And("^user enter Hasło \"([^\"]*)\"$")
        public void userEnterHasło(String arg0) throws Throwable {
            WebElement HasłoElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_plainPassword_first\"]"));
            HasłoElement.clear();
            HasłoElement.sendKeys(arg0);
        }
        @And("^user enter Powtórz hasło \"([^\"]*)\"$")
        public void userEnterPowtórzHasło(String arg0) throws Throwable {
            WebElement PowtórzHasłoElement = driver.findElement(By.xpath("//*[@id=\"fos_user_registration_form_plainPassword_second\"]"));
            PowtórzHasłoElement.clear();
            PowtórzHasłoElement.sendKeys(arg0);
        }
        @And("^user enter Miasto \"([^\"]*)\"$")
        public void userEnterMiasto(String arg0) throws Throwable {
            WebElement MiastoElement = driver.findElement(By.xpath("//*[@id=\"form_city\"]"));
            MiastoElement.clear();
            MiastoElement.sendKeys(arg0);
        }
        @And("^user enter Kod pocztowy \"([^\"]*)\"$")
        public void userEnterKodPocztowy(String arg0) throws Throwable {
            WebElement KodPocztowyElement = driver.findElement(By.xpath("//*[@id=\"form_postal_code\"]"));
            KodPocztowyElement.clear();
            KodPocztowyElement.sendKeys(arg0);

        }
            @And("^user enter Ulica \"([^\"]*)\"$")
        public void userEnterUlica(String arg0) throws Throwable {
                WebElement UlicaElement = driver.findElement(By.xpath("//*[@id=\"form_street\"]"));
                UlicaElement.clear();
                UlicaElement.sendKeys(arg0);
        }
         @And("^user enter Numer domu/lokalu \"([^\"]*)\"$")
        public void userEnterNumerDomuLokalu(String arg0) throws Throwable {
             WebElement NumerDomuElement = driver.findElement(By.xpath("//*[@id=\"form_number\"]"));
             NumerDomuElement.clear();
             NumerDomuElement.sendKeys(arg0);
        }
        @And("^user enter Zapoznałem się z regulaminem$")
        public void userEnterZapoznałemSięZRegulaminem() {
            WebElement ZapoznałemSięZRegulaminem = driver.findElement(By.xpath("/html/body/div/div/div/form/div[12]/input"));
            ZapoznałemSięZRegulaminem.click();
        }
        @And("^user clicks button Zarejestruj$")
        public void userClicksButtonZarejestruj() {
            WebElement ZapoznałemSięZRegulaminem = driver.findElement(By.xpath("//*[@id=\"register-submit-btn\"]"));
            ZapoznałemSięZRegulaminem.click();
        }
        @Then("^user is successfully register$")
        public void userIsSuccessfullyRegister() {
        }
}






