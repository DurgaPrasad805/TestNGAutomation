package com.msi.msisurfaces.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.msi.msisurfaces.framework.reports.Reports;

public class Base extends Reports {

	//this class will have all the common methods related to browser configuration to initialize the test scripts
	
	private static WebDriver driver = null;
	
   //Method to launch the browser on  the browser name coming from runner file
	@BeforeMethod(alwaysRun=true)
	@Parameters(value="browser")
	public void setupBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else {
			Assert.fail("Invalid Browser Name");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod(alwaysRun=true)
	//Method to tear-down/lose the browser windows
	public void tearDownbrowser() {
		driver.quit();
	}
	
	
	
	//Method to share browser session (driver) details with all other classes
	public WebDriver getDriver() {
		return driver;	
	}
	
	//Method to modify browser session (driver) details with all other classes
		public void setDriver(WebDriver newDriver) {
			driver=newDriver;	
		}

}
