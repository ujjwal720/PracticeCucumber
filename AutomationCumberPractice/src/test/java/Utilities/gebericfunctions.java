package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gebericfunctions {

	public WebDriver genricdriver;

	public gebericfunctions(WebDriver driver) {

		this.genricdriver = driver;

	}
	
	
	/*
	 * As we are creating the constructor but what is the need and why?
	 * we are creating the cnstructor because we will be passing the
	 * driver instance as we hve the followng
	 */

	public void webelementwaitss(WebElement e) {

		WebDriverWait waits = new WebDriverWait(genricdriver, Duration.ofSeconds(10));
		waits.until(ExpectedConditions.elementToBeClickable(e));
		
		

	}

}
