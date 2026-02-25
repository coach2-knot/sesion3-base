package com.knotacademy.qc.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;;

public class InventoryPage extends BasePage {

    private final By pageTitle = By.className("span.title");
    /// span[contains(text(),"Products")]
    private final By addBackpackButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By addTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By cartBadge = By.cssSelector(".shopping_cart_link .shopping_cart_badge");

    public InventoryPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isLoaded() {
        return "Products".equals(text(pageTitle));
    }

    public void addBackpack(){
        click(addBackpackButton);
    }

    public void addTShirt(){
        click(addTShirt);
    }

    public int getCartBadgeCount(){
        List<WebElement> badges = driver.findElements(cartBadge);
        if (badges.isEmpty()){
            return 0;
        }

        String value = badges.get(0).getText();
        if (value == null || value.isBlank()){
            return 0;
        }

        return Integer.parseInt(value.trim());
    }

}
