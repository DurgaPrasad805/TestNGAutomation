package com.practise.crm.framework;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener {
	
	 public void onTestStart(ITestResult result) {
		  
		 System.out.println("Test Execution is Started for Test Case: " +result.getMethod().getMethodName());
		 
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		 
		 System.out.println("Test Execution is Successful for Test Case: " +result.getMethod().getMethodName());
		    
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 
		 System.out.println("Test Execution is failed for Test Case: " +result.getMethod().getMethodName());
		 System.out.println("Test Execution is Failed due to error: " +result.getThrowable().getLocalizedMessage());
		    
		  }

}
