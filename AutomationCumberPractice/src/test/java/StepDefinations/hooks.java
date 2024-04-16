package StepDefinations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import Utilities.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;


public class hooks {

	
	public TestContext context;
	

	

	public hooks(TestContext d) {
	
		this.context=d;
	}

	@After
	public void teardown() {

		context.drivers.quit();
		

	}
	/*

	public void addscreenshot(WebDriver driver) throws IOException {

		try {
			Date a = new Date();
			File b = new File("C:\\Users\\UjjwalShrivastava\\git\\PracticeCucumber\\AutomationCumberPractice"
					+ a.getTime() + ".png");
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			File source = screenshot.getScreenshotAs(OutputType.FILE);S
			FileUtils.copyFile(source, b);

		}

		catch (Exception e) {
			
			
			e.printStackTrace();

		}

	}
	
	*/

	@AfterStep
	public void aftersexcution(Scenario scenario) throws IOException {
		
		System.out.println("lets excute the first one");
		
	File screenshotFile = ((TakesScreenshot)context.drivers).getScreenshotAs(OutputType.FILE);
		
		if(scenario.isFailed()==true) {

		try {
			// Get the test case name.
			//String testCaseName = result.getName();
			//abc = c.createTest(testCaseName);
			//abc.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is: " + result.getName() ,ExtentColor.RED));
			// Generate a timestamp with date, time, and seconds.
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
			String timestamp = dateFormat.format(new Date());

			// Set the project directory to the specified path.
			String projectDirectory = "C:\\Users\\UjjwalShrivastava\\git\\PracticeCucumber\\AutomationCumberPractice";

			// Concatenate the test case name with the timestamp.
			String screenshotFileName = "_" + timestamp + ".png";
			String screenshotPath = projectDirectory + "screenshots\\" + screenshotFileName;

			// Create the directory to store the screenshots if it doesn't exist.
			File directory = new File(screenshotPath).getParentFile();

			if (!directory.exists()) {
				boolean created = directory.mkdirs(); // Create the directory if it doesn't exist.
				System.out.println("Directory created: " + created); // Debug statement
			}

			// Save the screenshot with the new filename.
			File destFile = new File(screenshotPath);
			FileUtils.copyFile(screenshotFile, destFile);
			byte[] screenshotData = Files.readAllBytes(Paths.get(screenshotPath));
			 scenario.attach(screenshotData, "image/png", "screenshot");
			System.out.println("projectDirectory: " + projectDirectory); // Debug statement
			System.out.println("screenshotPath: " + screenshotPath); // Debug statement
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	} 
		else {
		System.out.println("WebDriver is null");
	}

	}

}
