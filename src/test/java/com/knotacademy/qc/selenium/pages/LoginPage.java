package com.knotacademy.qc.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;;

public class LoginPage extends BasePage {
    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    // By.cssSelector("#login-button")
    private final By errorMessage = By.cssSelector("h3[data-test=\"error\"]");
    // div.error-message-container h3

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open(String baseUrl) {
        driver.get(baseUrl);
    }

    public void login(String username, String pwd) {
        type(usernameInput, username);
        type(passwordInput, pwd);
        click(loginButton);
    }

    public String getErrorMessage() {
        return text(errorMessage);
    }

}
