package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersPgm implements ITestListener {
	
	public void onstart(ITestContext context) {
		System.out.println("Test Execution is started...");
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("start test excution...");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("excution is successful...");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("excution is failed...");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("excution is Skipped...");
	}
	public void onFinish(ITestResult result) {
		System.out.println("excution is Finished...");
	}
}
