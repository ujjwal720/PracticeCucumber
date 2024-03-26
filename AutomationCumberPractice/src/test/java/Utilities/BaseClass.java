package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;

	public WebDriver WebdriverSetup() throws IOException {

		File a = new File(
				"C:\\Users\\DELL\\Documents\\AutomationCumberPractice\\src\\test\\java\\Utilities\\configuration.Properties");
		FileInputStream b = new FileInputStream(a);
		Properties props = new Properties();
		props.load(b);

		if (driver == null) {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(props.getProperty("url"));

		}

		return driver;

	}

}
