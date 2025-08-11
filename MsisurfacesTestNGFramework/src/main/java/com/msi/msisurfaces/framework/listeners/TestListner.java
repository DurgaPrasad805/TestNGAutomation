package com.msi.msisurfaces.framework.listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.msi.msisurfaces.framework.base.Base;
import com.msi.msisurfaces.framework.reports.Reports;
import com.msi.msisurfaces.framework.web.commons.WebCommon;

public class TestListner extends Reports implements ITestListener {

	public void onTestStart(ITestResult result) {

		String testmethodName = result.getMethod().getMethodName();
		startReporting(testmethodName);

	}

	public void onTestSuccess(ITestResult result) {

		String testmethodName = result.getMethod().getMethodName();
		logger.pass("Test Execution is Successful for Test Case: " + testmethodName);
		stopReporting();
	}

	public void onTestFailure(ITestResult result) {

		String testmethodName = result.getMethod().getMethodName();
		logger.fail("Test Execution is failed for Test Case: " + testmethodName);
		logger.fail("Test Execution is Failed due to error: " + result.getThrowable().getLocalizedMessage());
		try {
			logger.addScreenCaptureFromPath(
					WebCommon.takeWindowScreenshot(new Base().getDriver(), testmethodName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopReporting();
	}
	
	public void onTestSkip(ITestResult result) {

		String testmethodName = result.getMethod().getMethodName();
		logger.fail("Test Execution is Skipped for Test Case: " + testmethodName);
		logger.fail("Test Execution is Skipped due to error: " + result.getThrowable().getLocalizedMessage());
		try {
			logger.addScreenCaptureFromPath(
					WebCommon.takeWindowScreenshot(new Base().getDriver(), testmethodName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopReporting();
	}

}
