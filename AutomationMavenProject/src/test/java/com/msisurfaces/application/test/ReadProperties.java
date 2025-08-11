package com.msisurfaces.application.test;

import java.util.Properties;

import com.msisurfaces.framework.utilities.ReadPropUtil;

public class ReadProperties {

	public static void main(String[] args) {
		
		Properties config= ReadPropUtil.readData("Config.properties");
		 
		System.out.println(config.getProperty("Username"));

		
	}

}
