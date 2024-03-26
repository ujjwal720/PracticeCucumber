package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\DELL\\Documents\\AutomationCumberPractice\\src\\main\\resources\\FeatureFiles"
		+ "\\HomePage.feature", glue= {"StepDefinations"}, monochrome = true)
public class CucmberRunner extends AbstractTestNGCucumberTests {
	
	

}
