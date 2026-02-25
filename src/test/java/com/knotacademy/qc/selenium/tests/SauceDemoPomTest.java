package com.knotacademy.qc.selenium.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.knotacademy.qc.selenium.core.BaseTest;
import com.knotacademy.qc.selenium.pages.CartPage;
import com.knotacademy.qc.selenium.pages.InventoryPage;
import com.knotacademy.qc.selenium.pages.LoginPage;

public class SauceDemoPomTest extends BaseTest {

    @Test
    void login(){
        LoginPage loginPage = new LoginPage(driver, wait);
        InventoryPage inventoryPage = new InventoryPage(driver, wait);
        CartPage cartPage = new CartPage(driver, wait);

        loginPage.open(requiredProperty("base.url"));
        loginPage.login(requiredProperty("username"),requiredProperty("password"));

        assertTrue(inventoryPage.isLoaded(),"Despues de login siempre validamos productos / inventario");

        inventoryPage.addBackpack();
        inventoryPage.addTShirt();
        assertEquals(2, inventoryPage.getCartBadgeCount(),"El badge debe tener dos productos");

        inventoryPage.openCart();
        assertTrue(cartPage.isLoaded(),"Debe ingresar al carrito");
        assertEquals(2, cartPage.getItemsCount(),"El carrito debe contar con 2 productos");

    }
    
}
