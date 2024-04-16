package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {""}, glue= {"StepDefinations"}, monochrome = true,
        plugin= {"html:target/cuucmber.html","rerun:target/failed.txt"})
public class CucmberRunner extends AbstractTestNGCucumberTests {
}
