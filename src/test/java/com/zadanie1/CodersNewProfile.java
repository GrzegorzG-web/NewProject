package com.zadanie1;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
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
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
        @And("^user enter E-mail \"([^\"]*)\"$")
        public void userEnterEMail(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
        @And("^user enter Imię \"([^\"]*)\"$")
        public void userEnterImię(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
        @And("^user enter Nazwisko \"([^\"]*)\"$")
        public void userEnterNazwisko(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
        @And("^user enter Hasło \"([^\"]*)\"$")
        public void userEnterHasło(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
        @And("^user enter Powtórz hasło \"([^\"]*)\"$")
        public void userEnterPowtórzHasło(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
        @And("^user enter Miasto \"([^\"]*)\"$")
        public void userEnterMiasto(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
        @And("^user enter Kod pocztowy \"([^\"]*)\"$")
        public void userEnterKodPocztowy(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
            @And("^user enter Ulica \"([^\"]*)\"$")
        public void userEnterUlica(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
         @And("^user enter Numer domu/lokalu \"([^\"]*)\"$")
        public void userEnterNumerDomuLokalu(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
        @And("^user enter Zapoznałem się z regulaminem$")
        public void userEnterZapoznałemSięZRegulaminem() {
        }
        @And("^user clicks button Zarejestruj$")
        public void userClicksButtonZarejestruj() {
        }
        @Then("^user is successfully register$")
        public void userIsSuccessfullyRegister() {
        }
}






