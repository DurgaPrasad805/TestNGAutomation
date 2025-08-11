package com.practise.crm.framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppCommons extends WebCommons {

	@Test(priority=2 , groups= {"Regression"}, invocationCount=10)
	public void Testcase1() {
       //Assert.fail("Test Case 1 is failed");
		System.out.println("Test case 1 - home Page Execute successfully........");
	}

	@Test(priority=-1, groups= {"Regression","sanity"})
	public void Testcase2() {

		System.out.println("Test case 2 - Add product to page successfully........");
	}

	@Test(dataProvider="testcase3" , priority=1 , groups= {"Regression","sanity", "smoke"}, enabled=true)
	public void Testcase3(String username, String password ) {

		System.out.println("Test case 3 - Login Executed successfully........");
	}
}
