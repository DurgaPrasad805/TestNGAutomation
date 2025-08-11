package com.msi.msisurfaces.application.tests;

import org.testng.annotations.Test;

public class ApplicationTest extends BaseTest {
	
	@Test(priority=1 )
	public void verifyOrangeHRMHomePage() {
		loginPage.launchApplication();
		loginPage.verifyOrangeHRMHomepageisDisplayed();
	
		}

	
	@Test(priority=2)
	public void verifyOrangeHRMLoginPage() {
		loginPage.launchApplication();
		loginPage.verifyOrangeHRMHomepageisDisplayed();
		loginPage.VerifyLoginHomePageisDisplayed();
		loginPage.verifyUsernameFieldisEnabled();
		}

}
