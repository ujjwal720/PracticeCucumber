package Utilities;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.MyAccount;
import Pages.ProductDescription;
import Pages.ShopPages;

public class ObjectManager {

	public WebDriver driver;

	public ObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage home() {

		return new HomePage(driver);

	}

	public ProductDescription productdis() {

		return new ProductDescription(driver);
	}

	public MyAccount product1() {
		return new MyAccount(driver);

		
		
	}
	
	
	public ShopPages sho1() {
		
		return new ShopPages(driver);
		
		
	}


	
	

}
