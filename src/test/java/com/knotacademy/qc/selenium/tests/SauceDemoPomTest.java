package com.knotacademy.qc.selenium.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.knotacademy.qc.selenium.core.BaseTest;
import com.knotacademy.qc.selenium.pages.LoginPage;

public class SauceDemoPomTest extends BaseTest {

    @Test
    void login(){
        LoginPage loginPage = new LoginPage(driver, wait);

        loginPage.open(requiredProperty("base.url"));
        loginPage.login(requiredProperty("username"),requiredProperty("password"));

        //assertTrue(null);
    }
    
}
