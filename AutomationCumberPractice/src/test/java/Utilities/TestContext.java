package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;

public class TestContext {

	public WebDriver driver;
	public ObjectManager ObjectManager ;
	public HomePage HomePage;

	public TestContext() throws IOException {

		BaseClass a = new BaseClass();
		ObjectManager  = new ObjectManager(a.WebdriverSetup());
		
	}

}
