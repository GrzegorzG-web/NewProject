package com.zadanie2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhpTravelsTest {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/geckodriver");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/");
    }
    @Test
    public void TestLogin(){
        //WebElement FlightButton = driver.findElement(By.cssSelector("span.hidden-xs:nth-child(4)"));
        WebElement FlightButton = driver.findElement(By.className("Flights"));
        //WebElement Flight = driver.findElement(By.xpath("/html/body/div[5]/section/div[2]/div/div/div[2]/ul/li[2]/a"));
        //WebElement FlightButton = driver.findElement(By.id("flights"));
        FlightButton.click();

    }

    @After
    public void tearDown(){
        //driver.quit();
    }
}
