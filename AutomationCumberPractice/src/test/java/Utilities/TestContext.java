package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;


public class TestContext {

	public WebDriver drivers;
	public ObjectManager ObjectManager;
	public gebericfunctions gebericfunctions;
	public BaseClass u;
	public Pages.ProductDescription ProductDescription;
	

	public TestContext() throws IOException {
		u=new BaseClass();
		this.drivers=u.WebdriverSetup();
		ObjectManager = new ObjectManager(drivers);
		gebericfunctions = new gebericfunctions(drivers);
		
		

	}

}
