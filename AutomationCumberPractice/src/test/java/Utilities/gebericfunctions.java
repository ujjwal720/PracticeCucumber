package Utilities;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	 * As we are creating the constructor but what is the need and why? we are
	 * creating the cnstructor because we will be passing the driver instance as we
	 * hve the followng
	 */

	public void webelementwaitss(WebElement e) {

		WebDriverWait waits = new WebDriverWait(genricdriver, Duration.ofSeconds(10));
		waits.until(ExpectedConditions.elementToBeClickable(e));

	}

	public void addscreenshot() throws IOException {
		
		Date a=new Date();
		File b=new File("C:\\Users\\UjjwalShrivastava\\git\\PracticeCucumber\\AutomationCumberPractice"+a.getTime()+".PNG");
		TakesScreenshot screenshot=((TakesScreenshot)genricdriver);
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,b);
		
		
		

	}

}
