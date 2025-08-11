package com.msi.msisurfaces.application.tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.msi.msisurfaces.application.steps.LoginPageSteps;
import com.msi.msisurfaces.framework.base.Base;
import com.msi.msisurfaces.framework.utilities.ExcelUtil;


public class BaseTest extends Base{

//	public CookiesPageSteps cookiesPage =null;
	public LoginPageSteps loginPage = null;
//	public SignUpPageSteps signUpPage = null;
//	public HomePageSteps homePage = null;
	
	@BeforeMethod(alwaysRun=true, dependsOnMethods="setupBrowser")
	public void initializePageObjects() {
		WebDriver driver = new Base().getDriver();
		//cookiesPage = new CookiesPageSteps(driver);
		  loginPage = new LoginPageSteps(driver);
		//signUpPage = new SignUpPageSteps(driver);
		//homePage = new HomePageSteps(driver);
	}
	
	@DataProvider(name="data")
	public String [][] testData(Method method){
		String [][] data = ExcelUtil.readExcelData("TestData.xlsx", method.getName());
		return data;
	}
}
