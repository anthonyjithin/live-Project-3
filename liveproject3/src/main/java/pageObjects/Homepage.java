package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{
	public WebDriver driver;
	
	By testStoreLink = By.linkText("TEST STORE");
	By cookie = By.cssSelector(".close-cookie-warning > span");
	
	public Homepage() throws IOException {
		super();
	}
	
	
	public WebElement getTestStoreLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(testStoreLink);
	}

	public WebElement getCookie() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cookie);
	}
	
	
	
	
	

}
