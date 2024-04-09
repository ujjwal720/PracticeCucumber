package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\UjjwalShrivastava\\git\\PracticeCucumber\\AutomationCumberPractice\\src"
        + "\\main\\resources\\FeatureFiles\\HomePage.feature"}, glue= {"StepDefinations"}, monochrome = true,
        plugin= {"html:target/cuucmber.html","rerun:target/failed.txt"})
public class CucmberRunner extends AbstractTestNGCucumberTests {
}
