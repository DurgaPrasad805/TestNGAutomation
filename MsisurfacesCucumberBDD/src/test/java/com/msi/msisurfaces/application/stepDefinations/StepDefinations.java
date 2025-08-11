package com.msi.msisurfaces.application.stepDefinations;

import org.openqa.selenium.WebDriver;

import com.msi.msisurfaces.application.steps.LoginPageSteps;
import com.msi.msisurfaces.framework.base.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinations {
	
//	public CookiesPageSteps cookiesPage =null;
	public LoginPageSteps loginPage = null;
//	public SignUpPageSteps signUpPage = null;
//	public HomePageSteps homePage = null;
	
	@Given("Initialize all the page objects")
	public void initializePageObjects() {
		WebDriver driver = new Base().getDriver();
		//cookiesPage = new CookiesPageSteps(driver);
		  loginPage = new LoginPageSteps(driver);
		//signUpPage = new SignUpPageSteps(driver);
		//homePage = new HomePageSteps(driver);ehrm
	}


	@Given("Launch the application")
	public void launch_the_application() {
		loginPage.launchApplication();
	}

	@Then("Verify OrangeHrm Homepage is displayed successfully")
	public void verify_orange_hrm_homepage_is_displayed_successfully() {
		loginPage.verifyOrangeHRMHomepageisDisplayed();
	}

	@Then("Verify OrangeHRM Loginpage is displayed successfully")
	public void verify_orange_hrm_loginpage_is_displayed_successfully() {
		loginPage.VerifyLoginHomePageisDisplayed();
	}

	@Then("Verify Username field is displayed is succesfully")
	public void verify_username_field_is_displayed_is_succesfully() {
		loginPage.verifyUsernameFieldisEnabled();
	}

}
