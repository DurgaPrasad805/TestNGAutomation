package com.msi.msisurfaces.framework.base;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.msi.msisurfaces.framework.utilities.PropUtill;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;




public class Base  {

	//this class will have all the common methods related to browser configuration to initialize the test scripts
	
	private static WebDriver driver = null;
	public Properties prop=PropUtill.readData("Config.properties");
	
   //Method to launch the browser on  the browser name coming from runner file
	@Before
	public void setupBrowser() {
        String browserName=prop.getProperty("browser");
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
	
	
	//Method to tear-down/lose the browser windows
	@After(order=0)
	public void tearDownbrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void failedTestListner(Scenario scenario) throws IOException {
	
		if (scenario.isFailed()) {
			File file=((TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(file);
			scenario.attach(fileContent, "image/png", "Screenshot");
			
		}
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
