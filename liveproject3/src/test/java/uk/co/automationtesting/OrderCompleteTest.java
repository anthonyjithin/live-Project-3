package uk.co.automationtesting;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.ShopHomePage;
import pageObjects.ShopProductPage;
@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks{

	public OrderCompleteTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void endToEndTest() throws IOException {
		ExtentManager.log("Starting Order Test");
		Homepage home = new Homepage();
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView()", home.getTestStoreLink()); 
		home.getTestStoreLink().click();
		
		ShopHomePage shopHome = new ShopHomePage();
		shopHome.getProdOne().click();
		ExtentManager.pass("Reached Shop Homepage");
		
		ShopProductPage shopProd = new ShopProductPage();
		shopProd.getAddToCartBtn().click();
		ExtentManager.pass("Added product to cart");
	}
	
	
	
	

}
