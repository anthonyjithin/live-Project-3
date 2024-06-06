package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopHomePage extends BasePage {
	public WebDriver driver;
	
	By productOne = By.cssSelector(".products.row [alt='Hummingbird printed t-shirt']");
	
	public ShopHomePage() throws IOException{
		super();
	}
	public WebElement getProdOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productOne);
		}

}
