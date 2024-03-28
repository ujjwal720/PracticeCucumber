package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\UjjwalShrivastava\\git\\PracticeCucumber\\AutomationCumberPractice\\src\\main\\resources\\FeatureFiles\\HomePage.feature","C:\\Users\\UjjwalShrivastava\\git\\PracticeCucumber\\AutomationCumberPractice\\src\\main\\resources\\FeatureFiles\\productdiscip.feature"}, glue= {"StepDefinations"}, monochrome = true
,dryRun=true)
public class CucmberRunner extends AbstractTestNGCucumberTests {
	
	

}
