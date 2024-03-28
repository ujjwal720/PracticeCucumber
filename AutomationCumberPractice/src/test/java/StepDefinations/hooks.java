package StepDefinations;

import Utilities.TestContext;
import io.cucumber.java.After;

public class hooks {
	
	public TestContext yu;
	
	
	public hooks(TestContext a) {
		
		this.yu=a;
		
		
	}

	
	@After
	public void teardown() {
		
		yu.drivers.quit();

	}

}
