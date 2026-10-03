package com.salesforce.tests;

import com.salesforce.pages.LoginPage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidLoginTest {
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
    public void testValidLogin() {
        try {
            loginPage.enterUsername("testuser@enterprise.com");
            loginPage.enterPassword("ValidSecurePassword123!");
            loginPage.clickRememberMe();
            Assert.assertTrue(loginPage.isRememberMeSelected());
            loginPage.clickLogin();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            boolean redirected = wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(BASE_URL)));
            Assert.assertTrue(redirected);
        } catch (Exception e) {
            Assert.fail("Valid login execution failed: " + e.getMessage());
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
