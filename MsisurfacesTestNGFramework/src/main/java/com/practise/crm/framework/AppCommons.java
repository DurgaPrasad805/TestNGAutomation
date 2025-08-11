package com.practise.crm.framework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppCommons extends WebCommons {

	@Test(groups= {"Regression"}, retryAnalyzer=RetryTest.class)
	public void Testcase1() {
        Assert.fail("Test case 1 failed");
		System.out.println("Test case 1 - home Page Execute successfully........");
	}

	@Test(priority=2,groups= {"Regression","sanity"},timeOut=2000,invocationCount=1)
	public void Testcase2() throws InterruptedException {
        Thread.sleep(3000);
		System.out.println("Test case 2 - added product to favorites page........");
	}

	@Test(dataProvider="testcase3",priority=-1,groups= {"Regression","Sanity", "Smoke"},enabled=true)
	public void Testcase3(String username, String password) {

		System.out.println("Test case 3 - Added favorites to shopping cart........" +username+" ,"+password);
	}
}
