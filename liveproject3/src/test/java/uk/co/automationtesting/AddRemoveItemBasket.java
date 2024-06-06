package uk.co.automationtesting;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import junit.framework.Assert;
import pageObjects.Homepage;
import pageObjects.ShopHomePage;
import pageObjects.ShopProductPage;
@Listeners(resources.Listeners.class)

public class AddRemoveItemBasket extends Hooks{

	public AddRemoveItemBasket() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings({ "deprecation", "deprecation", "deprecation" })
	@Test
	public void addRemoveItem() throws IOException {
		
		ExtentManager.log("Starting AddRemove Test");
		Homepage home = new Homepage();
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView()", home.getTestStoreLink()); 
		home.getTestStoreLink().click();
		
		
		ShopHomePage shopHome = new ShopHomePage();
		ExtentManager.pass("Reached Shop Homepage");
		shopHome.getProdOne().click();
		
		ShopProductPage shopProd = new ShopProductPage();
		ExtentManager.pass("Reached product page");
		//Assertion for current price
		//Assert.assertEquals(shopProd.getCurrentPrice().getText(), "$19.13");
		//Assert.assertEquals(shopProd.getCurrentPrice().getText(), "$19.13");
		try {
			Assert.assertEquals(shopProd.getCurrentPrice().getText(), "$19.12");
			ExtentManager.pass("The current price amount matches the expected amount.");
		}
		catch (AssertionError e) {
			Assert.fail("Current price did not match expected" + shopProd.getCurrentPrice().getText() + "expected " + "$19.12");
			ExtentManager.fail("Current price doesnt not match the expected");
		}
		
	}

}
