package tutorial.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
	 

		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("Hurry, I got passed: My name is: " + result.getName());
		}

		@Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("Dad, I failed again. My name is: " + result.getName());
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("I got skipped. I[" + result.getName() +"] also deserve to be executed.");
		}
		
		
		
		
		
	}

