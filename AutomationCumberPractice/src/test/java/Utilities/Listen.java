package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener {
	
	
	@Override
    public void onTestStart(ITestResult result) {
        // Your implementation here
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Your implementation here
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Your implementation here
    	System.out.println("the following test i am going to fail in cucmber");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Your implementation here
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Your implementation here
    }

    @Override
    public void onStart(ITestContext context) {
    	
    }
    
        

    @Override
    public void onFinish(ITestContext context) {
        // Your implementation here
    }

}
