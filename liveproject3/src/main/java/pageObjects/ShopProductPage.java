package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage{
	
	public WebDriver driver;
	
	By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
	By currentPrice = By.cssSelector(".current-price-value");

	public ShopProductPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getAddToCartBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addToCartBtn);
	}
	public WebElement getCurrentPrice() throws IOException {
		this.driver = getDriver();
		return driver.findElement(currentPrice);
	}
	

}
