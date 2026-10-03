package com.salesforce.tests;

import com.salesforce.pages.LoginPage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvalidLoginTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private final String BASE_URL = "https://login.salesforce.com/?locale=in";

    @BeforeMethod
    public void setUp() {
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.get(BASE_URL);
            loginPage = new LoginPage(driver);
        } catch (Exception e) {
            throw new RuntimeException("WebDriver initialization failed: " + e.getMessage(), e);
        }
    }

    @Test
    public void testInvalidLoginShowsErrorMessage() {
        try {
            loginPage.doLogin("invalid_user@enterprise.com", "WrongPassword999");
            Assert.assertTrue(loginPage.isErrorMessageDisplayed());
            String errorMsg = loginPage.getErrorMessageText();
            Assert.assertTrue(errorMsg.contains("Please check your username and password"));
        } catch (Exception e) {
            Assert.fail("Invalid login verification failed: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                System.err.println("Driver quit encountered an issue: " + e.getMessage());
            }
        }
    }
}
