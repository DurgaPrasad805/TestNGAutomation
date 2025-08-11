package com.msisurfaces.framework.web.commons;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Msi.msisurfaces.framework.base.Base;
import com.msisurfaces.framework.utilities.ReadPropUtil;

public class WebCommons {
	
	public WebDriver driver=new Base().getDriver();
	public Properties prop=ReadPropUtil.readData("Config.properties");
	
	
	public void launchApplication() {
		driver.get(prop.getProperty("ApplicationUrl"));
	}
	
	public void scrollToElement(WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("argumnts[0].scrollIntoView()", element);
	}
	
	public void click(WebElement element) {
		scrollToElement(element);
	        element.click();	
	}
	
	
       public void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("argumnts[0].click()", element);
	}
       
       public void doubleClick(WebElement element) {
   		scrollToElement(element);
   		Actions act=new Actions(driver);
   		act.doubleClick(element).click();
   	       	
   	}
       
       public void enterText(WebElement textbox, String value) {
   		scrollToElement(textbox);
   	       textbox.clear();
   	       textbox.sendKeys(value);
   	}
       
       public void checkbox(WebElement checkbox, boolean status) {
   		scrollToElement(checkbox);
   	        if(checkbox.isSelected() !=status) {
   	        	checkbox.click();
   	        }
   	}
       
       public void selectOption(WebElement dropdown, String selectBy, String option) {
   		scrollToElement(dropdown);
   	       Select s=new Select(dropdown);
   	       if(selectBy.equalsIgnoreCase("VisibleText")) {
   	    	s.selectByVisibleText(option);   
   	       }else if(selectBy.equalsIgnoreCase("value")) {
   	    	s.selectByValue(option); 
   	       }else if(selectBy.equalsIgnoreCase("Index")) {
   	    	   s.selectByIndex(Integer.parseInt(option));
   	       }
   	     
   	       
   	}
       public void wait(int seconds) {
   		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	}
       
	
	

}
