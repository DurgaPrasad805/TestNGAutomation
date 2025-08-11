package com.msi.msisurfaces.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.msi.msisurfaces.application.elements.LoginPageElements;

public class LoginPageSteps extends LoginPageElements {

	public LoginPageSteps(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyOrangeHRMHomepageisDisplayed() {
		waitForElement(orangeHRMLogo, 30);
		log("pass", "Orange HRm homepage is displayed");
		addScreenshot(orangeHRMLogo, "orangehrmlogo.png");
		
	}
	
	public void veriyOrangHRMLogo() {
		Assert.assertTrue(isElementDisplayed(orangeHRMLogo));
		log("pass", "OrangeHRM logo is successfully displayed on page");
	}

	public void VerifyLoginHomePageisDisplayed() {
		waitForElement(orangeHRMLogo, 30);
		Assert.assertTrue(isElementDisplayed(loginbutton));
		log("pass", "OrangeHRM Logo is displayed");
		addScreenshot(orangeHRMLogo, "orangehrmlogo.png");
	}

	public void verifyUsernameFieldisEnabled() {
		Assert.assertTrue(isElementDisplayed(username));
		log("pass", "Usename field is enabled");
	}

}
