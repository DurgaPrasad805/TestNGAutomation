package com.msi.msisurfaces.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.msi.msisurfaces.framework.web.commons.WebCommon;

public class LoginPageElements extends WebCommon {
	

	 @FindBy(xpath="//input[@name='username']")
	 public WebElement username;
	 
	 @FindBy(xpath="//input[@name='password']")
	 public WebElement password;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 public WebElement loginbutton;
	 
	 @FindBy(xpath="//div[@class='orangehrm-login-branding']")
	 public WebElement orangeHRMLogo;
	
}


 