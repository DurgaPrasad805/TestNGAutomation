package com.msi.msisurfaces.application.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.msi.msisurfaces.application.elements.LoginPageElements;

public class LoginPageSteps extends LoginPageElements {

	public LoginPageSteps(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyOrangeHRMHomepageisDisplayed() {
		waitForElement(orangeHRMLogo, 30);
		
		
	}

	public void VerifyLoginHomePageisDisplayed() {
		waitForElement(orangeHRMLogo, 30);
		Assert.assertTrue(isElementDisplayed(loginbutton));
		
		
	}

	public void verifyUsernameFieldisEnabled() {
		Assert.assertTrue(isElementDisplayed(username));
		
	}

}
