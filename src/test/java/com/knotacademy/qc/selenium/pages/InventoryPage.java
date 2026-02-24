package com.knotacademy.qc.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;;

public class InventoryPage extends BasePage {

    private final By pageTitle = By.className("span.title");
    /// span[contains(text(),"Products")]

    public InventoryPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isLoaded() {
        ///
        return "Products".equals(text(pageTitle));
    }
}
