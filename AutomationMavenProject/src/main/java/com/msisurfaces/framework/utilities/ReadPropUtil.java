package com.msisurfaces.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropUtil {
	
	public static Properties readData(String fileName) {
	
		
		Properties prop= new Properties();
		
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+fileName);
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return prop;
	}

}
