package Utilities;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;

public class ObjectManager {

	public WebDriver driver;

	public ObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage home() {
		
		return new HomePage(driver);
		
		
		
	}

}
